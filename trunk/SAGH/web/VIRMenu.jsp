<html>
    <head>
        <title>Habla</title>
        <link rel="stylesheet" type="text/css" href="css/base.css">

        <script>

        </script>

    </head>

    <body>

            <table border="0" width="100%" cellpadding="0">

                <%-- Inicio definicion de opciones del menu --%>
                <!-- Inicio Módulo Habitaciones -->
                <tr>
                    <td class="menuTitle">&nbsp;Habitaciones</td>
                </tr>
                <tr>
                    <td class="menuItem">&nbsp;<a href="ListadoHabitacionesServlet"
                                                  class="menuItem">Listado de Tarifas</a></td>
                </tr>
                <tr>
                    <td class="menuItem">&nbsp;<a href="registrarHabitacion.jsp" class="menuItem">
                            Registro de  Nueva Habitacion</a></td>
                </tr>
                <tr>
                    <td class="menuItem">&nbsp;<a href="actualizarHabitacion.jsp" class="menuItem">
                            Actualizacion de Datos Habitacion</a></td>
                </tr>
                <!-- Inicio Módulo Reservas -->
                <tr>
                    <td class="menuTitle">&nbsp;Reservas</td>
                </tr>
                <tr>
                    <td class="menuItem">&nbsp;
                        <a href="ListadoReservasServlet" class="menuItem">
                            Listado de Reservas</a></td>
                </tr>
                <!-- esta opción ya no va, solo si se pasa por el listadoHabitaciones.jsp
                <tr>
                    <td class="menuItem">&nbsp;<a href="solicitarReserva.jsp" class="menuItem">
                            Solicitud de Reserva</a></td>
                </tr>
                -->
                <tr>
                    <td height="30"></td>
                </tr>
                <tr>
                    <td >&nbsp;<a href="Logout.jsp" class="menuExtra">Salir del Sistema</a></td>
                </tr>

                <tr>
                    <td >&nbsp;<a href="home.jsp" class="menuExtra">Home</a></td>
                </tr>

                <tr>
                    <td >&nbsp;<a href="login.jsp" class="menuExtra">Login</a></td>
                </tr>

                <tr>
                    <td ></td>
                </tr>

                <%-- -----------------------------------------------------------------------------------
                        Visualizando el tipo de usuario. Esta informacion esta almanacenada en la sesion
                        del usuario actualmente logueado
                -------------------------------------------------------------------------------------- --%>
                <tr>
                    <td>
                        <b>Tipo Usuario</b>:
                         <font style="font-weight:bolder; font-family:Verdana;
                               font-style:italic; font-size:smaller"
                               color="#CE6F05">${usuario.descripcionTipo}</font>
                        <br>
                    </td>
                </tr>



                <%-- fin definicion de opciones del menu --%>


            </table>

    </body>
</html>