#language:es

Característica: Registrar nuevo cliente

  Antecedentes:
    Dado que estoy en la pagina de inicio de gurubank
    Cuando ingreso mis credenciales
      | usuario         | clave         |
      | mngr347054      | equmUrU       |
    Y lleno los campos de registro para cliente
    Entonces  valido la presencia de un mensaje de exito

  @secondTest
  Escenario: Registrar nuevo cliente en guru99

    Dado  selecciono abrir nueva cuenta
    Cuando  lleno todos los campos requeridos
    Entonces valido la presencia de un mensaje diciendo cuenta creada exitosamente