package nl.fs.demo;

public class Vermenigvuldigingen{
	
	public static void main(String[] args){
		int vv[][] = new int[11][11];
		for(int i =1; i<11;i++){
			for(int j =1; j< 11;j++){
				vv[i][j] = i*j;
				System.out.println(vv[i][j]);
			}
		}
		
	}
}