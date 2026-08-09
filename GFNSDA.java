class GFNSDA
{
    public static void main(String[] args) 
    {
        int fDN, sDN, rem, flag=0 ;
        fDN=(int)(Math.random()*100000);
        sDN=(int)(Math.random()*10);
        System.out.println("Five Digit no= "+fDN+ " Single Digit no= "+sDN);
        while(fDN!=0)
        {
            rem=fDN%10;
            fDN/=10;
            if(rem==sDN)
            {
                flag++;
            }
        }
        if(flag!=0)
            System.out.print("Single Digit "+sDN+"  appear in five digit at "+flag+" times");
        else
            System.out.print("Not Appear");
    }
}