<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<h1>Index</h1>

<div>
    <c:forEach var="e" items="${result}">
       <ul>
           <li>id:${e.id}<br/>
               Name:${e.name}<br/>
               Wage:${e.wage}</li>
       </ul>
    </c:forEach>
</div>
</body>
</html>