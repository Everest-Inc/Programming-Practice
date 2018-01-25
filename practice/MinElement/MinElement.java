// By: Prahlad Panthi
// to find the minimum element from a sorted but rotated array

public class MinElement{
	
	private int findMin(int[] arr){
		int len = arr.length;
		int min = arr[0], low = 0, high = len-1, mid;
		while(low <= high){
			mid = (low + high)/2;
			if(arr[low] < arr[mid]){
				if(arr[low] < min)
					min = arr[low];
				low = mid + 1;
				continue;
			}
			else{
				if(arr[mid] < min) 
					min = arr[mid];
				low += 1;
				continue;
			}
		}
		return min;
	}
	
	public static void main(String[] args){
		MinElement me = new MinElement();
		int[] arr = {100, 101, 102, 103, 104, 105, 106, 107, 108, 98, 99};
		int[] arr1 = {9,10,11,12,13,14,15,16,17,18,3,4,5,6,7,8};
		int[] arr2 = {5,6,7,8,9,10,13,14,16,18};
		int[] arr3 = {45, 47, 49, 53, 55, 57, 70, 78, 91, 100, 101, 102, 34, 36, 39, 41, 43};
		int min = me.findMin(arr);
		int min1 = me.findMin(arr1);
		int min2 = me.findMin(arr2);
		int min3 = me.findMin(arr3);
		System.out.println("Minimum element: "+min);
		System.out.println("Minimum element: "+min1);
		System.out.println("Minimum element: "+min2);
		System.out.println("Minimum element: "+min3);
	}
}
