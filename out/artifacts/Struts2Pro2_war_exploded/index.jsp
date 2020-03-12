<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/12
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<s:fielderror></s:fielderror>
<form action="${pageContext.request.contextPath}/hello.action">
    用户名：<input type="text" placeholder="请输入用户名..." name="username"><br>
    昵称：<input type="text" placeholder="请输入呢称..." name="nick"><br>
    爱好：
    <input type="checkbox" value="足球" name="hobby">足球
    <input type="checkbox" value="篮球" name="hobby">篮球
    <input type="checkbox" value="乒乓球" name="hobby">乒乓球<br>
    <input type="submit" value="提交">
</form>
<hr width="23px">
<h3>获取原生api</h3>
<form action="${pageContext.request.contextPath}/myform2.action">
    用户名：<input type="text" placeholder="请输入用户名..." name="username"><br>
    昵称：<input type="text" placeholder="请输入呢称..." name="nick"><br>
    爱好：
    <input type="checkbox" value="足球" name="hobby">足球
    <input type="checkbox" value="篮球" name="hobby">篮球
    <input type="checkbox" value="乒乓球" name="hobby">乒乓球<br>
    <input type="submit" value="提交">
</form>
<h3>获取原生api----实现接口</h3>
<form action="${pageContext.request.contextPath}/demo.action">
    用户名：<input type="text" placeholder="请输入用户名..." name="username"><br>
    昵称：<input type="text" placeholder="请输入呢称..." name="nick"><br>
    爱好：
    <input type="checkbox" value="足球" name="hobby">足球
    <input type="checkbox" value="篮球" name="hobby">篮球
    <input type="checkbox" value="乒乓球" name="hobby">乒乓球<br>
    <input type="submit" value="提交">
</form>
<h3>set</h3>
<form action="${pageContext.request.contextPath}/myform3.action">
    用户名：<input type="text" placeholder="请输入用户名..." name="username"><br>
    昵称：<input type="text" placeholder="请输入呢称..." name="nick"><br>
    年龄：<input type="text" placeholder="请输入年龄..." name="age"><br>
    爱好：
    <input type="checkbox" value="足球" name="hobby">足球
    <input type="checkbox" value="篮球" name="hobby">篮球
    <input type="checkbox" value="乒乓球" name="hobby">乒乓球<br>
    <input type="submit" value="提交">
</form>
<h3>提供页面表达式</h3>
<form action="${pageContext.request.contextPath}/myform4.action">
    用户名：<input type="text" placeholder="请输入用户名..." name="user.username"><br>
    昵称：<input type="text" placeholder="请输入呢称..." name="user.nick"><br>
    年龄：<input type="text" placeholder="请输入年龄..." name="user.age"><br>
    爱好：
    <input type="checkbox" value="足球" name="user.hobby">足球
    <input type="checkbox" value="篮球" name="user.hobby">篮球
    <input type="checkbox" value="乒乓球" name="user.hobby">乒乓球<br>
    <input type="submit" value="提交">
</form>
<h3>模型驱动方式</h3>
<form action="${pageContext.request.contextPath}/myform5.action">
    用户名：<input type="text" placeholder="请输入用户名..." name="username"><br>
    昵称：<input type="text" placeholder="请输入呢称..." name="nick"><br>
    年龄：<input type="text" placeholder="请输入年龄..." name="age"><br>
    爱好：
    <input type="checkbox" value="足球" name="hobby">足球
    <input type="checkbox" value="篮球" name="hobby">篮球
    <input type="checkbox" value="乒乓球" name="hobby">乒乓球<br>
    <input type="submit" value="提交">
</form>

</body>
</html>
