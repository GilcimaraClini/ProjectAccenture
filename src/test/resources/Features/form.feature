Feature: Fazer um cadastro no site.

  Scenario: Verificar se e possivel finalizar o cadastro.
    Given Ser um usurio e estar na pagina "http://sampleapp.tricentis.com/101/app.php"
    When preencher o campo make
    And preencher o campo Model
    And preencher o campo Cylinder Capacity
    And preencher o campo Engine Performance
    And preencher o campo Data of Manufacture
    And preencher o campo Number of Seats
    And preencher o campo Right Hand Drive
    And preencher o campo Number of Seats Motorcycle
    And preencher o campo Fuel Type
    And preencher o campo Payload
    And preencher o campo Total Weight
    And preencher o campo List Price
    And preencher o campo License Plate Number
    And preencher o campo Annual Mileage
    And clicar no botao Next Vehicle Data
    And preencher o campo First Name
    And preencher o campo Last Name
    And preencher o campo Date of Birth
    And preencher o campo Gender
    And preencher o campo Street Adress
    And preencher o campo Country
    And preencher o campo Zip Code
    And preencher o campo City
    And preencher o campo Occupation
    And preencher o campo Hobbies
    And preencher o campo Websites
    And clicar no botao Next Enter Product Data
    And preencher o campo Start Date
    And preencher o campo Insurance Sum
    And preencher o campo Merit Rating
    And preencher o campo Damage Insurance
    And preencher o campo Optional Products
    And preencher o campo Courtesy Car
    And clicar no botao Next Select Price Option
    And selecionar o campo Price Option
    And clicar no botao Next Send Quote
    And preencher o campo Email
    And preencher o campo Phone
    And preencher o campo Username
    And preencher o campo Password
    And preencher o campo Confirm Password
    And clicar no botao Next Send Email
    Then clicar no botao Sucess
