package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * FileName：TestClassName1
 * Author: sns-chaijinrui
 * Date: 2023/9/26
 * Time: 17:19
 * Description：
 */
public class TestClassName1 {
    @Test
    public void test() throws InterruptedException {

        long startTime = System.currentTimeMillis();
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://app.toponad.com/m/login");
//       登录
        //xpath定位  //*[@id="app"]/div[2]/form/div[1]/div/di v/div[1]/input
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/form/div[1]/div/div/div[1]/input")).sendKeys("xunshitiankong@163.com");
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/form/div[2]/div/div/div[1]/input")).sendKeys("Bj@116118");
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/form/div[4]/div")).click();

//todo 未经确认的定位横成功
        chromeDriver.findElementByCssSelector(".mediation").click();

        chromeDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div/div/div[1]/div/div")).click();
        chromeDriver.findElementByXPath("/html/body/div[1]/div[2]/div[2]/section/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/table/tbody[1]/tr[2]/td[4]/div/div/div/div/span").click();
//        关闭 按钮
        chromeDriver.findElementByXPath("/html/body/div[2]/div/div[3]/div/button").click();
    }
}
