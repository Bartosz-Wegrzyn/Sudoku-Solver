import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Tab {
    static int i = 0;
    private static String a = " ";
    //Linie poziome
    public static int[] X1o = new int[9];
    public static int[] X2o = new int[9];
    public static int[] X3o = new int[9];
    public static int[] X4o = new int[9];
    public static int[] X5o = new int[9];
    public static int[] X6o = new int[9];
    public static int[] X7o = new int[9];
    public static int[] X8o = new int[9];
    public static int[] X9o = new int[9];

    //Linie pionowe
    public static int[] Xo1 = {X1o[0], X2o[0], X3o[0], X4o[0], X5o[0], X6o[0], X7o[0], X8o[0], X9o[0]};
    public static int[] Xo2 = {X1o[1], X2o[1], X3o[1], X4o[1], X5o[1], X6o[1], X7o[1], X8o[1], X9o[1]};
    public static int[] Xo3 = {X1o[2], X2o[2], X3o[2], X4o[2], X5o[2], X6o[2], X7o[2], X8o[2], X9o[2]};
    public static int[] Xo4 = {X1o[3], X2o[3], X3o[3], X4o[3], X5o[3], X6o[3], X7o[3], X8o[3], X9o[3]};
    public static int[] Xo5 = {X1o[4], X2o[4], X3o[4], X4o[4], X5o[4], X6o[4], X7o[4], X8o[4], X9o[4]};
    public static int[] Xo6 = {X1o[5], X2o[5], X3o[5], X4o[5], X5o[5], X6o[5], X7o[5], X8o[5], X9o[5]};
    public static int[] Xo7 = {X1o[6], X2o[6], X3o[6], X4o[6], X5o[6], X6o[6], X7o[6], X8o[6], X9o[6]};
    public static int[] Xo8 = {X1o[7], X2o[7], X3o[7], X4o[7], X5o[7], X6o[7], X7o[7], X8o[7], X9o[7]};
    public static int[] Xo9 = {X1o[8], X2o[8], X3o[8], X4o[8], X5o[8], X6o[8], X7o[8], X8o[8], X9o[8]};

//    //Pola
//    ArrayList pola = new ArrayList(9);
//    int pola[0] = [X1o[0], X1o[1], X1o[2], X2o[0], X2o[1], X2o[2], X3o[0], X3o[1], X3o[2],];
//    pola[1] =   {X1o[3], X1o[4], X1o[5], X2o[3], X2o[4], X2o[5], X3o[3], X3o[4], X3o[5],};
//    pola[2] =  {X1o[6], X1o[7], X1o[8], X2o[6], X2o[7], X2o[8], X3o[6], X3o[7], X3o[8],};
//    pola[3] =   {X4o[0], X4o[1], X4o[2], X5o[0], X5o[1], X5o[2], X6o[0], X6o[1], X6o[2],};
//    pola[4] =     {X4o[3], X4o[4], X4o[5], X5o[3], X5o[4], X5o[5], X6o[3], X6o[4], X6o[5],};
//    pola[5] =    {X4o[6], X4o[7], X4o[8], X5o[6], X5o[7], X5o[8], X6o[6], X6o[7], X6o[8],};
//    pola[6] =   {X7o[0], X7o[1], X7o[2], X8o[0], X8o[1], X8o[2], X9o[0], X9o[1], X9o[2],};
//    pola[7]=  {X7o[3], X7o[4], X7o[5], X8o[3], X8o[4], X8o[5], X9o[3], X9o[4], X9o[5],};
//    pola[8] =   {X7o[6], X7o[7], X7o[8], X8o[6], X8o[7], X8o[8], X9o[6], X9o[7], X9o[8],};

    public  static int[] I =    {X1o[0], X1o[1], X1o[2], X2o[0], X2o[1], X2o[2], X3o[0], X3o[1], X3o[2],};
    public  static int[] II =   {X1o[3], X1o[4], X1o[5], X2o[3], X2o[4], X2o[5], X3o[3], X3o[4], X3o[5],};
    public  static int[] III =  {X1o[6], X1o[7], X1o[8], X2o[6], X2o[7], X2o[8], X3o[6], X3o[7], X3o[8],};
    public  static int[] IV =   {X4o[0], X4o[1], X4o[2], X5o[0], X5o[1], X5o[2], X6o[0], X6o[1], X6o[2],};
    public static int[] V =     {X4o[3], X4o[4], X4o[5], X5o[3], X5o[4], X5o[5], X6o[3], X6o[4], X6o[5],};
    public static int[] VI =    {X4o[6], X4o[7], X4o[8], X5o[6], X5o[7], X5o[8], X6o[6], X6o[7], X6o[8],};
    public static int[] VII =   {X7o[0], X7o[1], X7o[2], X8o[0], X8o[1], X8o[2], X9o[0], X9o[1], X9o[2],};
    public static int[] VIII =  {X7o[3], X7o[4], X7o[5], X8o[3], X8o[4], X8o[5], X9o[3], X9o[4], X9o[5],};
    public  static int[] IX =   {X7o[6], X7o[7], X7o[8], X8o[6], X8o[7], X8o[8], X9o[6], X9o[7], X9o[8],};


    //Drukowanie Tablic:

    public static void PrintTab_from_Xno() {
        //System.out.println("-------------------------------");
        for (Integer num : X1o) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();
        for (Integer num : X2o) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();
        for (Integer num : X3o) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();

        System.out.println("-------------------------------");
        for (Integer num : X4o) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();
        for (Integer num : X5o) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();
        for (Integer num : X6o) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();

        System.out.println("-------------------------------");
        for (Integer num : X7o) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();
        for (Integer num : X8o) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a);}
        i = 0;
        System.out.println();
        for (Integer num : X9o) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;System.out.println();}

    public static void PrintTab_from_Xon() {
        //System.out.println("-------------------------------");
        for (Integer num : Xo1) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();
        for (Integer num : Xo2) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();
        for (Integer num : Xo3) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();
        System.out.println("-------------------------------");
        for (Integer num : Xo4) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();
        for (Integer num : Xo5) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();
        for (Integer num : Xo6) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();
        System.out.println("-------------------------------");
        for (Integer num : Xo7) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;
        System.out.println();
        for (Integer num : Xo8) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a);}
        i = 0;
        System.out.println();
        for (Integer num : Xo9) { a = " ";if (i == 2 | i == 5) a = " | ";i++;System.out.print(" " + num + a); }i = 0;System.out.println();}

    public static void ClearTab() {

        for (int ww=0; ww<=8; ww++){
            X1o[ww] = 0;
            X2o[ww] = 0;
            X3o[ww] = 0;
            X4o[ww] = 0;
            X5o[ww] = 0;
            X6o[ww] = 0;
            X7o[ww] = 0;
            X8o[ww] = 0;
            X9o[ww] = 0;
            Xo1[ww] = 0;
            Xo2[ww] = 0;
            Xo3[ww] = 0;
            Xo4[ww] = 0;
            Xo5[ww] = 0;
            Xo6[ww] = 0;
            Xo7[ww] = 0;
            Xo8[ww] = 0;
            Xo9[ww] = 0;

            I[ww] = 0;
            II[ww] = 0;
            III[ww] = 0;
            IV[ww] = 0;
            V[ww] = 0;
            VI[ww] = 0;
            VII[ww] = 0;
            VIII[ww] = 0;
            IX[ww] = 0;

            Testy.variables_B_To_0();
        }
    }




    //Wgrywanie Liczb:

    public static void RandomXYW() throws InterruptedException {



        for ( int i =0; i<1; i++) {
            System.out.println("-------");


            //  Randomowe Cyfry do programu //
            double x1, y1, w1;
            x1 = java.lang.Math.random()*10;
            long x2 = java.lang.Math.round(x1);
            int x = (int)x2;
            if (x == 0) x=1;
            if (x == 10) x=9;

            y1 = java.lang.Math.random()*10;
            long y2 = java.lang.Math.round(y1);
            int y = (int)y2;
            if (y == 0) y=1;
            if (y == 10) y=9;

            w1 = java.lang.Math.random()*10;
            long w2 = java.lang.Math.round(w1);
            int w = (int)w2;
            if (w == 0) w=1;
            if (w == 10) w=9;
            System.out.println("x=" + x+"; y="+ y+ "; w="+ w);

            DataToTab_Xno(x, y ,w);
            DataToTab_Xon(y, x ,w);
            DataToTab_Xp(x, y, w );
            System.out.println("Tab no:");
            PrintTab_from_Xno();
//            System.out.println("Tab on:");
//            PrintTab_from_Xno();
            Testy.wszystkieTesty();

            x=0;
            y=0;
            w=0;
        }
    }

    public static void CustomXYW() throws InterruptedException {

        for (; ;) {
            System.out.println("--------------");

            System.out.println("Wyjdź: 0");
            System.out.println("Reset: 1");
            System.out.println("Wprowadź swoje cyfry:");

            //  własne cyfry//
            Scanner scanner = new Scanner(System.in);
            int xyw = scanner.nextInt();
            if (xyw == 0) break;
            if (xyw == 1) {
                ClearTab(); PrintTab_from_Xno(); continue;}
            if (xyw>999) {System.out.println("Niepoprawna wartość");continue;}
            if (xyw<110 ) {System.out.println("Niepoprawna wartość");continue;}


            int x = Math.xyw_To_x(xyw);
            int y = Math.xyw_To_y(xyw);
            int w = Math.xyw_To_w(xyw);
            if(x<=0 || y<=0 || w < 0) {
                System.out.println("x=" + x+"; y="+ y+ "; w="+ w);
                System.out.println("błąd00");continue;}
                System.out.println("x=" + x+"; y="+ y+ "; w="+ w);
            DataToTab_Xno(x, y ,w);
            DataToTab_Xon(y, x ,w);
            DataToTab_Xp(x, y, w );
                PrintTab_from_Xno();
            System.out.println();
            System.out.println(X2o[2]);
            System.out.println(Xo3[1]);
            System.out.println(I[5]);
            System.out.println();
                Testy.wszystkieTesty();
                Testy.variables_B_To_0();
                System.out.println();
               // PrintTab_from_Xon(); //tabon
        }
    }

    public static void PreLoadedXYW() throws InterruptedException {

        // Sudoku wgrane wcześcniej
//        int xyw[] = {};
        int xyw[] = {

//                119, 175, 181,
//                227, 258, 299,
//                315, 341, 369, 372, 387, 398,
//                412, 425, 467, 478, 491,
//                511, 555,
//                613, 659,
//                743, 751, 765, 784,
//                917, 921, 934, 952, 988,


//                111, 125, 130, 140, 154, 162, 170, 180, 196,
//                212, 227, 234, 245, 256, 260, 270, 281, 290,
//                310, 320, 336, 341, 350, 367, 374, 380, 392,
//                410, 421, 438, 440, 450, 460, 475, 484, 490,
//                510, 520, 533, 540, 555, 560, 570, 580, 590,
//                610, 626, 630, 644, 650, 663, 671, 689, 690,
//                710, 722, 730, 746, 750, 765, 779, 780, 790,
//                819, 828, 835, 840, 853, 860, 870, 886, 890,
//                910, 924, 930, 942, 951, 969, 978, 983, 990,

                116, 124, 130, 140, 153, 160, 170, 180, 197,
                215, 220, 231, 240, 257, 260, 279, 280, 290,
                310, 320, 330, 340, 350, 360, 370, 381, 390,
                410, 420, 434, 449, 450, 468, 470, 486, 490,
                510, 528, 530, 540, 550, 563, 570, 582, 590,
                610, 620, 630, 644, 650, 660, 670, 680, 690,
                714, 720, 730, 741, 755, 767, 770, 783, 790,
                812, 820, 838, 843, 850, 860, 870, 884, 890,
                917, 925, 930, 940, 950, 960, 970, 989, 996,



        };


        int dl = xyw.length;


        for (int i =0; i<dl; i++) {
            int x = Math.xyw_To_x(xyw[i]);
            int y = Math.xyw_To_y(xyw[i]);
            int w = Math.xyw_To_w(xyw[i]);
            if(x<=0 || y<=0 || w < 0) {
                System.out.println("x=" + x+"; y="+ y+ "; w="+ w);
                System.out.println("błąd00");continue;}
            System.out.println("Liczba "+ (i+1) + " = ["+ "x=" + x+"; y="+ y+ "; w="+ w + "]");

            DataToTab_Xno(x, y ,w);
            DataToTab_Xon(y, x ,w);
            DataToTab_Xp(x, y, w );

            PrintTab_from_Xno();
            Testy.wszystkieTesty();

        }
        System.out.println("___________________________________________");
        System.out.println("___________________________________________");
        System.out.println("___________________________________________");
        System.out.println("___________________________________________");
       // Testy.dzialaj();
    }

    //Wgrywanie pobranch liczb do tablic:

    public static void DataToTab_Xno(int x, int y, int w){

        switch ((int) x) {
            case 1:
                X1o[(int) (y - 1)] = (int) w;
                break;
            case 2:
                X2o[(int) (y - 1)] = (int) w;
                break;
            case 3:
                X3o[(int) (y - 1)] = (int) w;
                break;
            case 4:
                X4o[(int) (y - 1)] = (int) w;
                break;
            case 5:
                X5o[(int) (y - 1)] = (int) w;
                break;
            case 6:
                X6o[(int) (y - 1)] = (int) w;
                break;
            case 7:
                X7o[(int) (y - 1)] = (int) w;
                break;
            case 8:
                X8o[(int) (y - 1)] = (int) w;
                break;
            case 9:
                X9o[(int) (y - 1)] = (int) w;
                break;
        }
    }

    public static void DataToTab_Xon(int x, int y, int w){

        switch ((int) x) {
            case 1:
                Xo1[(int) (y - 1)] = (int) w;
                break;
            case 2:
                Xo2[(int) (y - 1)] = (int) w;
                break;
            case 3:
                Xo3[(int) (y - 1)] = (int) w;
                break;
            case 4:
                Xo4[(int) (y - 1)] = (int) w;
                break;
            case 5:
                Xo5[(int) (y - 1)] = (int) w;
                break;
            case 6:
                Xo6[(int) (y - 1)] = (int) w;
                break;
            case 7:
                Xo7[(int) (y - 1)] = (int) w;
                break;
            case 8:
                Xo8[(int) (y - 1)] = (int) w;
                break;
            case 9:
                Xo9[(int) (y - 1)] = (int) w;
                break;
        }
    }

    public static void DataToTab_Xp(int x, int y, int w){

        I[0] = X1o[0];
        I[1] = X1o[1];
        I[2] = X1o[2];
        I[3] = X2o[0];
        I[4] = X2o[1];
        I[5] = X2o[2];
        I[6] = X3o[0];
        I[7] = X3o[1];
        I[8] = X3o[2];

        II[0] = X1o[3];
        II[1] = X1o[4];
        II[2] = X1o[5];
        II[3] = X2o[3];
        II[4] = X2o[4];
        II[5] = X2o[5];
        II[6] = X3o[3];
        II[7] = X3o[4];
        II[8] = X3o[5];

        III[0] = X1o[6];
        III[1] = X1o[7];
        III[2] = X1o[8];
        III[3] = X2o[6];
        III[4] = X2o[7];
        III[5] = X2o[8];
        III[6] = X3o[6];
        III[7] = X3o[7];
        III[8] = X3o[8];

        IV[0] = X4o[0];
        IV[1] = X4o[1];
        IV[2] = X4o[2];
        IV[3] = X5o[0];
        IV[4] = X5o[1];
        IV[5] = X5o[2];
        IV[6] = X6o[0];
        IV[7] = X6o[1];
        IV[8] = X6o[2];

        V[0] = X4o[3];
        V[1] = X4o[4];
        V[2] = X4o[5];
        V[3] = X5o[3];
        V[4] = X5o[4];
        V[5] = X5o[5];
        V[6] = X6o[3];
        V[7] = X6o[4];
        V[8] = X6o[5];

        VI[0] = X4o[6];
        VI[1] = X4o[7];
        VI[2] = X4o[8];
        VI[3] = X5o[6];
        VI[4] = X5o[7];
        VI[5] = X5o[8];
        VI[6] = X6o[6];
        VI[7] = X6o[7];
        VI[8] = X6o[8];

        VII[0] = X7o[0];
        VII[1] = X7o[1];
        VII[2] = X7o[2];
        VII[3] = X8o[0];
        VII[4] = X8o[1];
        VII[5] = X8o[2];
        VII[6] = X9o[0];
        VII[7] = X9o[1];
        VII[8] = X9o[2];

        VIII[0] = X7o[3];
        VIII[1] = X7o[4];
        VIII[2] = X7o[5];
        VIII[3] = X8o[3];
        VIII[4] = X8o[4];
        VIII[5] = X8o[5];
        VIII[6] = X9o[3];
        VIII[7] = X9o[4];
        VIII[8] = X9o[5];

        IX[0] = X7o[6];
        IX[1] = X7o[7];
        IX[2] = X7o[8];
        IX[3] = X8o[6];
        IX[4] = X8o[7];
        IX[5] = X8o[8];
        IX[6] = X9o[6];
        IX[7] = X9o[7];
        IX[8] = X9o[8];

    }

}
