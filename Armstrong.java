class Armstrong
{
    public static void main(String[] args) 
    {
        
        int no, rem, temp, sum=0;
        no=(int)(Math.random()*100);
        temp=no;
        while(no!=0)
        {
            rem=no%10;
            sum=sum+rem*rem*rem;
            no/=10;
        }    
        if(temp==sum)
            System.out.println(temp+" is armstrong");
        else
            System.out.println(temp+" is not armstrong");
    }
}