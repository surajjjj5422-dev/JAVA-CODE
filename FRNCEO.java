//Generate 4 random number and count how many of them are even or odd
class FRNCEO
{
    public static void main(String[] args) {
        int a,b,c,d,even=0, odd=0;
        a=(int)(Math.random()*100);
        b=(int)(Math.random()*100);
        c=(int)(Math.random()*100);
        d=(int)(Math.random()*100);
        System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
        if(a%2==0)
            even++;
        else
            odd++;

         if(b%2==0)
            even++;
        else
            odd++;

         if(c%2==0)
            even++;
        else
            odd++;

         if(d%2==0)
            even++;
        else
            odd++;

        System.out.println("even= "+even+ " odd"+odd);
        
    }
}