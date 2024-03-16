
public class Dranza extends Beyblade {
	
	private String kutsal_canavar;
	
	public Dranza(String beybladeci,int donus_hızı,int saldırı_gücü,String kutsal_canavar) {
		super(beybladeci,donus_hızı,saldırı_gücü);
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
