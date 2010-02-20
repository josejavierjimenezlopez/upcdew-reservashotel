<%@taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

    <head>
        <title>Listado de Habitaciones - SAGH</title>
        <link rel="stylesheet" type="text/css" href="css/base.css">

        <script>

            function seleccionarHabitacion(param){
                alert('se llama al servlet SeleccionHabitacionServlet');
                document.forms[0].action = "SeleccionHabitacionServlet?rbTipoSeleccionado=" + param;
                document.forms[0].submit();
            }

        </script>

    </head>

    <body>
        <form method="post">
            <!-- Inicio Tabla Principal -->
            <table border="0" width="100%" height=350 cellspacing="0" cellpadding="0">
                <tr>

                    <td width="15%"  valign="top">
                        <%-- Inicio del Menu del Web Site --%>
                        <%@ include file="/VIRMenu.jsp" %>
                        <%-- Fin Menu del Web Site --%>
                    </td>

                    <td valign="top">
                        <table border="0"  cellspacing="0" cellpadding="0" align="left" width="70%">
                            <tr align="center">
                                <td colspan="6"><h2 class="titulo">Tarifas (counter)</h2></td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                            </tr>
                            <!-- Inicio Parte Filtro -->
                            <tr>
                                <td colspan="6"><h3 class="subtitulo">Filtro</h3></td>
                            </tr>
                            <tr>
                                <td colspan="6">
                                    <table border="1">
                                        <tr>
                                            <td class="tituloHeader">Precio entre:</td>
                                            <td>S/.<input name="txtPreIni" size="10"/> y
                                                S/.<input name="txtPreFin" size="10"/>
                                            </td
                                        </tr>
                                        <tr>
                                            <td colspan="2">
                                                <input type="button" value="Buscar" class="boton">
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <!-- Fin Parte Filtro -->

                            <tr>
                                <td>&nbsp;</td>
                            </tr>
                            <!-- Inicio tabla para mostrar la Data -->
                            <tr>
                                <td colspan="6"><h3 class="subtitulo">Lista de Habitaciones</h3></td>
                            </tr>
                            <tr>
                                <td>
                                    <table border="1">
                                        <!-- Inicio Cabecera del Listado -->
                                        <tr class="tituloTabla">
                                            <th>Descripci&oacute;n</th>
                                            <th>Tipo</th>
                                            <th>(S/.) Costo<br>(por noche)</th>
                                            <th>Capacidad</th>
                                            <th>Seleccionar</th>
                                        </tr>
                                        <!-- Fin Cabecera del Listado -->
                                        <C:forEach var="habitacion" items="${listaHabitaciones}">
                                            <tr>
                                                <td>${habitacion.descripcionHabitacion}</td>
                                                <td>${habitacion.descripcionTipo}</td>
                                                <td>S/. ${habitacion.precioXNoche}</td>
                                                <td>${habitacion.capacidadHabitacion}</td>
                                                <td><input type="radio" name="rbTipoSeleccionado"
                                                           value="${habitacion.codigoHabitacion}"
                                                           onclick="seleccionarHabitacion(this.value)"/>
                                                     </td>
                                            </tr>
                                        </C:forEach>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                            </tr>
                            <!--
                            <tr>
                                <td><input type="submit" value="Seleccionar Habitaciones" class="boton"
                                           onclick="seleccionarHabitacion(0);"></td>
                            </tr>
                            -->
                        </table>
                    </td>
                </tr>
            </table>
            <!-- Fin Tabla Principal -->
        </form>

        <%@ include file="/VIRFooter.jsp" %>
    </body>
</html>
