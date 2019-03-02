package redis.client.user;

/**
 * Created by zhaobing on 18-7-24.
 */
public class VOA implements IB {


    public VOA() {
        System.out.println("VOA");
    }

    public void test() {
        System.out.println("A");
    }

    @Override
    public void t1() {
        System.out.println("t1");
    }

    @Override
    public void t2() {
        System.out.println("t2");
    }
}
