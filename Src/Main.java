import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DrinksMaker drinksMaker = new DrinksMaker();

        Scanner scanner = new Scanner(System.in);
        boolean orderMore = true;

        while (orderMore) {
            System.out.println("Available drinks: ");
            for (DrinksMachine drink : DrinksMachine.values()) {
                System.out.println(drink);
            }

            System.out.print("Enter your drink choice: ");
            String drinkChoice = scanner.nextLine().toUpperCase();

            try {
                DrinksMachine selectedDrink = DrinksMachine.valueOf(drinkChoice);
                drinksMaker.makeDrink(selectedDrink);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid drink choice. Please try again.");
                continue;
            }

            System.out.print("Do you want to order more drinks? (yes/no): ");
            String moreChoice = scanner.nextLine().toLowerCase();

            if (moreChoice.equals("no")) {
                orderMore = false;
            }
        }

        int totalDrinksCount = drinksMaker.getTotalDrinksCount();
        double totalAmount = drinksMaker.getTotalAmount();

        System.out.println("Total drinks made: " + totalDrinksCount);
        System.out.println("Total amount to be paid: $" + totalAmount);

        scanner.close();
    }
}