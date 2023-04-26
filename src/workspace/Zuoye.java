package workspace;
public class Zuoye {
    public  static  void  main(String[] args){
            int []num=new int []{12,5,23,6,2};
                    for(int i=0;i<num.length-2;i++){
                        for(int j=i+1;j<=num.length-1;j++){
                            if (num[i]<num[j]){
                                int temp = num[i];
                                num[i] = num[j];
                                num[j] = temp;
                            }
                    }
                }
        System.out.print("此数组从大到小的排序为");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
}
}
