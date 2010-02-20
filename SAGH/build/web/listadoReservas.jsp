<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/verificaSesion.jsp" %>

<html>

    <head>
        <title>Listado de Reservas - SAGH</title>
        <link rel="stylesheet" type="text/css" href="css/base.css">

    </head>

    <body>

        <form>
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
                                <td colspan="6"><h2 class="titulo">Listado de Reservas</h2></td>
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
                                            <td class="tituloHeader">Nombre Hospedante:</td>
                                            <td><input name="txtHospedante" size="50"/></td>
                                            <td class="tituloHeader">Estado:</td>
                                            <td>
                                                <select name="cboEstado">
                                                    <option value="0" selected="selected">Todas</option>
                                                    <option value="1">Confirmada</option>
                                                    <option value="2">Pagada</option>
                                                    <option value="3">Anulada</option>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="tituloHeader">Fecha Registro entre:</td>
                                            <td><input name="txtFecRegIni" size="10"/> al
                                                <input name="txtFecRegFin" size="10"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="tituloHeader">Fecha Arribo entre:</td>
                                            <td><input name="txtFecArriboIni" size="10"/> al
                                                <input name="txtFecArriboFin" size="10"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="4">
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
                                <td colspan="6"><h3 class="subtitulo">Lista de Reservas</h3></td>
                            </tr>
                            <tr>
                                <td>
                                    <table border="1">
                                        <!-- Inicio Cabecera del Listado -->
                                        <tr class="tituloTabla">
                                            <th>C&oacute;digo</th>
                                            <th>Nombre<br>Hospedante</th>
                                            <th>Fecha Registro</th>
                                            <th>Fecha Arribo</th>
                                            <th>Estado</th>
                                            <th>(S/.) Total</th>
                                            <th>Ver Detalle</th>
                                            <th>Seleccionar</th>
                                        </tr>
                                        <!-- Fin Cabecera del Listado -->
                                        <c:forEach var="reserva" items="${listaReservas}">
                                            <tr>
                                                <td>${reserva.codigoReserva}</td>
                                                <td>${reserva.nombreHospedante}</td>
                                                <td>${reserva.fechaRegistroFormateada}</td>
                                                <td>${reserva.fechaArriboFormateada}</td>
                                                <td>${reserva.descripcionEstado}</td>
                                                <td>${reserva.total}</td>
                                                <td align="center"><a href="DetalleReserva.jsp?codigoReserva=${reserva.codigoReserva}"/>Ver Detalle</a></td>
                                                <td><input type="checkbox" value="${reserva.codigoReserva}" name="chkReservasSeleccionadas"></td>
                                            </tr>

                                        </c:forEach>
                                        <!--
                                        <tr>
                                            <td>R00001</td>
                                            <td>Pepito Perez</td>
                                            <td>26-10-2010</td>
                                            <td>27-10-2010</td>
                                            <td>Confirmada</td>
                                            <td>S/. 500</td>
                                            <td align="center"><a href="DetalleReserva.jsp"/>Ver Detalle</a></td>
                                            <td><input type="checkbox"></td>
                                        </tr>
                                        <tr>
                                            <td>R00002</td>
                                            <td>Hospedante 1</td>
                                            <td>26-10-2010</td>
                                            <td>28-10-2010</td>
                                            <td>Confirmada</td>
                                            <td>S/. 500</td>
                                            <td align="center"><a href="DetalleReserva.jsp"/>Ver Detalle</a></td>
                                            <td><input type="checkbox"></td>
                                        </tr>
                                        <tr>
                                            <td>R00003</td>
                                            <td>Hospedante 2</td>
                                            <td>26-10-2010</td>
                                            <td>29-10-2010</td>
                                            <td>Confirmada</td>
                                            <td>S/. 1000</td>
                                            <td align="center"><a href="DetalleReserva.jsp"/>Ver Detalle</a></td>
                                            <td><input type="checkbox"></td>
                                        </tr>
                                        -->
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                            </tr>
                            <tr>
                                <td><input type="submit" value="Pagar Reservas" class="boton"
                                           onclick="">&nbsp;
                                    <input type="submit" value="Anular Reservas" class="boton"
                                           onclick=""></td>
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
