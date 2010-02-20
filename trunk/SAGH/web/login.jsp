<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Login- SAGH</title>
        <link rel="stylesheet" type="text/css" href="css/base.css"/>
    </head>

    <body>

        <form action="LoginServlet" method="post">

            <table border="0" align="center">
                <tr>
                    <td rowspan="4" valign="top"><img src="images/sign_in.gif" /></td>
                </tr>
                <tr>
                    <td class="tituloHeader"><img src="images/user.gif" /> Usuario:</td>
                    <td><input size="20" name="txtUsuario"/></td>
                </tr>
                <tr>
                    <td class="tituloHeader"><img src="images/llave.gif" /> Password:</td>
                    <td><input size="20" name="txtPassword"/></td>
                </tr>
                <tr>
                    <td colspan="2" class="mensajeError">${mensajeError}</td>
                </tr>
                <tr align="center">
                    <td colspan="3"><input type="submit" class="boton"
                                           value="Login"/></td>
                </tr>
            </table>

        </form>


    </body>
</html>
