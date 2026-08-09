import java.util.Scanner;
class CircularArrLShift
{
    public static void main(String[] args) {
         int temp,j=0, i;
        int arr[]={23,41,677,1,53,43,554,65,33,55};
        System.out.println("Original Array= ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        temp=arr[0];
        for(i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[j+1];
            j++;
        }
        arr[i]=temp;
        
        System.out.println("Left Shift Array Array= ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}