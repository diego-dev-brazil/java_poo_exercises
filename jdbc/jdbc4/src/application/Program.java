package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;

public class Program {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? " 
					+ "WHERE (DepartmentId = ?)"
				, Statement.RETURN_GENERATED_KEYS);
			st.setDouble(1, 200);
			st.setInt(2, 1);
			
			int rowsAffected = st.executeUpdate();
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id + "\n");
				}
				System.out.println("Rows Affected: " + rowsAffected);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally 
		{
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
