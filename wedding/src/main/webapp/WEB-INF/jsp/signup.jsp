<%@ page language="java" pageEncoding="UTF-8"%>
<div id="confirm" class="container-fluid col-md-4 col-md-offset-4 col-xs-10 col-xs-offset-1">
<form action="confirm" method="POST" class="form-horizontal" role="form">
  <div class="form-group">
    <label for="inputName" class="col-sm-2 control-label col-md-offset-1">姓名</label>
    <div class="col-sm-7">
	  <div class="input-group">
	    <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
        <input type="text" name="name" class="form-control" id="name" maxlength="30" placeholder="Name">
	  </div>
    </div>
  </div>
  <div class="form-group">
    <label for="inputNum" class="col-sm-2 control-label col-md-offset-1">人数</label>
    <div class="col-sm-7">
	  <div class="input-group">
	    <span class="input-group-addon"><span class="glyphicon glyphicon-plus-sign"></span></span>
		<select class="form-control" id="number" name="number">
			<option>1</option>
			<option>2</option>
			<option>3</option>
			<option>4</option>
		</select>
	   </div>
    </div>
  </div>
  <div class="form-group">
      <div  class="checkbox center">
        <label>
          <input type="checkbox" id="checkit" checked="checked">参加婚礼
        </label>
      </div>
  </div>
  <div class="form-group">
    <div class="center">
      <button class="btn btn-info text-center center" type="button" onclick="submitForm2()">
      	<span class="glyphicon glyphicon-ok"></span>确认
      </button>
	  <script type="text/javascript">
		function submitForm2(){
			var number = 0;
			if ($("#checkit").is(":checked")) {
				var number = $("#number").val();
			}
			$.ajax({
				type: "GET",
				url : '/wedding/invitation/confirm',
				data : {
					"name": $("#name").val(),
					"number": number,
					"timestamp": new Date()
				},
				success: function(result) {
					$("#canvas").html(result);
				}
			});
		};
	  </script>
    </div>
  </div>
</form>
</div>