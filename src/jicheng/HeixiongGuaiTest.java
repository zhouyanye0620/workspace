package jicheng;



public class HeixiongGuaiTest {
    public static void main(String[] args) {
        HeiXiongGuai hx=new HeiXiongGuai();
        hx.name="大黑熊";
        System.out.println(hx.name);
        hx.chiRen();
        //hx.pasi();//继承不能有private
    }
}