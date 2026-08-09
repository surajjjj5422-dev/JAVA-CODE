import java.util.Scanner;
class SmartCard
{
    int emp_id;
    public void Markattendence(Employee e)
    {
        emp_id=e.getEmpid();
        System.out.println("Employee "+emp_id+" Is mark Presented");
    }

    public int getEmpid(Employee e)
    {
        return e.empid;
    }
}
class Employee
{
    int empid;
    Employee()
    {
        System.out.print("Enter Employee Id ");
        Scanner sc=new Scanner(System.in);
        this.empid=sc.nextInt();
    }
    int getEmpid()
    {
        return empid;
    }

    public void Login(SmartCard sc)
    {
        int eid=sc.getEmpid(this);
        System.out.println("Login Successfull for Employee =  " +eid);
    }
}
public class AD
{
    public static void main(String args[])
    {
        System.out.println("Associaion b/w Employee and Samrtcard");
        Employee e= new Employee();
        System.out.println("New employee Created");

        SmartCard scd=new SmartCard();
        scd.Markattendence(e);

        e.Login(scd);
    }
    
}