package redis.client.user;

import redis.clients.jedis.Jedis;

/**
 * Created by zhaobing on 18-7-2.
 */
public class TC {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("cao", "4");
        String value = jedis.get("cao");
        System.out.println(value);
    }
}
