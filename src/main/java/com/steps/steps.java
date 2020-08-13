package com.steps;


import com.login.doLogin;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class steps {
    WebDriver driver;

    @当("^我打开163网站$")
    public void openURL(){
//        System.out.println("打开163网站");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://testsaas.qingxiaoguo.com");
    }

    @并且("^在email文本框中输入\"(.*?)\"$")
    public void senkeyEmail(String email){
//        System.out.println("email文本框中输入了："+email);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input")).sendKeys(email);
    }

    @并且("^在密码框中输入\"([^\"]*)\"$")
    public void senkeyPwd(String pwd){
//        System.out.println("密码框中输入了："+pwd);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div/input")).sendKeys(pwd);
    }

    @当("^点击登录按钮$")
    public void clickLogin(){
//        System.out.println("点击登陆");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]")).click();
    }

    @那么("^登陆成功$")
    public void successLogin(){
        System.out.println("登陆成功");
    }

    @当("^我打开网址$")
    public void open(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://testsaas.qingxiaoguo.com");
    }

    @并且("^在用户文本框中输入\"(.*?)\"$")
    public void sendkeys(String user){
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div[2]/div/input")).sendKeys(user);
    }






    @当("^打开联合医产网址$")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\青小果6\\fireFoxDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://testsaas.qingxiaoguo.com");
    }

    @假如("^用账号\"(.*?)\"和密码\"(.*?)\"登录$")
    public void login(String user1, String pwd){
        doLogin a=new doLogin();
        a.executelogin(driver,user1,pwd);
    }


//    @并且("^在email文本框中输入\"15110403429@163.com\"$")
//    public void user(){
//        System.out.println("在email文本框中输入\"15110403429@163.com\"");
//    }
//    @并且("^在密码框中输入\"sn18235553949\"$")
//    public void pwd(){
//        System.out.println("在密码框中输入\"sn18235553949\"");
//    }
//    @当("^点击登录按钮$")
//    public void login(){
//        System.out.println("点击登录按钮");
//    }
//    @那么("^登陆成功$")
//    public void succeed(){
//        System.out.println("登陆成功");
//    }



}
