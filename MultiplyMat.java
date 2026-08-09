import java.util.Arrays;
class MultiplyMat
{
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9} };
        int b[][]={{1,2,3},{4,5,6},{7,8,9} };
        int c[][]=new int[3][3];
        int i=0, j=0, k=0,z;
        System.out.println("First array= ");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"   ");
            }
            System.out.println();
        }

        
        System.out.println("Second array= ");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"   ");
            }
            System.out.println();
        }

        for(i=0;i<a.length;i++)
        {
            
            for(j=0;j<a[i].length;j++)
            {
                for(k=0;k<3;k++)
                {
                    c[i][j]+=a[j][k]*b[k][j];
                }
                
            }
            
        }

        System.out.println("Multiply of array= ");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(c[i][j]+"   ");
            }
            System.out.println();
        }
        

    }
}
