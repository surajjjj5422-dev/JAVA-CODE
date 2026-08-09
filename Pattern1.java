// 1
// 22
// 333
// 4444
// 55555

class Pattern1
{
    public static void main(String[] args) 
    {
        int row=(int)(Math.random()*10);
        int i,j;
        System.out.println("Generated Number of Rows= "+row);
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}