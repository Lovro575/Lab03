<%-- 
    Document   : ageCalculator
    Created on : Oct 1, 2021, 2:44:10 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <label>Enter your age: </label>
            <input type="text" name="age_input" value="">
            <br><br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>${message}</p>
        <p>Your age next birthday will be ${result}</p>    
        <p><a href="calc">Arithmetic Calculator</a></p>        
    </body>
</html>