class Demo {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {

            // leading spaces
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            // stars with space BETWEEN them (but not at end)
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                if (j < i) System.out.print(" ");
            }

            System.out.println();
        }
    }
}
