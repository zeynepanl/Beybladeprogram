
public class Drayga extends Beyblade {
	
	private String kutsal_canavar;


	public Drayga(String beybladeci, int saldırı_gücü, int donus_hızı,String kutsal_canar) {
		super(beybladeci, saldırı_gücü, donus_hızı);
		this.kutsal_canavar=kutsal_canavar;
	}
	
	public void Yazdır() {
		super.Yazdır();
		System.out.println("Kutsal canavarın adı:"+kutsal_canavar);
	}

	
	public void Kutsal_canavarı_ortaya_cıkar() {
		System.out.println(getBeybladeci()+" "+kutsal_canavar+"ı ortaya çıkar.");
		
	}
	
	

}
