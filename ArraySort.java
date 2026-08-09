import java.util.Scanner;
class ArraySort
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp,j, i;
        int arr[]={78,65,467,44,33,2,6,7,5,4};
        System.out.println("Original Array= ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(i=0;i<arr.length;i++)
        {
            for(j=i;j<arr.length;j++)
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        System.out.println("Sorted Array= ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}