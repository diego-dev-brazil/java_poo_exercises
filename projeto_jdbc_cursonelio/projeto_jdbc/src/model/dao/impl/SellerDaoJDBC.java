package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {
	
	private Connection conn;
	
	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Seller sel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Seller sel) {
		// TODO A uto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		
		try {
		st = conn.prepareStatement(
				"SELECT seller.*,department.Name as DepName\n"
				+ "FROM seller INNER JOIN department\n"
				+ "ON seller.DepartmentId = department.Id\n"
				+ "WHERE seller.Id = ?", Statement.RETURN_GENERATED_KEYS);
		
		st.setInt(1, id);
		rs = st.executeQuery();
		if(rs.next()) {
			Department dep = new Department();
			dep.setId(rs.getInt("DepartmentId"));
			dep.setName(rs.getString("DepName"));
			Seller sel = new Seller();
			sel.setId(rs.getInt("Id"));
			sel.setName(rs.getString("Name"));
			sel.setEmail(rs.getString("Email"));
			sel.setBirthDate(rs.getDate("BirthDate"));
			sel.setBaseSalary(rs.getDouble("BaseSalary"));
			sel.setDepartment(dep);
			return sel;
		}else {
			return null;
		}
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
