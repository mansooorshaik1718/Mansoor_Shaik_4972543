package Exercise3;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 200.50),
            new Order(2, "Bob", 150.75),
            new Order(3, "Charlie", 300.00),
            new Order(4, "David", 250.25),
            new Order(5, "Eve", 100.00)
        };

        // Bubble Sort Test
        BubbleSort.bubbleSort(orders);
        System.out.println("Orders sorted by Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Resetting the orders array for Quick Sort
        orders = new Order[]{
            new Order(1, "Alice", 200.50),
            new Order(2, "Bob", 150.75),
            new Order(3, "Charlie", 300.00),
            new Order(4, "David", 250.25),
            new Order(5, "Eve", 100.00)
        };

        // Quick Sort Test
        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("Orders sorted by Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
