Feature: Autenticar
  Yo como usuario de GitHub quiero autenticarme para porder hacer uso de las diferentes funcionalidades de la plataforma

  Scenario: Autenticar usuario con cuenta gratuita
    Given "Cesar" quiere autenticarse
    When Cesar se autentica
    Then Cesar debe ver la pagina de inicio