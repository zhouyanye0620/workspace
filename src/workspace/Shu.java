package workspace;


public class Shu {
    public static void main(String[] args) {
        int[] arr = {12, 5, 23,6,2};
        int max = getMax(arr);
        System.out.println("max = " + max);
    }
        public static int getMax(int[] arr) {
            int max=arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
}



