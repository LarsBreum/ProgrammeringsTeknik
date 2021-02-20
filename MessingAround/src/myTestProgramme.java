
import java.util.ArrayList;
import java.util.Collections;


public class myTestProgramme {


	public static void main(String[] args) {
		
		int[] nums = new int[]{10, 28, 10, 1, 2, 5,7, 1, 549, 3};
		
		for (int i = 0; i < nums.length; i++) {
			for(int k = 0; k < nums.length; k++) {
				if(nums[k] > nums[i]) {
					int temp = nums[k];
					nums[k] = nums[i];
					nums[i] = temp;
				}
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		String[] names = new String[]{"Sandra", "Alice"};
		
		for (int i = 0; i < names.length; i++) {
			for(int k = 0; k < names.length; k++) {
				if(names[k].compareTo(names[i]) > 0) {
					String temp = names[k];
					names[k] = names[i];
					names[i] = temp;
				}
			}
		}
		
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
		
	}
	
	

}
