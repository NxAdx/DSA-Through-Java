class paT {
    public static void main(String[] args) {
        // pat1(5);
        // pat2(5);
        // pat3(5);
        // pat4(5);
        // pat5(5);
        // pat6(5);
        // pat7(5);
        // pat8(5);
        //pat09(5);
        // pat9(5);
        pat10(5);
    }

    static void pat1(int n) {

        // *****
        // *****
        // *****
        // *****
        // *****
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pat2(int n) {
        // *
        // **
        // ***
        // ****
        // *****
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pat3(int n) {
        // *****
        // ****
        // ***
        // **
        // *
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pat4(int n) {

        for (int row = 1; row <= n; row++) {
           //     *
           //    **
           //   ***
           //  ****
           // *****
            for (int sp = 1; sp <= n - row; sp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pat5(int n) {
        // *****
        //  ****
        //   ***
        //    **
        //     *

        for (int row = 1; row <= n; row++) {

            for (int sp = 1; sp <= row - 1; sp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pat6(int n) {
//     *
//    **
//   ***
//  ****
// *****
//  ****
//   ***
//    **
//     *
     
        for (int row = 1; row <= n * 2; row++) {
            int tillthis = row > n ? n * 2 - row : row;
            int space = n - tillthis;
            for (int sp = 1; sp <= space; sp++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= tillthis; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pat7(int n) {
        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= n - row; sp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    static void pat8(int n) {
        //  * * * * *
        //   * * * *
        //    * * *
        //     * *
        //      *
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= row - 1; sp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
      static void pat09(int n) {
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

        for (int row = 1; row <= n * 2; row++) {
            int till = row > n ? n * 2 - row : row;
            for (int col = 1; col <= till; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat9(int n) {
    // //      * 
    // //     * * 
    // //    * * * 
    // //   * * * * 
    // //  * * * * * 
    // //   * * * * 
    // //    * * * 
    // //     * * 
    // //      * 

        for (int row = 1; row <= n * 2; row++) {
            int till = row > n ? n * 2 - row : row;
            int space = n - till;
            for (int sp = 1; sp <= space; sp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= till; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pat10(int n) {
    // //      * 
    // //     * * 
    // //    * * * 
    // //   * * * * 
    // //  * * * * * 
    // //   * * * * 
    // //    * * * 
    // //     * * 
    // //      * 
          
        for (int row = 1; row < n * 2; row++) {
            if (row <= n) {
                for (int space = n - row; space >= 1; space--) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            } else {
                for (int space = 1; space <= row - n; space++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= (n * 2) - row; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
