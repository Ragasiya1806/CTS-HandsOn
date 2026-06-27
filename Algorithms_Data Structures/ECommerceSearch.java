class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class Main {

    public static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == targetId) {
                return mid;
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };

        int targetId = 104;

        int linearResult = linearSearch(products, targetId);

        if (linearResult != -1) {
            System.out.println("Linear Search: Product Found - " + products[linearResult].productName);
        } else {
            System.out.println("Linear Search: Product Not Found");
        }

        int binaryResult = binarySearch(products, targetId);

        if (binaryResult != -1) {
            System.out.println("Binary Search: Product Found - " + products[binaryResult].productName);
        } else {
            System.out.println("Binary Search: Product Not Found");
        }

        System.out.println();
        System.out.println("Time Complexity Analysis");
        System.out.println("Linear Search:");
        System.out.println("Best Case: O(1)");
        System.out.println("Average Case: O(n)");
        System.out.println("Worst Case: O(n)");
        System.out.println();
        System.out.println("Binary Search:");
        System.out.println("Best Case: O(1)");
        System.out.println("Average Case: O(log n)");
        System.out.println("Worst Case: O(log n)");
        System.out.println();
        System.out.println("Binary Search is more suitable because it is faster for searching in sorted data.");
    }
}