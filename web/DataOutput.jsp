<%--
  Created by IntelliJ IDEA.
  User: lewis
  Date: 5/9/16
  Time: 6:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Weather Information</title>
</head>
<body>

    West Coast weather is currently ${templist.temperaturewest} ºf
    Real Coast weather is currently ${templist.temperaturereal} ºf
    ${}
    <form action="/Information">
        <input type="submit" value="Refresh Value">
    </form>








</body>
</html>
