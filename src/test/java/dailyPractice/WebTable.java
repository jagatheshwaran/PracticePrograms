package dailyPractice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	static WebDriver driver;

	public static void main(String ar[]) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/ECLIPSE%20ENV/WorkSpace/From_Old_WorkSpace/SeleniumBasics/TestResources/WebTable.html");

		WebElement table = driver.findElement(By.xpath("//table"));

		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		List<WebElement> allColumns = table.findElements(By.tagName("td"));

		System.out.println("All rows " + allRows.size());
		System.out.println("All columns " + allColumns.size());

		for (WebElement row : allRows) {

			List<WebElement> cells = row.findElements(By.tagName("td"));

			for (WebElement cell : cells) {

				if (cell.getText().equals("UK")) {

					System.out.println(cell.getText());
					System.out.println(row.getText());
					// cell.findElement(By.tagName("a")).click();
				}
			}
		}
		driver.close();
	}
}
