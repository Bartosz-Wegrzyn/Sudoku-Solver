import java.lang.reflect.Array;
import java.util.ArrayList;

public class Testy<publis> {

    //Zmienne
    static int b1o = 0;
    static int b2o = 0;
    static int b3o = 0;
    static int b4o = 0;
    static int b5o = 0;
    static int b6o = 0;
    static int b7o = 0;
    static int b8o = 0;
    static int b9o = 0;

    static int bo1 = 0;
    static int bo2 = 0;
    static int bo3 = 0;
    static int bo4 = 0;
    static int bo5 = 0;
    static int bo6 = 0;
    static int bo7 = 0;
    static int bo8 = 0;
    static int bo9 = 0;

    static int bp1 = 0;
    static int bp2 = 0;
    static int bp3 = 0;
    static int bp4 = 0;
    static int bp5 = 0;
    static int bp6 = 0;
    static int bp7 = 0;
    static int bp8 = 0;
    static int bp9 = 0;

    static int bon = 0;
    static int bno = 0;
    static int bpn = 0;
    static int b = 0;
   // static int conc = 0;

    static int memory;

    public static void wszystkieTesty(int conc){poziome(conc); pionowe(conc); pola(conc); finalTest(conc);}

    //Test lini poziomych, sprawdzenie czy w koażdej z tablic nie piowela sie dana wartość
    public  static void poziome(int conc) {



        // X1o

        for ( int i = 0; i < 9 ; i++){

            if (Tab.X1o[0] == Tab.X1o[i] && Tab.X1o[0] != 0 && i!=0) {b1o=1;}
            if (Tab.X1o[1] == Tab.X1o[i] && Tab.X1o[1] != 0 && i!=1) {b1o=1;}
            if (Tab.X1o[2] == Tab.X1o[i] && Tab.X1o[2] != 0 && i!=2) {b1o=1;}
            if (Tab.X1o[3] == Tab.X1o[i] && Tab.X1o[3] != 0 && i!=3) {b1o=1;}
            if (Tab.X1o[4] == Tab.X1o[i] && Tab.X1o[4] != 0 && i!=4) {b1o=1;}
            if (Tab.X1o[5] == Tab.X1o[i] && Tab.X1o[5] != 0 && i!=5) {b1o=1;}
            if (Tab.X1o[6] == Tab.X1o[i] && Tab.X1o[6] != 0 && i!=6) {b1o=1;}
            if (Tab.X1o[7] == Tab.X1o[i] && Tab.X1o[7] != 0 && i!=7) {b1o=1;}
            if (Tab.X1o[8] == Tab.X1o[i] && Tab.X1o[8] != 0 && i!=8) {b1o=1;}
        }

        if(conc ==1) {

            if (b1o == 1)
                System.out.println("bład w 1 wierszu");

        }

        // X2o

        for ( int i = 0; i <9 ; i++){

            if (Tab.X2o[0] == Tab.X2o[i] && Tab.X2o[0] != 0 && i!=0) {b2o=1;}
            if (Tab.X2o[1] == Tab.X2o[i] && Tab.X2o[1] != 0 && i!=1) {b2o=1;}
            if (Tab.X2o[2] == Tab.X2o[i] && Tab.X2o[2] != 0 && i!=2) {b2o=1;}
            if (Tab.X2o[3] == Tab.X2o[i] && Tab.X2o[3] != 0 && i!=3) {b2o=1;}
            if (Tab.X2o[4] == Tab.X2o[i] && Tab.X2o[4] != 0 && i!=4) {b2o=1;}
            if (Tab.X2o[5] == Tab.X2o[i] && Tab.X2o[5] != 0 && i!=5) {b2o=1;}
            if (Tab.X2o[6] == Tab.X2o[i] && Tab.X2o[6] != 0 && i!=6) {b2o=1;}
            if (Tab.X2o[7] == Tab.X2o[i] && Tab.X2o[7] != 0 && i!=7) {b2o=1;}
            if (Tab.X2o[8] == Tab.X2o[i] && Tab.X2o[8] != 0 && i!=8) {b2o=1;}
        }

        if(conc ==1) {
            if (b2o == 1)
                System.out.println("bład w 2 wierszu");
        }

        // X3o

        for ( int i = 0; i <9 ; i++){

            if (Tab.X3o[0] == Tab.X3o[i] && Tab.X3o[0] != 0 && i!=0) {b3o=1;}
            if (Tab.X3o[1] == Tab.X3o[i] && Tab.X3o[1] != 0 && i!=1) {b3o=1;}
            if (Tab.X3o[2] == Tab.X3o[i] && Tab.X3o[2] != 0 && i!=2) {b3o=1;}
            if (Tab.X3o[3] == Tab.X3o[i] && Tab.X3o[3] != 0 && i!=3) {b3o=1;}
            if (Tab.X3o[4] == Tab.X3o[i] && Tab.X3o[4] != 0 && i!=4) {b3o=1;}
            if (Tab.X3o[5] == Tab.X3o[i] && Tab.X3o[5] != 0 && i!=5) {b3o=1;}
            if (Tab.X3o[6] == Tab.X3o[i] && Tab.X3o[6] != 0 && i!=6) {b3o=1;}
            if (Tab.X3o[7] == Tab.X3o[i] && Tab.X3o[7] != 0 && i!=7) {b3o=1;}
            if (Tab.X3o[8] == Tab.X3o[i] && Tab.X3o[8] != 0 && i!=8) {b3o=1;}
        }
        if(conc ==1) {
            if (b3o == 1)
                System.out.println("bład w 3 wierszu");
        }
        // X4o

        for ( int i = 0; i <9 ; i++){

            if (Tab.X4o[0] == Tab.X4o[i] && Tab.X4o[0] != 0 && i!=0) {b4o=1;}
            if (Tab.X4o[1] == Tab.X4o[i] && Tab.X4o[1] != 0 && i!=1) {b4o=1;}
            if (Tab.X4o[2] == Tab.X4o[i] && Tab.X4o[2] != 0 && i!=2) {b4o=1;}
            if (Tab.X4o[3] == Tab.X4o[i] && Tab.X4o[3] != 0 && i!=3) {b4o=1;}
            if (Tab.X4o[4] == Tab.X4o[i] && Tab.X4o[4] != 0 && i!=4) {b4o=1;}
            if (Tab.X4o[5] == Tab.X4o[i] && Tab.X4o[5] != 0 && i!=5) {b4o=1;}
            if (Tab.X4o[6] == Tab.X4o[i] && Tab.X4o[6] != 0 && i!=6) {b4o=1;}
            if (Tab.X4o[7] == Tab.X4o[i] && Tab.X4o[7] != 0 && i!=7) {b4o=1;}
            if (Tab.X4o[8] == Tab.X4o[i] && Tab.X4o[8] != 0 && i!=8) {b4o=1;}
        }
        if(conc ==1) {
            if (b4o == 1)
                System.out.println("bład w 4 wierszu");
        }

        // X5o

        for ( int i = 0; i <9 ; i++){

            if (Tab.X5o[0] == Tab.X5o[i] && Tab.X5o[0] != 0 && i!=0) {b5o=1;}
            if (Tab.X5o[1] == Tab.X5o[i] && Tab.X5o[1] != 0 && i!=1) {b5o=1;}
            if (Tab.X5o[2] == Tab.X5o[i] && Tab.X5o[2] != 0 && i!=2) {b5o=1;}
            if (Tab.X5o[3] == Tab.X5o[i] && Tab.X5o[3] != 0 && i!=3) {b5o=1;}
            if (Tab.X5o[4] == Tab.X5o[i] && Tab.X5o[4] != 0 && i!=4) {b5o=1;}
            if (Tab.X5o[5] == Tab.X5o[i] && Tab.X5o[5] != 0 && i!=5) {b5o=1;}
            if (Tab.X5o[6] == Tab.X5o[i] && Tab.X5o[6] != 0 && i!=6) {b5o=1;}
            if (Tab.X5o[7] == Tab.X5o[i] && Tab.X5o[7] != 0 && i!=7) {b5o=1;}
            if (Tab.X5o[8] == Tab.X5o[i] && Tab.X5o[8] != 0 && i!=8) {b5o=1;}
        }
        if(conc ==1) {
            if (b5o == 1)
                System.out.println("bład w 5 wierszu");
        }

        // X6o

        for ( int i = 0; i <9 ; i++){

            if (Tab.X6o[0] == Tab.X6o[i] && Tab.X6o[0] != 0 && i!=0) {b6o=1;}
            if (Tab.X6o[1] == Tab.X6o[i] && Tab.X6o[1] != 0 && i!=1) {b6o=1;}
            if (Tab.X6o[2] == Tab.X6o[i] && Tab.X6o[2] != 0 && i!=2) {b6o=1;}
            if (Tab.X6o[3] == Tab.X6o[i] && Tab.X6o[3] != 0 && i!=3) {b6o=1;}
            if (Tab.X6o[4] == Tab.X6o[i] && Tab.X6o[4] != 0 && i!=4) {b6o=1;}
            if (Tab.X6o[5] == Tab.X6o[i] && Tab.X6o[5] != 0 && i!=5) {b6o=1;}
            if (Tab.X6o[6] == Tab.X6o[i] && Tab.X6o[6] != 0 && i!=6) {b6o=1;}
            if (Tab.X6o[7] == Tab.X6o[i] && Tab.X6o[7] != 0 && i!=7) {b6o=1;}
            if (Tab.X6o[8] == Tab.X6o[i] && Tab.X6o[8] != 0 && i!=8) {b6o=1;}
        }
        if(conc ==1) {
            if (b6o == 1)
                System.out.println("bład w 6 wierszu");
        }
        // X7o

        for ( int i = 0; i <9 ; i++){

            if (Tab.X7o[0] == Tab.X7o[i] && Tab.X7o[0] != 0 && i!=0) {b7o=1;}
            if (Tab.X7o[1] == Tab.X7o[i] && Tab.X7o[1] != 0 && i!=1) {b7o=1;}
            if (Tab.X7o[2] == Tab.X7o[i] && Tab.X7o[2] != 0 && i!=2) {b7o=1;}
            if (Tab.X7o[3] == Tab.X7o[i] && Tab.X7o[3] != 0 && i!=3) {b7o=1;}
            if (Tab.X7o[4] == Tab.X7o[i] && Tab.X7o[4] != 0 && i!=4) {b7o=1;}
            if (Tab.X7o[5] == Tab.X7o[i] && Tab.X7o[5] != 0 && i!=5) {b7o=1;}
            if (Tab.X7o[6] == Tab.X7o[i] && Tab.X7o[6] != 0 && i!=6) {b7o=1;}
            if (Tab.X7o[7] == Tab.X7o[i] && Tab.X7o[7] != 0 && i!=7) {b7o=1;}
            if (Tab.X7o[8] == Tab.X7o[i] && Tab.X7o[8] != 0 && i!=8) {b7o=1;}
        }
        if(conc ==1) {
            if (b7o == 1)
                System.out.println("bład w 7 wierszu");
        }

        // X8o

        for ( int i = 0; i <9 ; i++){

            if (Tab.X8o[0] == Tab.X8o[i] && Tab.X8o[0] != 0 && i!=0) {b8o=1;}
            if (Tab.X8o[1] == Tab.X8o[i] && Tab.X8o[1] != 0 && i!=1) {b8o=1;}
            if (Tab.X8o[2] == Tab.X8o[i] && Tab.X8o[2] != 0 && i!=2) {b8o=1;}
            if (Tab.X8o[3] == Tab.X8o[i] && Tab.X8o[3] != 0 && i!=3) {b8o=1;}
            if (Tab.X8o[4] == Tab.X8o[i] && Tab.X8o[4] != 0 && i!=4) {b8o=1;}
            if (Tab.X8o[5] == Tab.X8o[i] && Tab.X8o[5] != 0 && i!=5) {b8o=1;}
            if (Tab.X8o[6] == Tab.X8o[i] && Tab.X8o[6] != 0 && i!=6) {b8o=1;}
            if (Tab.X8o[7] == Tab.X8o[i] && Tab.X8o[7] != 0 && i!=7) {b8o=1;}
            if (Tab.X8o[8] == Tab.X8o[i] && Tab.X8o[8] != 0 && i!=8) {b8o=1;}
        }
        if(conc ==1) {
            if (b8o==1)
                System.out.println("bład w 8 wierszu");
        }


        // X9o

        for ( int i = 0; i <9 ; i++){

            if (Tab.X9o[0] == Tab.X9o[i] && Tab.X9o[0] != 0 && i!=0) {b9o=1;}
            if (Tab.X9o[1] == Tab.X9o[i] && Tab.X9o[1] != 0 && i!=1) {b9o=1;}
            if (Tab.X9o[2] == Tab.X9o[i] && Tab.X9o[2] != 0 && i!=2) {b9o=1;}
            if (Tab.X9o[3] == Tab.X9o[i] && Tab.X9o[3] != 0 && i!=3) {b9o=1;}
            if (Tab.X9o[4] == Tab.X9o[i] && Tab.X9o[4] != 0 && i!=4) {b9o=1;}
            if (Tab.X9o[5] == Tab.X9o[i] && Tab.X9o[5] != 0 && i!=5) {b9o=1;}
            if (Tab.X9o[6] == Tab.X9o[i] && Tab.X9o[6] != 0 && i!=6) {b9o=1;}
            if (Tab.X9o[7] == Tab.X9o[i] && Tab.X9o[7] != 0 && i!=7) {b9o=1;}
            if (Tab.X9o[8] == Tab.X9o[i] && Tab.X9o[8] != 0 && i!=8) {b9o=1;}
        }
        if(conc ==1) {
            if (b9o==1)
                System.out.println("bład w 9 wierszu");
        }

        if (b1o + b2o + b3o + b4o + b5o + b6o + b7o + b8o + b9o == 0) {
            bno = 0;


        } else bno=1;
        //end poziome
    }

