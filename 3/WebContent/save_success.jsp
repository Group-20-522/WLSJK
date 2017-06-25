<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>考试报名系统</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="reset.css" />
<link rel="stylesheet" href="login.css" />

<script type="text/javascript">
	var time = 4;

	function returnUrlByTime() {

		window.setTimeout('returnUrlByTime()', 1000);

		time = time - 1;

		document.getElementById("layer").innerHTML = time;
	}
</script>

</head>

<body  onload="returnUrlByTime()">

<%  
	String kaoshenghao = (String)request.getAttribute("kaoshenghao");
	//String kaoshenghao = "jsp";
	
%>


	<div class="page">
	<div class="loginwarrp">
		<div class="logo">信息更新成功</div>
        
	</div>
	
	<div class="loginwarrp">
		<div class="logo"><span id="layer">3</span>秒后返回报考页面</div>
        <%
		//转向语句
		response.setHeader("Refresh", "3;URL=whochoose?kaoshenghao="+kaoshenghao);
	%>
	</div>
	
	
</div>
	
	
	
</body>
</html>