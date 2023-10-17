package rubiks.cube;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) throws SQLException {
		
		ArrayList<Cube> cubes = CubeDAO.getAllCubes();
		Random random = new Random();
//		
		double randomNumber = random.nextDouble(50);
//		Cube cube = new Cube("Rubik", randomNumber, 6, "2017-12-25" );
		
//		CubeDAO.createCube(cube);
		
		for(Cube c: cubes) {
			System.out.println(c.getBrand() + " - " + c.getWeight() + "g - " + c.getSides() + " sides - " + c.getDate());
		}
		
//		cube.setWeight(randomNumber);
//		cube.setBrand("Rubik");
//		
//		boolean updated = CubeDAO.update(cube);
//		if (updated) {
//			System.out.println("Changed succesfully!");
//		}else {
//			System.out.println("The changes cannot be made!");
//		}
//		
//		CubeDAO.delete("Rubik");
	}
}
