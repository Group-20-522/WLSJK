package show;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
 * Servlet implementation class hadchoose_outServlet
 */
@WebServlet("/hadchoose_outServlet")
public class hadchoose_outServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hadchoose_outServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String kaoshenghao = (String) request.getSession().getAttribute("kaoshenghao");//考生号
	
//		request.setAttribute("kaoshenghao",kaoshenghao);
		System.out.println("考生号"+kaoshenghao);
//		kaoshenghao = "1";
		/*
		 * 
		 * 连接数据库，利用考生号查看已经报考科目
		 * 需要知道已报考科目数目number；
		 * ；
		 * 
		 * */
		DBHelper.DB_driver();
		int number=0;
		Connection connect = null;
     	Statement stmt = null;
     	int[] kemuhao = new int[4];

     	try {
     	      connect = DriverManager.getConnection(
     	          DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);

     	      System.out.println("Success connect Mysql server!");
     	      stmt = connect.createStatement();
     	      String sql = "select * from baokaokemu where kaoshenghao='"+kaoshenghao+"';";	//查询表user
	     	  ResultSet rs = stmt.executeQuery(sql);	
	     	  while(rs.next()) {
	     		  kemuhao[number] = Integer.parseInt(rs.getString("kemuhao"));
	     		  number++;
     	      }
	     	  if(stmt != null) stmt.close();
	     	  if(connect != null) connect.close();
	     	  
     	    }
     	    catch (Exception e) {
     	      System.out.print("get data error!");
     	      e.printStackTrace();
     	    }
		
		
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("hadchoose.jsp");
		
		request.setAttribute("number",number);
        
		for(int i = 0 ; i < number ; ++i)
		{
			/*知道具体科目号及科目名*/
			request.setAttribute("subjectnumber"+i,kemuhao[i]);
//			String subjectname = "apple"+i+3;
			request.setAttribute("subjectname"+i,DBconfig.kemuming[kemuhao[i]-1]);
		}
		
		
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
