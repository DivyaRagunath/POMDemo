package pageFactoryDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class NewTours {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Login l=PageFactory.initElements(driver, Login.class);
		BookingTickets b=l.demoLogin();
		Logout logout= b.demoBookingTickets1("oneway");
		logout.demoSignOff();
		driver.quit();
	}

}
