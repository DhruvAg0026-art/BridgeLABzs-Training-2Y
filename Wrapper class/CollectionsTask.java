public class CollectionsTask {
    public static void main(String[] args) {
        double[] prices = {19.99, 29.99, 5.49, 15.00, 99.99};
        ArrayList<Double> priceList = convertArrayToList(prices);
        
        double highestPrice = findHighestPrice(priceList);
        double averagePrice = calculateAveragePrice(priceList);
        
        System.out.println("Highest Price: " + highestPrice);
        System.out.println("Average Price: " + averagePrice);
    }

    public static ArrayList<Double> convertArrayToList(double[] array) {
        ArrayList<Double> list = new ArrayList<>();
        for (double price : array) {
            list.add(price);
        }
        return list;
    }

    public static double findHighestPrice(ArrayList<Double> prices) {
        double highest = Double.MIN_VALUE;
        for (double price : prices) {
            if (price > highest) {
                highest = price;
            }
        }
        return highest;
    }

    public static double calculateAveragePrice(ArrayList<Double> prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum / prices.size();
    }
}