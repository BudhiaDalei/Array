// Second Smlllest element in an array
import java.util.*;
class Solution{
	public static void fetchSecondSmallest(int[] arr){
		int secondSmallestElement = Arrays.stream(arr).sorted().distinct().skip(1);
	}
	public static void main(String[] args) {
		int[] arr = {2,4,6,3,8,4};
		System.out.println(arr  +" ");
	}
}