package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.isro.gov.in/Chandrayaan3.html");

	}

}
