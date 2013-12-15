<%@ page import="redpill.User" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <meta name="layout" content="main"/>
    <title></title>
</head>


<body>


<div class="body">
    <h1>&nbsp;&nbsp;&nbsp;&nbsp;Login</h1>

<g:if test="${flash.message}">
    <div class="message" >
        ${flash.message}
    </div>
</g:if>

<g:form action="authenticate" controller="user" method="post" class="form">

    <div class="dialog">
        <table>
            <tbody>
            <tr class="prop">
                <td class="name">
                    <label for="login">Login:</label>
                </td>
                <td> <div class="input">
                    <g:textField placeholder="Username" type="text" required="true" id="login" name="username"/>
                    </div>
                </td>
            </tr>

            <tr class="prop">
                <td class="name">
                    <label for="password">Password:</label>
                </td>
                <td>
                    <g:passwordField placeholder="password" type="password" required="true" id="password" name="password"/>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
    <div class="buttons">
        <span class="button">
            <input class="save" type="submit" value="Login" />
        </span>
    </div>
</g:form>

</div>
</body>
</html>