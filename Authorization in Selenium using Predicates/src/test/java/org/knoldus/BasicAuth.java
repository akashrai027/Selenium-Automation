package org.knoldus;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;

import java.io.IOException;
import java.net.URI;
import java.time.Duration;
import java.util.function.Predicate;

public class BasicAuth extends  Browser{

    @Test
    public void check() throws IOException {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Predicate, consumer, function
        //Predicate<URI> uriPredicate = uri -> uri.getHost().contains("jigsaw.w3.org");
        Predicate<URI> uriPredicate = uri -> uri.getHost().contains("jigsaw.w3.org");

        //Cast driver into HasAuthentication class
        ((HasAuthentication)driver).register(uriPredicate, UsernameAndPassword.of("guest", "guest"));

        driver.get("https://jigsaw.w3.org/HTTP/");
        driver.findElement(By.cssSelector("a[href*='Basic/']")).click();

        driver.quit();

    }
}
