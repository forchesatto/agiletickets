package br.com.caelum.agiletickets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleBusca {

	public static void main(String[] args) {
		WebDriver browser = new FirefoxDriver();
		
		browser.get("http://google.com.br");
		WebElement form = browser.findElement(By.id("gbqf"));
		form.findElement(By.name("q")).sendKeys("Caelum");
		form.submit();
		browser.close();
		
		browser = new FirefoxDriver();
		
		browser.get("http://google.com.br/search?q=Caelum");
		browser.findElement(By.cssSelector("h3.r a")).click();
		
	}
}
