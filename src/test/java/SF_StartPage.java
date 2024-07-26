import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class SF_StartPage {
    @Test
    public void openStartPage() {
        String s = System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://skillfactory.ru/");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Онлайн-школа Skillfactory — онлайн-обучение востребованным IT-профессиям");
    }

    @Test
    public void allCours() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://skillfactory.ru/");
            Thread.sleep(2000);

            String window1 = driver.getWindowHandle();

            WebElement AllCours = driver.findElement(By.xpath("//a[@class='directions__list-link directions__list-link_green']"));
            AllCours.click();

            Set<String> currentWindows = driver.getWindowHandles();

            String window2 = null;
            for (String window : currentWindows) {
                if (!window.equals((window1))) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/courses");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void program() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://skillfactory.ru/");
            Thread.sleep(2000);

            String window1 = driver.getWindowHandle();

            WebElement Program = driver.findElement(By.xpath("(//span[text()='Программирование'])[2]"));
            Program.click();

            Set<String> currentWindows = driver.getWindowHandles();

            String window2 = null;
            for (String window : currentWindows) {
                if (!window.equals((window1))) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/courses/programmirovanie");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void dataSince() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://skillfactory.ru/");
            Thread.sleep(2000);

            String window1 = driver.getWindowHandle();

            WebElement datS = driver.findElement(By.xpath("//a[@href='/courses/data-science']"));
            datS.click();

            Set<String> currentWindows = driver.getWindowHandles();

            String window2 = null;
            for (String window : currentWindows) {
                if (!window.equals((window1))) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/courses/data-science");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void dataAnalytics() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://skillfactory.ru/");
            Thread.sleep(2000);

            String window1 = driver.getWindowHandle();

            WebElement datA = driver.findElement(By.xpath("//a[@href='/courses/analitika-dannyh']"));
            datA.click();

            Set<String> currentWindows = driver.getWindowHandles();

            String window2 = null;
            for (String window : currentWindows) {
                if (!window.equals((window1))) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/courses/analitika-dannyh");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void testing() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://skillfactory.ru/");
            Thread.sleep(2000);

            String window1 = driver.getWindowHandle();

            WebElement tests = driver.findElement(By.xpath("//a[@href='/courses/testirovanie']"));
            tests.click();

            Set<String> currentWindows = driver.getWindowHandles();

            String window2 = null;
            for (String window : currentWindows) {
                if (!window.equals((window1))) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/courses/testirovanie");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void higherEducation() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://skillfactory.ru/");
            Thread.sleep(2000);

            String window1 = driver.getWindowHandle();

            WebElement HE = driver.findElement(By.xpath("(//span[text()='Высшее образование'])[2]"));
            HE.click();

            Set<String> currentWindows = driver.getWindowHandles();

            String window2 = null;
            for (String window : currentWindows) {
                if (!window.equals((window1))) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://new.skillfactory.ru/vyssheye-obrazovaniye");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void design() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://skillfactory.ru/");
            Thread.sleep(2000);

            String window1 = driver.getWindowHandle();

            WebElement Design = driver.findElement(By.xpath("(//span[text()='Дизайн'])[2]"));
            Design.click();

            Set<String> currentWindows = driver.getWindowHandles();

            String window2 = null;
            for (String window : currentWindows) {
                if (!window.equals((window1))) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/courses/design");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void managment() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://skillfactory.ru/");
            Thread.sleep(2000);

            String window1 = driver.getWindowHandle();

            WebElement Manag = driver.findElement(By.xpath("(//span[text()='Менеджмент'])[2]"));
            Manag.click();

            Set<String> currentWindows = driver.getWindowHandles();

            String window2 = null;
            for (String window : currentWindows) {
                if (!window.equals((window1))) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://skillfactory.ru/courses/management-i-upravlenie");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void contacts() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://skillfactory.ru/");
            Thread.sleep(2000);

            String window1 = driver.getWindowHandle();

            WebElement Manag = driver.findElement(By.xpath("//a[text()='контакты']"));
            Manag.click();

            Set<String> currentWindows = driver.getWindowHandles();

            String window2 = null;
            for (String window : currentWindows) {
                if (!window.equals((window1))) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            String title = driver.getTitle();
            Assert.assertEquals(title, "Контакты школы по работе с данными Skillfactory");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void free() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://skillfactory.ru/");
            Thread.sleep(2000);

            String window1 = driver.getWindowHandle();

            WebElement Free = driver.findElement(By.xpath("//a[text()='БЕСПЛАТНО']"));
            Free.click();

            Set<String> currentWindows = driver.getWindowHandles();

            String window2 = null;
            for (String window : currentWindows) {
                if (!window.equals((window1))) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            String title = driver.getTitle();
            Assert.assertEquals(title, "Бесплатные курсы, онлайн обучение профессиям с получением сертификата, семинары и вебинары бесплатно от Skillfactory");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
    @Test
    public void pointingAndClick() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://skillfactory.ru/");
            Thread.sleep(2000);

            String window1 = driver.getWindowHandle();

            WebElement dropDown = driver.findElement(By.xpath("//a[@class='main__burger t978__tm-link']"));
            WebElement forum = driver.findElement(By.xpath("//span[text()='БЛОГ']"));
            dropDown.click();
            Actions actions = new Actions(driver);
            actions.moveToElement(forum).click().build().perform();

            Set<String> currentWindows = driver.getWindowHandles();

            String window2 = null;
           for (String window : currentWindows) {
                if (!window.equals((window1))) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://blog.skillfactory.ru/");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }
    }
}


