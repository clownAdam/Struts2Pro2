<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/13
  Time: 5:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="myform6.action">
    名称：<input type="text" placeholder="请输入商品名称..." name="goodsList[0].name"><br>
    价格：<input type="text" placeholder="请输入商品价格..." name="goodsList[0].price"><br>
    <hr>
    名称：<input type="text" placeholder="请输入商品名称..." name="goodsList[1].name"><br>
    价格：<input type="text" placeholder="请输入商品价格..." name="goodsList[1].price"><br>
    <input type="submit" name="" value="提交">
</form>
<h1>map</h1>
<form action="myform7.action">
    名称：<input type="text" placeholder="请输入商品名称..." name="goodsMap[1].name"><br>
    价格：<input type="text" placeholder="请输入商品价格..." name="goodsMap[1].price"><br>
    <hr>
    名称：<input type="text" placeholder="请输入商品名称..." name="goodsMap[2].name"><br>
    价格：<input type="text" placeholder="请输入商品价格..." name="goodsMap[2].price"><br>
    <input type="submit" name="" value="提交">
</form>
</body>
</html>
