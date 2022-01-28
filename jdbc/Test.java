package jdbc;
import java.sql.*;

public class Test {

	public static void main(String[] args) {
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connect = DriverManager.getConnection("jdbc:mysql:///newbase","root","000001");
			
			Statement state = connect.createStatement();
			
			//String tableCreation = "create table viedo(sNo int,name varchar(100),addr varchar(100))"; 
			
			//state.executeUpdate(tableCreation);
			
//			String dataAdd = "insert into viedo values(1,'mugesh','salem')";
//			String dataAdd1 = "insert into viedo values(2,'subu','thirunelveli')";
//			
//			state.executeUpdate(dataAdd);
//			state.executeUpdate(dataAdd1);
			
			

//			String alter = "alter table viedo add (numb INT)";
//			state.executeUpdate(alter);
			
//			String update = "update viedo set num = 81222 where sNo = 1";
//			String update1 = "update viedo set num = 8300 where sNo = 2";
//			state.executeUpdate(update);
//			state.executeUpdate(update1);

			ResultSet result = state.executeQuery("select * from viedo");
			while(result.next())
			{
				System.out.println(result.getInt("sNo")+"\t"+result.getString("name")+"\t"+result.getString("addr")+"\t"+result.getString("num"));
			}
		
			
			
			
			
			
//			
//			ResultSet result = state.executeQuery("select * from details where id = 1");
//			while(result.next())
//			{
//				System.out.println(result.getInt("id")+"\t"+result.getString("name")+"\t"+result.getString("address")+"\t"+result.getString("email")+"\t"+result.getString("number"));
//			}
			
			
			
			
		}
		catch(Exception e){
			System.out.println("error"+e);
		}
		

	}

}
