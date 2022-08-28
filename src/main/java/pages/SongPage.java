package pages;

import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.exam.driver.Driver;

import javax.swing.*;

import static selenium.exam.driver.Driver.driver;

public class SongPage extends Driver {
    Methods methods;

    public SongPage() {
        methods = new Methods();
    }
//"button.T0anrkk_QA4IAQL29get mYN_ST1TsDdC6q1k1_xs>:nth-child(1)"
    public void addSongPlayList() throws InterruptedException {
        //1.şarkı
        WebElement checkedOptions = driver.findElement(By.cssSelector("div.h4HgbO_Uu1JYg5UGANeQ"));
        Actions actions = new Actions(driver);
        actions.contextClick(checkedOptions).perform();


        WebElement addSongList = driver.findElement(By.cssSelector("ul.SboKmDrCTZng7t4EgNoM>:nth-child(7)"));
        actions.moveToElement(addSongList).perform();
        Thread.sleep(500);
        actions.clickAndHold(addSongList);

        WebElement addSongListClick = driver.findElement(By.cssSelector("div.eelA_0lUVXP3DXSyqSl6>:nth-child(3)"));
        actions.release(addSongListClick);
        actions.doubleClick(addSongListClick);
        actions.perform();
        Thread.sleep(2000);

    }

public void addSongPlayList2() throws InterruptedException {
            //2.şarkı
            WebElement checkedOptions2 = driver.findElement(By.xpath("//div[@aria-rowindex=\"3\"]"));
            Actions actions2 = new Actions(driver);
            actions2.contextClick(checkedOptions2).perform();

            Thread.sleep(500);
            WebElement addSongList2 = driver.findElement(By.cssSelector("ul.SboKmDrCTZng7t4EgNoM>:nth-child(7)"));
            actions2.moveToElement(addSongList2).perform();
            actions2.clickAndHold(addSongList2);
            Thread.sleep(500);

            WebElement addSongListClick2 = driver.findElement(By.cssSelector("div.eelA_0lUVXP3DXSyqSl6>:nth-child(3)"));
            actions2.release(addSongListClick2);
            actions2.doubleClick(addSongListClick2);
            actions2.perform();
            Thread.sleep(2000);


        }
    public void addSongPlayList3() throws InterruptedException {
        //2.şarkı
        WebElement checkedOptions3 = driver.findElement(By.xpath("//div[@aria-rowindex=\"4\"]"));
        Actions actions3 = new Actions(driver);
        actions3.contextClick(checkedOptions3).perform();

        Thread.sleep(500);
        WebElement addSongList3 = driver.findElement(By.cssSelector("ul.SboKmDrCTZng7t4EgNoM>:nth-child(7)"));
        actions3.moveToElement(addSongList3).perform();
        actions3.clickAndHold(addSongList3);
        Thread.sleep(500);

        WebElement addSongListClick3 = driver.findElement(By.cssSelector("div.eelA_0lUVXP3DXSyqSl6>:nth-child(3)"));
        actions3.release(addSongListClick3);
        actions3.doubleClick(addSongListClick3);
        actions3.perform();
        Thread.sleep(2000);


    }


      //  actions.moveToElement(addSongList).perform();
    //    actions.click(addSongListClick);


    }




