//Generate teo single digit random no and calculate first base to the power second number
class GTDRNCSPOF
{
    public static void main(String[] args) 
    {
        int a, b, s;
        a=(int)(Math.random()*10);
        b=(int)(Math.random()*10);
        System.out.println("First no= "+a+" Second number= "+b);
        s=a;
        for(int i=1;i<b;i++)
        {
           if(b==0)
           {
                s=1;
                break;
           }
           else 
            s=s*a;
        }
        System.out.print("Result= "+s);
    }
}