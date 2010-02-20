<%@ include file="/verificaSesion.jsp" %>
<html>

    <head>
        <title></title>
        <link rel="stylesheet" type="text/css" href="css/base.css">
    </head>
    <body>
        <form action="SolicitudReservaServlet" method="post">
            <!-- Inicio Tabla Principal -->
            <table border="0" width="100%" height=350 cellspacing="0" cellpadding="0">
                <tr>

                    <td width="15%"  valign="top">
                        <%-- Inicio del Menu del Web Site --%>
                        <%@ include file="/VIRMenu.jsp" %>
                        <%-- Fin Menu del Web Site --%>
                    </td>

                    <td>
                        <table border="1">
                            <tr>
                                <td class="mensajeOk">${tipoMensaje}</td>
                            </tr>
                            <tr>
                                <td class="mensajeOk">${textoMensaje}</td>
                            </tr>
                        </table>
                    </td>

                </tr>
            </table>
            <!-- Fin Tabla Principal -->
        </form>

        <%@ include file="/VIRFooter.jsp" %>
    </body>
</html>
