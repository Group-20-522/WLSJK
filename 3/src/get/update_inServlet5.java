package get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class update_inServlet5
 */
@WebServlet("/update_inServlet5")
public class update_inServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update_inServlet5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
     	
    
   
 
     	//String schooladdress = request.getParameter("schooladdress");// 毕业院校
     
     	//String dotime = request.getParameter("dotime");//工作年限
     	//String zhiwu = request.getParameter("zhiwu");//所在岗位职务
     	String address = request.getParameter("address");//家庭住址
     	//String phone = request.getParameter("grdh");//个人号码
     	//String email = request.getParameter("email");//email
     	//String youbian = request.getParameter("post");//邮编
     	//String kaoshenghao = request.getParameter("kaoshenghao");//考生号
     	System.out.println(address);
     	
     	/*
     	 * 
     	 * 
     	 * 此部分做数据库连接，录入更新信息等
     	 * 
     	 * 
     	 * */
     	
     	
     	
     	
		
		request.getRequestDispatcher("save_success.jsp").forward(request, response);//下一个页面的跳转
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
