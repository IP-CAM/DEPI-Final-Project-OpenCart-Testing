package org.agaafar;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class PageBase {
        WebDriver driver;
        public static long Wait = 60;
        public PageBase(WebDriver driver){
            this.driver = driver;
        }
        public void waitTimeToBeClickable(By element) {
            WebDriverWait wait;
            wait = new WebDriverWait(driver,Wait);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        public void waitTimeToBeVisible(By element){
            WebDriverWait wait;
            wait = new WebDriverWait(driver,Wait);
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        }
        public void sendKeys(By element,String value){
            waitTimeToBeVisible(element);
            driver.findElement(element).sendKeys(value);
        }
        public void clickOnElement(By element){
            waitTimeToBeVisible(element);
            waitTimeToBeClickable(element);
            driver.findElement(element).click();
        }
}
