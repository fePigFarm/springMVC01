<%--
  Created by IntelliJ IDEA.
  User: yangguoqiang01
  Date: 2019-05-26
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>我是标题</title>
  </head>
  <body>
    <a href="promotion/welcome">欢迎点击！！！</a> <br/>
    <a href="promotion/welcome/abc">欢迎点击！！！</a><br/>
    <a href="promotion/welcome/sdfgfdsd/abc">欢迎点击！！！</a><br/>
    <a href="promotion/welcome/sdfg/fd/sd/abc">欢迎点击！！！</a><br/>
    <a href="promotion/welcome/zs">传递参数</a><br/>

    <form action="promotion/add" method="post">
      <input type="text" value="yang" name="yang">
      <button type="submit">提交</button>
    </form><br/>

    <form action="promotion/add" method="post">
      <input type="text" value="杨" name="yang">
      <button type="submit">提交 -- 并且name是yang，value是杨</button>
    </form><br/>

    <form action="promotion/testParam" method="post">
      <input type="text" value="yang" name="yang">
      <input type="text" value="18" name="age">
      <button type="submit">提交 -- 参数形式</button>
    </form><br/>

    <form action="promotion/testObjectProperties" method="post">
      name:<input name="name" type="text" /><br/>
      age:<input name="age" type="text" /><br/>
      家庭地址:<input name="address.homeAddress" type="text" /><br/>
      学校地址:<input name="address.schoolAddress" type="text" /><br/>
      <input type="submit" value="查">
    </form>
  </body>
</html>
