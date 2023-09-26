package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;

/**
 * FileName：Test2
 * Author: sns-chaijinrui
 * Date: 2023/9/20
 * Time: 12:49
 * Description：进行组的删除和添加
 * 先全部用xpath定位，看看耗时
 */
public class Test2 {
    @Test
    public void test2() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://app.toponad.com/m/login");
//       登录
        //xpath定位  //*[@id="app"]/div[2]/form/div[1]/div/di v/div[1]/input
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/form/div[1]/div/div/div[1]/input")).sendKeys("xunshitiankong@163.com");
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/form/div[2]/div/div/div[1]/input")).sendKeys("Bj@116118");
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/form/div[4]/div")).click();
        Thread.sleep(2000);
        chromeDriver.findElementByXPath("//*[@id=\"app\"]/div[2]/div[1]/div/div/ul/div[4]/a/li/span").click();//
        Thread.sleep(3000);
        chromeDriver.findElementByXPath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[1]/div[1]/div/div/div/div[2]/div/div/span/span/div/div/div/div/div/div/span").click();
        Thread.sleep(3000);
//        选择应用
//        chromeDriver.findElementByClassName("el-input__inner").sendKeys("el-input__inner");
//        搜索
        chromeDriver.findElementByClassName("label-box").click();
//        adx开关
        chromeDriver.findElementByXPath("//*[@id=\"app\"]/div[2]/div[2]/section/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/table/tbody[1]/tr[2]/td[4]/div/div/div/div/span").click();
        Thread.sleep(3000);

        chromeDriver.quit();
        long endTime = System.currentTimeMillis();
        System.out.println("执行时长=" + (endTime - startTime) / 1000.00 + "s");
    }
}
