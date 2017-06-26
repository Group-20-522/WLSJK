package show;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBHelper;
import db.DBconfig;

/**
 * Servlet implementation class whochoose
 */
@WebServlet("/whochoose")
public class whochoose extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public whochoose() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		String kaoshenghao = null;
		String kaoshenghao1 = null;
		String kaoshenghao2 = null;
		
		kaoshenghao = (String)request.getAttribute("kaoshenghao");//java接收
		kaoshenghao1 = request.getParameter("kaoshenghao");//jsp接收
		kaoshenghao2 = (String) request.getSession().getAttribute("kaoshenghao");//java接收
		
		if(kaoshenghao == null)
		{
			kaoshenghao = kaoshenghao1;
		}
		if(kaoshenghao == null)
		{
			kaoshenghao = kaoshenghao2;
		}
		
		
		request.setAttribute("kaoshenghao",kaoshenghao);
		System.out.println("考生号="+kaoshenghao);
		/*
		 * 
		 * 连接数据库，利用考生号查看已经报考科目
		 * 需要知道已报考科目数目number；
		 * 知道具体科目号；
		 * 
		 * */
		DBHelper.DB_driver();
		Connection conn;
		int a=0,b=0,c=0,d=0;
		try { Statement stmt;
		 
			conn = DriverManager.getConnection(DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);
			stmt = conn.createStatement();
			String sql = "select * from baokaokemu where kaoshenghao='"+kaoshenghao+"';";    //要执行的SQL
			ResultSet rs = stmt.executeQuery(sql);//创建数据对象
            System.out.println("编号"+"\t"+"姓名"+"\t"+"年龄");
            while (rs.next()){
            	int i=0;
            	i = rs.getInt("kemuhao");
            	if(i==1) a=1;
            	else if(i==3) b=1;
            	else if(i==4) c=1;
            	else if(i==5) d=1;
            	}
            rs.close();
            stmt.close();
            conn.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		
		
		RequestDispatcher rd = request.getRequestDispatcher("choose.jsp");		
	
        

			request.setAttribute("subjectnumber1",a);
			request.setAttribute("subjectnumber2",b);
			request.setAttribute("subjectnumber3",c);
			request.setAttribute("subjectnumber4",d);
		
		rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
