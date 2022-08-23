package day24_array;

public class SchoolStore {
    
    public static void main(String[] args) {


        // each item price and id are related in the positions they are in the array

        String[] items = {"Backpack", "Jacket", "Shirt", "Macbook", "Notebook", "Headphones"};
        double[] prices = {59.99, 150.0, 10.55, 1_000, 3.49, 15.99};
        int[] itemID = {500101, 500102, 500103, 500104, 500105, 500106};

        // print the catalog
        System.out.println("Full Catalog\nID\t\t | NAME | PRICE");
        for (int i = 0; i < items.length; i++) {
            System.out.println(itemID[i] + " | " + items[i] + " | $" + prices[i]);
        }

        // finding if jackets in the store
        boolean inStock = false;
        for (String eachItem : items) {  // eachItem will represent each element from the items array
            if (eachItem.equalsIgnoreCase("jacket")){
                inStock = true;
                break;
            }
        }
        System.out.println(inStock ? "Jacket is in stock" : "We don't have jackets right now");

        System.out.println();

        // find the index of notebook
        int index = -1;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("notebook")) {
                index = i;
            }

        }
        System.out.println("Index of the notebook " + index);

        // Find the information for the most expensive item
        double maxPrice = prices[0];
        int indexOfMax = 0;

        for (int i = 0; i < prices.length; i++) { // we can start from int = 1 because first price is already default

            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMax = i;
            }

        }
        System.out.println("Most Expensive item: " + itemID[indexOfMax] + " | " + items[indexOfMax] + " | $" + prices[indexOfMax]);






        
    }
}
