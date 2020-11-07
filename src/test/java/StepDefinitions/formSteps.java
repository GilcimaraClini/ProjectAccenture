package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class formSteps extends base {

	@Given("Ser um usurio e estar na pagina {string}")
	public void ser_um_usurio_e_estar_na_pagina(String string) {
		openPage();
	}

	@When("preencher o campo make")
	public void preencher_o_campo_make() {
		setMake("Audi");
	}

	@And("preencher o campo Model")
	public void preencher_o_campo_model() {
		setModel("Scooter");
	}

	@And("preencher o campo Cylinder Capacity")
	public void preencher_o_campo_cylinder_capacity() {
		setCylinderCapacity("1234");
	}

	@And("preencher o campo Engine Performance")
	public void preencher_o_campo_engine_performance() {
		setEnginePerformance("1000");
	}

	@And("preencher o campo Data of Manufacture")
	public void preencher_o_campo_data_of_manufacture() {
		setDataManufacture("10/10/1980");
	}

	@And("preencher o campo Number of Seats")
	public void preencher_o_campo_number_of_seats() {
		setNumberSeats("2");
	}

	@And("preencher o campo Right Hand Drive")
	public void preencher_o_campo_right_hand_drive() {
		setRightDrive("No");
	}

	@And("preencher o campo Number of Seats Motorcycle")
	public void preencher_o_campo_number_of_seats_motorcycle() {
		setNumberSeatsMotorcycle("1");
	}

	@And("preencher o campo Fuel Type")
	public void preencher_o_campo_fuel_type() {
		setFuelType("Diesel");
	}

	@And("preencher o campo Payload")
	public void preencher_o_campo_payload() {
		setPayload("999");
	}

	@And("preencher o campo Total Weight")
	public void preencher_o_campo_total_weight() {
		setWeight("1234");
	}

	@And("preencher o campo List Price")
	public void preencher_o_campo_list_price() {
		setListPrice("99999");
	}

	@And("preencher o campo License Plate Number")
	public void preencher_o_campo_license_plate_number() {
		setLicensePlateNumber("ABC123");
	}

	@And("preencher o campo Annual Mileage")
	public void preencher_o_campo_annual_mileage() {
		setAnnualMileage("99999");
	}

	// final pagina 1
	@And("clicar no botao Next Vehicle Data")
	public void clicar_no_botao_next_vehicle_data() {
		nextVehicleData();
	}

	@And("preencher o campo First Name")
	public void preencher_o_campo_first_name() {
		setFirstName("Jose");
	}

	@And("preencher o campo Last Name")
	public void preencher_o_campo_last_name() {
		setLastName("Silva");
	}

	@And("preencher o campo Date of Birth")
	public void preencher_o_campo_date_of_birth() {
		setDateBirth("10/10/1957");
	}

	@And("preencher o campo Gender")
	public void preencher_o_campo_gender() {
		setGender("Female");
	}

	@And("preencher o campo Street Adress")
	public void preencher_o_campo_street_adress() {
		setStreetAdress("Avenida Brasil");
	}

	@And("preencher o campo Country")
	public void preencher_o_campo_country() {
		setCountry("Brazil");
	}

	@And("preencher o campo Zip Code")
	public void preencher_o_campo_zip_code() {
		setZipCode("13220000");
	}

	@And("preencher o campo City")
	public void preencher_o_campo_city() {
		setCity("Sao Paulo");
	}

	@And("preencher o campo Occupation")
	public void preencher_o_campo_occupation() {
		setOccupation("Employee");
	}

	@And("preencher o campo Hobbies")
	public void preencher_o_campo_hobbies() { // "Yes" or "No".
		setHobbiesSpeeding("Yes");
		setHobbiesBungeeJumping("No");
		setHobbiesCliffDiving("Yes");
		setHobbiesSkydiving("No");
		setHobbiesOther("No");
	}

	@And("preencher o campo Websites")
	public void preencher_o_campo_websites() {
		setWebsites("www.google.com");
	}

	@And("clicar no botao Next Enter Product Data")
	public void clicar_no_botao_next_enter_product_data() {
		nextProductData();
	}

	@And("preencher o campo Start Date")
	public void preencher_o_campo_start_date() {
		setStartDate("10/01/2021");
	}

	@And("preencher o campo Insurance Sum")
	public void preencher_o_campo_insurance_sum() {
		setInsuranceSum("3000000");
	}

	@And("preencher o campo Merit Rating")
	public void preencher_o_campo_merit_rating() {
		setMeritRating("Bonus 1");
	}

	@And("preencher o campo Damage Insurance")
	public void preencher_o_campo_damage_insurance() {
		setDamageInsurance("No Coverage");
	}

	@And("preencher o campo Optional Products")
	public void preencher_o_campo_optional_products() { // "Yes" or "No".
		setOptionalProductsEuroProtetion("Yes");
		setOptionalLegalDefenseInsurance("Yes");
	}

	@And("preencher o campo Courtesy Car")
	public void preencher_o_campo_courtesy_car() {
		setCourtesyCar("No");
	}

	@And("clicar no botao Next Select Price Option")
	public void clicar_no_botao_next_select_price_option() {
		nextSelectPriceOption();
	}
	@And("selecionar o campo Price Option")
	public void selecionar_o_campo_price_option() { // "Silver", "Gold", "Platinum" or "Ultimate"
		setPriceOption("Gold");
	}
	@And("clicar no botao Next Send Quote")
	public void clicar_no_botao_next_send_quote() {
		nextSendQuote();
	}

	@And("preencher o campo Email")
	public void preencher_o_campo_email() {
	setEmail("joaosilva@email.com");
	}

	@And("preencher o campo Phone")
	public void preencher_o_campo_phone() {
	 setPhone("12345678");
	}

	@And("preencher o campo Username")
	public void preencher_o_campo_username() {
	 setUsername("username");
	}

	@And("preencher o campo Password")
	public void preencher_o_campo_password() {
	   setPassword("Abc1234");
	}

	@And("preencher o campo Confirm Password")
	public void preencher_o_campo_confirm_password() {
		 setConfirmPassword("Abc1234");
	}
	@And("clicar no botao Next Send Email")
	public void clicar_no_botao_next_send_email() {
		nextSendEmail();
	}

	@Then("clicar no botao Sucess")
	public void clicar_no_botao_sucess() throws InterruptedException {
		confirmSucessMessage();
		closePage();
	}


}
