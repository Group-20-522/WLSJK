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
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
   	<link rel="stylesheet" href="login.css" />
      
    
  </head>  
    
    
  <body>  
  <h1 align="center"> 科 目 报 考 情 况 查 询</h1>  
    <hr/>
      
    
        
        
        <fieldset>
		<legend><span id="lblBt">科 目 列 表</span></legend>
		<table class="datelist" cellspacing="0" cellpadding="3" border="0" id="DBGridInfo" width="100%">
			<tbody><tr class="datelisthead">
				<td>序号</td><td>名称</td><td></td><td></td><td></td><td></td><td></td><td>操作</td></tr>
				<tr>
				<td>1</td><td>英 语 四 级 考 试</td><td></td><td></td><td></td><td></td><td></td><td><a href="find?kemuhao=1">查 询</a></td>
				</tr>
				
				<tr>
				<td>2</td><td>超 级 机 构 地 质 专 业 研 究 生 考 试</td><td></td><td></td><td></td><td></td><td></td><td><a href="find?kemuhao=3">查 询</a></td>
				</tr>
				<tr>
				<td>3</td><td>全 国 计 算 机 等 级 考 试</td><td></td><td></td><td></td><td></td><td></td><td><a href="find?kemuhao=4">查 询</a></td>
				</tr>
				<tr>
				<td>4</td><td>全 国 会 计 资 格 考 试</td><td></td><td></td><td></td><td></td><td></td><td><a href="find?kemuhao=5">查 询</a></td>
				</tr>
				<tr>
				
			</tbody>
		</table>
		</fieldset>
        
        <h1></h1>
      
    
  </body>  
</html>  