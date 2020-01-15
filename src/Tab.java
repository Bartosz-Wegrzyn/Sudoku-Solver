import java.util.Scanner;

class Tab {

    //--------------------------------Zmienne--------------------------------

    static int[][] sudoku = new int[9][9];

    private static int[][] PreLoadedXYW = {{

            //PreLoadedXYW #1
            119, 175, 181,
            227, 258, 299,
            315, 341, 369, 372, 387, 398,
            412, 425, 467, 478, 491,
            511, 555,
            613, 659,
            743, 751, 765, 784,
            917, 921, 934, 952, 988,},{

            //PreLoadedXYW #2
            111, 125, 130, 140, 154, 162, 170, 180, 196,
            212, 227, 234, 245, 256, 260, 270, 281, 290,
            310, 320, 336, 341, 350, 367, 374, 380, 392,
            410, 421, 438, 440, 450, 460, 475, 484, 490,
            510, 520, 533, 540, 555, 560, 570, 580, 590,
            610, 626, 630, 644, 650, 663, 671, 689, 690,
            710, 722, 730, 746, 750, 765, 779, 780, 790,
            819, 828, 835, 840, 853, 860, 870, 886, 890,
            910, 924, 930, 942, 951, 969, 978, 983, 990,}, {

            //PreLoadedXYW #3
            116, 124, 130, 140, 153, 160, 170, 180, 197,
            215, 220, 231, 240, 257, 260, 279, 280, 290,
            310, 320, 330, 340, 350, 360, 370, 381, 390,
            410, 420, 434, 449, 450, 468, 470, 486, 490,
            510, 528, 530, 540, 550, 563, 570, 582, 590,
            610, 620, 630, 644, 650, 660, 670, 680, 690,
            714, 720, 730, 741, 755, 767, 770, 783, 790,
            812, 820, 838, 843, 850, 860, 870, 884, 890,
            917, 925, 930, 940, 950, 960, 970, 989, 996,}};

    //--------------------------------Koniec Zmiennych------------------------------


    //-------------------------Rodzaje wczytywania liczb:---------------------------
//    public static void RandomXYW() throws InterruptedException {
//
//        for ( int i =0; i<1; i++) {
//            System.out.println("-------");
//
//            //  Randomowe Cyfry do programu //
//            double x1, y1, w1;
//
//            x1 = java.lang.Math.random()*10;
//            long x2 = java.lang.Math.round(x1);
//            int x = (int)x2;
//            if (x == 0) x=1;
//            if (x == 10) x=9;
//
//            y1 = java.lang.Math.random()*10;
//            long y2 = java.lang.Math.round(y1);
//            int y = (int)y2;
//            if (y == 0) y=1;
//            if (y == 10) y=9;
//
//            w1 = java.lang.Math.random()*10;
//            long w2 = java.lang.Math.round(w1);
//            int w = (int)w2;
//            if (w == 0) w=1;
//            if (w == 10) w=9;
//            System.out.println("x=" + x+"; y="+ y+ "; w="+ w);
//
//            wstaw_XYW_do_sudoku(x, y ,w);
//
//        }
//    }

    static void CustomXYW()  {

        for (; ;) {
            System.out.println("--------------");

            System.out.println("Wyczyść: 1");
            System.out.println("Zatwierdź: 0");
            System.out.println("Wprowadź swoje cyfry:");

            //  własne cyfry//
            Scanner scanner = new Scanner(System.in);
            int xyw = scanner.nextInt();
            if (xyw == 0) break;
            if (xyw == 1) {
                wyczysc_sudoku(); new Tab(); continue;}

            if (xyw>999) {System.out.println("Niepoprawna wartość");continue;}
            if (xyw<110 ) {System.out.println("Niepoprawna wartość");continue;}

            int x = Math.xyw_To_x(xyw);
            int y = Math.xyw_To_y(xyw);
            int w = Math.xyw_To_w(xyw);

            if(x<=0 || y<=0 || w < 0) {System.out.println("błąd00");continue;}

            System.out.println("x=" + x+"; y="+ y+ "; w="+ w);
            wstaw_XYW_do_sudoku(x, y ,w);

            Print_sudoku();
            Testy.sprawdz_bledyPola();

                //Wykonaj testy aby sprawdzić czy nie popełniono błedu we wprowadzaniu!



        }
    }

    static void PreLoadedXYW(int numer_Tablicy) {

        int dl = PreLoadedXYW[numer_Tablicy-1].length;
        for (int i =0; i<dl; i++) {
            int x = Math.xyw_To_x(PreLoadedXYW[numer_Tablicy-1][i]);
            int y = Math.xyw_To_y(PreLoadedXYW[numer_Tablicy-1][i]);
            int w = Math.xyw_To_w(PreLoadedXYW[numer_Tablicy-1][i]);
            if(x<=0 || y<=0 || w < 0) {
                System.out.println("x=" + x + "; y=" + y + "; w=" + w);
                System.out.println("Błąd w pamięci");
                continue;
            }
            wstaw_XYW_do_sudoku(x, y ,w);
        }

    }


    //-------------------------koniec wczytywania liczb-----------------------------
    private static void wstaw_XYW_do_sudoku(int x, int y, int w){
                sudoku[x - 1][y - 1] = w;
    }

   static void Print_sudoku() {

        for (int i = 0; i < sudoku.length; i++) {
            if (i == 3 || i == 6){System.out.print("---------------------------------");
                System.out.println();}
            for (int j = 0; j < sudoku[i].length; j++) {


                if (j == 2 | j == 5) System.out.print(sudoku[i][j]+ " | ");
                else System.out.print(sudoku[i][j]+ "   ");
            }
            System.out.println();
        }
    }

    static void wyczysc_sudoku() {
        for (int i = 0; i < sudoku.length; i++) {
            for (int ii = 0; ii < sudoku[i].length; ii++) {
                sudoku[i][ii]=0;
            }
        }
    }

}
