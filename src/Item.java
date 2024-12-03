public class Item {

  private String itemName;
  private String itemDescription;
  private int itemQuantity;
  private double unitPrice;

  
  public Item(String name, String desc, int qty, double price) {
    this.itemName = name;
    this.itemDescription = desc;
    this.itemQuantity = qty;
    this.unitPrice = price;
  }

 
  public void displayDetails() {
    System.out.println("Item Name: " + this.itemName);
    System.out.println("Item Description: " + this.itemDescription);
    System.out.println("Item Quantity: " + this.itemQuantity);
    System.out.println("Unit Price: " + this.unitPrice);
  }

  
  public int getItemQuantity() {
    return itemQuantity;
  }

  
  public double getUnitPrice() {
    return unitPrice;
  }
}
