<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
      
    <title>考试报名系统</title>  
      
 
 	<link rel="stylesheet" href="reset.css" />
	<link rel="stylesheet" href="login.css" />
  
  <script   Language="javaScript">   
		function   validate()   
		{   
				if (myform.Username.value == "")   
				{   
						alert("身份证号不能为空.");   
						document.myform.Username.focus();   
						return false  ;   
				}  
				if (myform.NPassword.value == "")   
				{   
						alert("密码不能为空.");   
						document.myform.NPassword.focus();   
						return false  ;   
				}  
				if (myform.NBPassword.value == "")   
				{   
						alert("确认密码不能为空.");   
						document.myform.NBPassword.focus();   
						return false  ;   
				}
				if (!(myform.NPassword.value == myform.NBPassword.value))
				{   
						alert("两密码不等.");   
						document.myform.NPassword.focus();   
						return false  ;   
				} 
 				return  true;   
		}   
  </script>   
  
  
  
  
  </head>  
    
  <body>  
  <div class="page">
	<div class="loginwarrp">
		<div class="logo">考生账号注册</div>
        <div class="login_form">
			<form id="Login" name="myform" method="post" onsubmit="return validate()" action="logon_inServlet">
				<li class="login-item">
					<span>身份证号：</span>
					<input type="text" id="username" name="Username" class="login_input" >
                                        <span id="count-msg" class="error"></span>
				</li>
				<li class="login-item">
					<span>密　　码：</span>
					<input type="password" id="password" name="NPassword" class="login_input" >
                                        <span id="password-msg" class="error"></span>
				</li>
				
				<li class="login-item">
					<span>确认密码：</span>
					<input type="password" id="password" name="NBPassword" class="login_input" >
                                        <span id="password-msg" class="error"></span>
				</li>
            
				
				<div class="clearfix"></div>
				<li class="login-sub">
					<input type="submit" name="Submit" value="注册" />
                    <input type="reset" name="Reset" value="重置" />
				</li>  
				<li class="login-tiao">
                    <input type="button" name="Reset" value="返	  回" onclick="window.location.href='login.jsp'"/>
				</li>                     
           </form>
		</div>
	</div>
</div>


</html>