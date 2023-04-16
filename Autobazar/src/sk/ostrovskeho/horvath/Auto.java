package sk.ostrovskeho.horvath;

public class Auto {
	private String znacka;
	private String model;
	private String motor;
	private String typ;
	private int rok;
	private int najazdene;
	private int cena;
	private int predajnaCena;
	
	
	
	
	public Auto(String znacka, String model, String motor, String typ, int rok, int najazdene, int cena,
			int predajnaCena) {
		super();
		this.znacka = znacka;
		this.model = model;
		this.motor = motor;
		this.typ = typ;
		this.rok = rok;
		this.najazdene = najazdene;
		this.cena = cena;
		this.predajnaCena = predajnaCena;
	}
	
	
	public Auto(String znacka, String model, String motor, String typ, int rok, int najazdene, int cena) {
		super();
		this.znacka = znacka;
		this.model = model;
		this.motor = motor;
		this.typ = typ;
		this.rok = rok;
		this.najazdene = najazdene;
		this.cena = cena;
	}




	@Override
	public String toString() {
		return "Auto [znacka=" + znacka + ", model=" + model + ", motor=" + motor + ", typ=" + typ + ", rok=" + rok
				+ ", najazdene=" + najazdene + ", cena=" + cena + ", predajnaCena=" + predajnaCena + "]";
	}


	public String getZnacka() {
		return znacka;
	}
	public void setZnacka(String znacka) {
		this.znacka = znacka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public int getRok() {
		return rok;
	}
	public void setRok(int rok) {
		this.rok = rok;
	}
	public int getNajazdene() {
		return najazdene;
	}
	public void setNajazdene(int najazdene) {
		this.najazdene = najazdene;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public int getPredajnaCena() {
		return predajnaCena;
	}
	public void setPredajnaCena(int predajnaCena) {
		this.predajnaCena = predajnaCena;
	}
	
	
	
}
