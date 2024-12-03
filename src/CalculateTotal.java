public class CalculateTotal {

  
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.displayDetails();
    System.out.println("\n");

    Item item1 = new Item("Coke", "Description 1", 2, 6.99);
    Item item2 = new Item("Pepsi", "Description 2", 1, 4.99);

    item1.displayDetails();
    item2.displayDetails();
    System.out.println("\n");

    double totalCost = 0;
    totalCost += item1.getUnitPrice() * item1.getItemQuantity();
    totalCost += item2.getUnitPrice() * item2.getItemQuantity();
    System.out.println("\n");

    System.out.println("Total Cost: " + totalCost);
  }
}
