import java.util.Scanner;
class AvgerageOfArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a[]=new int[10];
        int i, sum, avg;
        for(i=0, sum=0;i<a.length;i++)
        {
            System.out.print( "\nEnter Element=");
            a[i]=sc.nextInt();
            sum+=a[i];

        }
        avg=sum/a.length;
        System.out.println("sum= "+sum+" average= "+avg);
        for(int x: a)
        {
            if(x>avg)
                System.out.print(x+" ");
        }

    }
}