    //Test lini pionowych, sprawdzenie czy w koażdej z tablic nie piowela sie dana wartość
    public  static void pionowe(int conc) {


        // Xo1

        for (int i = 0; i < 9; i++) {

            if (Tab.Xo1[0] == Tab.Xo1[i] && Tab.Xo1[0] != 0 && i != 0) {
                bo1 = 1;
            }
            if (Tab.Xo1[1] == Tab.Xo1[i] && Tab.Xo1[1] != 0 && i != 1) {
                bo1 = 1;
            }
            if (Tab.Xo1[2] == Tab.Xo1[i] && Tab.Xo1[2] != 0 && i != 2) {
                bo1 = 1;
            }
            if (Tab.Xo1[3] == Tab.Xo1[i] && Tab.Xo1[3] != 0 && i != 3) {
                bo1 = 1;
            }
            if (Tab.Xo1[4] == Tab.Xo1[i] && Tab.Xo1[4] != 0 && i != 4) {
                bo1 = 1;
            }
            if (Tab.Xo1[5] == Tab.Xo1[i] && Tab.Xo1[5] != 0 && i != 5) {
                bo1 = 1;
            }
            if (Tab.Xo1[6] == Tab.Xo1[i] && Tab.Xo1[6] != 0 && i != 6) {
                bo1 = 1;
            }
            if (Tab.Xo1[7] == Tab.Xo1[i] && Tab.Xo1[7] != 0 && i != 7) {
                bo1 = 1;
            }
            if (Tab.Xo1[8] == Tab.Xo1[i] && Tab.Xo1[8] != 0 && i != 8) {
                bo1 = 1;
            }
        }
        if(conc == 1) {

            if (bo1 == 1)
                System.out.println("bład w 1 kolumnie");
        }
        // Xo2

        for (int i = 0; i < 9; i++) {

            if (Tab.Xo2[0] == Tab.Xo2[i] && Tab.Xo2[0] != 0 && i != 0) {
                bo2 = 1;
            }
            if (Tab.Xo2[1] == Tab.Xo2[i] && Tab.Xo2[1] != 0 && i != 1) {
                bo2 = 1;
            }
            if (Tab.Xo2[2] == Tab.Xo2[i] && Tab.Xo2[2] != 0 && i != 2) {
                bo2 = 1;
            }
            if (Tab.Xo2[3] == Tab.Xo2[i] && Tab.Xo2[3] != 0 && i != 3) {
                bo2 = 1;
            }
            if (Tab.Xo2[4] == Tab.Xo2[i] && Tab.Xo2[4] != 0 && i != 4) {
                bo2 = 1;
            }
            if (Tab.Xo2[5] == Tab.Xo2[i] && Tab.Xo2[5] != 0 && i != 5) {
                bo2 = 1;
            }
            if (Tab.Xo2[6] == Tab.Xo2[i] && Tab.Xo2[6] != 0 && i != 6) {
                bo2 = 1;
            }
            if (Tab.Xo2[7] == Tab.Xo2[i] && Tab.Xo2[7] != 0 && i != 7) {
                bo2 = 1;
            }
            if (Tab.Xo2[8] == Tab.Xo2[i] && Tab.Xo2[8] != 0 && i != 8) {
                bo2 = 1;
            }
        }
        if(conc == 1) {
            if (bo2 == 1)
                System.out.println("bład w 2 kolimnie");
        }


        // Xo3

        for (int i = 0; i < 9; i++) {

            if (Tab.Xo3[0] == Tab.Xo3[i] && Tab.Xo3[0] != 0 && i != 0) {
                bo3 = 1;
            }
            if (Tab.Xo3[1] == Tab.Xo3[i] && Tab.Xo3[1] != 0 && i != 1) {
                bo3 = 1;
            }
            if (Tab.Xo3[2] == Tab.Xo3[i] && Tab.Xo3[2] != 0 && i != 2) {
                bo3 = 1;
            }
            if (Tab.Xo3[3] == Tab.Xo3[i] && Tab.Xo3[3] != 0 && i != 3) {
                bo3 = 1;
            }
            if (Tab.Xo3[4] == Tab.Xo3[i] && Tab.Xo3[4] != 0 && i != 4) {
                bo3 = 1;
            }
            if (Tab.Xo3[5] == Tab.Xo3[i] && Tab.Xo3[5] != 0 && i != 5) {
                bo3 = 1;
            }
            if (Tab.Xo3[6] == Tab.Xo3[i] && Tab.Xo3[6] != 0 && i != 6) {
                bo3 = 1;
            }
            if (Tab.Xo3[7] == Tab.Xo3[i] && Tab.Xo3[7] != 0 && i != 7) {
                bo3 = 1;
            }
            if (Tab.Xo3[8] == Tab.Xo3[i] && Tab.Xo3[8] != 0 && i != 8) {
                bo3 = 1;
            }
        }
        if(conc == 1) {
            if (bo3 == 1)
                System.out.println("bład w 3 kolimnie");
        }

        // X4o

        for (int i = 0; i < 9; i++) {

            if (Tab.Xo4[0] == Tab.Xo4[i] && Tab.Xo4[0] != 0 && i != 0) {
                bo4 = 1;
            }
            if (Tab.Xo4[1] == Tab.Xo4[i] && Tab.Xo4[1] != 0 && i != 1) {
                bo4 = 1;
            }
            if (Tab.Xo4[2] == Tab.Xo4[i] && Tab.Xo4[2] != 0 && i != 2) {
                bo4 = 1;
            }
            if (Tab.Xo4[3] == Tab.Xo4[i] && Tab.Xo4[3] != 0 && i != 3) {
                bo4 = 1;
            }
            if (Tab.Xo4[4] == Tab.Xo4[i] && Tab.Xo4[4] != 0 && i != 4) {
                bo4 = 1;
            }
            if (Tab.Xo4[5] == Tab.Xo4[i] && Tab.Xo4[5] != 0 && i != 5) {
                bo4 = 1;
            }
            if (Tab.Xo4[6] == Tab.Xo4[i] && Tab.Xo4[6] != 0 && i != 6) {
                bo4 = 1;
            }
            if (Tab.Xo4[7] == Tab.Xo4[i] && Tab.Xo4[7] != 0 && i != 7) {
                bo4 = 1;
            }
            if (Tab.Xo4[8] == Tab.Xo4[i] && Tab.Xo4[8] != 0 && i != 8) {
                bo4 = 1;
            }
        }
        if(conc == 1) {
            if (bo4 == 1) System.out.println("bład w 4 kolumnie");
        }


        // Xo5

        for (int i = 0; i < 9; i++) {
            if (Tab.Xo5[0] == Tab.Xo5[i] && Tab.Xo5[0] != 0 && i != 0) {
                bo5 = 1;
            }
            if (Tab.Xo5[1] == Tab.Xo5[i] && Tab.Xo5[1] != 0 && i != 1) {
                bo5 = 1;
            }
            if (Tab.Xo5[2] == Tab.Xo5[i] && Tab.Xo5[2] != 0 && i != 2) {
                bo5 = 1;
            }
            if (Tab.Xo5[3] == Tab.Xo5[i] && Tab.Xo5[3] != 0 && i != 3) {
                bo5 = 1;
            }
            if (Tab.Xo5[4] == Tab.Xo5[i] && Tab.Xo5[4] != 0 && i != 4) {
                bo5 = 1;
            }
            if (Tab.Xo5[5] == Tab.Xo5[i] && Tab.Xo5[5] != 0 && i != 5) {
                bo5 = 1;
            }
            if (Tab.Xo5[6] == Tab.Xo5[i] && Tab.Xo5[6] != 0 && i != 6) {
                bo5 = 1;
            }
            if (Tab.Xo5[7] == Tab.Xo5[i] && Tab.Xo5[7] != 0 && i != 7) {
                bo5 = 1;
            }
            if (Tab.Xo5[8] == Tab.Xo5[i] && Tab.Xo5[8] != 0 && i != 8) {
                bo5 = 1;
            }
        }
        if(conc == 1) {
            if (bo5 == 1)
                System.out.println("bład w 5 kolumnie");
        }


        // Xo6

        for (int i = 0; i < 9; i++) {

            if (Tab.Xo6[0] == Tab.Xo6[i] && Tab.Xo6[0] != 0 && i != 0) {
                bo6 = 1;
            }
            if (Tab.Xo6[1] == Tab.Xo6[i] && Tab.Xo6[1] != 0 && i != 1) {
                bo6 = 1;
            }
            if (Tab.Xo6[2] == Tab.Xo6[i] && Tab.Xo6[2] != 0 && i != 2) {
                bo6 = 1;
            }
            if (Tab.Xo6[3] == Tab.Xo6[i] && Tab.Xo6[3] != 0 && i != 3) {
                bo6 = 1;
            }
            if (Tab.Xo6[4] == Tab.Xo6[i] && Tab.Xo6[4] != 0 && i != 4) {
                bo6 = 1;
            }
            if (Tab.Xo6[5] == Tab.Xo6[i] && Tab.Xo6[5] != 0 && i != 5) {
                bo6 = 1;
            }
            if (Tab.Xo6[6] == Tab.Xo6[i] && Tab.Xo6[6] != 0 && i != 6) {
                bo6 = 1;
            }
            if (Tab.Xo6[7] == Tab.Xo6[i] && Tab.Xo6[7] != 0 && i != 7) {
                bo6 = 1;
            }
            if (Tab.Xo6[8] == Tab.Xo6[i] && Tab.Xo6[8] != 0 && i != 8) {
                bo6 = 1;
            }
        }
        if(conc == 1) {
            if (bo6 == 1)
                System.out.println("bład w 6 kolumnie");
        }

        // Xo7

        for (int i = 0; i < 9; i++) {
            if (Tab.Xo7[0] == Tab.Xo7[i] && Tab.Xo7[0] != 0 && i != 0) {
                bo7 = 1;
            }
            if (Tab.Xo7[1] == Tab.Xo7[i] && Tab.Xo7[1] != 0 && i != 1) {
                bo7 = 1;
            }
            if (Tab.Xo7[2] == Tab.Xo7[i] && Tab.Xo7[2] != 0 && i != 2) {
                bo7 = 1;
            }
            if (Tab.Xo7[3] == Tab.Xo7[i] && Tab.Xo7[3] != 0 && i != 3) {
                bo7 = 1;
            }
            if (Tab.Xo7[4] == Tab.Xo7[i] && Tab.Xo7[4] != 0 && i != 4) {
                bo7 = 1;
            }
            if (Tab.Xo7[5] == Tab.Xo7[i] && Tab.Xo7[5] != 0 && i != 5) {
                bo7 = 1;
            }
            if (Tab.Xo7[6] == Tab.Xo7[i] && Tab.Xo7[6] != 0 && i != 6) {
                bo7 = 1;
            }
            if (Tab.Xo7[7] == Tab.Xo7[i] && Tab.Xo7[7] != 0 && i != 7) {
                bo7 = 1;
            }
            if (Tab.Xo7[8] == Tab.Xo7[i] && Tab.Xo7[8] != 0 && i != 8) {
                bo7 = 1;
            }
        }
        if(conc == 1) {
            if (bo7 == 1)
                System.out.println("bład w 7 kolumnie");
        }


        // Xo8

        for (int i = 0; i < 9; i++) {
            if (Tab.Xo8[0] == Tab.Xo8[i] && Tab.Xo8[0] != 0 && i != 0) {
                bo8 = 1;
            }
            if (Tab.Xo8[1] == Tab.Xo8[i] && Tab.Xo8[1] != 0 && i != 1) {
                bo8 = 1;
            }
            if (Tab.Xo8[2] == Tab.Xo8[i] && Tab.Xo8[2] != 0 && i != 2) {
                bo8 = 1;
            }
            if (Tab.Xo8[3] == Tab.Xo8[i] && Tab.Xo8[3] != 0 && i != 3) {
                bo8 = 1;
            }
            if (Tab.Xo8[4] == Tab.Xo8[i] && Tab.Xo8[4] != 0 && i != 4) {
                bo8 = 1;
            }
            if (Tab.Xo8[5] == Tab.Xo8[i] && Tab.Xo8[5] != 0 && i != 5) {
                bo8 = 1;
            }
            if (Tab.Xo8[6] == Tab.Xo8[i] && Tab.Xo8[6] != 0 && i != 6) {
                bo8 = 1;
            }
            if (Tab.Xo8[7] == Tab.Xo8[i] && Tab.Xo8[7] != 0 && i != 7) {
                bo8 = 1;
            }
            if (Tab.Xo8[8] == Tab.Xo8[i] && Tab.Xo8[8] != 0 && i != 8) {
                bo8 = 1;
            }

        }
        if(conc == 1) {
            if (bo8 == 1)
                System.out.println("bład w 8 kolumnie");
        }


        // Xo9

        for (int i = 0; i < 9; i++) {

            if (Tab.Xo9[0] == Tab.Xo9[i] && Tab.Xo9[0] != 0 && i != 0) { bo9 = 1; }
            if (Tab.Xo9[1] == Tab.Xo9[i] && Tab.Xo9[1] != 0 && i != 1) { bo9 = 1; }
            if (Tab.Xo9[2] == Tab.Xo9[i] && Tab.Xo9[2] != 0 && i != 2) { bo9 = 1; }
            if (Tab.Xo9[3] == Tab.Xo9[i] && Tab.Xo9[3] != 0 && i != 3) { bo9 = 1; }
            if (Tab.Xo9[4] == Tab.Xo9[i] && Tab.Xo9[4] != 0 && i != 4) { bo9 = 1; }
            if (Tab.Xo9[5] == Tab.Xo9[i] && Tab.Xo9[5] != 0 && i != 5) { bo9 = 1; }
            if (Tab.Xo9[6] == Tab.Xo9[i] && Tab.Xo9[6] != 0 && i != 6) { bo9 = 1; }
            if (Tab.Xo9[7] == Tab.Xo9[i] && Tab.Xo9[7] != 0 && i != 7) { bo9 = 1; }
            if (Tab.Xo9[8] == Tab.Xo9[i] && Tab.Xo9[8] != 0 && i != 8) { bo9 = 1;}
        }
        if(conc == 1) {
            if (bo9 == 1)
                System.out.println("bład w 9 kolumnie");
        }
        //end poziome


        if (bo1 + bo2 + bo3 + bo4 + bo5 + bo6 + bo7 + bo8 + bo9 == 0) {
            bon = 0;
        } else bon = 1;

    }

