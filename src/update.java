import java.sql.*;
public class update 
{

	public static void main(String[] args) 
	{
		System.out.println("Update Records");
		Connection con=null;
		String url = "jdbc:mysql://localhost:3306/";
		String db = "jdbc";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url+db,"root","123456");
			
			try
			{
				Statement st = con.createStatement();
				String Sql = "select * from employee where EmpName like 's%'";
				st.executeUpdate(Sql);
				st.close();
				System.out.println("Data Done");
			}
			catch(SQLException s)
			{
				System.out.println("Exception Occourd");
				con.close();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
