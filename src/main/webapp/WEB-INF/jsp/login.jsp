<%--
  Created by IntelliJ IDEA.
  User: CHT
  Date: 2018-4-30
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>登录页</title>
</head>
<body>

    <h2>欢迎来到登陆页</h2>
    <hr/>
    <form action="${pageContext.request.contextPath}/sys/login" method="post">
        <table>
            <caption>用户登录</caption>
            <tr>
                <th>用户名:</th>
                <td><input type="text" name="userName" placeholder="请输入用户名"/></td>
            </tr>
            <tr>
                <th>密码:</th>
                <td><input type="password" name="password" placeholder="请输入密码"/></td>
            </tr>
            <tr>
                <td align="center" colspan="2">
                    <input type="submit"/>&nbsp;
                    <input type="reset"/>
                </td>
            </tr>
        </table>
    </form>


    <br/>
    <hr/>
    <br/>
    <table id="registorTable">
        <caption>用户注册</caption>
        <tr>
            <th>用户名:</th>
            <td><input type="text" name="userName" placeholder="请输入用户名"/></td>
        </tr>
        <tr>
            <th>密码:</th>
            <td><input type="password" name="password" placeholder="请输入密码"/></td>
        </tr>
        <tr>
            <th>年龄:</th>
            <td><input type="text" name="age" placeholder="请输入用年龄"/></td>
        </tr>
        <tr>
            <th>身高:</th>
            <td><input type="text" name="height" placeholder="请输入用身高"/></td>
        </tr>
        <tr>
            <th>生日:</th>
            <td><input type="text" name="date" placeholder="请输入用生日"/></td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <input id="register" type="submit"/>&nbsp;
                <input type="reset"/>
            </td>
        </tr>
    </table>


    <script type="application/javascript" src="/resourse/js/jquery-3.3.1.js"></script>
<script type="application/javascript">
    $(function () {
        $("#register").click(function () {
            var sendDate = {
                userName:$("#registorTable input[name='userName']").val(),
                password:$("#registorTable input[name='password']").val(),
                age:$("#registorTable input[name='age']").val(),
                height:$("#registorTable input[name='height']").val(),
                date:$("#registorTable input[name='date']").val()
            };
            $.ajax({
                type: "POST",
                contentType: "application/json;charset=UTF-8", //发送数据的格式
                url: "${pageContext.request.contextPath}sys/register",
                data: JSON.stringify(sendDate),
                dataType: "json",
                success: function(data){
                    alert(JSON.stringify(data));
                }
            });

        });
    });

</script>

</body>
</html>
