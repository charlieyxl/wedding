<%@ page language="java" pageEncoding="UTF-8"%>
<p class="text-center lead text-success" id="confirm_info">
	<span class="glyphicon glyphicon-ok-circle"></span><%= request.getAttribute("info_str") %>
</p>
<p class="text-center">姓名：<%= request.getAttribute("name") %></p>
<p class="text-center">人数：<%= request.getAttribute("number") %></p>