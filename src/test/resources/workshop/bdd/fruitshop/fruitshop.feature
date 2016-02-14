Feature: Titre de la feature - en langage non ambigu - à remplacer

    Scenario: Premier scenario fruitshop
    Given le prix des pommes est 100
      And le client prend 1 lot de pommes
    When le client passe a la caisse
    Then il paye 100
    
    Scenario: Premier scenario fruitshop
    Given le prix des pommes est 0
      And le client prend 1 lot de pommes
    When le client passe a la caisse
    Then il paye 0
    
    Scenario: Premier scenario fruitshop
    Given le prix des pommes est 100
      And le client prend 0 lot de pommes
    When le client passe a la caisse
    Then il paye 0
    
    Scenario: Premier scenario fruitshop
    Given le prix des pommes est 100
      And le client prend 1 lot de pommes
      And le prix des bannanes est 150
      And le client prend 1 lot de bannanes 
    When le client passe a la caisse
    Then il paye 250