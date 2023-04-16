package sk.ostrovskeho.horvath;

import java.util.ArrayList;

public class AutoBazar {
	private ArrayList<Auto> zoznam = new ArrayList<Auto>();
	
	
	
	
	public AutoBazar(ArrayList<Auto> zoznam) {
		super();
		this.zoznam = zoznam;
	}

	@Override
	public String toString() {
		return "AutoBazar [zoznam=" + zoznam + "]";
	}


	public void pridaj(Auto auto) {
		zoznam.add(auto);
	}
	
	
	public int pocetAut() {
		int count = 0;
		for (Auto i: zoznam) {
			count++;
		}
		return count;
	}
	
	public int pocetpredanych() {
		int count = 0;
		for (Auto i: zoznam) {
			if(i.getPredajnaCena() == 0) {
				continue;
			}
			count++;
		}
		return count;
		
	}
	
	public String vykonejsieAuto() {
		Auto auto = zoznam.get(0);
		String prvyobjemMotoraStr = auto.getMotor();
		double NajvacsiObjemMotora = Double.parseDouble(prvyobjemMotoraStr);
		
		
		for (Auto a: zoznam) {
			String objemMotoraStr = a.getMotor();
			double objemMotora = Double.parseDouble(objemMotoraStr);
			
			if(objemMotora > NajvacsiObjemMotora) {
				NajvacsiObjemMotora = objemMotora;
				auto = a;
			}
		}
		
		String vysledok = "Znacka: " +auto.getZnacka() + ", Model: " + auto.getModel();
		return vysledok;
	}
	
}
