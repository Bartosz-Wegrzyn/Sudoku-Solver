import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /////////////////////////////////////////////////////////////////////////////////
// Main Początek //

Tab.PreLoadedXYW();
//Tab.CustomXYW();
Testy.dzialaj();

Tab.PrintTab_from_Xno();

//        for(;;){
//            System.out.print(" 1 - Start ");
//            System.out.print(" 2 - Random");
//            System.out.print(" 3 - PreLoaded ");
//            System.out.print(" 4 - Custom ");
//            System.out.print(" 5 - WszystkieTesty ");
//            System.out.print(" 6 - Dzialaj ");
//            System.out.print(" 7 - Custom ");
//            System.out.print(" ");
//            Scanner menu = new Scanner(System.in);
//            int x = menu.nextInt();
//
//            switch (x){
//                case 1: Start();
//                case 2: Tab.RandomXYW();
//                case 3: Tab.PreLoadedXYW();
//                case 4: Tab.CustomXYW();
//                case 5: Testy.wszystkieTesty();
//                case 6: Testy.dzialaj();
//                case 7:
//
//            }

//    }

////////////////////////////////////////////////////////////////
    }


    public static void Start() throws InterruptedException {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Witam w programie do automatycznego rozwiązywania sudoku!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Program domyślnie ma ustawione wszystkie wartości na 0");
        TimeUnit.SECONDS.sleep(2);

        Tab.PrintTab_from_Xno();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Wprowadź wartość swoich liczb poprzez podanie ich współżędnych.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Pierwsza cyfra reprezentuje numer wiersza, druga cyfra reprezentuje numer kolumny, trzecia cyfra wartość pola");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Przykładowo 123:");
        TimeUnit.SECONDS.sleep(2);
        Tab.X2o[1] = 3;
        Tab.PrintTab_from_Xno();
        TimeUnit.SECONDS.sleep(2);
        Tab.ClearTab();

    }
}