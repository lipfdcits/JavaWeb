package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class doLogin {
    //登录功能
    public void executelogin(WebDriver driver,String user1,String pwd){
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input")).sendKeys(user1);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div/input")).sendKeys(pwd);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]")).click();
    }
}
