package pages;

import methods.Methods;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import selenium.exam.driver.Driver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreatePlayList extends Driver {
    Methods methods;
    Actions actions=new Actions(driver);

    public CreatePlayList(){
        methods=new Methods();



    }
      public void clickCreatePlayList() throws InterruptedException {

        By clickPlaylist=By.cssSelector("button[data-testid=\"create-playlist-button\"]");
        assertTrue(methods.isElementClickable(clickPlaylist, 200));
        methods.clickElement(clickPlaylist);
        Thread.sleep(5000);



      }
      public void renamePlayList() throws InterruptedException {
      By clickList=By.xpath(
              "//div[@class='GlueDropTarget GlueDropTarget--albums GlueDropTarget--tracks GlueDropTarget--local-tracks GlueDropTarget--episodes GlueDropTarget--playlists GlueDropTarget--folders']");
          assertTrue(methods.isElementClickable(clickList, 200));
          methods.clickElement(clickList);


          By clickOtherOptions=By.cssSelector("button[data-testid=\"more-button\"]");
          assertTrue(methods.isElementClickable(clickOtherOptions, 200));
          methods.clickElement(clickOtherOptions);

          By clickRenameButton=By.cssSelector("ul.SboKmDrCTZng7t4EgNoM>:nth-child(4)");
          methods.clickElement(clickRenameButton);

          WebElement clickRenameTextWeb=driver.findElement(By.cssSelector("input.f0GjZQZc4c_bKpqdyKbq"));
          clickRenameTextWeb.clear();
          clickRenameTextWeb.sendKeys("Spotify Listem");



         // By clickRenameText=By.id("//input[@data-testid=\"playlist-edit-details-name-input\"]");
          //methods.clear(clickRenameText);




          Thread.sleep(5000);

      }
      public void renameSave() throws InterruptedException {
        By renameSaveClick=By.cssSelector("button[data-testid=\"playlist-edit-details-save-button\"]");
        methods.clickElement(renameSaveClick);
          Thread.sleep(5000);
      }

      public void renameSaveController(String renameText) throws InterruptedException {

        String renameSaveText=methods.getText(By.xpath("//span[@class=\"Type__TypeElement-goli3j-0 gJFKvJ VjIb8SfYTkc4wMpqqj3f\"]"));
          Assertions.assertEquals(renameText,renameSaveText);
          Thread.sleep(200);

      }

}


