package workspace;
public class One {
    public static void main(String[] args) {
        int[] a = new int[] { 23, 2, 11, 32, 43, 28 };
        // 遍历一遍数组-----
        System.out.println("遍历数组a[]");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // 选择排序从大到小
        System.out.println("下面进行从大到小的选择排序");
        for (int i = 0; i <= a.length - 2; i++) {
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        // 遍历一遍排序后的数组
        System.out.println("遍历经过选择排序从大到小排序后的数组a[]");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

  /*      //对12,5,23,6,2这一组数从小到大排序
        int arr[] = new int[]{12, 5, 23, 6, 2};
        //外层循环控制排序的次数
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环读取数组的元素进行比较
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //数组第一个元素与第二个元素相比较，如果第一个元素大
                //则交换位置，实现从小到大排序；如果从大到小，则是“<”符号
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //循环遍历输出数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
*/