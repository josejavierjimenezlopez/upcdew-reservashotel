<%@ include file="/verificaSesion.jsp" %>
<html>

    <head>
        <title>Solicitar Reserva - SAGH</title>
        <link rel="stylesheet" type="text/css" href="css/base.css">

        <script>
            function calcularTotal(numDiasEstancias, precioXNoche){
                total = numDiasEstancias * precioXNoche;
                document.form1.txtTotal.value = total;
            }
        </script>

    </head>
    <body>
        <form action="SolicitudReservaServlet" method="post" name="form1">
            <!-- Inicio Tabla Principal -->
            <table border="0" width="100%" height=350 cellspacing="0" cellpadding="0">
                <tr>

                    <td width="15%"  valign="top">
                        <%-- Inicio del Menu del Web Site --%>
                        <%@ include file="/VIRMenu.jsp" %>
                        <%-- Fin Menu del Web Site --%>
                    </td>

                    <td valign="top">
                        <!-- Inicio tabla Body -->
                        <table border="0"  cellspacing="0" cellpadding="0" width="70%">
                            <tr align="center">
                                <td colspan="6"><h2 class="titulo">Solicitud de Reserva</h2></td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                            </tr>
                            <!-- Inicio Parte Header -->
                            <tr>
                                <td colspan="6"><h3 class="subtitulo">Datos de la Reserva</h3></td>
                            </tr>
                            <tr>
                                <td colspan="6">
                                    <table border="1">
                                        <tr>
                                            <td class="tituloHeader">Fecha Arribo:</td>
                                            <td><input name="txtFechaArribo" size="10"/></td>
                                            <td class="tituloHeader">Counter:</td>
                                            <td>
                                                <input name="txtCounter" size="40" 
                                                       value="${usuario.username}"
                                                       readonly/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="tituloHeader">Fecha Registro:</td>
                                            <td><input name="txtFechaRegistro" size="10"/></td>
                                            <td class="tituloHeader">Nombre Hospedante:</td>
                                            <td><input name="txtHospedante" size="40"/></td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <!-- Fin Parte Header -->

                            <tr>
                                <td>&nbsp;</td>
                            </tr>
                            <!-- Inicio tabla para mostrar la Data -->
                            <tr>
                                <td colspan="6"><h3 class="subtitulo">Habitaciones a Reservar</h3></td>
                            </tr>
                            <tr>
                                <td>
                                    <table border="1">
                                        <!-- Inicio Cabecera del Listado -->
                                        <tr class="tituloTabla">
                                            <th>Tipo</th>
                                            <th>(S/.) Costo<br>(por noche)</th>
                                            <th># D&iacute;as<br>Estancia</th>
                                            <th>Total (S/.)</th>
                                        </tr>
                                        <!-- Fin Cabecera del Listado -->
                                        <tr>
                                            <td>${habitacionAReservar.descripcionTipo}</td>
                                            <td>S/. ${habitacionAReservar.precioXNoche}</td>
                                            <td><input size="5" name="txtNumDiasEstancia" value="1"
                                                       onkeyup="calcularTotal(this.value,
                                                       ${habitacionAReservar.precioXNoche});"></td>
                                            <td>S/. <input size="5" name="txtTotal" 
                                                           value="${habitacionAReservar.precioXNoche}"></td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <!-- Fin tabla para mostrar la Data -->
                            <tr>
                                <td>&nbsp;</td>
                            </tr>
                            <tr>
                                <td><input type="submit" value="Solicitar Reserva"
                                           class="boton"></td>
                            </tr>
                        </table>
                        <!-- Fin tabla Body -->
                    </td>
                </tr>
            </table>
            <!-- Fin Tabla Principal -->
        </form>

        <%@ include file="/VIRFooter.jsp" %>
    </body>
</html>
