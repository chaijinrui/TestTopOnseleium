package org.example;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * FileName：Teat1
 * Author: thinkbook-chaijinrui
 * Date: 2023/9/18
 * Time: 14:29
 * Description：
 */
public class Teat1 {


    @Test
    public void testTeat1() throws InterruptedException {
//        配置Chromedriver路径，可以不用这么配置
//        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.baidu.com");
        Thread.sleep(3000);
        chromeDriver.quit();
    }
}
