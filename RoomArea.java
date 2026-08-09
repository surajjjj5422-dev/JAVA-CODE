import java.util.Scanner;
class Room
{
    int len;
    int brea;
    void getData(int a, int b)
    {
        len=a;
        brea=b;
    }
}

class RoomArea
{
    public static void main(String[] args) 
    {
        int area;
        Scanner sc= new Scanner(System.in);
        Room room1=new Room();
        System.out.println("Enter length and breadth\t ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        room1.getData(x,y);
        area=room1.len*room1.brea;

        System.out.println("\n Area=\t"+area);
    }
}
