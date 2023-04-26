package workspace;

public class Shuzu2 {
    public static void main(String[] args) {
        int[] arr = {2,9,6,3,7};
        System.out.println("数组内容有:");
        printArray(arr);
        System.out.print("冒泡排序前");
        printArray(arr);
        System.out.print("冒泡排序后");
        printArray(arr);}
        public  static  void printArray(int[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+"");
            }System.out.println();
    }public  static  void bobbleSort(int[]arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;i++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }System.out.print("第"+(i+1)+"轮排序后:");
            }
            printArray(arr);

        }
    }

}
