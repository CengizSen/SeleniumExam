package pages;
import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;


import methods.Methods;

public class GuestPage {

    Methods methods;

         public GuestPage(){
         methods=new Methods();

     }
     public void controlGuestPage(){

         assertTrue(methods.isElementVisible(By.xpath("//a[@aria-current=\"page\" and ./span[text()=\"Ana sayfa\"]]"),20));
         assertTrue(methods.isElementVisible(By.cssSelector("a[href=\"/search\"]"),20));
         assertTrue(methods.isElementVisible(By.cssSelector("a[href=\"/collection\"]"),20));
         assertTrue(methods.isElementVisible(By.xpath("//button[text()=\"Kaydol\"]"),30));
         assertTrue(methods.isElementVisible(By.cssSelector("button[data-testid=\"login-button\"]"),20));


     }
    public void clickLoginButton()  {

        By loginButton = By.cssSelector("button[data-testid=\"login-button\"]");
        assertTrue(methods.isElementClickable(loginButton, 20));
        methods.clickElement(loginButton);

    }




}
