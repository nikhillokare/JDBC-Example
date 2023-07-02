import java.sql.*;
public class Selecteg 
{
     public static void main(String[] args)
	{
		System.out.println("Select/Read Query Table");
		Connection con=null;
		String url = "jdbc:mysql://localhost:3306/";
		String db = "jdbc";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url+db,"root","Nikhil@07!<>");
			
			try
			{
				Statement st = con.createStatement();
				String Squery = "Delete from employee where EmpId=4";
				
				ResultSet res = st.executeQuery(Squery);
				System.out.println("Retrive Data:");
				
				while(res.next())
				{
					int EmpId=res.getInt("EmpId");
					String EmpName = res.getString("EmpName");
					int EmpSalary = res.getInt("EmpSalary");
					
					System.out.println("ID: "+EmpId);
					System.out.println("Name: "+EmpName);
					System.out.println("Salary: "+EmpSalary);
				}
				System.out.println("Data Done");
			}
			catch(SQLException s)
			{
				System.out.println("Exception Occourd");
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

