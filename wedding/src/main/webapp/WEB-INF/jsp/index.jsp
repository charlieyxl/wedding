<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>于晓路和徐晨珏的结婚请柬</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/wedding/css/bootstrap-inv.min.css">
<script type="text/javascript" src="/wedding/js/wedding.js"></script>

<script src="http://webapi.amap.com/maps?v=1.2&key=8325164e247e15eea68b59e89200988b"></script>

<style>
body {
	font-size: 13px !important;
}

h3 {
	font-size: 23px !important;
}

@media ( min-width :768px) {
	.my-map {
		margin: 0 auto;
		width: 768px;
		height: 200px;
	}
	#confirm_info {
		padding-top: 4%;
	}
	#canvas {
		padding-top: 1.5%;
	}
	body {
		font-family: "Microsoft YaHei", "Helvetica Neue", "Sans-Serif";
	}
}

@media ( max-width : 768px) {
	.my-map {
		margin: 0 auto;
		width: device-width;
		height: 200px;
	}
	#confirm_info {
		padding-top: 16%;
	}
	#canvas {
		padding-top: 4%;
	}
}

.my-map .icon {
	background: url(http://lbs.amap.com/console/public/show/marker.png)
		no-repeat;
}

.my-map .icon-cir {
	height: 31px;
	width: 28px;
}

.my-map .icon-cir-red {
	background-position: -11px -5px;
}

.center {
	display: table;
	margin: 0 auto;
}

.firstLetter {
	font-size: 200%;
}

.name {
	font-size: 125%;
}

#date {
	padding-top: 0px;
	margin-top: 0px;
}

#ido, #ido-xs {
	width: 100%;
}
</style>

<script type="text/javascript">
	function hello_xs(btn) {
		$.ajax({
			url : btn.title,
			type : "get",
			success : function(result) {
				$("#canvas").html(result);
			}
		});
	};
</script>
</head>

<body>
	<div class="hidden-xs">
		<img id="ido" src="/wedding/images/lu.png"></img>
	</div>
	<div class="visible-xs">
		<img id="ido-xs" src="/wedding/images/lu-xs.png"></img>
	</div>

	<div class="container-fluid">
		<div class="row hidden-xs">
			<div class="col-md-6 col-md-offset-3">
				<ul id="nav" class="nav nav-pills nav-justified">
					<li id="invitation_btn" class="active"><a
						href="javascript:void(0)" title="invitation" onclick="hello(this)">喜帖</a>
					</li>
					<li id="ablumn_btn"><a href="javascript:void(0)"
						title="ablumn" onclick="hello(this)">图集</a></li>
					<li id="story_btn"><a href="javascript:void(0)" title="story"
						onclick="hello(this)">故事</a></li>
					<li id="map_btn"><a href="javascript:void(0)" title="map"
						onclick="hello(this)">地图</a></li>
					<li id="signup_btn"><a href="javascript:void(0)"
						title="signup" onclick="hello(this)">回执</a></li>
				</ul>
			</div>
		</div>
		<div class="row visible-xs">
			<div class="btn-group center">
				<button type="button" class="btn btn-info" title="invitation"
					onclick="hello_xs(this)">喜帖</button>
				<button type="button" class="btn btn-info" title="ablumn"
					onclick="hello_xs(this)">图集</button>
				<button type="button" class="btn btn-info" title="story"
					onclick="hello_xs(this)">故事</button>
				<button type="button" class="btn btn-info" title="map"
					onclick="hello_xs(this)">地图</button>
				<button type="button" class="btn btn-info" title="signup"
					onclick="hello_xs(this)">回执</button>
			</div>
		</div>
		<div id="canvas">
			<div class="row">
				<div id="invitation" class="col-md-6 col-md-offset-3">
					<h3 id="date" class="text-center">
						<span class="glyphicon glyphicon-calendar"></span> 2014年11月22日
					</h3>
					<h3 class="text-center">
						<span class="glyphicon glyphicon-time"></span> 17:30
					</h3>
					<p class="text-center">
						新郎：<span class="name text-primary">于晓路</span>&nbsp;&nbsp; 新娘：<span
							class="name text-primary">徐晨珏</span>
					</p>
					<p class="text-center">谨于</p>
					<p id="m1" class="text-center"></p>
					<script type="text/javascript">
						countdown();
					</script>
					<p class="text-center">杭州市三台山路278号浙江宾馆锦绣厅举行结婚典礼</p>
					<p class="text-center">敬备薄酌，恭候光临</p>
				</div>
			</div>
		</div>
	</div>
	<audio autoplay hidden loop>
		<source src="/wedding/songs/perfect2.mp3" type="audio/mpeg">
	</audio>
</body>
</html>