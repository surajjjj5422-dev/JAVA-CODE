// 1
// 222
// 33333
// 4444444
// 555555555

class Pattern2
{
    public static void main(String[] args) 
    {
        int row=(int)(Math.random()*10);
        int i,j;
        System.out.println("Generated Number of Rows= "+row);

        for(i=1;i<=row;i++)
        {
            for(j=1;j<=i+i-1;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}