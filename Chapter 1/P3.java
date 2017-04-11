public class P3 {

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
