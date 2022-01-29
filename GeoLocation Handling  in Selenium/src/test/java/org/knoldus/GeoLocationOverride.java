package org.knoldus;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


public class GeoLocationOverride extends Browser{

    @Test
    public void  check() throws IOException, InterruptedException {

        ChromeDriver driver = (ChromeDriver) initializeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Map<String, Object> geolocation = new HashMap<>();
        geolocation.put("latitude", 28.5433176);
        geolocation.put("longitude",77.4048783);
        geolocation.put("accuracy", 5);
        driver.executeCdpCommand("Emulation.setGeolocationOverride", geolocation);
        driver.get("https://www.google.com/maps");
        driver.findElement(By.cssSelector("#pWhrzc-mylocation")).click();

        Thread.sleep(4000);
        driver.quit();
    }
}
