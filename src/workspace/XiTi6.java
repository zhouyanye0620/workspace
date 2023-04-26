package workspace;

public class XiTi6 {
    public static void main(String[] args) {
        int num = 50;
        double sum = 0.0;
        for (int num1 = 1; num1 <= num; num1++) {
            double he = ((num1 % 2 == 0) ? -1 : 1) / Math.pow(num1, 2);
            sum += he;
        }
        System.out.println("前五十项的和为" + sum);
    }
}