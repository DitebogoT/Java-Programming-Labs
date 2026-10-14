public class Product {
    int ProductID;
    String name;
    double price;
    int stockQuantity;

    Product(int ProductID, String name, double price, int stockQuantity){
        this.ProductID = ProductID;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    void displayDetails()
    {
        System.out.println(this.ProductID + " " + this.name + " " +  this.price + " " + this.stockQuantity);
    }
    void addStock()
    {
        this.ProductID = ProductID;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;

        System.out.println("Stock added: " + this.ProductID + " " + this.name + " " +  this.price + " " + this.stockQuantity);
    }
    void reduceStock()
    {

    }
    void stockValue()
    {
        double value = price * stockQuantity;
        System.out.println("The stock value is equivalent to: " +value);
    }


}

//Create a Product class with product ID, name, price, and stock quantity.
//Add methods to display details, add stock, reduce stock after a sale, and calculate stock value (price * quantity).
//Do not allow sales that exceed available stock.
