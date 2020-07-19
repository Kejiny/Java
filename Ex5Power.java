public class Ex5Power {
    public static void main(String[] args) {
        int n = 2, p = 5, result = 2;
        if (n > 0 && p == 0) {
            result = 1;
        } else if (n == 0 && p > 2) {
            result = 0;
        } else {
            for (int i = 1; i < p; i++) {
                result = result * n;
            }
        }
        System.out.println(n + "^" + p + "=" + result);
    }
    }
