/*
P1.3 The value of π can be computed according to the following formula:
(π/4) = 1 - (1/3) + (1/5) - (1/7) + (1/9) - .....
Write an algorithm to compute π. Because the formula is an infinite series and an
algorithm must stop after a finite number of steps, you should stop when you have
the result determined to six significant digits.*/
public class P3_PI {

    public static void main(String[] args) {
        double pi = 0;
        boolean haveToAdd = true;
        int i = 1;
        for (int j = 1; j <= 999999999; j++) {
            if (haveToAdd) {
                pi += (4 * (1.0 / i));
                i += 2;
                haveToAdd = false;
            } else {
                pi -= (4 * (1.0 / i));
                i += 2;
                haveToAdd = true;
            }
        }
        System.out.println(pi);
    }
}
