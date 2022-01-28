package jdbc;
import java.sql.*;

public class Connect {
	
	public static void main(String[] args)
	{
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql:///newbase","root","000001");
		
		Statement state = connect.createStatement();
		//String input = "create table new(id int,name varchar(100),address varchar(100))";
		//String input1 = "insert into new values(1,'mugesh','salem') ";
//		String input = "insert into new values(2,'subu','Thirunelveli')";
//		String input2 = "insert into new values(3,'sithin','Dharmapuri')";
//		state.executeUpdate(input);
//		state.executeUpdate(input2);
		String inp = "alter table details ";
		
		ResultSet result = state.executeQuery("select * from details");
		while(result.next())
		{
			System.out.println(result.getInt("id")+"\t"+result.getString("name")+"\t"+result.getString("address"));
		}
		
		ResultSet result1 = state.executeQuery("select * from details where id=2");
//		while(result1.next()){
		System.out.println(result.getString("name")+result.getString("address"));
//	}
		
		//int a = state.executeUpdate(input);
		//int b = state.executeUpdate(input1);
		
		//if(a >0){System.out.println("added");}
		//else{System.out.println("no");}
//		if(b>0){System.out.println("inserted");}
//		else{System.out.println("no");}
		
		}
		catch(Exception e){
			System.out.println("hello"+e);
		}
		
	}

}
