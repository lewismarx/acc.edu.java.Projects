<%--
  Created by IntelliJ IDEA.
  User: lewis
  Date: 5/9/16
  Time: 7:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sky Types</title>
</head>
<link rel="stylesheet" type="text/css" href="css.css">
<style>
    body {background-color: gainsboro}
    p {color:#888888}
    h2 {color:#585858}


</style>

<body>

<h2> In Paris </h2>


<p> ${skymap.get("paris").getMorningSky()} </p>

<h2> In weisbaten </h2>


<p> ${skymap.get("weisbaten")["nightSky"]} </p>


<form action="/SkyTime" method="get" >
    <input type="submit" value="Refresh Value">
</form>



</body>
</html>
