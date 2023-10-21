package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";

    @Given(value = "Halaman login SauceDemo")
    public void HalamanloginSauceDemo(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.get(baseUrl);

        String loginPageAssert = driver.findElement(By.xpath("//h2[contains(text(),'testing)]")).getText();
        Assert.assertEquals(loginPageAssert,"testing");
    }

    @When("Input username")
    public void InputUsername(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And(value = "Input password")
    public void  InputPassword(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("Klik tombol login")
    public void klikTombolLogin() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("User ke halaman dashboard")
    public void userKeHalamanDashboard() {
        driver.findElement(By.xpath("//div[contains(text(),'dashboard')]"));
    }

    @Then("User menerima pesan gagal login")
    public void userMenerimaPesanGagalLogin() {
    }

    @And("Input Invalid password")
    public void inputInvalidPassword() {
    }

}
