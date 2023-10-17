package resurse.educationale;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ResursaDAO {
	public static void createResursa(Resursa resursa) throws SQLException {
		Connection c = DBHelper.getConnection();
		String createQuery = "insert into resurse_educationale(titlu, dificultate_intelegere, nivel_educational) values (?,?,?)";
		PreparedStatement ps = c.prepareStatement(createQuery);
		ps.setString(1, resursa.getTitlu());
		ps.setInt(2, resursa.getDificultate_intelegere());
		ps.setString(3, resursa.getNivel_educational());
		
		ps.executeUpdate();
		System.out.println("Resursa a fost adaugata.");
	}
	
	public static ArrayList<Resursa> getAllResources() throws SQLException{
		ArrayList<Resursa> result = new ArrayList<Resursa>();
		
		Connection c = DBHelper.getConnection();
		Statement stmt = c.createStatement();
		String displayQuery = "select * from resurse_educationale";
		ResultSet rs = stmt.executeQuery(displayQuery);
		
		while(rs.next()) {
			Resursa cube = new Resursa();
			cube.setTitlu(rs.getString("titlu"));
			cube.setDificultate_intelegere(rs.getInt("dificultate_intelegere"));
			cube.setNivel_educational(rs.getString("nivel_educational"));
			result.add(cube);
		}
		return result;
	}
	
	public static String delete(int id) throws SQLException {
		Connection c = DBHelper.getConnection();
		String deleteQuery = "delete from resurse_educationale where id = ?";
		
		PreparedStatement ps = c.prepareStatement(deleteQuery);
		ps.setInt(1, id);
		
		int ar = ps.executeUpdate();
		return ar == 0 ? "Nu a fost stearsa inregistrarea" : "A fost sters 1 cub.";
	}
	
	public static boolean update(Resursa resursa) throws SQLException{
		Connection c = DBHelper.getConnection();
		String updateQuery = "update resurse_educationale set dificultate_intelegere = ? where id = ?";
		PreparedStatement ps = c.prepareStatement(updateQuery);
		ps.setInt(1, resursa.getDificultate_intelegere());
		ps.setInt(2, resursa.getId());
		
		int ar = ps.executeUpdate();
		return ar == 0 ? false : true;
	}
}
