package redis.client.user;

/**
 * Created by zhaobing on 18-7-24.
 */
public class VOB extends VOA implements IB, IIC {

    public VOB() {
        super();
        System.out.println("VOB");
    }

    @Override
    public void test() {
        super.test();
        System.out.println("A");
    }

    @Override
    public void canClose() {
        System.out.println("close");
    }
}
