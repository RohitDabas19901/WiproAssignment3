<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Model Attribute Example</title>
    </head>
    <body>
        <h2>@ModelAttribute example</h2>
        <hr />
        <div id="welcome_message">${message}</div>
        <div> </div>
        <table>
            <tr>
                <td>Countries: ${countrieslist}</td>
            </tr>
        </table>
    </body>
</html>