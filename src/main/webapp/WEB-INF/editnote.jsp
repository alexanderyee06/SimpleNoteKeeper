<%-- 
    Document   : editnote
    Created on : 1-Feb-2022, 8:10:10 PM
    Author     : alexa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form action="note" method="post">
            <label>Title: </label>
            <input type="text" name="title" placeholder="Title">
            <br>
            <label>Contents: </label>
            <input type="text" name="contents" placeholder="Contents">
            <br>
            <button type="submit">Save</button>
        </form>
    </body>
</html>
