package org.example;

import org.junit.jupiter.api.Test;
import pages.*;
import selenium.exam.driver.Driver;

/**
 * Hello world!
 *
 */
public class SpotifyTest extends Driver
{
     GuestPage guestPage;
     LoginPage loginPage;
     HomePage homePage;
     CreatePlayList createPlayList;
     SearchPage searchPage;
     SongPage songPage;

     PlayList playList;

    @Test
    public void loginTest() throws InterruptedException {
        init();
        guestPage.controlGuestPage();
        guestPage.clickLoginButton();
        loginPage.controlLoginPage();
        loginPage.validLogin("yunussahabt@gmail.com","Testinium2022");
        homePage.loginControl("YunusB");
        createPlayList.clickCreatePlayList();
        createPlayList.renamePlayList();
        createPlayList.renameSave();
        createPlayList.renameSaveController("Spotify Listem");
        searchPage.searchTabClick();
        searchPage.searchTextSet();
        searchPage.songClick();
        songPage.addSongPlayList();
        songPage.addSongPlayList2();
        songPage.addSongPlayList3();
        playList.clickPlayListItem();;
        playList.listenSecondMusic();





    }




    public void init(){

        guestPage = new GuestPage();
        loginPage = new LoginPage();
        homePage = new HomePage();
        createPlayList=new CreatePlayList();
        searchPage=new SearchPage();
        songPage=new SongPage();
        playList=new PlayList();
    }






}
