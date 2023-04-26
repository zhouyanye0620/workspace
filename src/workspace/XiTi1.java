package workspace;
import  java.util.Scanner;
public class XiTi1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int sum = 0;
        while (sum < 1000) {
            int num = input.nextInt();
            sum += num;
            System.out.println( sum+"和");
            sum++;
        }
    }
}
