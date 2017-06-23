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
 
      
<script type="text/javascript">
function ShowElement(element)
{
var oldhtml = element.innerHTML;
var newobj = document.createElement('input');
//创建新的input元素
newobj.type = 'text';
newobj.value = oldhtml;
//为新增元素添加类型
newobj.onblur = function(){
element.innerHTML = this.value == oldhtml ? oldhtml : this.value;

//当触发时判断新增元素值是否为空，为空则不修改，并返回原有值 
}
element.innerHTML = ' ';
element.appendChild(newobj);
newobj.focus();
}
</script>


  </head>  
    
  <body>  
  <div id="blog-news">
   <embed wmode="transparent" src="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.swf" quality="high" bgcolor="#ffffff" width="160" height="70" name="honehoneclock" align="middle" allowscriptaccess="always" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer">
   </div>
   
   
   
   
 <%  
	String name = (String)request.getAttribute("name");
 String kaoshenghao = (String)request.getAttribute("kaoshenghao");
 	String sex = (String)request.getAttribute("sex");
 	String year = (String)request.getAttribute("year");
 	String month = (String)request.getAttribute("month");
 	String day = (String)request.getAttribute("day");
	String chusheng = year + "年" +  month + "月" +  day + "日";
 	String id = (String)request.getAttribute("id");
 	String minzu = (String)request.getAttribute("minzu");
 	String jiguan = (String)request.getAttribute("jiguan");
 	String xueli = (String)request.getAttribute("xueli");
 	String schooladdress = (String)request.getAttribute("schooladdress");
 	String zhuanye = (String)request.getAttribute("zhuanye");
 	String xuelixingzhi = (String)request.getAttribute("xuelixingzhi");
 	String dotime = (String)request.getAttribute("dotime");
 	String baokaojibie = (String)request.getAttribute("baokaojibie");
 	String zhiwu = (String)request.getAttribute("zhiwu");
 	String address = (String)request.getAttribute("address");
 	String phone = (String)request.getAttribute("phone");
 	String email = (String)request.getAttribute("email");
 	String youbian = (String)request.getAttribute("youbian");
%> 
  
  <div id="hd_cnt">
<div class="list_hdcnt">
 <form id="add_user" name="add_user" action="hadchoose.jsp" method="post">
			  <table width="100%" align="center" cellpadding="0" cellspacing="0" border="1" bordercolor="#BBBBBB">
                <tbody>
               
                    <tr class="TDtop">
     <td height="25" colspan="8" align="center" bgcolor="#D3E3ED" class="bs_bg"><div align="center">全 国 会 计 资 格 考 试 考 生 信 息 表</div></td>
                    </tr>
             
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">姓　　名：</td>
                    <td align="left" width="300" bgcolor="#FFFFFF" height="27" ><%=name %></td>
                 </tr>
                 
                      <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">考　　号：</td>
                    <td align="left" width="300" bgcolor="#FFFFFF" height="27"><%=kaoshenghao %></td>
                 </tr>   
				          
                 
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">性　　别：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=sex %></td>
                  </tr>
                  
    
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">出生日期：</td>
					<td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=chusheng %></td>
                   
                  </tr>
                  
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">身份证号：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=id %></td>
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">民　　族：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=minzu %></td>
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">籍　　贯：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=jiguan %></td>
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">学　　历：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=xueli %></td>
                  </tr>
                  
                  
                   <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">毕业院校：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"  ondblclick="ShowElement(this)"><%=schooladdress %></td>
                    <td align="center" width="104" bgcolor="GRAY" height="27">属性双击可修改</td>
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">专　　业：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=zhuanye %></td>
                  
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">学历性质：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=xuelixingzhi %></td>
                  
                  </tr>
                  
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#d4d8e2" height="27">工作年限：</td>
                    <td align="left" width="104" bgcolor="#d4d8e2" height="27"  ondblclick="ShowElement(this)" title="sdsa"><%=dotime %></td>
                  <td align="center" width="104" bgcolor="#d4d8e2" height="27">属性双击可修改</td>
                  </tr>
                  
                  
                 <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">报考级别：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=baokaojibie %></td>
                  
                  </tr>
                  
                  
                <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">所在岗位的职务：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27" ondblclick="ShowElement(this)"><%=zhiwu %></td>
                  <td align="center" width="104" bgcolor="GRAY" height="27">属性双击可修改</td>
                  </tr>
                  
                  
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">家庭住址：</td>
					<td align="left" width="104" bgcolor="#FFFFFF" height="27" ondblclick="ShowElement(this)"><%=address %></td>
					<td align="center" width="104" bgcolor="GRAY" height="27">属性双击可修改</td>
                  </tr>
                
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">个人电话：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27" ondblclick="ShowElement(this)"><%=phone %></td>
                    <td align="center" width="104" bgcolor="GRAY" height="27">属性双击可修改</td>
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">Email：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27" ondblclick="ShowElement(this)"><%=email %></td>
                    <td align="center" width="104" bgcolor="GRAY" height="27">属性双击可修改</td>
                  </tr>
                  
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">邮　　编：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27" ondblclick="ShowElement(this)"><%=youbian %></td>
                    <td align="center" width="104" bgcolor="GRAY" height="27">属性双击可修改</td>
                  </tr>
                  
             
                  <tr valign="center" bgcolor="#009966">
                    <td height="16" colspan="3" bgcolor="#FFFFFF" style="BORDER-TOP-WIDTH: 1px; BORDER-RIGHT: #000080 1px solid; BORDER-LEFT: #000080 1px solid; BORDER-BOTTOM: #000080 1px solid">
                    <p align="center">
                    
						<input name="submit" type="submit" style="COLOR: #000000" value="保 存">
                     	<input type="button" style="COLOR: #000000" value="返 回" onclick="window.location.href='write4.jsp';"/>
                 
                    </p></td>
                  </tr>
                
                </tbody>
            </table></form>
</div>
</div>
  
  
  </body>  
</html>  