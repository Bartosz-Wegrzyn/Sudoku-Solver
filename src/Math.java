class Math {

    //Ustawia wartość x na tą samą co pierwsza cyfre zmiennej xyw
    static int xyw_To_x(int xyw){
        int firstDigit = xyw;
        firstDigit = firstDigit / 100;
        if (firstDigit == 0) {firstDigit =1; }
        if (firstDigit == 10) {firstDigit =0; }
        return firstDigit;
    }

    //Ustawia wartość y na tą samą co druga cyfra zmiennej xyw
    static int xyw_To_y(int number){

        int x = xyw_To_x(number);
        int secondDigit = number;
        secondDigit = secondDigit-(x*100) ;
        secondDigit = secondDigit/10 ;
        if (secondDigit == 0) {secondDigit =1; }
        if (secondDigit == 10) {secondDigit =0; }
        return secondDigit;
    }
    //Ustawia wartość w na tą samą co druga cyfra zmiennej xyw
    static int xyw_To_w(int number){
        int x = xyw_To_x(number);
        int y = xyw_To_y(number);
        int thirdDigit = number;
        thirdDigit = thirdDigit-(x*100)-(y*10);
        return thirdDigit;
    }
}
