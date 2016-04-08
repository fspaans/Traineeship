package nl.fs.demo;

public class IfElse{
	
	public static void main(String[] args){
		
		int x = 8;
		int y = 1;
		
		if(x*y == 8){
			x=1;
			System.out.println("(A)if "+ x +" "+ y);
		}else{
			x = 2;
			System.out.println("(A)else "+ x +" "+ y);
		}
		
		if(x<y){
			x*=2;
			System.out.println("(B)if "+ x +" "+ y);
		}else{
			x ++;
			System.out.println("(B)else "+ x +" "+ y);
		}
		
		if(x>y){
			x++;
			y++;
			System.out.println("(C)if "+ x +" "+ y);
		}else{
			x--;
			y--;
			System.out.println("(C)else "+ x +" "+ y);
		}
		
		
	}
	
}