package quizes.q2.aleksandre_maghlakelidze_1.drill;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri
        int otherExpenses = 5100 + 75 + 159 + 14800 + 5100; // tetri

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);
        System.out.println(profit);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {

        double profitInTetris = (pricePerCoffee * numCoffeeSold) - (totalCostOfBeans + otherExpenses);
        double profitInLaris = profitInTetris / 100;

        return profitInLaris;
    }


}
