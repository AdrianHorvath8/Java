package sk.ostrovskeho.horvath;
import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		Auto auto1 = new Auto("BMW", "m8", "2.5", "sedan", 2015, 20000, 52000);
		Auto auto2 = new Auto("Audi", "A8", "3.3", "sedan", 2020, 1500, 95000, 90000);
		Auto auto3 = new Auto("Fiat", "Punto", "5.3", "sedan", 2020, 1500, 95000, 90000);
		
		ArrayList<Auto> a = new ArrayList<Auto>();
		
		a.add(auto3);
		
		AutoBazar autobazar1 = new AutoBazar(a);
		autobazar1.pridaj(auto2);
		autobazar1.pridaj(auto2);
		autobazar1.pridaj(auto1);
		
	
		System.out.println(auto1.toString());
		System.out.println(autobazar1.toString());
		System.out.println(autobazar1.pocetAut());
		System.out.println(autobazar1.pocetpredanych());
		System.out.println(autobazar1.vykonejsieAuto());
	}

}
