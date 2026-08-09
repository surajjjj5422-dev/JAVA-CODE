import java.util.Scanner;
import java.util.Vector;

class ProductItem
{
    int id;
    private float price;
    ProductItem(int id, float price)
    {
        this.id=id;
        this.price=price;
    }

    public String toString()
    {
        return "Id "+id+ " Price "+price;
    }

    float getPrice()
    {
        return price;
    }

}

class ShoppingCart
{
    int custId;
    Vector itemsv;
    ShoppingCart(int custId)
    {
        this.custId=custId;
        itemsv = new Vector();
    }


}
public class ShopDemo
{
    public static void main(String[] args) 
    {

    }
}