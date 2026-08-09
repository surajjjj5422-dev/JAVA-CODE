import java.util.Scanner;
import java.lang.Math;
class Sqrt
{
    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Any number for Square root=\t");
            double num=sc.nextInt();
            double s=Math.sqrt(num);

            System.out.println("\n Square Root=\t"+s);
    }
}