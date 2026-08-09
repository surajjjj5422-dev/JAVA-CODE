class SuperPalindrom
{
    public static void main(String[] args) 
    {
        int no, rev=0, rem, temp,sqrt;
        no=(int)(Math.random()*1000);
        System.out.println("Generated no= "+no);
        sqrt=no*no;
        temp=sqrt;
        while(sqrt!=0)
        {
            rem=sqrt%10;
            rev=rev*10+rem;
            sqrt/=10;
        }
        if(temp==rev)
            System.out.println(temp+" is Super  Palindrom");
        else
            System.out.println(temp+"is no Super Palindrom");
        
    }
}