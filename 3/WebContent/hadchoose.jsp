<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
 
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
 
      
    <title>考试报名系统</title>  
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
 
      
    
  </head>  
    
    
  <body>  
  <h1 align="center">已 报 考 科 目 查 看</h1>  
    <hr/>
      
<%  
	String kaoshenghao = (String)request.getAttribute("kaoshenghao");
%>
        
        
        
<%  
	int number = (int)request.getAttribute("number");
%> 
        
        <fieldset>
		<legend><span id="lblBt">已 报 考 科 目 列 表</span></legend>
		<table class="datelist" cellspacing="0" cellpadding="3" border="0" id="DBGridInfo" width="100%">
			<tbody><tr class="datelisthead">
				<td>序号</td><td>名称</td><td></td><td></td><td></td><td></td><td></td><td>操作</td></tr>
				<% 
				for(int i=0;i<number;++i)
				{  %>
				
				<tr>
				<td><%=i+1 %></td>
				<%
					int subjectnumber =  (int)request.getAttribute("subjectnumber"+i);
					String subjectname = (String)request.getAttribute("subjectname"+i);
					
				%>
				<td><%=subjectname %>></td><td></td><td></td><td></td><td></td><td></td><td><a href="outServlet<%=subjectnumber %>?kaoshenghao=<%=kaoshenghao %>">查 看</a></td>
				</tr>
				<% }%>
				
				
			</tbody>
		</table>
		</fieldset>
        
        <h1></h1>
     <form action="choose.jsp" method="post" align="center" >     
    	<input type="submit" style="width:110px; height:35px "value="返回报考页面" />   
    </form>
    
  </body>  
</html>  