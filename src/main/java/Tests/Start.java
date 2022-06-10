package Tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Start {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Cuarto Cuatrimestre\\Calidad Del Software\\Primer Selenium\\Primera_Automatizacion\\src\\main\\resources\\Drivers\\chromedriver.exe");
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        // Open facebook
        driver.get("http://www.facebook.com");
        // Maximize browser
        driver.manage().window().maximize();
        driver.close();
    }

}
