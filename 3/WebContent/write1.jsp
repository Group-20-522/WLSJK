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
    <!-- 
    <link rel="stylesheet" type="text/css" href="styles.css"> 
    -->  
      
    <script   Language="javaScript">   
		function   validate()   
		{   
				if (add_user.studentname.value=="")   
				{   
						alert("姓名不能为空.");   
						document.add_user.studentname.focus();   
						return false  ;   
				}  
			
				if (add_user.minzu.value=="")   
				{   
						alert("民族不能为空.");   
						document.add_user.minzu.focus();   
						return false  ;   
				}   
				
				if (add_user.schooladdress.value=="")   
				{   
						alert("学校不能为空.");   
						document.add_user.schooladdress.focus();   
						return false  ;   
				}
			
				if (add_user.address.value=="")   
				{   
						alert("家庭住址不能为空.");   
						document.add_user.address.focus();   
						return false  ;   
				}
				
				if (add_user.grdh.value=="")   
				{   
						alert("个人电话不能为空.");   
						document.add_user.grdh.focus();   
						return false  ;   
				}
				
				if (add_user.email.value=="")   
				{   
						alert("email不能为空.");   
						document.add_user.email.focus();   
						return false  ;   
				}
 				return  true;   
		}   
  </script>    
    
    
  </head>  
    
  <body>  
  <div id="blog-news">
   <embed wmode="transparent" src="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.swf" quality="high" bgcolor="#ffffff" width="160" height="70" name="honehoneclock" align="middle" allowscriptaccess="always" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer">
   </div>
  
  
  <div id="hd_cnt">
