Feature: Loguearse en la pagina de prueba

  Scenario: Login
    Given que ingreso a la pagina demoguru99
    When ingreso los datos de usuario "qualityadmin" y contrasena "pass1"
    Then valido el ingreso exitoso