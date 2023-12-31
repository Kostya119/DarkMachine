enum DrinksMachine {
    COFFEE,
    TEA,
    LEMONADE,
    MOJITO,
    MINERAL_WATER,
    COCA_COLA
}

class Drinks {
    static final double COFFEE_PRICE = 2.5;
    static final double TEA_PRICE = 1.8;
    static final double LEMONADE_PRICE = 2.0;
    static final double MOJITO_PRICE = 3.5;
    static final double MINERAL_WATER_PRICE = 1.0;
    static final double COCA_COLA_PRICE = 2.2;
}

class DrinksMaker {
    private int totalDrinksCount = 0;
    private double totalAmount = 0.0;

    void makeDrink(DrinksMachine drink) {
        switch (drink) {
            case COFFEE:
                makeCoffee();
                break;
            case TEA:
                makeTea();
                break;
            case LEMONADE:
                makeLemonade();
                break;
            case MOJITO:
                makeMojito();
                break;
            case MINERAL_WATER:
                makeMineralWater();
                break;
            case COCA_COLA:
                makeCocaCola();
                break;
        }
    }

    private void makeCoffee() {
        System.out.println("Preparing coffee...");
        totalDrinksCount++;
        totalAmount += Drinks.COFFEE_PRICE;
    }

    private void makeTea() {
        System.out.println("Preparing tea...");
        totalDrinksCount++;
        totalAmount += Drinks.TEA_PRICE;
    }

    private void makeLemonade() {
        System.out.println("Preparing lemonade...");
        totalDrinksCount++;
        totalAmount += Drinks.LEMONADE_PRICE;
    }

    private void makeMojito() {
        System.out.println("Preparing mojito...");
        totalDrinksCount++;
        totalAmount += Drinks.MOJITO_PRICE;
    }

    private void makeMineralWater() {
        System.out.println("Preparing mineral water...");
        totalDrinksCount++;
        totalAmount += Drinks.MINERAL_WATER_PRICE;
    }

    private void makeCocaCola() {
        System.out.println("Preparing Coca Cola...");
        totalDrinksCount++;
        totalAmount += Drinks.COCA_COLA_PRICE;
    }

    int getTotalDrinksCount() {
        return totalDrinksCount;
    }

    double getTotalAmount() {
        return totalAmount;
    }
}