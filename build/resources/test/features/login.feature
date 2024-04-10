#language:es
  Característica: Inicio de sesion
    @smokeTest
    Esquema del escenario: Inicio de sesion en guru99

      Dado que estoy en la pagina de inicio de gurubank
      Cuando ingreso mis credenciales
        | usuario   | clave   |
        | <Usuario> | <Clave> |

      Y lleno los campos de registro para cliente
      Entonces  valido la presencia de un mensaje de exito

      Ejemplos:
        | Usuario         | Clave         |
        | mngr347054      | equmUrU       |


