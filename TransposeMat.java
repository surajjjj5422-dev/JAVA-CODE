class TransposeMat
{
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9} };
        int i=0, j=0, temp;
        System.out.println("Original array= ");
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
            for(j=0;j<arr[i].length/2;j++)
            {
                temp=arr[i][j];
               arr[i][j]=arr[j][i]; 
               arr[j][i]=temp;
            }
            
        }

        System.out.println("Transpose of array= ");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }

    }
}
