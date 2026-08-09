class MatrixSumCol
{
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9} };
        int i=0, j=0, sum[]=new int[3];
        System.out.println(" array= ");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }

        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                sum[i]+=arr[j][i];
            }
            System.out.println("Sum of "+(i+1)+"  column = "+ sum[i]);
        }

    }
}