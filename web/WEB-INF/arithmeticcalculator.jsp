<%-- 
    Document   : arithmeticcalculator
    Created on : Oct 1, 2021, 2:44:23 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="calc">
            <label>First: </label>
            <input type="number" name="firstNumber" value="${firstNum}">
            <br><br>
            <label>Second: </label>
            <input type="number" name="secondNumber" value="${secondNum}">
            <br><br>
            <input type="submit" name="plus" value="+">
            <input type="submit" name="minus" value="-">
            <input type="submit" name="multiplication" value="*">
            <input type="submit" name="modulus" value="%">
        </form>
        <p>Result: ${errorMessage} ${result} ${nocalculation}</p>
        <p><a href="age">Age Calculator</a></p>
    </body>
</html>
