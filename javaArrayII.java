import java.util.ArrayList;
import java.util.Scanner;

public class javaArrayII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> receipt = new ArrayList<>();
        ArrayList<String> menu = new ArrayList<>();
        ArrayList<Integer> prices = new ArrayList<>();
        
        menu.add("Coke");
        prices.add(20);
        menu.add("Royale");
        prices.add(23);
        menu.add("Sprite");
        prices.add(19);
        menu.add("Sarsi");
        prices.add(25);
        while (true) {
            System.out.print("\nBeverage Available: ");
            for (int i = 0; i < menu.size(); i++) {
                System.out.print(menu.get(i) + " = P" + prices.get(i));
                if (i < menu.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            System.out.print("Purchase Beverage: ");
            String beverage = sc.nextLine();
            boolean found = false;
            for (String item : menu) {
                if (item.equalsIgnoreCase(beverage)) {
                    receipt.add(item);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("\nBeverage not available.");
            }

            System.out.print("Do you want to add more? Yes or No? ");
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("No")) {
                System.out.println("\n-------------------------------");
                System.out.println("\nPlease Pay your Beverage");
                int total = 0;
                for (int i = 0; i < receipt.size(); i++) {
                    beverage = receipt.get(i);
                    int price = prices.get(menu.indexOf(beverage));
                    System.out.println(beverage + "\tPhp " + price);
                    total += price;
                }
                System.out.print("Total Amount:\t" + total);
                break;
            }
        }
        sc.close();
        System.out.println();
    }
}