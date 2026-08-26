package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;

public class Program {
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = DB.getConnection();
			
			/*pst = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES "
					+ "(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS
					);
			pst.setString(1, "Jorginho");
			pst.setString(2, "jorginho@gmail.com");
			pst.setDate(3, new java.sql.Date(sdf.parse("10/02/1990").getTime()));
			pst.setDouble(4, 2300.00);
			pst.setInt(5, 3);*/
			pst = conn.prepareStatement("insert into department (Name) values"
										+ " ('D1'),('D2')",
					Statement.RETURN_GENERATED_KEYS);
			
			int rowsAffected = pst.executeUpdate();
			if (rowsAffected > 0) {
				ResultSet rs = pst.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id + "\n");
				}
				System.out.println("Rows Affected: " + rowsAffected);
			}else {
				System.out.println("No rows affected");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} 
		finally {
			DB.closeStatement(pst);
			DB.closeConnection();
		}
	}
}
