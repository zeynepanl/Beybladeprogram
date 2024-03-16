
public class Beyblade {
	private String beybladeci;
	private int saldırı_gücü;
	private int donus_hızı;
	public Beyblade(String beybladeci, int saldırı_gücü, int donus_hızı) {
		this.beybladeci = beybladeci;
		this.saldırı_gücü = saldırı_gücü;
		this.donus_hızı = donus_hızı;
	}
	public String getBeybladeci() {
		return beybladeci;
	}
	public void setBeybladeci(String beybladeci) {
		this.beybladeci = beybladeci;
	}
	public int getSaldırı_gücü() {
		return saldırı_gücü;
	}
	public void setSaldırı_gücü(int saldırı_gücü) {
		this.saldırı_gücü = saldırı_gücü;
	}
	public int getDonus_hızı() {
		return donus_hızı;
	}
	public void setDonus_hızı(int donus_hızı) {
		this.donus_hızı = donus_hızı;
	}
	
	public void Saldır() {
		System.out.println(getBeybladeci()+" "+saldırı_gücü+"ve"+donus_hızı+"ile saldırıyor.");
	}
	
	public void Kutsal_canavarı_ortaya_cıkar() {
		System.out.println("Bu Beybladenin kutsal canavarı bulunmuyor.");
	}
	public void Yazdır() {
		System.out.println("Beybladeci ismi:"+beybladeci);
		System.out.println("saldırı gücü:"+saldırı_gücü);
		System.out.println("dönüş hızı:"+donus_hızı);
	}
	
	
	
	

}
