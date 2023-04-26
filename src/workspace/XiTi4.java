package workspace;

public class XiTi4 {
    public static void main(String[] args) {
        for(int i = 1;i <= 6;i++){
            for (int num = 0; num<(i-1)*2; num++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 9-2*(i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



