package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class base {
	private WebDriver driver;

	public void openPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/app.php");

	}

	public void setMake(String i) {
		WebElement selectMake = driver
				.findElement(By.xpath("//div[@class='field idealforms-field idealforms-field-select-one invalid']"));
		WebElement opcaoMake = selectMake.findElement(By.id("make"));
		new Select(opcaoMake).selectByValue(i);
	}

	public void setModel(String i) {
		WebElement selectModel = driver
				.findElement(By.xpath("//div[@class='field idealforms-field idealforms-field-select-one']"));
		WebElement opcaoModel = selectModel.findElement(By.id("model"));
		new Select(opcaoModel).selectByValue(i);
	}

	public void setCylinderCapacity(CharSequence i) {
		driver.findElement(By.id("cylindercapacity")).sendKeys(i);
	}

	public void setEnginePerformance(CharSequence i) {
		driver.findElement(By.id("engineperformance")).sendKeys(i);
	}

	public void setDataManufacture(CharSequence i) {
		driver.findElement(By.id("dateofmanufacture")).sendKeys(i);
	}

	public void setNumberSeats(String i) {
		WebElement selectNumberSeats = driver
				.findElement(By.xpath("//div[@class='field idealforms-field idealforms-field-select-one']"));
		WebElement opcaoNumberSeats = selectNumberSeats.findElement(By.id("numberofseats"));
		new Select(opcaoNumberSeats).selectByValue(i);
	}

	public void setRightDrive(String i) {
		if (i == "Yes") {
			driver.findElement(By.cssSelector(
					"#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1)"))
					.click();
		} else if (i == "No") {
			driver.findElement(By.cssSelector(
					"#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2)"))
					.click();
		}
	}

	public void setNumberSeatsMotorcycle(String i) {
		WebElement selectNumberSeatsMotorcycle = driver
				.findElement(By.xpath("//div[@class='field idealforms-field idealforms-field-select-one']"));
		WebElement opcaoNumberSeatsMotorcycle = selectNumberSeatsMotorcycle
				.findElement(By.id("numberofseatsmotorcycle"));
		new Select(opcaoNumberSeatsMotorcycle).selectByValue(i);
	}

	public void setFuelType(String i) {
		WebElement selectFuelType = driver
				.findElement(By.xpath("//div[@class='field idealforms-field idealforms-field-select-one']"));
		WebElement opcaoFuelType = selectFuelType.findElement(By.id("fuel"));
		new Select(opcaoFuelType).selectByValue(i);
	}

	public void setPayload(CharSequence i) {
		driver.findElement(By.id("payload")).sendKeys(i);
	}

	public void setWeight(CharSequence i) {
		driver.findElement(By.id("totalweight")).sendKeys(i);
	}

	public void setListPrice(CharSequence i) {
		driver.findElement(By.id("listprice")).sendKeys(i);
	}

	public void setLicensePlateNumber(CharSequence i) {
		driver.findElement(By.id("licenseplatenumber")).sendKeys(i);
	}

	public void setAnnualMileage(CharSequence i) {
		driver.findElement(By.id("annualmileage")).sendKeys(i);
	}

	public void nextVehicleData() {
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}

	public void setFirstName(String nome) {
		driver.findElement(By.id("firstname")).sendKeys(nome);
	}

	public void setLastName(String sobrenome) {
		driver.findElement(By.id("lastname")).sendKeys(sobrenome);
	}

	public void setDateBirth(String dataNasc) {
		driver.findElement(By.id("birthdate")).sendKeys(dataNasc);
	}

	public void setGender(String gender) {
		if (gender == "Male") {
			driver.findElement(By.cssSelector(
					"#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1)"))
					.click();
		} else if (gender == "Female") {
			driver.findElement(By.cssSelector(
					"#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2)"))
					.click();
		}
	}

	public void setStreetAdress(String endereco) {
		driver.findElement(By.id("streetaddress")).sendKeys(endereco);
	}

	public void setCountry(String i) {
		WebElement selectCountry = driver
				.findElement(By.xpath("//div[@class='field idealforms-field idealforms-field-select-one']"));
		WebElement opcaoCountry = selectCountry.findElement(By.id("country"));
		new Select(opcaoCountry).selectByValue(i);
	}

	public void setZipCode(String cep) {
		driver.findElement(By.id("zipcode")).sendKeys(cep);
	}

	public void setCity(String cidade) {
		driver.findElement(By.id("city")).sendKeys(cidade);
	}

	public void setOccupation(String i) {
		WebElement selectOccupation = driver
				.findElement(By.xpath("//div[@class='field idealforms-field idealforms-field-select-one']"));
		WebElement opcaoOccupation = selectOccupation.findElement(By.id("occupation"));
		new Select(opcaoOccupation).selectByValue(i);
	}

	public void setHobbiesSpeeding(String i) {
		if (i == "Yes") {
			driver.findElement(By.cssSelector(
					"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1)"))
					.click();
		}
	}

	public void setHobbiesBungeeJumping(String i) {
		if (i == "Yes") {
			driver.findElement(By.cssSelector(
					"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2)"))
					.click();
		}
	}

	public void setHobbiesCliffDiving(String i) {
		if (i == "Yes") {
			driver.findElement(By.cssSelector(
					"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(3)"))
					.click();
		}
	}

	public void setHobbiesSkydiving(String i) {
		if (i == "Yes") {
			driver.findElement(By.cssSelector(
					"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(4)"))
					.click();
		}
	}

	public void setHobbiesOther(String i) {
		if (i == "Yes") {
			driver.findElement(By.cssSelector(
					"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(5)"))
					.click();
		}
	}

	public void setWebsites(String site) {
		driver.findElement(By.id("website")).sendKeys(site);
	}

	public void nextProductData() {
		driver.findElement(By.id("nextenterproductdata")).click();
	}

	public void setStartDate(String start) {
		driver.findElement(By.id("startdate")).sendKeys(start);
	}

	public void setInsuranceSum(String i) {
		WebElement selectInsuranceSum = driver
				.findElement(By.xpath("//div[@class='field idealforms-field idealforms-field-select-one']"));
		WebElement opcaoInsuranceSum = selectInsuranceSum.findElement(By.id("insurancesum"));
		new Select(opcaoInsuranceSum).selectByValue(i);
	}

	public void setMeritRating(String i) {
		WebElement selectMeritRating = driver
				.findElement(By.xpath("//div[@class='field idealforms-field idealforms-field-select-one']"));
		WebElement opcaoMeritRating = selectMeritRating.findElement(By.id("meritrating"));
		new Select(opcaoMeritRating).selectByValue(i);
	}

	public void setDamageInsurance(String i) {
		WebElement selectDamageInsurance = driver
				.findElement(By.xpath("//div[@class='field idealforms-field idealforms-field-select-one']"));
		WebElement opcaoDamageInsurance = selectDamageInsurance.findElement(By.id("damageinsurance"));
		new Select(opcaoDamageInsurance).selectByValue(i);
	}

	public void setOptionalProductsEuroProtetion(String i) {
		if (i == "Yes") {
			driver.findElement(By.cssSelector(
					"#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span"))
					.click();
		}
	}

	public void setOptionalLegalDefenseInsurance(String i) {
		if (i == "Yes") {
			driver.findElement(By.cssSelector(
					"#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span"))
					.click();
		}
	}

	public void setCourtesyCar(String i) {
		WebElement selectCourtesyCar = driver
				.findElement(By.xpath("//div[@class='field idealforms-field idealforms-field-select-one']"));
		WebElement opcaoCourtesyCar = selectCourtesyCar.findElement(By.id("courtesycar"));
		new Select(opcaoCourtesyCar).selectByValue(i);
	}

	public void nextSelectPriceOption() {
		driver.findElement(By.id("nextselectpriceoption")).click();
	}

	public void setPriceOption(String i) {
		if (i == "Silver") {
			driver.findElement(By.cssSelector(".choosePrice:nth-child(1) > .ideal-radio")).click();
		} else if (i == "Gold") {
			driver.findElement(By.cssSelector(".choosePrice:nth-child(2) > .ideal-radio")).click();
		} else if (i == "Platinum") {
			driver.findElement(By.cssSelector(".choosePrice:nth-child(3) > .ideal-radio")).click();
		} else if (i == "Ultimate") {
			driver.findElement(By.cssSelector(".choosePrice:nth-child(4) > .ideal-radio")).click();
		}
	}

	public void nextSendQuote() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.id("nextsendquote")).click();
	}

	public void setEmail(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
	}

	public void setPhone(String phone) {
		driver.findElement(By.id("phone")).sendKeys(phone);
	}

	public void setUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	public void setPassword(String pword) {
		driver.findElement(By.id("password")).sendKeys(pword);
	}

	public void setConfirmPassword(String pword) {
		driver.findElement(By.id("confirmpassword")).sendKeys(pword);
	}

	public void nextSendEmail() {

		driver.findElement(By.xpath("//*[@id=\"sendemail\"]")).click();
	}

	public void confirmSucessMessage() throws InterruptedException {
		Thread.sleep(10000);
		{
			WebElement element = driver.findElement(By.id("sendemail"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		driver.findElement(By.cssSelector(".confirm")).click();

	}

	public void closePage() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
