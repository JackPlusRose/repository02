<%--
  Created by IntelliJ IDEA.
  User: Jack
  Date: 2019/8/13
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/testFindAll">查询所有1</a><br>
<hr>
<form action="account/testSaveAccount" method="post">
    姓名：<input type="text" name="userName"><br>
    金额：<input type="text" name="money"><br>
    <input type="submit">
</form>
<br>
<hr>
<form method="post" action="account/testUpload" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
