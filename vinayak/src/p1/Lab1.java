package p1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1 {
	public static void main(String[]args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=(WebDriver) new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	String url=driver.getCurrentUrl();
	System.out.println("curent url"+url);
	
	String pagetitle=driver.getTitle();
	
	if("Facebook -log in or sing up".equals(pagetitle))
	{
		System.out.println("test case passed");
	}
	else
	{
		System.out.println("test case falied");
	}
	driver.findElement(By.xpath("//*[@Id='email']")).sendKeys("vinayakparitgalataga@gmail.com");
	driver.findElement(By.xpath("//*[@Id='pass']")).sendKeys("Vinayak@2002");
	driver.findElement(By.xpath("//*[@id=\"u_0_9_Z1\"]")).click();
}
	
}