<div class="list_hdcnt">
 <form id="add_user" name="add_user" action="inServlet1" method="post"  onsubmit="return validate()">
			  <table width="100%" align="center" cellpadding="0" cellspacing="0" border="1" bordercolor="#BBBBBB">
                <tbody>
               
                    <tr class="TDtop">
     <td height="25" colspan="8" align="center" bgcolor="#D3E3ED" class="bs_bg"><div align="center">英 语 四 级 考 试 报 名 表</div></td>
                    </tr>
             
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">&nbsp;&nbsp;&nbsp;&nbsp; 姓　　名：</td>
                    <td align="left" width="218" bgcolor="#FFFFFF" height="27"><input name="studentname" class="login_username" size="10">
                        <span class="样式4">* </span></td>
                    <td align="left" width="196" bgcolor="#FFFFFF" height="27"></td>
                  </tr>
				          
                 
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">性　　别：</td>
                    <td align="left" width="218" bgcolor="#FFFFFF" height="27"><select name="sex" size="1" class="login_username" style="BORDER-RIGHT: 1px solid; PADDING-RIGHT: 4px; BORDER-TOP: 1px solid; PADDING-LEFT: 4px; PADDING-BOTTOM: 1px; BORDER-LEFT: 1px solid; PADDING-TOP: 1px; BORDER-BOTTOM: 1px solid">
                      <option value="男" selected="">男</option>
                      <option value="女">女</option>
                    </select>
                        <span class="样式4">* </span></td>
                    <td align="left" width="196" bgcolor="#FFFFFF" height="27"></td>
                  </tr>
                  
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">出生日期：</td>
                    <td width="218" bgcolor="#FFFFFF" height="27">
                   <select name="year" class="login_username" id="year">
                          <option value="1967">1967</option>
                          <option value="1968">1968</option>
                          <option value="1969">1969</option>
                          <option value="1970">1970</option>
                          <option value="1971">1971</option>
                          <option value="1972">1972</option>
                          <option value="1973">1973</option>
                          <option value="1974">1974</option>
                          <option value="1975">1975</option>
                          <option value="1976">1976</option>
                          <option value="1977">1977</option>
                          <option value="1978">1978</option>
                          <option value="1979">1979</option>
                          <option value="1980">1980</option>
                          <option value="1981">1981</option>
                          <option value="1982">1982</option>
                          <option value="1983">1983</option>
                          <option value="1984">1984</option>
                          <option value="1985">1985</option>
                          <option value="1986">1986</option>
                          <option value="1987">1987</option>
                          <option value="1988">1988</option>
                          <option value="1989">1989</option>
                          <option value="1990">1990</option>
                          <option value="1991">1991</option>
                          <option value="1992">1992</option>
                          <option value="1993">1993</option>
                          <option value="1994">1994</option>
                          <option value="1995">1995</option>
                          <option value="1996" selected="">1996</option>
                          <option value="1997">1997</option>
                          <option value="1998">1998</option>
                          <option value="1999">1999</option>    
                        </select>
                      年
                        <select name="month" class="login_username" id="month">
                          <option value="01">01</option>
                          <option value="02">02</option>
                          <option value="03">03</option>
                           <option value="04" selected="">04</option>
                          <option value="05">05</option>
                          <option value="06">06</option>
                          <option value="07">07</option>
                          <option value="08">08</option>
                          <option value="09">09</option>
                          <option value="10">10</option>
                          <option value="11">11</option>
                          <option value="12">12</option>
                        </select>
                      月
                      <select name="day" class="login_username" id="day">
                          <option value="01">01</option>
                          <option value="02">02</option>
                          <option value="03">03</option>
                          <option value="04">04</option>
                          <option value="05">05</option>
                          <option value="06">06</option>
                          <option value="07">07</option>
                          <option value="08">08</option>
                          <option value="09">09</option>
                          <option value="10">10</option>
                          <option value="11">11</option>
                          <option value="12">12</option>
                          <option value="13">13</option>
                          <option value="14" selected="">14</option>
                          <option value="15">15</option>
                          <option value="16">16</option>
                          <option value="17">17</option>
                          <option value="18">18</option>
                          <option value="19">19</option>
                          <option value="20">20</option>
                          <option value="21">21</option>
                          <option value="22">22</option>
                          <option value="23">23</option>
                          <option value="24">24</option>
                          <option value="25">25</option>
                          <option value="26">26</option>
                          <option value="27">27</option>
                          <option value="28">28</option>
                          <option value="29">29</option>
                          <option value="30">30</option>
                          <option value="31">31</option>
                      </select>
                      日 <span class="样式4">*</span> </td>
                   
                  </tr>
                  
                  
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">民　　族：</td>
                    <td width="218" bgcolor="#FFFFFF" height="27"><input name="minzu" class="login_username" value="汉族" size="10">
                        <span class="样式4">*</span> </td>
                    <td width="196" bgcolor="#FFFFFF" height="27"></td>
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">籍　　贯：</td>
                    <td width="218" bgcolor="#FFFFFF" height="27"><select name="jiguan" size="1" class="login_username">
                        <option value="北京" selected="">北京</option>
                        <option value="福建">福建</option>
                        <option value="上海">上海</option>
                        <option value="天津">天津</option>
                        <option value="重庆">重庆</option>
                        <option value="浙江">浙江</option>
                        <option value="河北">河北</option>
                        <option value="河南">河南</option>
                        <option value="山东">山东</option>
                        <option value="山西">山西</option>
                        <option value="内蒙">内蒙</option>
                        <option value="辽宁">辽宁</option>
                        <option value="吉林">吉林</option>
                        <option value="黑龙江">黑龙江</option>
                        <option value="江苏">江苏</option>
                        <option value="浙江">浙江</option>
                        <option value="安徽">安徽</option>
                        <option value="江西">江西</option>
                        <option value="湖北">湖北</option>
                        <option value="湖南">湖南</option>
                        <option value="广东">广东</option>
                        <option value="广西">广西</option>
                        <option value="海南">海南</option>
                        <option value="四川">四川</option>
                        <option value="贵州">贵州</option>
                        <option value="云南">云南</option>
                        <option value="西藏">西藏</option>
                        <option value="陕西">陕西</option>
                        <option value="甘肃">甘肃</option>
                        <option value="青海">青海</option>
                        <option value="宁夏">宁夏</option>
                        <option value="新疆">新疆</option>
                        <option value="台湾">台湾</option>
                        <option value="香港">香港</option>
                        <option value="澳门">澳门</option>
                    </select>
                        <span class="样式4">*</span> </td>
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">学　　历：</td>
                    <td width="218" bgcolor="#FFFFFF" height="27"><select name="xueli" size="1" class="login_username">
                      <option value="本科" selected="">本科</option>
                      <option value="研究生">研究生</option>
                      <option value="博士">博士</option>
                    </select>
                        <span class="样式4">* </span></td>
                    <td align="left" width="196" bgcolor="#FFFFFF" height="27"></td>
                  </tr>
                  
                   <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">学　　校：</td>
                    <td width="218" bgcolor="#FFFFFF" height="27"><input name="schooladdress" class="login_username" id="schooladdress">
                        <span class="样式4">*</span> </td>
                  
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">家庭住址：</td>
                    <td width="218" bgcolor="#FFFFFF" height="27"><input name="address" class="login_username" id="address">
                        <span class="样式4">*</span> </td>
                    <td width="196" bgcolor="#FFFFFF" height="27">寄成绩单用，请务必填写正确！</td>
                  </tr>
                
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">个人电话：</td>
                    <td width="218" bgcolor="#FFFFFF" height="27"><input name="grdh" class="login_username" id="grdh">
                        <span class="样式3">*</span> </td>
                    <td width="196" bgcolor="#FFFFFF" height="27">请正确输入，便于联系。</td>
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">Email：</td>
                    <td width="218" bgcolor="#FFFFFF" height="27"><input name="email" class="login_username">
                        <span class="样式4">*</span> </td>
                    <td width="196" bgcolor="#FFFFFF" height="27">给你发送报名反馈信息用，请正确输入！</td>
                  </tr>
                  
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">邮　　编：</td>
                    <td width="218" bgcolor="#FFFFFF" height="27"><input name="post" class="login_username" id="post" size="10">
                 
                  </tr>
                  
             
                  <tr valign="center" bgcolor="#009966">
                    <td height="16" colspan="3" bgcolor="#FFFFFF" style="BORDER-TOP-WIDTH: 1px; BORDER-RIGHT: #000080 1px solid; BORDER-LEFT: #000080 1px solid; BORDER-BOTTOM: #000080 1px solid">
                    <p align="center">

                      <input name="submit" type="submit" style="COLOR: #000000" value="提交">
                 
                      <input style="COLOR: #000000" type="reset" value="重填" name="reset">
                    </p></td>
                  </tr>
                
                </tbody>
            </table></form>
</div>
</div>
  
  
  </body>  
</html>  