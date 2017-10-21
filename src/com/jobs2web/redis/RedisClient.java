package com.jobs2web.redis;

import redis.clients.jedis.Jedis;

import java.util.Date;
import java.util.Map;

public class RedisClient {

    public static final String CURR_TIME = "currTime";

    Jedis jedis;

    public RedisClient () {

        jedis = new Jedis("172.18.0.2", 6379);

    }

    public boolean isRunning() {
        //Connecting to Redis server on localhost
        System.out.println("Connection to server sucessfully");
        //check whether server is running or not
        System.out.println("Server is running: "+jedis.ping());

        if ("PONG".equalsIgnoreCase(jedis.ping())) {

            setValue("currTime", (new Date()).toString());
            return true;
        } else {
            return false;
        }
    }

    public void setValue(String key, String value) {

        jedis.set(key, value);

    }

    public String getValue(String key) {

        return jedis.get(key);
    }
}
