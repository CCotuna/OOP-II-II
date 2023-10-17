package resurse.educationale;

public class Resursa {
	private int id;
	private String titlu;
	private int dificultate_intelegere;
	private String nivel_educational;
	
	public Resursa() {
		
	}

	public Resursa( String titlu, int dificultate_intelegere, String nivel_educational) {
		this.titlu = titlu;
		this.dificultate_intelegere = dificultate_intelegere;
		this.nivel_educational = nivel_educational;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public int getDificultate_intelegere() {
		return dificultate_intelegere;
	}

	public void setDificultate_intelegere(int dificultate_intelegere) {
		this.dificultate_intelegere = dificultate_intelegere;
	}

	public String getNivel_educational() {
		return nivel_educational;
	}

	public void setNivel_educational(String nivel_educational) {
		this.nivel_educational = nivel_educational;
	}
	
	
	
}
