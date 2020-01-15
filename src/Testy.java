class Testy<publis> {


    private static boolean bledy = false;


    private static void sprawdz_bledy() {

//        int x[] = {0,0,0,1,1,1,2,2,2};
//        int z[] = {0,1,2,0,1,2,0,1,2};
//        int zz[] = {0,1,2,0,1,2,0,1,2};
//
//        for (int p = 0; p<9;p+=2) {

            for (int s = 0; s < 9; s++) {                //s  - stała
                for (int z1 = 0; z1 < 9; z1++) {        //z1 - zmienna1
                    for (int z2 = 0; z2 < 9; z2++) {    //z2 - zmienna2

//                        if(p==0) {
                            //------------------Sprawdzanie w poziomie-------------------//
                            if (Tab.sudoku[s][z2] == Tab.sudoku[s][z1] && Tab.sudoku[s][z2] != 0 && z1 != z2) {
                              //  System.out.println("W wierszu " + (s + 1) + " pozycje " + (z1 + 1) + " i " + (z2 + 1) + " są identyczne.");
                                bledy = true;
                            }
                            //------------------Sprawdzanie w pionie-------------------//
                            if (Tab.sudoku[z2][s] == Tab.sudoku[z1][s] && Tab.sudoku[z2][s] != 0 && z1 != z2) {
                               // System.out.println("W kolumnie " + (s + 1) + " pozycje " + (z1 + 1) + " i " + (z2 + 1) + " są identyczne.");
                                bledy = true;
                            }
//                        }


//                            //------------------Sprawdzanie w polach-------------------//
//                            if (Tab.sudoku[x[s] + p][zz[z2] + p] == Tab.sudoku[x[s] + p][z[z1] + p] && Tab.sudoku[x[s] + p][zz[z2] + p] != 0 && z != zz) {
//                                System.out.println("W polu " + (s + 1) + " pozycje " + (z1 + 1) + " i " + (z2 + 1) + " są identyczne.");
//                                błędy = true;
//                            }

                    }
                }
            }
        }
//    }
    static void sprawdz_bledyPola() {

        int[] x = {0,0,0,1,1,1,2,2,2};
        int[] z = {0,1,2,0,1,2,0,1,2};
        int[] zz = {0,1,2,0,1,2,0,1,2};

        for (int p = 0; p<9;p+=3) {


            for (int s = 0; s < 9; s++) {                //s  - stała
                for (int z1 = 0; z1 < 9; z1++) {        //z1 - zmienna1
                    for (int z2 = 0; z2 < 9; z2++) {    //z2 - zmienna2

                            //------------------Sprawdzanie w polach-------------------//
                        if (Tab.sudoku[x[s]+p][zz[z2]+p] == Tab.sudoku[x[s]+p][z[z1]+p] && Tab.sudoku[x[s]+p][zz[z2]+p] != 0 && z[z1]+p != zz[z2]+p) {

                            System.out.println("W polu " + ((x[s]+p) + 1) + " pozycje " + ((z[z1]+p) + 1) + " i " + ((zz[z2]+p) + 1) + " są identyczne.");
                            bledy = true;
                        }

                    }
                }
            }
        }
    }



    private static void wyzeruj_wartosc_testow() {
                bledy = false;
    }

    static void uzupelniaj() {
                /*
                1.Weź pierwsze 0 z tablicy,
                2.Spróbuj wstawić: 1 2, 3, 4, 5, 6, 7, 8, 9.
                3a.Jeśli tylko przy jednej zmiennej nie ma błędu, wstaw ją.
                3b.Jeśli pasuje więcej niż 1 weź następne 0 z tablicy.
                4a.Kontynuuj do puki nie będzie 0.
                4b.Jeśli po całym obrocie nic się nie zmieniło. --> "Nie potrafię tego rozwiązać"
                 */
        System.out.println("______________________________________");
        System.out.println("_______Rozpoczynam_Uzupełnianie_______");
        System.out.println("______________________________________");

        for ( ; ; ) {
            int[][] sudoku_kopia = Tab.sudoku;


            for (int x = 0; x < 9; x++) {
                for (int y = 0; y < 9; y++) {
                    if (Tab.sudoku[x][y] == 0) {

                        int mozliwosci = 0;
                        for (int w = 1; w < 10; w++) {
                            Tab.sudoku[x][y] = w;
                            wyzeruj_wartosc_testow();
                            sprawdz_bledy(); // - Sprawdz czy pasuje
                            if (!bledy) mozliwosci++;
                            Tab.sudoku[x][y] = 0;
                        }

                        if (mozliwosci == 1) {
                            for (int w = 1; w < 10; w++) {
                                Tab.sudoku[x][y] = w;
                                wyzeruj_wartosc_testow();
                                sprawdz_bledy(); // - Sprawdz czy pasuje
                                if (!bledy) break;
                            }
                        }
                    }
                }
            }
            if(sudoku_kopia==Tab.sudoku){ System.out.println("Nie potrafię tego rozwiązać"); break;}
        }
    }

}