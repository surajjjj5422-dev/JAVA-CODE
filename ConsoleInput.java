import java.io.*;
class ConsoleInput
{
    public static void main(String[] args) {
        Console con =System.console();
        
        int a,b,sum;
        System.out.print("Enter a=");
        a=Integer.parseInt(con.readLine());
        System.out.print("Enter b=");
        b=Integer.parseInt(con.readLine());
        sum=a+b;
        System.out.println(sum);
    }
}