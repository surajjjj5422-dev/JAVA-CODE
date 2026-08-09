import java.util.Scanner;
class HistogramHori
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter no of row=");
         int size=sc.nextInt();
        int a[]=new int [size] ;
        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter "+(i+1)+ " element");
            a[i]=sc.nextInt();
        }
        
        
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i];j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
