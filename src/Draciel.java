
public class Draciel extends Beyblade {
	
	private String kutsal_canavar;
	private String gizli_yetenek;

	public Draciel(String beybladeci, int saldırı_gücü, int donus_hızı,String kutsal_canavar,String gizli_yetenek) {
		super(beybladeci, saldırı_gücü, donus_hızı);
		this.kutsal_canavar=kutsal_canavar;
		this.gizli_yetenek=gizli_yetenek;
	}

	
	public void Kutsal_canavarı_ortaya_cıkar() {
		System.out.println(getBeybladeci()+" "+kutsal_canavar+"ı ortaya çıkarıyor.");
		
	}

	
	public void Yazdır() {
		super.Yazdır();
		System.out.println("Kutsal canavar adı:"+kutsal_canavar);
		System.out.println("Gizli yetenek:"+gizli_yetenek);
	}
	
	
	
	

}
