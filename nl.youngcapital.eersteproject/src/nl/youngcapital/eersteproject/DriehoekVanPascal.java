package nl.youngcapital.eersteproject;

public class DriehoekVanPascal {

	public static void main(String[] args) {
		int[][] dvp = new int[10][];
		for(int i = 0; i < dvp.length; i++) {
			int[] line = new int[i+1];
			if(i == 0) {
				line[i] = 1;
			}
			else {
				line[i] = 1;
				line[0] = 1;
				for(int j = 1; j < line.length - 1; j++) {
					line[j] = dvp[i-1][j-1] + dvp[i-1][j];
				}
			}
			dvp[i] = line;
		}
		for(int[] row: dvp) {
			for(int el: row) {
				System.out.print(el + " ");
			}
			System.out.println("");
		}
	}
}
