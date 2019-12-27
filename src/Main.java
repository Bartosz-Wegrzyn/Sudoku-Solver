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
                case 1: Tab.CustomXYW(); Testy.dzialaj(1); break;


                case 2:
                    System.out.println("Tablica 1:");
                    Tab.PreLoadedXYW(1);
                    System.out.println("Tablica");
                    Tab.PrintTab_from_Xno();
                    Tab.ClearTab();

                    System.out.println("Tablica 2:");
                    Tab.PreLoadedXYW(2);
                    System.out.println("Tablica");
                    Tab.PrintTab_from_Xno();
                    Tab.ClearTab();

                    System.out.println("Tablica 3:");
                    Tab.PreLoadedXYW(3);
                    Tab.PrintTab_from_Xno();
                    Tab.ClearTab();

                    System.out.println("Wybież tablice 1, 2 lub 3:");

                    Scanner wyb_tab = new Scanner(System.in);
                    System.out.println("___________________________________________________________________________");
                    int w = wyb_tab.nextInt();
                        switch (w){

                            case 1:
                                Tab.PreLoadedXYW(1);
                                System.out.println("Tablica");
                                Tab.PrintTab_from_Xno();
                                Testy.dzialaj(0);
                                System.out.println("Rozwiązanie:");

                                Tab.PrintTab_from_Xno();
                                continue Menu;
                            case 2:
                                Tab.PreLoadedXYW(2);
                                System.out.println("Tablica");
                                Tab.PrintTab_from_Xno();
                                System.out.println("Rozwiązanie:");
                                Testy.dzialaj(1);
                                Tab.PrintTab_from_Xno();
                                continue Menu;
                            case 3:
                                Tab.PreLoadedXYW(3);
                                System.out.println("Tablica");
                                Tab.PrintTab_from_Xno();
                                Testy.dzialaj(1);
                                System.out.println("Rozwiązanie:");
                                Tab.PrintTab_from_Xno();
                                continue Menu;

                        }
                        break;

                    case 3: break Menu;
            }

            Tab.PrintTab_from_Xno();

        }
////////////////////////////////////////////////////////////////
    }


    public static void Start_Custom() throws InterruptedException {

        System.out.println("Program domyślnie ma ustawione wszystkie wartości na 0");
        Tab.PrintTab_from_Xno();
        TimeUnit.SECONDS.sleep(2);


        System.out.println("Wprowadź wartość swoich liczb poprzez podanie ich współżędnych.");
        //TimeUnit.SECONDS.sleep(2);
        System.out.println("Pierwsza cyfra reprezentuje numer wiersza, druga cyfra reprezentuje numer kolumny, trzecia cyfra wartość pola");
        //TimeUnit.SECONDS.sleep(2);
        System.out.println("Przykładowo 123:");
       // TimeUnit.SECONDS.sleep(2);
        Tab.X2o[1] = 3;
        Tab.PrintTab_from_Xno();
        TimeUnit.SECONDS.sleep(2);
        Tab.ClearTab();

    }
}