class ArrayElementShift
{
        public static void main(String[] args) 
        {
        int temp,j=0, i;
        int arr[]={23,41,677,1,53,43,554,65,33,55};
        System.out.println("Original Array= ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<arr.length-1;i++)
        {
            arr[j]=arr[j+1];
            j++;
        }
        arr[i]=0;

        System.out.println("Left Shift Array Array= ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}