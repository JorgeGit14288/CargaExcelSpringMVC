<%-- 
    Document   : index
    Created on : Oct 17, 2018, 8:50:10 AM
    Author     : Tier3
--%>

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
            <input type="file" name="file"/>
            <input type="submit" value="Subir archivo"/>
        </form>

    </center>
</body>
</html>
