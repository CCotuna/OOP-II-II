package rubiks.cube;

public class Cube {
	private String brand;
	private Double weight;
	private int sides;
	private String date;
	
	public Cube() {
		
	}
//
//	public Cube(String brand, Double weight, int sides) {
//		super();
//		this.brand = brand;
//		this.weight = weight;
//		this.sides = sides;
//	}

	public Cube(String brand, Double weight, int sides, String date) {
		super();
		this.brand = brand;
		this.weight = weight;
		this.sides = sides;
		this.date = date;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
