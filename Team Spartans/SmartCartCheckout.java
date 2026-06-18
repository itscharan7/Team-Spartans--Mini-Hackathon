import java.util.Scanner;

public class SmartCartCheckout {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0;
        double discount = 0;

        System.out.print("Enter Number of Products: ");
        int length = sc.nextInt();

        System.out.println("\n length============== RECEIPT ==============");

        for (int iter = 1; iter <= length; iter++) {

            System.out.print("\nEnter Product Name: ");
            String productName = sc.next();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            double itemTotal = price * quantity;

            total += itemTotal;

            System.out.println(
                    productName +
                    " | " + price +
                    " element " + quantity +
                    " = " + itemTotal);
        }

        if (total >= 5000) {
            discount = total * 0.20;
        }
        else if (total >= 2000) {
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        String customerType;

        if (total >= 5000) {
            customerType = "Premium Bulk Customer";
        }
        else if (total >= 2000) {
            customerType = "Bulk Customer";
        }
        else {
            customerType = "Regular Customer";
        }

        System.out.println("\nlength======================================");
        System.out.println("Customer Type : " + customerType);
        System.out.println("Subtotal      : " + total);
        System.out.println("Discount      : " + discount);
        System.out.println("Final Bill    : " + finalAmount);
        System.out.println("======================================");

        System.out.println("\nTransaction Completed Successfully!");

        sc.close();
    }
}