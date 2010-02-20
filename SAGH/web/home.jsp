<%@ include file="/verificaSesion.jsp" %>
<html>

    <head>
        <title>Home Page - Sistema SAGH</title>
    </head>
    <body>

        <table border="0" width="100%" height=350 cellspacing="0" cellpadding="0">
            <tr>

                <td width="15%"  valign="top">
                    <%-- Inicio del Menu del Web Site --%>
                    <%@ include file="/VIRMenu.jsp" %>
                    <%-- Fin Menu del Web Site --%>
                </td>

                <td   valign="top" >   <p>&nbsp;</p>

                    <table border="1"  cellspacing="0" cellpadding="0" align="center">

                        <tr valign=top align=left>
                            <td height=65 colspan=8 align=left valign=top>
                                <img height=65 width=465 src="images/titulo.gif" border=0></td>                            <td></td>
                        </tr>
                        <tr >
                            <td> </td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td </td>
                        </tr>
                        <tr >
                            <td>
                                Estimado Sr. <b> ${usuario.nombreCompleto} </b>:
                                con el sistema de Administraci&oacute;n y Gesti&oacute;n Hotelera, usted
                                podrá controlar la<br/> <b>reserva y disponibilidad</b> de las habitaciones.
                            </td>
                            <td colspan=2></td>
                        </tr>
                    </table>

                </td>

            </tr>
        </table>
        <%@ include file="/VIRFooter.jsp" %>
    </body>
</html>
