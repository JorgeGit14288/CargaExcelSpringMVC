 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
    <h1>Spring MVC file upload example</h1>
 
    <form method="POST" action="${pageContext.request.contextPath}/carga"
        enctype="multipart/form-data">
        <input type="file" name="file" /> <input type="submit" value="Submit" />
    </form>
 
    <h1>Upload Status</h1>
 
    <h2>Message : ${message}</h2>
 
</body>
</html>





<%-- 
    Document   : index
    Created on : Oct 17, 2018, 8:50:10 AM
    Author     : Tier3


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carga de archivos</title>
    </head>
    <body>
    <center>

        <h3>Carga de archivos Test</h3>
        <form method="post" action="carga" enctype="multipart/form-data">
            <input type="file" name="file" accept=".xls,.xlsx" />
            <input type="submit" value="Subir archivo"/>
        </form>

    </center>
</body>
</html>
--%>