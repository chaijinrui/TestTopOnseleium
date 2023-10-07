package org.example.tools;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * FileName：Tools
 * Author: sns-chaijinrui
 * Date: 2023/10/7
 * Time: 15:46
 * Description：工具类
 */

/*
测试类：元素是否存在
 */
public class  Tools {
    @Test
    public static Boolean check(WebDriver driver, By seletor) {
        try {
            driver.findElement(seletor);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }
}
