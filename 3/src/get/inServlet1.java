package get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class inServlet1
 */
@WebServlet("/inServlet1")
public class inServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		/*四级考试学生信息获取*/
		String name = request.getParameter("studentname");//姓名
     	String sex = request.getParameter("sex");//性别
    	String year = request.getParameter("year"); //年
    	String month = request.getParameter("month"); //月
    	String day = request.getParameter("day"); //日
     	//String id = request.getParameter("sfid");//身份证号
     	String minzu = request.getParameter("minzu");//民族
     	String jiguan = request.getParameter("jiguan");//籍贯
     	String xueli = request.getParameter("xueli");//学历
     	String school = request.getParameter("schooladdress");//学校
     	String address = request.getParameter("address");//家庭地址
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
