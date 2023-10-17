package resurse.educationale;

import java.util.ArrayList;
import java.util.Random;


public class Main {
	ArrayList<Resursa> resurse = ResursaDAO.getAllCubes();
	Random random = new Random();
	
	double randomNumber = random.nextDouble(50);
	Resursa resursa = new Resursa("Rubik", 3, "randomNumber");
	
	ResursaDAO.
	
//	for(Resursa s : resurse) {
//		System.out.println(s.getTitlu() + " - " + s.getDificultate_intelegere() + " - " + s.getNivel_educational());
//	}
	
//	cube.setWeight(randomNumber);
//	cube.setBrand("Rubik");
//	
//	boolean updated = CubeDAO.update(cube);
//	if (updated) {
//		System.out.println("Changed succesfully!");
//	}else {
//		System.out.println("The changes cannot be made!");
//	}
//	
//	CubeDAO.delete("Rubik");
}
