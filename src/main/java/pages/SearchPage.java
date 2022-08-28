package pages;

import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import selenium.exam.driver.Driver;

public class SearchPage extends Driver {

    Methods methods;

    public SearchPage() {
        methods = new Methods();
    }

    public void searchTabClick() throws InterruptedException {
        By searchClick=By.cssSelector("ul.RSg3qFREWrqWCuUvDpJR>:nth-child(2)");
        methods.clickElement(searchClick);
        Thread.sleep(200);

    }
    public void searchTextSet() throws InterruptedException {
        WebElement searchText=driver.findElement(By.xpath("//input[@data-testid=\"search-input\"]"));
        searchText.click();
        searchText.sendKeys("Daft Punk");
        searchText.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

    }
    public void songClick() throws InterruptedException {
        By song=By.cssSelector("div.KjPUGV8uMbl_0bvk9ePv>:nth-child(2)");
        methods.clickElement(song);
        Thread.sleep(5000);
    }




}
