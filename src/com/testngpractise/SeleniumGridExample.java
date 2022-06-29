package com.testngpractise;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridExample {
	
	public static RemoteWebDriver driver;
	@Test
	
	public void OpenBrowser() throws MalformedURLException
	
	{
//String url =  "http://10.0.0.248:5566/wd/hub";

URL url = new URL("http://10.0.0.248:5566/wd/hub");
       
DesiredCapabilities caps = DesiredCapabilities.chrome();
caps.setPlatform(Platform.WINDOWS);
caps.setBrowserName("chrome");

//driver = new RemoteWebDriver(new URL(url), caps);
ChromeOptions options = new ChromeOptions();
driver = new RemoteWebDriver(url, options);

driver.get("https://the-internet.herokuapp.com/");

	}

}
