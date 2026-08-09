class Palindrom
{
    public static void main(String[] args) 
    {
        int temp, rem, rev=0;
        for(int n=1;n<=100;n++)
        {
                temp=n;
                while(n!=0)
                {
                    rem=n%10;
                    rev=rev*10+rem;
                    n/=10;
                }
                if(temp==rev)
                    System.out.println(temp+" Palindrom");
                else
                    System.out.println(temp+" is no Palindrom");
        }
        
    }
}