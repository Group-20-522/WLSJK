package get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login_inServlet
 */
@WebServlet("/login_inServlet")
public class login_inServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login_inServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*登录*/
		request.setCharacterEncoding("UTF-8");		
		String id = request.getParameter("Username");//身份证号
     	String password = request.getParameter("NPassword");//密码
     	String kaoshenghao;
     	/*
     	 * 
     	 * 查数据库看看有没有这个人
     	 * 
     	 * 
     	 * 
     	 * */
     	
     	
     	/*
     	if(查有此人)
     	{
     		
     		
     		 //入库拿考生号 kaoshenghao=?
     		
     	
			request.setAttribute("kaoshenghao",kaoshenghao);
     		request.getRequestDispatcher("choose.jsp").forward(request, response);
     		
     	}
     	else
     	{
     		request.getRequestDispatcher("login_fail.jsp").forward(request, response);
     	}
		*/
     	
     	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
