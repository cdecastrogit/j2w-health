<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.jobs2web.redis.RedisClient" %>

<html>
  <head>
    <title>j2w-health</title>
  </head>
  <body>


  <h1>Monitors x health of integration points for j2w apps. </h1>

  <%

    RedisClient redisClient = new RedisClient();

  %>

  <h2>

    Redis is running: <%= redisClient.isRunning() %>

    <p/>

    Last cached time is: <%= redisClient.getValue(RedisClient.CURR_TIME) %>

  </h2>



  </body>
</html>
