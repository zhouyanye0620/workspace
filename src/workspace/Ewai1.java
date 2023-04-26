        package  workspace;
    public  class Ewai1{
        public  static  void main(String[]args) {
            int arr[] = new int[]{12, 5, 23, 6, 2};
            //外层循环控制排序的次数
            for (int i = 0; i < arr.length; i++) {
                //内层循环读取数组的元素进行比较
                for (int j = 0; j < arr.length-2; j++) {
                    //数组第一个元素与第二个元素相比较，如果第一个元素大
                    //则交换位置，实现从小到大排序；如果从大到小，则是“<”符号
                    if (arr[i]  < arr[j]) {
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

