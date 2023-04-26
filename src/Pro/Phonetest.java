package Pro;

public class Phonetest {
    public  static  void main(String[]args){
    //创建手机的对象
    Phone p= new Phone();
//给手机赋值
    p.brand="小米";
    p.price=1999.98;
    //获取手机对象的值
    System.out.println(p.brand);
        System.out.println(p.price);
       // 调用手机的方法
        p.call();
        p.playGame();
        Phone p2= new Phone();
 p2.brand="小";
    p2.price=1999.98;
//类是共同特征的描述 对象是真实存在的具体实列
}}
