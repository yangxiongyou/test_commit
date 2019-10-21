import cn.yxy.test.domain.BBuser;
import cn.yxy.test.domain.User;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
 final  static  String ss = "aaa";
    public static void main(String[] args) {
        //=======
        //----------
        System.out.println("2222");
        System.err.print("------------");
        System.out.println("");
        System.out.println("000000000");
        System.out.println("------------");
        System.out.println("=====================");
        System.out.println("goods moring ------");

        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<Object, Object> map = new HashMap<>();

        Arrays.asList();

        test("aaa");
        User user = new User();
        user.setName("");
        user.setSex("");
        user.setNo("");
        user.setWeight("");
//        user.setAge(0);
        ReentrantLock lock = new ReentrantLock();
        lock.lock();

        String json="{\"name\":\"aaaa\",\n" +
                "\"goods\":\"bbbb\"\n" +
                "}";
        System.out.println("Hello World!");
    }


    public  static  String test(String ss ){
        System.out.println("------>"+ss);
        return  ss;
    }
    public  static  String test(String ss,String aa ){
        System.out.println("------>"+ss);
        return  ss;
    }

    public BBuser conver(User user){
        BBuser bBuser = new BBuser();
        bBuser.setName(user.getName());
        bBuser.setWeight(user.getWeight());
        return bBuser;

    }

    public BBuser test(User user){
        BBuser bBuser = new BBuser();
        bBuser.setName(user.getName());
        bBuser.setWeight(user.getWeight());
        return bBuser;


    }
}
