package nl.youngcapital.eersteproject;



public class IsPrime {

	public static void main(String[] args) {

		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int i = 0; i < nums.length; i++) {
			int check = (int) Math.sqrt(nums[i]);
			int j = 2;
			for(j = 2; j <= check; j++) {
				if(nums[i] % j == 0) {
					System.out.println(nums[i] + " is geen priemgetal");
					break;
				}
			}
			if (j == check+1)
				System.out.println(nums[i] + " is een priemgetal");
		}
	}
}
