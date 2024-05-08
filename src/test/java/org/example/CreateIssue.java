package org.example;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CreateIssue {
    WebDriver driver;

    @BeforeEach
    void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://jira-auto.codecool.metastage.net/");
        driver.findElement(By.cssSelector("#login-form-username")).sendKeys("automation13");
        driver.findElement(By.cssSelector("#login-form-password")).sendKeys("CCAutoTest19.");
        driver.findElement(By.cssSelector("#login")).click();
        Thread.sleep(1800);
    }

    @Test
    void testCreateIssueAsToucan() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"create_link\"]")).click();
        Thread.sleep(700);
        driver.findElement(By.cssSelector("#project-field")).click();
        driver.findElement(By.xpath("//ul[@id='all-projects']/li[6]/a[@role='presentation']")).click();

        Thread.sleep(700);
        driver.findElement(By.xpath("//*[@id=\"summary\"]")).sendKeys("test summary");
        Thread.sleep(700);
        driver.findElement(By.xpath("//*[@id=\"create-issue-submit\"]")).click();
        Thread.sleep(700);
        Assertions.assertTrue(driver.findElement(By.xpath("//*[@id=\"aui-flag-container\"]/div/div/a")).isDisplayed());
        Thread.sleep(1200);
    }

    @Test
    void testCreateIssueAsJeti() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"create_link\"]")).click();
        Thread.sleep(700);
        driver.findElement(By.cssSelector("#project-field")).click();
        assertThrows(NoSuchElementException.class, () -> {
            driver.findElement(By.linkText("JETI project (JETI)")).click();
        });
    }

    @AfterEach
    void tearDown(){

        driver.quit();
    }
}
