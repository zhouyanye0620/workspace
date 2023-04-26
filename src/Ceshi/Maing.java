package Ceshi;

public class Maing  implements  jiekou1,jiekou2{
    double r;
    public  Maing(double r){
        this.r=r;
    }

    @Override
    public double yuanmianji() {
        return jiekou1.pi*2*r;
    }

    @Override
    public double yuanzhouchang() {
        return jiekou2.pi*r*r;
    }
}
