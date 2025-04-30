public class Bucles {
    
    public static void main(String[] args) {

        // Bucle FOR
        System.out.println("Bucle FOR:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // Bucle WHILE
        System.out.println("\n\nBucle WHILE:");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }

        // Bucle DO-WHILE
        System.out.println("\n\nBucle DO-WHILE:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 10);
    }
}
