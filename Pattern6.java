//     1
//    121
//   12321
//  1234321
// 123454321
class Pattern6
{
    public static void main(String[] args)
    {
        
        int row=(int)(Math.random()*10);
        int i,j,k;
        System.out.println("Generated Number of Rows= "+row);

        for(i=1;i<=row;i++)
        {
            k=1;
            for(j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
             
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            } 
            
            for(j=i-1;j>0;j--)
            {
                System.out.print(j);
            } 

            
            for(j=1;j<=row-i;j++)
            {
                System.out.print("  ");
            }
            System.out.println();  
        }
    }
}