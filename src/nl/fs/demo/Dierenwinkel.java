package nl.fs.demo;

public class Dierenwinkel{
	//Dier dier = new Dier();
	String gv;
	String[] dier = {"Hond","Kat","Konijn"};
	String[] vogel = {"Papegaai","Parkiet","Struisvogel"};

	//int[] voorraad = {1,5,3};
	
	public String getVoorraad(){
		
		StringBuilder s = new StringBuilder();
		for(int i=0; i<dier.length;i++){
			
			s.append(dier[i]);
			System.out.println(dier[i]);

		}
		gv = s.toString();
		return gv ;
	}
	
	public static void main(String[] args){
		//System.out.println(Dierenwinkel.getVoorraad());
		
	}
	
}