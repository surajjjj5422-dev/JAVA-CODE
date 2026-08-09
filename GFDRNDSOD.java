class GFDRNDSOD
{
    public static void main(String[] args) 
    {
        int no, sum=0, rem;
        no=(int)(Math.random()*100000);
        System.out.println("Generated no= "+no);
        while(no!=0)
        {
            rem=no%10;
            sum=sum+rem;
            no/=10;
        }
        System.out.println("Sum Of Digits= "+sum);
    }
}