    //Test pól, sprawdzenie czy w koażdej z tablic nie piowela sie dana wartość
    public static void pola(int conc){



        // I

        for ( int i = 0; i <9 ; i++){

            if (Tab.I[0] == Tab.I[i] && Tab.I[0] != 0 && i!=0) {bp1=1;}
            if (Tab.I[1] == Tab.I[i] && Tab.I[1] != 0 && i!=1) {bp1=1;}
            if (Tab.I[2] == Tab.I[i] && Tab.I[2] != 0 && i!=2) {bp1=1;}
            if (Tab.I[3] == Tab.I[i] && Tab.I[3] != 0 && i!=3) {bp1=1;}
            if (Tab.I[4] == Tab.I[i] && Tab.I[4] != 0 && i!=4) {bp1=1;}
            if (Tab.I[5] == Tab.I[i] && Tab.I[5] != 0 && i!=5) {bp1=1;}
            if (Tab.I[6] == Tab.I[i] && Tab.I[6] != 0 && i!=6) {bp1=1;}
            if (Tab.I[7] == Tab.I[i] && Tab.I[7] != 0 && i!=7) {bp1=1;}
            if (Tab.I[8] == Tab.I[i] && Tab.I[8] != 0 && i!=8) {bp1=1;}
        }
        if(conc == 1) {
            if (bp1==1)
                System.out.println("bład w 1 polu");
        }

        // II

        for ( int i = 0; i <9 ; i++){

            if (Tab.II[0] == Tab.II[i] && Tab.II[0] != 0 && i!=0) {bp2=1;}
            if (Tab.II[1] == Tab.II[i] && Tab.II[1] != 0 && i!=1) {bp2=1;}
            if (Tab.II[2] == Tab.II[i] && Tab.II[2] != 0 && i!=2) {bp2=1;}
            if (Tab.II[3] == Tab.II[i] && Tab.II[3] != 0 && i!=3) {bp2=1;}
            if (Tab.II[4] == Tab.II[i] && Tab.II[4] != 0 && i!=4) {bp2=1;}
            if (Tab.II[5] == Tab.II[i] && Tab.II[5] != 0 && i!=5) {bp2=1;}
            if (Tab.II[6] == Tab.II[i] && Tab.II[6] != 0 && i!=6) {bp2=1;}
            if (Tab.II[7] == Tab.II[i] && Tab.II[7] != 0 && i!=7) {bp2=1;}
            if (Tab.II[8] == Tab.II[i] && Tab.II[8] != 0 && i!=8) {bp2=1;}
        }
        if(conc == 1) {
            if (bp2==1)
                System.out.println("bład w 2 polu");
        }


        // III

        for ( int i = 0; i <9 ; i++){
            if (Tab.III[0] == Tab.III[i] && Tab.III[0] != 0 && i!=0) {bp3=1;}
            if (Tab.III[1] == Tab.III[i] && Tab.III[1] != 0 && i!=1) {bp3=1;}
            if (Tab.III[2] == Tab.III[i] && Tab.III[2] != 0 && i!=2) {bp3=1;}
            if (Tab.III[3] == Tab.III[i] && Tab.III[3] != 0 && i!=3) {bp3=1;}
            if (Tab.III[4] == Tab.III[i] && Tab.III[4] != 0 && i!=4) {bp3=1;}
            if (Tab.III[5] == Tab.III[i] && Tab.III[5] != 0 && i!=5) {bp3=1;}
            if (Tab.III[6] == Tab.III[i] && Tab.III[6] != 0 && i!=6) {bp3=1;}
            if (Tab.III[7] == Tab.III[i] && Tab.III[7] != 0 && i!=7) {bp3=1;}
            if (Tab.III[8] == Tab.III[i] && Tab.III[8] != 0 && i!=8) {bp3=1;}
        }
        if(conc == 1) {
            if (bp3==1)
                System.out.println("bład w 3 polu");
        }

        // IV

        for ( int i = 0; i <9 ; i++){
            if (Tab.IV[0] == Tab.IV[i] && Tab.IV[0] != 0 && i!=0) {bp4=1;}
            if (Tab.IV[1] == Tab.IV[i] && Tab.IV[1] != 0 && i!=1) {bp4=1;}
            if (Tab.IV[2] == Tab.IV[i] && Tab.IV[2] != 0 && i!=2) {bp4=1;}
            if (Tab.IV[3] == Tab.IV[i] && Tab.IV[3] != 0 && i!=3) {bp4=1;}
            if (Tab.IV[4] == Tab.IV[i] && Tab.IV[4] != 0 && i!=4) {bp4=1;}
            if (Tab.IV[5] == Tab.IV[i] && Tab.IV[5] != 0 && i!=5) {bp4=1;}
            if (Tab.IV[6] == Tab.IV[i] && Tab.IV[6] != 0 && i!=6) {bp4=1;}
            if (Tab.IV[7] == Tab.IV[i] && Tab.IV[7] != 0 && i!=7) {bp4=1;}
            if (Tab.IV[8] == Tab.IV[i] && Tab.IV[8] != 0 && i!=8) {bp4=1;}
        }
        if(conc == 1) {
            if (bp4==1) System.out.println("bład w 4 polu");
        }


        // V

        for ( int i = 0; i <9 ; i++){

            if (Tab.V[0] == Tab.V[i] && Tab.V[0] != 0 && i!=0) {bp5=1;}
            if (Tab.V[1] == Tab.V[i] && Tab.V[1] != 0 && i!=1) {bp5=1;}
            if (Tab.V[2] == Tab.V[i] && Tab.V[2] != 0 && i!=2) {bp5=1;}
            if (Tab.V[3] == Tab.V[i] && Tab.V[3] != 0 && i!=3) {bp5=1;}
            if (Tab.V[4] == Tab.V[i] && Tab.V[4] != 0 && i!=4) {bp5=1;}
            if (Tab.V[5] == Tab.V[i] && Tab.V[5] != 0 && i!=5) {bp5=1;}
            if (Tab.V[6] == Tab.V[i] && Tab.V[6] != 0 && i!=6) {bp5=1;}
            if (Tab.V[7] == Tab.V[i] && Tab.V[7] != 0 && i!=7) {bp5=1;}
            if (Tab.V[8] == Tab.V[i] && Tab.V[8] != 0 && i!=8) {bp5=1;}
        }
        if(conc == 1) {
            if (bp5==1)
                System.out.println("bład w 5 polu");
        }


        // VI

        for ( int i = 0; i <9 ; i++){

            if (Tab.VI[0] == Tab.VI[i] && Tab.VI[0] != 0 && i!=0) {bp6=1;}
            if (Tab.VI[1] == Tab.VI[i] && Tab.VI[1] != 0 && i!=1) {bp6=1;}
            if (Tab.VI[2] == Tab.VI[i] && Tab.VI[2] != 0 && i!=2) {bp6=1;}
            if (Tab.VI[3] == Tab.VI[i] && Tab.VI[3] != 0 && i!=3) {bp6=1;}
            if (Tab.VI[4] == Tab.VI[i] && Tab.VI[4] != 0 && i!=4) {bp6=1;}
            if (Tab.VI[5] == Tab.VI[i] && Tab.VI[5] != 0 && i!=5) {bp6=1;}
            if (Tab.VI[6] == Tab.VI[i] && Tab.VI[6] != 0 && i!=6) {bp6=1;}
            if (Tab.VI[7] == Tab.VI[i] && Tab.VI[7] != 0 && i!=7) {bp6=1;}
            if (Tab.VI[8] == Tab.VI[i] && Tab.VI[8] != 0 && i!=8) {bp6=1;}
        }
        if(conc == 1) {
            if (bp6==1)
                System.out.println("bład w 6 polu");
        }

        // VII

        for ( int i = 0; i <9 ; i++){

            if (Tab.VII[0] == Tab.VII[i] && Tab.VII[0] != 0 && i!=0) {bp7=1;}
            if (Tab.VII[1] == Tab.VII[i] && Tab.VII[1] != 0 && i!=1) {bp7=1;}
            if (Tab.VII[2] == Tab.VII[i] && Tab.VII[2] != 0 && i!=2) {bp7=1;}
            if (Tab.VII[3] == Tab.VII[i] && Tab.VII[3] != 0 && i!=3) {bp7=1;}
            if (Tab.VII[4] == Tab.VII[i] && Tab.VII[4] != 0 && i!=4) {bp7=1;}
            if (Tab.VII[5] == Tab.VII[i] && Tab.VII[5] != 0 && i!=5) {bp7=1;}
            if (Tab.VII[6] == Tab.VII[i] && Tab.VII[6] != 0 && i!=6) {bp7=1;}
            if (Tab.VII[7] == Tab.VII[i] && Tab.VII[7] != 0 && i!=7) {bp7=1;}
            if (Tab.VII[8] == Tab.VII[i] && Tab.VII[8] != 0 && i!=8) {bp7=1;}
        }
        if(conc == 1) {
            if (bp7==1)
                System.out.println("bład w 7 polu");
        }


        // VIII

        for ( int i = 0; i <9 ; i++){

            if (Tab.VIII[0] == Tab.VIII[i] && Tab.VIII[0] != 0 && i!=0) {bp8=1;}
            if (Tab.VIII[1] == Tab.VIII[i] && Tab.VIII[1] != 0 && i!=1) {bp8=1;}
            if (Tab.VIII[2] == Tab.VIII[i] && Tab.VIII[2] != 0 && i!=2) {bp8=1;}
            if (Tab.VIII[3] == Tab.VIII[i] && Tab.VIII[3] != 0 && i!=3) {bp8=1;}
            if (Tab.VIII[4] == Tab.VIII[i] && Tab.VIII[4] != 0 && i!=4) {bp8=1;}
            if (Tab.VIII[5] == Tab.VIII[i] && Tab.VIII[5] != 0 && i!=5) {bp8=1;}
            if (Tab.VIII[6] == Tab.VIII[i] && Tab.VIII[6] != 0 && i!=6) {bp8=1;}
            if (Tab.VIII[7] == Tab.VIII[i] && Tab.VIII[7] != 0 && i!=7) {bp8=1;}
            if (Tab.VIII[8] == Tab.VIII[i] && Tab.VIII[8] != 0 && i!=8) {bp8=1;}
        }
        if(conc == 1) {
            if (bp8==1)
                System.out.println("bład w 8 polu");
        }



        // IX

        for ( int i = 0; i <9 ; i++){

            if (Tab.IX[0] == Tab.IX[i] && Tab.IX[0] != 0 && i!=0) {bp9=1;}
            if (Tab.IX[1] == Tab.IX[i] && Tab.IX[1] != 0 && i!=1) {bp9=1;}
            if (Tab.IX[2] == Tab.IX[i] && Tab.IX[2] != 0 && i!=2) {bp9=1;}
            if (Tab.IX[3] == Tab.IX[i] && Tab.IX[3] != 0 && i!=3) {bp9=1;}
            if (Tab.IX[4] == Tab.IX[i] && Tab.IX[4] != 0 && i!=4) {bp9=1;}
            if (Tab.IX[5] == Tab.IX[i] && Tab.IX[5] != 0 && i!=5) {bp9=1;}
            if (Tab.IX[6] == Tab.IX[i] && Tab.IX[6] != 0 && i!=6) {bp9=1;}
            if (Tab.IX[7] == Tab.IX[i] && Tab.IX[7] != 0 && i!=7) {bp9=1;}
            if (Tab.IX[8] == Tab.IX[i] && Tab.IX[8] != 0 && i!=8) {bp9=1;}
        }
        if(conc == 1) {
            if (bp9==1)
                System.out.println("bład w 9 polu");
        }

        if (bp1 + bp2 + bp3 + bp4 + bp5 + bp6 + bp7 + bp8 + bp9 == 0) {
            bpn = 0;

        }else bpn = 1;

    }

