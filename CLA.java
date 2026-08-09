class CLA 
{
    public static void main(String[] args) 
    {
        int count, i=0;
        String string;
        count=args.length;
        System.out.println("number of argument ="+count);
        while(i<count)
        {
            string=args[i];
            i++;
            System.out.println(i+" : "+" java is " + string + " ! " );
        }
        
    }    
}
