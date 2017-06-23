package get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class inServlet3
 */
@WebServlet("/inServlet3")
public class inServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		/*超级机构地质专业研究生信息记录*/
		String name = request.getParameter("studentname");//姓名
     	String sex = request.getParameter("sex");//性别
     	String maritalstatus = request.getParameter("maritalstatus");//婚姻状况
    	String year = request.getParameter("year"); //年
    	String month = request.getParameter("month"); //月
    	String day = request.getParameter("day"); //日
     	//String id = request.getParameter("sfid");//身份证号
     	String minzu = request.getParameter("minzu");//民族
     	String jiguan = request.getParameter("jiguan");//籍贯
     	String origin = request.getParameter("origin");//考生来源
     	String soldier = request.getParameter("soldier");//军人
     	String schooladdress = request.getParameter("schooladdress");//学习工作单位
     	String politicalstatus = request.getParameter("politicalstatus");//政治面貌
     	String address = request.getParameter("address");//住址
     	String phone = request.getParameter("grdh");//个人号码
     	String email = request.getParameter("email");//email
     	String youbian = request.getParameter("post");//邮编
     	String kaoshenghao = (String) request.getSession().getAttribute("testSession");//考生号
     	
     	
     	/*
     	 * 
     	 * 
     	 * 此部分做数据库连接，录入信息等
     	 * 
     	 * 
     	 * */
     	
     	
     	
		
		request.getRequestDispatcher("fill_in_success.jsp").forward(request, response);//下一个页面的跳转
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