    //Sprawdza czy jest jakiś bład.
    public  static void finalTest(int conc){ if (bon +bno+bpn==0){

        b=0;
        if(conc == 1) { System.out.println("Tablica nie zawiera błędów");};

    } else b=1;  }


    public static void variables_B_To_0() {
        b1o = 0;
        b2o = 0;
        b3o = 0;
        b4o = 0;
        b5o = 0;
        b6o = 0;
        b7o = 0;
        b8o = 0;
        b9o = 0;

        bo1 = 0;
        bo2 = 0;
        bo3 = 0;
        bo4 = 0;
        bo5 = 0;
        bo6 = 0;
        bo7 = 0;
        bo8 = 0;
        bo9 = 0;

        bp1 = 0;
        bp2 = 0;
        bp3 = 0;
        bp4 = 0;
        bp5 = 0;
        bp6 = 0;
        bp7 = 0;
        bp8 = 0;
        bp9 = 0;

        bon = 0;
        bno = 0;
        bpn = 0;
        b = 0;

        //memory = 0;


    }

    public static void dzialaj(int conc){
                /*
                bież pierwsze 0 z tablicy,
                 spróbuj 1 2, 3, 4, 5, 6, 7, 8, 9,
                  jeśli tylko 1 pasuje (przy pozostałych wysskakują błędy) wstaw ją;
                  Jeśli pasuje więcej niż 1 pomiń== i weź następne 0 z tablicy

                  kontynuuj do puki nie będzie 0.
                 */
        System.out.println("______________________________________");
        System.out.println("______________________________________");

        for (int z= 0 ; z<1 ;z++ ) {


            for (int i = 0; i < 9; i++) {

                int posible = 0;

                if (Tab.X1o[i] == 0) {


                    for (int w = 1; w < 10; w++) {
                        Testy.variables_B_To_0();
                        bon = 0;
                        bno = 0;
                        bpn = 0;
                        b = 0;

                        //  wszystkieTesty(conc
                        // );

                        Tab.X1o[i] = w;

                        Tab.DataToTab_Xno(1, i + 1, w);
                        Tab.DataToTab_Xon(i + 1, 1, w);
                        Tab.DataToTab_Xp(1, i + 1, w);


                        if(conc == 1) {Tab.PrintTab_from_Xno();}

                        wszystkieTesty(conc);

                        Tab.DataToTab_Xno(1, i + 1, 0);
                        Tab.DataToTab_Xon(i + 1, 1, 0);
                        Tab.DataToTab_Xp(1, i + 1, 0);
                        if (b == 0) {
                            memory = w;
                            ++posible;
                        }
                        //System.out.println("Posible : " + posible);


                        Testy.variables_B_To_0();
                    }


                    if (posible == 1) {
                        for (int w = 1; w < 10; w++) {
                            Testy.variables_B_To_0();
                            bon = 0;
                            bno = 0;
                            bpn = 0;
                            b = 0;

                            //  wszystkieTesty(conc
                            // );

                            Tab.X1o[i] = w;

                            Tab.DataToTab_Xno(1, i + 1, w);
                            Tab.DataToTab_Xon(i + 1, 1, w);
                            Tab.DataToTab_Xp(1, i + 1, w);


                           // if(conc == 1) {Tab.PrintTab_from_Xno();}
                            wszystkieTesty(conc);


                            if (b == 0) {
                                break;
                            }
                            // System.out.println("Posible : "+posible);


                            Testy.variables_B_To_0();
                        }
                    }

                }


            }//1
            for (int i = 0; i < 9; i++) {

                int posible = 0;

                if (Tab.X2o[i] == 0) {


                    for (int w = 1; w < 10; w++) {
                        Testy.variables_B_To_0();
                        bon = 0;
                        bno = 0;
                        bpn = 0;
                        b = 0;

                        //  wszystkieTesty(conc
                        // );

                        Tab.X2o[i] = w;

                        Tab.DataToTab_Xno(2, i + 1, w);
                        Tab.DataToTab_Xon(i + 1, 2, w);
                        Tab.DataToTab_Xp(2, i + 1, w);


                       // if(conc == 1) {Tab.PrintTab_from_Xno();}
                        wszystkieTesty(conc);

                        Tab.DataToTab_Xno(2, i + 1, 0);
                        Tab.DataToTab_Xon(i + 1, 2, 0);
                        Tab.DataToTab_Xp(2, i + 1, 0);
                        if (b == 0) {
                            memory = w;
                            ++posible;
                        }
                        //System.out.println("Posible : " + posible);


                        Testy.variables_B_To_0();
                    }


                    if (posible == 1) {
                        for (int w = 1; w < 10; w++) {
                            Testy.variables_B_To_0();
                            bon = 0;
                            bno = 0;
                            bpn = 0;
                            b = 0;

                            //  wszystkieTesty(conc
                            // );

                            Tab.X2o[i] = w;

                            Tab.DataToTab_Xno(2, i + 1, w);
                            Tab.DataToTab_Xon(i + 1, 2, w);
                            Tab.DataToTab_Xp(1, i + 2, w);


                         //   if(conc == 1) {Tab.PrintTab_from_Xno();}
                            wszystkieTesty(conc);

                            if (b == 0) {
                                break;
                            }
                            // System.out.println("Posible : "+posible);


                            Testy.variables_B_To_0();
                        }
                    }

                }


            }//2
            for (int i = 0; i < 9; i++) {

                int posible = 0;

                if (Tab.X3o[i] == 0) {


                    for (int w = 1; w < 10; w++) {
                        Testy.variables_B_To_0();
                        bon = 0;
                        bno = 0;
                        bpn = 0;
                        b = 0;

                        //  wszystkieTesty(conc
                        // );

                        Tab.X3o[i] = w;

                        Tab.DataToTab_Xno(3, i + 1, w);
                        Tab.DataToTab_Xon(i + 1, 3, w);
                        Tab.DataToTab_Xp(3, i + 1, w);


                      //  if(conc == 1) {Tab.PrintTab_from_Xno();}
                        wszystkieTesty(conc);

                        Tab.DataToTab_Xno(3, i + 1, 0);
                        Tab.DataToTab_Xon(i + 1, 3, 0);
                        Tab.DataToTab_Xp(3, i + 1, 0);
                        if (b == 0) {
                            memory = w;
                            ++posible;
                        }
                        //System.out.println("Posible : " + posible);


                        Testy.variables_B_To_0();
                    }


                    if (posible == 1) {
                        for (int w = 1; w < 10; w++) {
                            Testy.variables_B_To_0();
                            bon = 0;
                            bno = 0;
                            bpn = 0;
                            b = 0;

                            //  wszystkieTesty(conc
                            // );

                            Tab.X3o[i] = w;

                            Tab.DataToTab_Xno(3, i + 1, w);
                            Tab.DataToTab_Xon(i + 1, 3, w);
                            Tab.DataToTab_Xp(3, i + 1, w);


                          //  if(conc == 1) {Tab.PrintTab_from_Xno();}
                            wszystkieTesty(conc);

//
                            if (b == 0) {
                                break;
                            }
                            // System.out.println("Posible : "+posible);


                            Testy.variables_B_To_0();
                        }
                    }

                }


            }//3
            for (int i = 0; i < 9; i++) {

                int posible = 0;

                if (Tab.X4o[i] == 0) {


                    for (int w = 1; w < 10; w++) {
                        Testy.variables_B_To_0();
                        bon = 0;
                        bno = 0;
                        bpn = 0;
                        b = 0;

                        //  wszystkieTesty(conc
                        // );

                        Tab.X4o[i] = w;

                        Tab.DataToTab_Xno(4, i + 1, w);
                        Tab.DataToTab_Xon(i + 1, 4, w);
                        Tab.DataToTab_Xp(4, i + 1, w);


                      //  if(conc == 1) {Tab.PrintTab_from_Xno();}
                        wszystkieTesty(conc);

                        Tab.DataToTab_Xno(4, i + 1, 0);
                        Tab.DataToTab_Xon(i + 1, 4, 0);
                        Tab.DataToTab_Xp(4, i + 1, 0);
                        if (b == 0) {
                            memory = w;
                            ++posible;
                        }
                        //System.out.println("Posible : " + posible);


                        Testy.variables_B_To_0();
                    }


                    if (posible == 1) {
                        for (int w = 1; w < 10; w++) {
                            Testy.variables_B_To_0();
                            bon = 0;
                            bno = 0;
                            bpn = 0;
                            b = 0;

                            //  wszystkieTesty(conc
                            // );

                            Tab.X4o[i] = w;

                            Tab.DataToTab_Xno(4, i + 1, w);
                            Tab.DataToTab_Xon(i + 1, 4, w);
                            Tab.DataToTab_Xp(4, i + 1, w);


                         //   if(conc == 1) {Tab.PrintTab_from_Xno();}
                            wszystkieTesty(conc);

                            if (b == 0) {
                                break;
                            }
                            // System.out.println("Posible : "+posible);


                            Testy.variables_B_To_0();
                        }
                    }

                }


            }//4
            for (int i = 0; i < 9; i++) {

                int posible = 0;

                if (Tab.X5o[i] == 0) {


                    for (int w = 1; w < 10; w++) {
                        Testy.variables_B_To_0();
                        bon = 0;
                        bno = 0;
                        bpn = 0;
                        b = 0;

                        //  wszystkieTesty(conc
                        // );

                        Tab.X5o[i] = w;

                        Tab.DataToTab_Xno(5, i + 1, w);
                        Tab.DataToTab_Xon(i + 1, 5, w);
                        Tab.DataToTab_Xp(5, i + 1, w);


                      //  if(conc == 1) {Tab.PrintTab_from_Xno();}
                        wszystkieTesty(conc);

                        Tab.DataToTab_Xno(5, i + 1, 0);
                        Tab.DataToTab_Xon(i + 1, 5, 0);
                        Tab.DataToTab_Xp(5, i + 1, 0);
                        if (b == 0) {
                            memory = w;
                            ++posible;
                        }
                        //System.out.println("Posible : " + posible);


                        Testy.variables_B_To_0();
                    }


                    if (posible == 1) {
                        for (int w = 1; w < 10; w++) {
                            Testy.variables_B_To_0();
                            bon = 0;
                            bno = 0;
                            bpn = 0;
                            b = 0;

                            //  wszystkieTesty(conc
                            // );

                            Tab.X5o[i] = w;

                            Tab.DataToTab_Xno(5, i + 1, w);
                            Tab.DataToTab_Xon(i + 1, 5, w);
                            Tab.DataToTab_Xp(5, i + 1, w);


                      //      if(conc == 1) {Tab.PrintTab_from_Xno();}
                            wszystkieTesty(conc);

//                    Tab.DataToTab_Xno(1, i+1, 0);
//                    Tab.DataToTab_Xon(i+1,1, 0);
//                    Tab.DataToTab_Xp(1,i+1, 0);
                            if (b == 0) {
                                break;
                            }
                            // System.out.println("Posible : "+posible);


                            Testy.variables_B_To_0();
                        }
                    }

                }


            }//5
            for (int i = 0; i < 9; i++) {

                int posible = 0;

                if (Tab.X6o[i] == 0) {


                    for (int w = 1; w < 10; w++) {
                        Testy.variables_B_To_0();
                        bon = 0;
                        bno = 0;
                        bpn = 0;
                        b = 0;

                        //  wszystkieTesty(conc
                        // );

                        Tab.X6o[i] = w;

                        Tab.DataToTab_Xno(6, i + 1, w);
                        Tab.DataToTab_Xon(i + 1, 6, w);
                        Tab.DataToTab_Xp(6, i + 1, w);


                      //  if(conc == 1) {Tab.PrintTab_from_Xno();}
                        wszystkieTesty(conc);

                        Tab.DataToTab_Xno(6, i + 1, 0);
                        Tab.DataToTab_Xon(i + 1, 6, 0);
                        Tab.DataToTab_Xp(6, i + 1, 0);
                        if (b == 0) {
                            memory = w;
                            ++posible;
                        }
                        //System.out.println("Posible : " + posible);


                        Testy.variables_B_To_0();
                    }


                    if (posible == 1) {
                        for (int w = 1; w < 10; w++) {
                            Testy.variables_B_To_0();
                            bon = 0;
                            bno = 0;
                            bpn = 0;
                            b = 0;

                            //  wszystkieTesty(conc
                            // );

                            Tab.X6o[i] = w;

                            Tab.DataToTab_Xno(6, i + 1, w);
                            Tab.DataToTab_Xon(i + 1, 6, w);
                            Tab.DataToTab_Xp(6, i + 1, w);


                         //   if(conc == 1) {Tab.PrintTab_from_Xno();}
                            wszystkieTesty(conc);

//                    Tab.DataToTab_Xno(1, i+1, 0);
//                    Tab.DataToTab_Xon(i+1,1, 0);
//                    Tab.DataToTab_Xp(1,i+1, 0);
                            if (b == 0) {
                                break;
                            }
                            // System.out.println("Posible : "+posible);


                            Testy.variables_B_To_0();
                        }
                    }

                }


            }//6
            for (int i = 0; i < 9; i++) {

                int posible = 0;

                if (Tab.X7o[i] == 0) {


                    for (int w = 1; w < 10; w++) {
                        Testy.variables_B_To_0();
                        bon = 0;
                        bno = 0;
                        bpn = 0;
                        b = 0;

                        //  wszystkieTesty(conc
                        // );

                        Tab.X7o[i] = w;

                        Tab.DataToTab_Xno(7, i + 1, w);
                        Tab.DataToTab_Xon(i + 1, 7, w);
                        Tab.DataToTab_Xp(7, i + 1, w);


                       // if(conc == 1) {Tab.PrintTab_from_Xno();}
                        wszystkieTesty(conc);

                        Tab.DataToTab_Xno(7, i + 1, 0);
                        Tab.DataToTab_Xon(i + 1, 7, 0);
                        Tab.DataToTab_Xp(7, i + 1, 0);
                        if (b == 0) {
                            memory = w;
                            ++posible;
                        }
                        //System.out.println("Posible : " + posible);


                        Testy.variables_B_To_0();
                    }


                    if (posible == 1) {
                        for (int w = 1; w < 10; w++) {
                            Testy.variables_B_To_0();
                            bon = 0;
                            bno = 0;
                            bpn = 0;
                            b = 0;

                            //  wszystkieTesty(conc
                            // );

                            Tab.X7o[i] = w;

                            Tab.DataToTab_Xno(7, i + 1, w);
                            Tab.DataToTab_Xon(i + 1, 7, w);
                            Tab.DataToTab_Xp(7, i + 1, w);


                         //   if(conc == 1) {Tab.PrintTab_from_Xno();}
                            wszystkieTesty(conc);

//                    Tab.DataToTab_Xno(1, i+1, 0);
//                    Tab.DataToTab_Xon(i+1,1, 0);
//                    Tab.DataToTab_Xp(1,i+1, 0);
                            if (b == 0) {
                                break;
                            }
                            // System.out.println("Posible : "+posible);


                            Testy.variables_B_To_0();
                        }
                    }

                }


            }//7
            for (int i = 0; i < 9; i++) {

                int posible = 0;

                if (Tab.X8o[i] == 0) {


                    for (int w = 1; w < 10; w++) {
                        Testy.variables_B_To_0();
                        bon = 0;
                        bno = 0;
                        bpn = 0;
                        b = 0;

                        //  wszystkieTesty(conc
                        // );

                        Tab.X8o[i] = w;

                        Tab.DataToTab_Xno(8, i + 1, w);
                        Tab.DataToTab_Xon(i + 1, 8, w);
                        Tab.DataToTab_Xp(8, i + 1, w);


//                        if(conc == 1) {Tab.PrintTab_from_Xno();}
                        wszystkieTesty(conc);

                        Tab.DataToTab_Xno(8, i + 1, 0);
                        Tab.DataToTab_Xon(i + 1, 8, 0);
                        Tab.DataToTab_Xp(8, i + 1, 0);
                        if (b == 0) {
                            memory = w;
                            ++posible;
                        }
                        //System.out.println("Posible : " + posible);


                        Testy.variables_B_To_0();
                    }


                    if (posible == 1) {
                        for (int w = 1; w < 10; w++) {
                            Testy.variables_B_To_0();
                            bon = 0;
                            bno = 0;
                            bpn = 0;
                            b = 0;

                            //  wszystkieTesty(conc
                            // );

                            Tab.X8o[i] = w;

                            Tab.DataToTab_Xno(8, i + 1, w);
                            Tab.DataToTab_Xon(i + 1, 8, w);
                            Tab.DataToTab_Xp(8, i + 1, w);


//                            if(conc == 1) {Tab.PrintTab_from_Xno();}
                            wszystkieTesty(conc);

//                    Tab.DataToTab_Xno(1, i+1, 0);
//                    Tab.DataToTab_Xon(i+1,1, 0);
//                    Tab.DataToTab_Xp(1,i+1, 0);
                            if (b == 0) {
                                break;
                            }
                            // System.out.println("Posible : "+posible);


                            Testy.variables_B_To_0();
                        }
                    }

                }


            }//8
            for (int i = 0; i < 9; i++) {

                int posible = 0;

                if (Tab.X9o[i] == 0) {


                    for (int w = 1; w < 10; w++) {
                        Testy.variables_B_To_0();
                        bon = 0;
                        bno = 0;
                        bpn = 0;
                        b = 0;

                        //  wszystkieTesty(conc
                        // );

                        Tab.X9o[i] = w;

                        Tab.DataToTab_Xno(9, i + 1, w);
                        Tab.DataToTab_Xon(i + 1, 9, w);
                        Tab.DataToTab_Xp(9, i + 1, w);


//                        if(conc == 1) {Tab.PrintTab_from_Xno();}
                        wszystkieTesty(conc);

                        Tab.DataToTab_Xno(9, i + 1, 0);
                        Tab.DataToTab_Xon(i + 1, 9, 0);
                        Tab.DataToTab_Xp(9, i + 1, 0);
                        if (b == 0) {
                            memory = w;
                            ++posible;
                        }
                        //System.out.println("Posible : " + posible);


                        Testy.variables_B_To_0();
                    }


                    if (posible == 1) {
                        for (int w = 1; w < 10; w++) {
                            Testy.variables_B_To_0();
                            bon = 0;
                            bno = 0;
                            bpn = 0;
                            b = 0;

                            //  wszystkieTesty(conc
                            // );

                            Tab.X9o[i] = w;

                            Tab.DataToTab_Xno(9, i + 1, w);
                            Tab.DataToTab_Xon(i + 1, 9, w);
                            Tab.DataToTab_Xp(9, i + 1, w);


//                            if(conc == 1) {Tab.PrintTab_from_Xno();}
                            wszystkieTesty(conc);

//                    Tab.DataToTab_Xno(1, i+1, 0);
//                    Tab.DataToTab_Xon(i+1,1, 0);
//                    Tab.DataToTab_Xp(1,i+1, 0);
                            if (b == 0) {
                                break;
                            }
                            // System.out.println("Posible : "+posible);


                            Testy.variables_B_To_0();
                        }
                    }

                }


            }//9



       // if (b==0){break;}
        }
        //if(conc == 1) {Tab.PrintTab_from_Xno();}

    }
}