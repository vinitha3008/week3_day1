package week3.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmDialog {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		
		//click on simple alert
		driver.findElement(By.xpath("(//span[text()='Show'])")).click();
		
		//Handling alert
		Alert simple = driver.switchTo().alert();
		System.out.println(simple.getText());
		//accept alert
		simple.accept();
		
		//click on prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//handling alert
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("welcome");
		
		Thread.sleep(2000);
		//get text from the prompt box
		System.out.println("prompt box: "+prompt.getText());
		prompt.accept();
	
		
		//clik on show button for confirmation box
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//handling alert
		Alert con = driver.switchTo().alert();
		//get text from alert box
		System.out.println(con.getText());
		con.dismiss();
		//get text from alert ui
		String s=driver.findElement(By.xpath("(//span[text()='Show'])[2]//following::span[@id='result']")).getText();
		
		System.out.println(s);
		
		
		
	}

}
