// 0
// 12
// 345
// 6789
// 01234
class Pattern4
{
    public static void main(String[] args)
    {
        
        int row=(int)(Math.random()*10);
        int i,j,k=0;
        System.out.println("Generated Number of Rows= "+row);

        for(i=1;i<=row;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();    
        }
        for(i=0;i<row;i++)
            System.out.print(i+" ");
    }
}