<%--
  Created by IntelliJ IDEA.
  User: lynas
  Date: 6/20/15
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
This is home
${test}

<form name="testForm" method="post" action="/test">
  <input type="text" name="test" value="test" />
  <input type="submit" value="submit" />
</form>
</body>
</html>
