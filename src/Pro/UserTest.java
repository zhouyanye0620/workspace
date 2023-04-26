package Pro;

public class UserTest {
    public static void main(String[] args) {
        User oneoneone=new User("小明",12.5,"876");
        User twotwotwo=new User("好好学习Java",89,"987623");
        oneoneone.info();
        twotwotwo.info();
    }
}


class User {

    String name;
    double yue;
    String password;


    public User(String a,double b,String c) {
        name=a;
        yue=b;
        password=c;
    }
    public  void info(){
        while(true){
            if(name.length()>=2&& name.length()<=4){
                if(yue>20||yue==0.0){
                    if(password.length()>=6){
                        System.out.println("用户的姓名为: "+name+"余额为: "+yue+"密码为: "+password);
                        break;
                    }else {
                        password="000000";

                    }
                }else{
                    yue=0.0;
                    continue;
                }
            }else{
                name="无名";
                continue;
            }
        }

    }
}
