import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
////////////////////////////////////////////////////////////////////////


        System.out.println("Witam w programie do automatycznego rozwiązywania sudoku!");

      Menu:  for (;;) {
            System.out.println("1: Wprowadź włany zestaw cyfr");
            System.out.println("2: Wybiesz wgraną wablice");
            System.out.println("3: Zakończ program");
            Scanner menu = new Scanner(System.in);

            int m = menu.nextInt();

            switch (m) {
                case 1: instrukcja(); Tab.CustomXYW(); Testy.uzupelniaj();break;
                case 2:
                    System.out.println("Tablica 1:");
                    Tab.PreLoadedXYW(1);
                    System.out.println("Tablica");
                    Tab.Print_sudoku();
                    Tab.wyczysc_sudoku();

                    System.out.println("Tablica 2:");
                    Tab.PreLoadedXYW(2);
                    System.out.println("Tablica");
                    Tab.Print_sudoku();
                    Tab.wyczysc_sudoku();

                    System.out.println("Tablica 3:");
                    Tab.PreLoadedXYW(3);
                    Tab.Print_sudoku();
                    Tab.wyczysc_sudoku();

                    System.out.println("Wybież tablice 1, 2 lub 3:");

                    Scanner wyb_tab = new Scanner(System.in);
                    System.out.println("___________________________________________________________________________");
                    int w = wyb_tab.nextInt();
                        switch (w){

                            case 1:
                                Tab.PreLoadedXYW(1);
                                System.out.println("Tablica");
                                Tab.wyczysc_sudoku();
                                Testy.uzupelniaj();
                                System.out.println("Rozwiązanie:");

                                Tab.Print_sudoku();
                                continue Menu;
                            case 2:
                                Tab.PreLoadedXYW(2);
                                System.out.println("Tablica");
                                Tab.Print_sudoku();
                                System.out.println("Rozwiązanie:");
                                Testy.uzupelniaj();
                                Tab.Print_sudoku();
                                continue Menu;
                            case 3:
                                Tab.PreLoadedXYW(3);
                                System.out.println("Tablica");
                                Tab.Print_sudoku();
                                Testy.uzupelniaj();
                                System.out.println("Rozwiązanie:");
                                Tab.Print_sudoku();
                                continue Menu;

                        }
                        break;

                    case 3: break Menu;
            }

            Tab.Print_sudoku();

        }
//////////////////////////////////////////////////////////////
    }


    private static void instrukcja() throws InterruptedException {

        System.out.println("Program domyślnie ma ustawione wszystkie wartości na 0");
       new Tab();
        TimeUnit.SECONDS.sleep(2);


        System.out.println("Wprowadź wartość swoich liczb poprzez podanie ich współżędnych.");
        //TimeUnit.SECONDS.sleep(2);
        System.out.println("Pierwsza cyfra reprezentuje numer wiersza, druga cyfra reprezentuje numer kolumny, trzecia cyfra wartość pola");
        //TimeUnit.SECONDS.sleep(2);
        System.out.println("Przykładowo 123:");
       // TimeUnit.SECONDS.sleep(2);
        Tab.sudoku[0][1] = 3;
        Tab.Print_sudoku();
        TimeUnit.SECONDS.sleep(2);
        Tab.wyczysc_sudoku();

    }
}