package nl.youngcapital.eersteproject;

public class SubsequentNumbers {
	public static void main (String[] args) {

		int[] seq = {5, 9, 13, 17, 21};
		int[] nextseq = new int[10];
		nextseq[0] = 5;
		for(int i = 1; i < nextseq.length; i++)
			nextseq[i] = nextseq[i - 1] + 4;
		System.out.print("De reeks van tien getallen is ");
		for(int i = 0; i < nextseq.length - 1; i++)
			System.out.print(nextseq[i] + ", ");
		System.out.println(nextseq[nextseq.length - 1] + ".");
	}
}
