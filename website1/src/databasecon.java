import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class databasecon {

	Connection con;
	PreparedStatement psmt;
	
	public databasecon() {
		System.out.println("Connecting....");
       
       
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("driver connect ho gya");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//System.out.println("error1");
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			//System.out.println("connection ho gya");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//System.out.println("error2");
			e.printStackTrace();
		}
	}
	
		int insertData(String name , String mobile , String email, String username , String password){
		int status = 0;
		try {
			psmt = con.prepareStatement("insert into web1 values(?,?,?,?,?)");
			//System.out.println("statement mil gya");
			
			psmt.setString(1,name);
			psmt.setString(2,mobile);
			psmt.setString(3, email);
			psmt.setString(4, username);
			psmt.setString(5, password);
			
			status = psmt.executeUpdate();
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//System.out.println("error3");
			e.printStackTrace();
		}
		
		
		return status;
		}
	}


