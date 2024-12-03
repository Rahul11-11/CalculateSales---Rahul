import java.util.Date;


public class Customer {

  private String customerName;
  private String contactInformation;
  private String deliveryAddress;
  private Date arrivalDate;

  
  public Customer() {
    this.customerName = "Rahul";
    this.contactInformation = "rahulreddy.battula@eagles.oc.edu";
    this.deliveryAddress = "700 Main St, Oklahoma, USA";
    this.arrivalDate = new Date();
  }

  
  public void displayDetails() {
    System.out.println("Customer Name: " + this.customerName);
    System.out.println("Contact Information: " + this.contactInformation);
    System.out.println("Delivery Address: " + this.deliveryAddress);
    System.out.println("Expected Arrival Date: " + this.arrivalDate);
  }
}
