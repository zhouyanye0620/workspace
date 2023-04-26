package workspace;
//数组
public class Shuzu {
    public  static  void main(String[] args){
        int[] x=new int[]{ };//静态完整格式
        int [] y={12,23};//静态简化格式
        System.out.print(x);
        System.out.println(y.length);

        int[]arr={12,24,36};
                arr[2]=100;//赋值
        System.out.println(arr.length);//数组的访问从0开始
           // 数组的长度属性 数组名.length   最大长度-1

             //动态数组
             int[] a=new int[3];
             a[0]=100;
             System.out.println(a[0]);


    }

}
