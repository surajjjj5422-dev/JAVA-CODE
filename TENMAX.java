class TENMAX{
    public static void main(String[] args)
     {
            int no, max=-99,flag=0,  i;
            for(i=1;i<=10;i++)
            {
                no=(int)(Math.random()*10);
                System.out.print(" "+no);
                
                    if(max<no)
                    {
                            max=no;
                            flag=1;
                    }
                    else if(max==no)
                    {
                        flag++;
                    }

                
            }
            System.out.print("MAX= "+max+" appearance="+flag);
    }
}