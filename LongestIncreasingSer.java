class LongestIncreasingSer
{
    public static void main(String[] args) 
    {
        int no, max=1, i,inc=0, cmp=Integer.MIN_VALUE;
        System.out.print("Generated no=");
        for(i=1;i<=10;i++)
        {
            no=(int)(Math.random()*100);
            System.out.print(+no+" ");
            if(no>cmp)
            {
                    inc++;      
                    cmp=no;
            }
            else
            {
                    inc=1;
                    cmp=Integer.MIN_VALUE;

            }
            if(inc>max)
                max=inc;
        }
        System.out.println("\n"+max);
    }
}
