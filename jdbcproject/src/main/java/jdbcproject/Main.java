package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://b3e6af9b452e8f:9951edf9@us-cdbr-east-06.cleardb.net/heroku_1bf74d9e6c8ddcb");
		
		Statement stmt = con.createStatement();
		
//		String tableSql = "CREATE TABLE IF NOT EXISTS employees(emp_id int PRIMARY KEY AUTO_INCREMENT, name varchar(30), position varchar(30), salary double)";
//		
//		stmt.execute(tableSql);
//		
//		String insertSql = "INSERT INTO employees(name, position, salary) VALUES('john', 'developer', 200000)";
//		
//		stmt.executeUpdate(insertSql);
		
		String selectSql = "SELECT * FROM employees";
		
		ResultSet resultSet = stmt.executeQuery(selectSql);
		
		while(resultSet.next())
		{
			System.out.println(resultSet.getString(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getString(4));
		}
		
		stmt.close();
	}

}
 