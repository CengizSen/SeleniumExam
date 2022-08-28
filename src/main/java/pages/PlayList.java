package pages;

import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.exam.driver.Driver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayList extends Driver {
    Methods methods;

    public PlayList(){
        methods=new Methods();

    }


    public void clickPlayListItem() throws InterruptedException {
        By clickList=By.xpath(
                "//div[@class='GlueDropTarget GlueDropTarget--albums GlueDropTarget--tracks GlueDropTarget--local-tracks GlueDropTarget--episodes GlueDropTarget--playlists GlueDropTarget--folders']");
        assertTrue(methods.isElementClickable(clickList, 200));
        methods.clickElement(clickList);
        Thread.sleep(2000);


    }

    public void listenSecondMusic() throws InterruptedException {
        WebElement element=driver.findElement(By.xpath("//div[@aria-rowindex=\"3\"]"));
        Actions actions=new Actions(driver);
        actions.click(element);
        Thread.sleep(10000);


    }


}
