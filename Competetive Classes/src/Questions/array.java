package Questions;

public class array {
	public static void main(String[] args) {
		//int [] arr=null;
//		System.out.println(arr);
//		arr = new int[5];
//		//length
//		System.out.println(arr.length);
//		
		int arr[] = {10,20,30,40,50};
//		System.out.println(arr[0]+" "+arr[1]);
//		swap(arr[0], arr[1]);
//		System.out.println(arr[0]+" "+arr[1]);
		int other[]= {100,200,300};
		System.out.println(arr[0]+" "+other[0]);
		swap(arr, other);
		System.out.println(arr[0]+" "+other[0]);
		
	}
	public static void swap(int []a, int []b) {
		int[] t=a;
		a=b;
		b=t;
	}
}
