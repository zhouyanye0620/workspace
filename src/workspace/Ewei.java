package workspace;

public class Ewei {
            public static void main(String[] args) {
                //输出二维数组所有元素的和
                int[][] n = {{4, 6}, {1, 4 ,5,7}, {-2}};
                int sum = 0;
                System.out.println("输出一个二维数组：");
                for (int[] m : n) {
                    for (int i : m) {
                        System.out.print(i + " ");
                        sum += i;
                    }
                    System.out.println();
                }
                System.out.println("所有元素和是：" + sum);
            }
        }
