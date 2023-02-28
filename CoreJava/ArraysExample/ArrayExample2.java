package ArraysExample;

public class ArrayExample2 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		//default values
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
			System.out.println();
		arr[2]=89;
		//after change
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
