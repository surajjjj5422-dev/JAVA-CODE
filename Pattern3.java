// 0
// 10
// 101
// 0101
// 01010
class Pattern3
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
                System.out.print(k);
                if(k==0)
                    k=1;
                else
                    k=0;
                

            }
            System.out.println();
        }
    }
}