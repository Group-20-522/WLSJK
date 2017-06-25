package db;

import java.sql.*;



public class Try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	    try {
	        Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
	        //Class.forName("org.gjt.mm.mysql.Driver");
	       System.out.println("Success loading Mysql Driver!");
	      }
	      catch (Exception e) {
	        System.out.print("Error loading Mysql Driver!");
	        e.printStackTrace();
	      }
	    */
		
	    Connection connect = null;
		Statement stmt = null;
	      try {
	        connect = DriverManager.getConnection(
	        		DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);	//连接

	        System.out.println("Success connect Mysql server!");
	        stmt = connect.createStatement();
	       String a = "341204199801310217";
	       String b = "1234";
	        String sql = "select * from password where ID = '"+a+"'and password ='"+b+"';";//定义SQL语句
//	        boolean a = stmt.execute(sql);
//	        if(a) System.out.println("yes");
//	        if(!a) System.out.println("no");
	        ResultSet rs = stmt.executeQuery(sql);
	        
//	        if(rs.next()) System.out.println("yes");
//	        else System.out.println("no");
	        String password;
	        if(rs.next()) {
	        	System.out.println("yes");
	        	/*
		  		password = rs.getString("password");
		  		System.out.println(password);
		  		if(password==a) System.out.println("yes");
		  		else System.out.println("no");
		  		System.out.println(a.length());
		  		
		  		System.out.println(password.length());
//	          System.out.println(rs.getString("ID")+"\t"+rs.getString("kaoshenghao"));
 */
	        }
	  		else System.out.println("no");

	        if(stmt != null){
				stmt.close();
			}
	        if (connect != null) {
	        	connect.close();
			}
	      }
	      catch (SQLException e) {
	        System.out.print("get data error!");
	        e.printStackTrace();
	      }
	      
	    	 
	      
		
		
		
		
	}
}
