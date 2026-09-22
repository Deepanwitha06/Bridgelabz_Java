package javaProgrammingElement.level1;
// Creating Class with name ProfitAndLoss  to calculate profit and loss
class ProfitAndLoss {

    public static void main(String[] args) {

        // Create an int variable costPrice and assign value 129
        int costPrice = 129;

        // Create an int variable sellingPrice and assign value 191
        int sellingPrice = 191;

        // Calculate the profit
        int profit = sellingPrice - costPrice;

        // Calculate the profit percentage
        double profitPercentage = (double) profit / costPrice * 100;

        // Display the result
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice+ "\nThe Profit is INR " + profit+ " and the Profit Percentage is " + profitPercentage);
    }
}
