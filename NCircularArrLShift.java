import java.util.Scanner;
class NCircularArrLShift
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp,j=0,k=0, i;
		int arr[]= {23,41,677,1,53,43,554,65,33,55};
		System.out.println("how many time array shift=");
		int n=sc.nextInt();
		System.out.println("Original Array= ");
		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");

		}
		for(i=0; i<n; i++)
		{
			temp=arr[0];
			for(j=0; j<arr.length-1; j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=temp;

		}


		System.out.println("Left Shift Array Array= "+ n +" times");
		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
}