package workspace.shixun;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean in=true;//用于开始和结束循环
        loinsystem account_1=new loinsystem();
        int numofregister=0;//用于计数
        //界面
        while(in){
            System.out.println("===登录系统===");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.查看");
            System.out.println("4.退出");
            System.out.println("==注意== 未注册的用户请先注册");
            System.out.println("请输入编号进行操作");
            int input= scan.nextInt();
            if(input==1){
                account_1.login(numofregister);
            }else if(input==2){
                numofregister++;//每注册一个账户都会分配一个在String[][] allAccount 新位置
                account_1.register(numofregister);
            }else if(input==3){
                account_1.showInfo(numofregister);
                //退出功能
            }else if(input==4){
                System.out.println("是否要退出登录系统？Y/N");
                String quit=scan.next();
                if("Y".equals(quit)){
                    in=false;
                }else {
                    in=true;
                }
            }
        }
    }
}
class loinsystem{
    //用户数量和用户的账户和密码存储
    String[][] allAccount=new String[100][2];

    //注册方法
    public void register(int numofregister){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入账号名");
        //String account用于接受用户输入的账号
        String account=scanner.next();
        System.out.println("请输入密码");
        //String password用于接受用户输入的密码
        String password=scanner.next();
        //储存用户的账号密码
        allAccount[numofregister][0]=account;
        allAccount[numofregister][1]=password;
        //提示注册成功
        System.out.println("注册成功!");
        System.out.println("\n");
    }
    //登录方法
    public void login(int numofregister){
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入账号");
        //inputAccount用于接受用户的输入账号
        String inputAccount=scan.next();
        System.out.println("请输入密码");
        //inputPassword用于接受用户的输入密码
        String inputPassword= scan.next();
        //遍历查找用户的输入账号在数组的哪个位置以方便账号与密码匹配
        for(int i=0;i<allAccount.length;i++) {
            if (i <= numofregister) {//避免空指针异常
                if (inputAccount.equals(allAccount[i][0])) {//如果找到了账号在数组的位置就看密码与用户输入的密码是否匹配
                    if (inputPassword.equals(allAccount[i][1])) {
                        System.out.println("登录成功");
                    } else {
                        System.out.println("账号或密码有误 登录失败");
                    }
                }

            }else {//避免空指针异常
                break;
            }
        }
    }
    //查看方法
    public void showInfo(int numofregister){
        for(int i=1;i<allAccount.length;i++){
            if(i<=numofregister){//避免空指针异常 避免遍历过度
                System.out.println("用户"+i+"信息如下:");
                System.out.println("账号:"+allAccount[i][0]);
                System.out.println("密码:"+allAccount[i][1]);
            }else {//避免空指针异常 避免遍历过度
                break;
            }

        }
    }
}

