class Demo {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i + j <= n) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            // right side stars
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
