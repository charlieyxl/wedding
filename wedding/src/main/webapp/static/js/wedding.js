function hello(btn){
	$.ajax({
		url: btn.title,
		type: "get",
		success: function(result) {
			$("#canvas").html(result);
			$("li.active").attr('class', '');
			$("#"+btn.title+"_btn").attr('class', 'active');
		}
	});
};
function hello_xs(btn){
	$.ajax({
		url: btn.title,
		type: "get",
		success: function(result) {
			$("#canvas").html(result);
		}
	});
};
function countdown()
{
	var day=hour=min=sec=0;
	var endtime = Date.parse("Sun, 22 Nov 2014 17:30:00 GMT+800"); 
	var todaytime = new Date();  
	var tmp=endtime-todaytime;
	if (tmp > 0) {
		day=Math.floor(tmp/86400000);
		tmp%=86400000;
		hour=Math.floor(tmp/3600000);
		tmp%=3600000;
		min=Math.floor(tmp/60000);
		tmp%=60000;
		sec=Math.floor(tmp/1000);
	} else {
		day = hour = min = sec = 0;
	}
	var str = " "+day+" 天 "+hour+" 小时 "+min+" 分钟 "+sec+" 秒后 ";
	document.getElementById("m1").innerHTML= str;
	setTimeout("countdown()",1000);
};

