class GCD
{
    public static void main(String[] args) 
    {
        int a, b, i=1, gcd=0;
        a=(int)(Math.random()*100);
        b=(int)(Math.random()*100);
        System.out.println("a= "+a+" b= "+b);
        while(a>=i && b>=i)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
                i++;
            }
            else
                i++;
        }
        System.out.print("GCD= "+gcd);
    }
}