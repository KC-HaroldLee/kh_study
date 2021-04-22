package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class ProductDao {
	public void resistItem(int no,  String name, String type, int price, Date made,  Date expire ) throws SQLException, ClassNotFoundException{
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");
		
		String sql = "insert into product values("
				+ "?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ps.setString(2, name);
		ps.setString(3, type);
		ps.setInt(4, price);
		ps.setDate(5, made);
		ps.setDate(6, expire); //여긴 확실히 sql
		
		ps.execute();
		
		con.close();
		
	}
	/*
public void resistItemDtoTest(ProductDto productdto) throws Exception{
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");
		
		String sql = "insert into product values("
				+ "?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, productdto.getNo());
		ps.setString(2, productdto.getName());
		ps.setString(3, productdto.get);
		ps.setInt(4, price);
		ps.setDate(5, made);
		ps.setDate(6, expire); //여긴 확실히 sql
		
		ps.execute();
		
		con.close();
		*/

}
