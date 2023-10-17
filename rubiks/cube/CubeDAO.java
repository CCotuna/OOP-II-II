package rubiks.cube;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CubeDAO {
	
	public static void createCube(Cube cube) throws SQLException {
		Connection c = DBHelper.getConnection();
		String createQuery = "insert into rubiks_cube(brand, weight, sides, manufactured) values (?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(createQuery);
		ps.setString(1, cube.getBrand());
		ps.setDouble(2, cube.getWeight());
		ps.setInt(3, cube.getSides());
		ps.setString(4, cube.getDate());
		
		ps.executeUpdate();
		System.out.println("1 Cube was created.");
	}
	
	public static ArrayList<Cube> getAllCubes() throws SQLException{
		ArrayList<Cube> result = new ArrayList<Cube>();
		
		Connection c = DBHelper.getConnection();
		Statement stmt = c.createStatement();
		String displayQuery = "select * from rubiks_cube";
		ResultSet rs = stmt.executeQuery(displayQuery);
		
		while(rs.next()) {
			Cube cube = new Cube();
			cube.setBrand(rs.getString("brand"));
			cube.setWeight(rs.getDouble("weight"));
			cube.setSides(rs.getInt("sides"));
			cube.setDate(rs.getString("manufactured"));
			result.add(cube);
		}
		return result;
	}
	
	public static String delete(String brand) throws SQLException {
		Connection c = DBHelper.getConnection();
		String deleteQuery = "delete from rubiks_cube where brand = ?";
		
		PreparedStatement ps = c.prepareStatement(deleteQuery);
		ps.setString(1, brand);
		
		int ar = ps.executeUpdate();
		return ar == 0 ? "Nu a fost stearsa inregistrarea" : "A fost sters 1 cub.";
	}
	
	public static boolean update(Cube cube) throws SQLException{
		Connection c = DBHelper.getConnection();
		String updateQuery = "update rubiks_cube set weight = ? where brand = ?";
		PreparedStatement ps = c.prepareStatement(updateQuery);
		ps.setDouble(1, cube.getWeight());
		ps.setString(2, cube.getBrand());
		
		int ar = ps.executeUpdate();
		return ar == 0 ? false : true;
	}
}
