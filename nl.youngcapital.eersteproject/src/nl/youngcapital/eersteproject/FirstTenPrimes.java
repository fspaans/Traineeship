package nl.youngcapital.eersteproject;

public class FirstTenPrimes {

	public static void main (String[] args) {
		int[] tp = new int[10];
		tp[tp.length-1] = 0;
		int i = 2;
		int index = 0;
		while(tp[tp.length-1] == 0) {
			int check = (int) Math.sqrt(i);
			int j = 2;
			for(j = 2; j <= check; j++) {
				if(i % j == 0) {
					break;
				}
			}
			if(j == check+1) {
				if (index == 0) {
					System.out.print("De eerste " + tp.length + " priemgetallen zijn: ");
				}
				tp[index] = i;
				if(index == tp.length-1) {
					System.out.print(tp[index]);
				}
				else {
					System.out.print(tp[index] + ", ");
				}
				index++;
			}
			i++;
		}
	}
}
