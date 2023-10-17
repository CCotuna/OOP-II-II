package proiecte.artistice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProiectArtDAO {
	public static void createProject(ProiectArt proiect) throws SQLException {
		Connection c = DBHelper.getConnection();
		String createQuery = "insert into proiecte_artistice(nume_proiect, artist_principal, data_lansare, tip_proiect) values (?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(createQuery);
		ps.setString(1, proiect.getNume_artist());
		ps.setString(2, proiect.getNume_artist());
		ps.setString(3, proiect.getData());
		ps.setString(4, proiect.getTip_proiect());
		
		ps.executeUpdate();
		System.out.println("Resursa a fost adaugata.");
	}
	
	public static ArrayList<ProiectArt> getAllProjects() throws SQLException{
		ArrayList<ProiectArt> result = new ArrayList<ProiectArt>();
		
		Connection c = DBHelper.getConnection();
		Statement stmt = c.createStatement();
		String displayQuery = "select * from proiecte_artistice";
		ResultSet rs = stmt.executeQuery(displayQuery);
		
		while(rs.next()) {
			ProiectArt proiect = new ProiectArt();
			proiect.setNume_proiect(rs.getString("nume_proiect"));
			proiect.setNume_artist(rs.getString("artist_principal"));;
			proiect.setData(rs.getString("data_lansare"));
			proiect.setTip_proiect(rs.getString("tip_proiect"));
			result.add(proiect);
		}
		return result;
	}
	
	public static String delete(int id) throws SQLException {
		Connection c = DBHelper.getConnection();
		String deleteQuery = "delete from proiecte_artistice where id = ?";
		
		PreparedStatement ps = c.prepareStatement(deleteQuery);
		ps.setInt(1, id);
		
		int ar = ps.executeUpdate();
		return ar == 0 ? "Nu a fost stearsa inregistrarea" : "A fost sters 1 proiect.";
	}
	
	public static boolean update(ProiectArt proiect) throws SQLException{
		Connection c = DBHelper.getConnection();
		String updateQuery = "update proiecte_artistice set nume_proiect = ? where tip_proiect = ?";
		PreparedStatement ps = c.prepareStatement(updateQuery);
		ps.setString(1, proiect.getNume_proiect());
		ps.setString(2, proiect.getTip_proiect());
		
		int ar = ps.executeUpdate();
		return ar == 0 ? false : true;
	}
}
