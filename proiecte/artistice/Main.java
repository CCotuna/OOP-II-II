package proiecte.artistice;

import java.sql.SQLException;
import java.util.ArrayList;

import resurse.educationale.Resursa;
import resurse.educationale.ResursaDAO;

public class Main {

	public static void main(String[] args) throws SQLException {
		ArrayList<ProiectArt> proiecte = ProiectArtDAO.getAllProjects();
		
//		ProiectArt proiect1 = new ProiectArt("In the Heights", "Lin-Manuel Miranda", "2023-05-15", "Film");
		ProiectArt proiect2 = new ProiectArt("Colorful Canvas", "Emily Johnson", "2023-07-02", "Expozitie de Arta");
//		ProiectArt proiect3 = new ProiectArt("Harmony Symphony", "London Philharmonic", "2023-06-20", "Concert");
//		ProiectArt proiect4 = new ProiectArt("Renaissance Rhythms", "The Royal Ballet", "	2023-08-10", "Spectacol de Balet");
//
//		ProiectArtDAO.createProject(proiect1);
//		ProiectArtDAO.createProject(proiect2);
//		ProiectArtDAO.createProject(proiect3);
//		ProiectArtDAO.createProject(proiect4);
		
		for(ProiectArt p : proiecte) {
			System.out.println(p.getNume_proiect()+ " - " + p.getNume_artist()+ " - " + p.getData() + " - " + p.getTip_proiect());
		}
		
		proiect2.setNume_proiect("Colorful Canvas");
		proiect2.setTip_proiect("Expozitie de Arta");
		
		ProiectArtDAO.update(proiect2);
//		
		ProiectArtDAO.delete(4);
	}

}
