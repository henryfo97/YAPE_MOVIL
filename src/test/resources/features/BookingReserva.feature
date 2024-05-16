# language: es
@Booking_001
Característica: Featurue Booking para que el usuario pueda realizar las funcionabilidades de Servicio de alojamiento

  Antecedentes:
    Entonces valido el ingreso correcto a la aplicacion

  @Booking_002
  Escenario: Validar reserva de alojamiento OK
    Entonces ingreso los datos de busqueda
      | Destino | FechaInicio    | FechaFin       | Ninnos |
      | Cuzco   | 24 junio 2024 | 31 agosto 2024 | 4      |
    E realizo la busqueda
    Entonces selecciono la segunda opcion
    Cuando ingreso los datos del usuario
      | Nombre   | Apellido | Email                         | Direccion  | CodigoPostal | Ciudad | Pais | Telefono  |
      | Henry | Rengifo    | henry.ren008@gmail.com        | jr ica | 11112        | Lima    | Perú | 909090909 |
    Dado ingreso datos de la tarjeta
      | Numero           | Titular        | FechaC | CodigoCVV |
      | 4898989896007434 | Henry Rengifo | 06/26  | 139       |
    E pulso sobre Reserva Ahora
    Cuando valido la reserva confirmada

  @Booking_003
  Escenario: Validar reserva de alojamiento exitoso ingresando otros datos del usuario
    Entonces ingreso los datos de busqueda
      | Destino | FechaInicio    | FechaFin       | Ninnos |
      | Cuzco   | 24 junio 2024 | 31 agosto 2024 | 4      |
    E realizo la busqueda
    Entonces selecciono la segunda opcion
    Cuando ingreso los datos del usuario
      | Nombre   | Apellido | Email                | Direccion  | CodigoPostal | Ciudad | Pais | Telefono  |
      | Cristian | Almeyda   | henry.ren008@gmail.com | Jr ica | 11112        | Lima    | Perú | 989876767 |
    Dado ingreso datos de la tarjeta
      | Numero           | Titular        | FechaC | CodigoCVV |
      | 40099980479090034 | Henry Rengifo | 05/27  | 861       |
    E pulso sobre Reserva Ahora
    Cuando valido la reserva confirmada

  @Booking_004
  Escenario: Validar reserva de alojamiento fallido sin ingresar telefono
    Entonces ingreso los datos de busqueda
      | Destino | FechaInicio    | FechaFin       | Ninnos |
      | Cuzco   | 24 junio 2024 | 31 agosto 2024 | 5      |
    E realizo la busqueda
    Entonces selecciono la segunda opcion
    Cuando ingreso los datos del usuario
      | Nombre   | Apellido | Email                | Direccion  | CodigoPostal | Ciudad | Pais | Telefono |
      | Cristian | Almeyda   | henry.ren008@gmail.com | Jr ica | 11112        | Lima    | Perú |  |
    Dado ingreso datos de la tarjeta
      | Numero           | Titular        | FechaC | CodigoCVV |
      | 40099980479090034 | Henry Rengifo | 05/27  | 861       |
    E pulso sobre Reserva Ahora
    Cuando valido la reserva confirmada

  @Booking_005
  Escenario: Validar reserva de alojamiento fallido sin ingresar el Pais
    Entonces ingreso los datos de busqueda
      | Destino | FechaInicio    | FechaFin       | Ninnos |
      | Cuzco   | 24 junio 2024 | 31 agosto 2024 | 5      |
    E realizo la busqueda
    Entonces selecciono la segunda opcion
    Cuando ingreso los datos del usuario
      | Nombre   | Apellido | Email                | Direccion  | CodigoPostal | Ciudad | Pais | Telefono  |
      | Cristian | Almeyda   | henry.ren008@gmail.com | Jr ica | 11112        | Lima    | Perú |  |
    Dado ingreso datos de la tarjeta
      | Numero           | Titular        | FechaC | CodigoCVV |
      | 40099980479090034 | Henry Rengifo | 05/27  | 861       |
    E pulso sobre Reserva Ahora
    Cuando valido la reserva confirmada
