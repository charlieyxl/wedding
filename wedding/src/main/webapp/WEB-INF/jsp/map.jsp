<%@ page language="java" pageEncoding="UTF-8"%>
<div>
	<p class="text-center">
		<span class="glyphicon glyphicon-map-marker"></span> 杭州三台山路278号浙江宾馆<span
			class="text-danger">(单号限行)</span>
	</p>
</div>
<div id="wrap" class="my-map">
	<div id="mapContainer"></div>
</div>
<script
	src="http://webapi.amap.com/maps?v=1.2&key=8325164e247e15eea68b59e89200988b"></script>
<script>
	!function() {
		var infoWindow, map, level = 13, center = {
			lng : 120.147342,
			lat : 30.23979
		}, features = [ {
			type : "Marker",
			name : "婚礼地点-浙江宾馆",
			desc : "杭州三台山路278号",
			color : "red",
			icon : "cir",
			offset : {
				x : -9,
				y : -31
			},
			lnglat : {
				lng : 120.129189,
				lat : 30.232152
			}
		} ];

		function loadFeatures() {
			for (var feature, data, i = 0, len = features.length, j, jl, path; i < len; i++) {
				data = features[i];
				switch (data.type) {
				case "Marker":
					feature = new AMap.Marker(
							{
								map : map,
								position : new AMap.LngLat(data.lnglat.lng,
										data.lnglat.lat),
								zIndex : 3,
								extData : data,
								offset : new AMap.Pixel(data.offset.x,
										data.offset.y),
								title : data.name,
								content : '<div class="icon icon-' + data.icon + ' icon-'+ data.icon +'-' + data.color +'"></div>'
							});
					break;
				case "Polyline":
					for (j = 0, jl = data.lnglat.length, path = []; j < jl; j++) {
						path.push(new AMap.LngLat(data.lnglat[j].lng,
								data.lnglat[j].lat));
					}
					feature = new AMap.Polyline({
						map : map,
						path : path,
						extData : data,
						zIndex : 2,
						strokeWeight : data.strokeWeight,
						strokeColor : data.strokeColor,
						strokeOpacity : data.strokeOpacity
					});
					break;
				case "Polygon":
					for (j = 0, jl = data.lnglat.length, path = []; j < jl; j++) {
						path.push(new AMap.LngLat(data.lnglat[j].lng,
								data.lnglat[j].lat));
					}
					feature = new AMap.Polygon({
						map : map,
						path : path,
						extData : data,
						zIndex : 1,
						strokeWeight : data.strokeWeight,
						strokeColor : data.strokeColor,
						strokeOpacity : data.strokeOpacity,
						fillColor : data.fillColor,
						fillOpacity : data.fillOpacity
					});
					break;
				default:
					feature = null;
				}
				if (feature) {
					AMap.event.addListener(feature, "click", mapFeatureClick);
				}
			}
		}

		function mapFeatureClick(e) {
			if (!infoWindow) {
				infoWindow = new AMap.InfoWindow({
					autoMove : true,
					map : map
				});
			}
			var extData = e.target.getExtData();
			infoWindow.setContent("<h5>" + extData.name + "</h5><div>"
					+ extData.desc + "</div>");
			infoWindow.open(map, e.lnglat);
		}

		map = new AMap.Map("mapContainer", {
			center : new AMap.LngLat(center.lng, center.lat),
			level : level
		});

		loadFeatures();
		map.plugin([ "AMap.ToolBar", "AMap.OverView", "AMap.Scale" ],
				function() {
					map.addControl(new AMap.ToolBar);
					map.addControl(new AMap.OverView({
						isOpen : true
					}));
					map.addControl(new AMap.Scale);
				});
	}();
</script>