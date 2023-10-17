package proiecte.artistice;

public class ProiectArt {
	private String nume_proiect;
	private String nume_artist;
	private String data;
	private String tip_proiect;
	
	public ProiectArt() {
		
	}

	public ProiectArt(String nume_proiect, String nume_artist, String data, String tip_proiect) {
		super();
		this.nume_proiect = nume_proiect;
		this.nume_artist = nume_artist;
		this.data = data;
		this.tip_proiect = tip_proiect;
	}

	public String getNume_proiect() {
		return nume_proiect;
	}

	public void setNume_proiect(String nume_proiect) {
		this.nume_proiect = nume_proiect;
	}

	public String getNume_artist() {
		return nume_artist;
	}

	public void setNume_artist(String nume_artist) {
		this.nume_artist = nume_artist;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTip_proiect() {
		return tip_proiect;
	}

	public void setTip_proiect(String tip_proiect) {
		this.tip_proiect = tip_proiect;
	}
	
	
}
