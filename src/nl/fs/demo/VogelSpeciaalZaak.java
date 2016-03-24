package nl.fs.demo;

public class VogelSpeciaalZaak extends Dierenwinkel{
	
	static String gv;
	
	@Override
	public String getVoorraad(){
		
		StringBuilder s = new StringBuilder();
		for(int i=0; i<vogel.length;i++){
			
			s.append(vogel[i]);
			
		}
		gv = s.toString();
		return gv ;
		
	}
	
	public void main(){
		//System.out.println(gv);
		
	}
	
}