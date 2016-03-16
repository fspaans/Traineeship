package nl.youngcapital.eersteproject;

public class SubsequentNumbers {
	public static void main (String[] args) {

		int[] seq = new int[10];
		seq[0] = 5;
		for(int i = 1; i < seq.length; i++)
			seq[i] = seq[i - 1] + 4;
		System.out.print("De reeks van tien getallen is ");
		for(int i = 0; i < seq.length - 1; i++)
			System.out.print(seq[i] + ", ");
		System.out.println(seq[seq.length - 1] + ".");
	}
}
