package resurse.educationale;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		ArrayList<Resursa> resurse = ResursaDAO.getAllResources();
		
		Resursa resursa = new Resursa("Matematică 101", 4, "Universitate");
		Resursa resursa1 = new Resursa("Biologie Avansată", 4, "Liceu");
		Resursa resursa2 = new Resursa("Istoria Artei", 4, "Liceu");
		Resursa resursa3 = new Resursa("Engleza pentru Toți", 4, "Gimnaziu");
		
		ResursaDAO.createResursa(resursa);
		ResursaDAO.createResursa(resursa1);
		ResursaDAO.createResursa(resursa2);
		ResursaDAO.createResursa(resursa3);
		
		
		for(Resursa s : resurse) {
			System.out.println(s.getTitlu() + " - " + s.getDificultate_intelegere() + " - " + s.getNivel_educational());
		}
		
		resursa1.setDificultate_intelegere(2);
		resursa1.setId(2);
		ResursaDAO.update(resursa1);
		
		ResursaDAO.delete(3);
	}
}
