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
  <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
  <script type="text/javascript">
    $(document).ready(function(){
      $("#testJson").click(function(){
        //通过ajax请求springmvc
        $.post(
                "promotion/testJson",//服务器地址
                // {"name":"zs","age":23},
                function(result){//服务端处理完毕后的回调函数 List<Student> students， 加上@ResponseBody后， students实质是一个json数组的格式
                  for(var i=0;i<result.length ;i++){
                    alert(result[i].id +"-"+result[i].name +"-"+result[i].age);
                  }
                }
        );
      });
    });
  </script>
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
    </form><br/>

    <%--<a href="promotion/testI18n">国际化</a><br/>--%>

    <a href="promotion/testMvcViewController">解析器</a><br/>


    <form action="promotion/testDateFormat" method="post">
        姓名：<input type="text" name="name">
        年龄：<input type="text" name="age">
        出生日期：<input type="text" name="birthday">
        邮箱：<input type="text" name="email">
        <button type="submit">学生日期</button>
    </form><br/>

  <input type="button" value="testJson" id="testJson" /><br/>
  </body>
</html>
