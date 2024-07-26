import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class FreeCours {
    @Test
    public void whatProfession() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.get("https://skillfactory.ru/free-events");
            Thread.sleep(2000);

            WebElement testsPRO = driver.findElement(By.xpath("//a[text()='Пройти бесплатно']"));
            testsPRO.click();


            String title = driver.getTitle();
            Assert.assertEquals(title, "Какая удаленная профессия ваша?");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }

    }
    @Test
    public void popular() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.get("https://skillfactory.ru/free-events");
            Thread.sleep(2000);

            WebElement testsPRO = driver.findElement(By.xpath("//div[text()='Популярное']"));
            testsPRO.click();


            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/free-events?tfc_storepartuid[722553837]=%D0%9F%D0%BE%D0%BF%D1%83%D0%BB%D1%8F%D1%80%D0%BD%D0%BE%D0%B5&tfc_div=:::");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }

    }
    @Test
    public void careerGuidance() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.get("https://skillfactory.ru/free-events");
            Thread.sleep(2000);

            WebElement career = driver.findElement(By.xpath("//div[text()='Профориентация']"));
            career.click();


            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/free-events?tfc_storepartuid[722553837]=%D0%9F%D1%80%D0%BE%D1%84%D0%BE%D1%80%D0%B8%D0%B5%D0%BD%D1%82%D0%B0%D1%86%D0%B8%D1%8F&tfc_div=:::");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }

    }
    @Test
    public void freeSafety() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.get("https://skillfactory.ru/free-events");
            Thread.sleep(2000);

            WebElement safety = driver.findElement(By.xpath("//div[text()='Безопасность']"));
            safety.click();

            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/free-events?tfc_storepartuid[722553837]=%D0%91%D0%B5%D0%B7%D0%BE%D0%BF%D0%B0%D1%81%D0%BD%D0%BE%D1%81%D1%82%D1%8C&tfc_div=:::");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void freeAnalitica() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.get("https://skillfactory.ru/free-events");
            Thread.sleep(2000);

            WebElement FAnalitic = driver.findElement(By.xpath("//div[text()='Аналитика']"));
            FAnalitic.click();

            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/free-events?tfc_storepartuid[722553837]=%D0%90%D0%BD%D0%B0%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%B0&tfc_div=:::");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void freeDataSince() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.get("https://skillfactory.ru/free-events");
            Thread.sleep(2000);

            WebElement DS = driver.findElement(By.xpath("//div[text()='Data Science']"));
            DS.click();

            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/free-events?tfc_storepartuid[722553837]=Data+Science&tfc_div=:::");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void freeProg() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.get("https://skillfactory.ru/free-events");
            Thread.sleep(2000);

            WebElement progF = driver.findElement(By.xpath("//div[text()='Разработка']"));
            progF.click();

            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/free-events?tfc_storepartuid[722553837]=%D0%A0%D0%B0%D0%B7%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%BA%D0%B0&tfc_div=:::");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void freeManagmetn() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.get("https://skillfactory.ru/free-events");
            Thread.sleep(2000);

            WebElement managF = driver.findElement(By.xpath("//div[text()='Менеджмент в IT']"));
            managF.click();

            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/free-events?tfc_storepartuid[722553837]=%D0%9C%D0%B5%D0%BD%D0%B5%D0%B4%D0%B6%D0%BC%D0%B5%D0%BD%D1%82+%D0%B2+IT&tfc_div=:::");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void freeTesting() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.get("https://skillfactory.ru/free-events");
            Thread.sleep(2000);

            WebElement testingF = driver.findElement(By.xpath("//div[text()='Тестирование']"));
            testingF.click();

            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/free-events?tfc_storepartuid[722553837]=%D0%A2%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5&tfc_div=:::");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void freeNeuro() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.get("https://skillfactory.ru/free-events");
            Thread.sleep(2000);

            WebElement neuro = driver.findElement(By.xpath("//div[text()='Нейросети']"));
            neuro.click();

            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/free-events?tfc_storepartuid[722553837]=%D0%9D%D0%B5%D0%B9%D1%80%D0%BE%D1%81%D0%B5%D1%82%D0%B8&tfc_div=:::");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void freeIi() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.get("https://skillfactory.ru/free-events");
            Thread.sleep(2000);

            WebElement ii = driver.findElement(By.xpath("//div[text()='Искусственный интеллект']"));
            ii.click();

            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/free-events?tfc_storepartuid[722553837]=%D0%98%D1%81%D0%BA%D1%83%D1%81%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9+%D0%B8%D0%BD%D1%82%D0%B5%D0%BB%D0%BB%D0%B5%D0%BA%D1%82&tfc_div=:::");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void search() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.get("https://skillfactory.ru/free-events");
            Thread.sleep(2000);

            WebElement Search = driver.findElement(By.xpath("//input[@name='query']"));
            Search.sendKeys("Тест", Keys.ENTER);

            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/free-events?tfc_query[722553837]=%D0%A2%D0%B5%D1%81%D1%82&tfc_div=:::");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void Xray() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get("https://skillfactory.ru/free-events");
            Thread.sleep(2000);

            WebElement phone = driver.findElement(By.xpath("//input[@name='tildaspec-phone-part[]']"));
            WebElement mail = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
            phone.sendKeys("9999999999");
            mail.sendKeys("A@gmail.com", Keys.ENTER);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
}
