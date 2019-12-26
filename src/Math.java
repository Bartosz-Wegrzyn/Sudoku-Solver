public class Math {

    //Ustawia wartość x na tą samą co pierwsza cyfre zmiennej xyw
    static int xyw_To_x(int number){
        int firstDigit = number;
        firstDigit = firstDigit / 100;
        if (firstDigit == 0) {firstDigit =1; }
        if (firstDigit == 10) {firstDigit =0; }
        int x = firstDigit;
        return x;
        
    }
//Ustawia wartość y na tą samą co druga cyfra zmiennej xyw

    static int xyw_To_y(int number){

       int x = xyw_To_x(number);
        
        int secondDigit = number;
        secondDigit = secondDigit-(x*100) ;
        secondDigit = secondDigit/10 ;

        if (secondDigit == 0) {secondDigit =1; }
        if (secondDigit == 10) {secondDigit =0; }
        int  y = secondDigit;
        return y;
    }
    //    Ustawia wartość y na tą samą co druga cyfra zmiennej xyw
    static int xyw_To_w(int number){
        int x = xyw_To_x(number);
        int y = xyw_To_y(number);
        int thirdDigit = (int) number;
        thirdDigit = thirdDigit-(x*100)-(y*10);
        int w=thirdDigit;
        return w;

    }
}
