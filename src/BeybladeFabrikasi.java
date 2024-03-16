
public class BeybladeFabrikasi {
	
	public Beyblade beybladeuret(String beyblade_turu) {
		
		if(beyblade_turu.equals("Draciel")) {
			return new Draciel("Takao",800,300,"Mavi ejderha","Kutsal canavarla konuşma");
			}
		else if(beyblade_turu.equals("Dranza")) {
			return new Dranza("Kai",600,400,"Kırmızı anka kuşu");
		}
		else if(beyblade_turu.equals("Drayga")) {
			return new Drayga("rei",800,250,"Beyaz kaplan");
		}
		else {
			return null;
		}
		
	}

}
