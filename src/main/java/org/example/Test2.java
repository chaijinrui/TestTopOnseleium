package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

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
        //xpath定位  //*[@id="app"]/div[2]/form/div[1]/div/div/div[1]/input
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/form/div[1]/div/div/div[1]/input")).sendKeys("xunshitiankong@163.com");
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/form/div[2]/div/div/div[1]/input")).sendKeys("Bj@116118");
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/form/div[4]/div")).click();
        Thread.sleep(5000);
        chromeDriver.quit();
        long endTime = System.currentTimeMillis();
        System.out.println("执行时长=" + (endTime - startTime) / 1000.00 + "s");
    }
}
