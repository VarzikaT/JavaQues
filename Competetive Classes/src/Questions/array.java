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
		//swap(arr, other);
		swap1(arr,0,1);
		System.out.println(arr[0]+" "+arr[1]);
		
	}
	//java is call by reference therefore unless we change the values at the reference or original address they are not reflected
	//since in  the swap method created before we were creating copies and changing there
	public static void swap1(int []a, int i , int j) {
		int t = a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public static void swap(int []a, int []b) {
		int[] t=a;
		a=b;
		b=t;
	}
}
