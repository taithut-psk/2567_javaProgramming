import javax.swing.*;

public class Lab201 {
    public static void main(String[] args) {
    	
        final int numberOfCustomer = Integer.parseInt(JOptionPane.showInputDialog(null, "How many customer per bill?"));

        float price = numberOfCustomer * 299;
        float discount = (price * 10 / 100);

        int discount_2 = 2;
        while(discount_2 == 2) {
            discount_2 = JOptionPane.showConfirmDialog(null,
                    "Total Price is " + String.format("%,.2f", price) + 
                    " baht." + "\n" +
                    "Do you have a member card?"
            );
        }

        float sumPrice = price;
        if (discount_2 == 0) {
        sumPrice -= discount ;
        JOptionPane.showMessageDialog(null,"Amount to be paid is "+ String.format("%,.2f", sumPrice) + " baht.");
        }
    }
}