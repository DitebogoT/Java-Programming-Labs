public class ShoppingTotal {
    String productName;
    double unitPrice = 14.00;
    int quantity = 10;
    double totalCost;

    static void printCalculations(){
        ShoppingTotal shopping = new ShoppingTotal();
        System.out.println("Total cost:" + (shopping.quantity * shopping.unitPrice));
    }
}
