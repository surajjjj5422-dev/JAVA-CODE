//      *
//     **
//    ***
//  *****
// ******
class Pattern5
{
    public static void main(String[] args)
    {
        
        int row=(int)(Math.random()*10);
        int i,j;
        System.out.println("Generated Number of Rows= "+row);

        for(i=1;i<=row;i++)
        {
            for(j=1;j<=row-i;j++)
            {
                System.out.print("  ");
            }
             
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            } 
            System.out.println();  
        }
    }
}