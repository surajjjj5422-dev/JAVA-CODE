import java.util.Scanner;
class HistogramVer
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, max;
        System.out.println("Enter no of row=");
         int size=sc.nextInt();
        int a[]=new int [size] ;
        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter "+(i+1)+ " element");
            a[i]=sc.nextInt();
        }
        
        max=a[0];
        for(i=0;i<a.length;i++)
        {
            if(max>a[i]) max=a[i];
        }




        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {

                    if(a[i]>=max)
                        System.out.print("*");
                    else
                        System.out.print(" ");

                    max--;
            }
        }

    }
}
