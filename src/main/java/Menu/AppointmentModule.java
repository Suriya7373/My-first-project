package Menu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.By.*;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import static org.openqa.selenium.By.xpath;
public class AppointmentModule {
    WebDriver driver;
    public AppointmentModule(WebDriver driver) {

        this.driver = driver;
    }
        public void Appointment() throws InterruptedException {

        //Appointment module
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
            WebElement  PatientAppointment = driver.findElement(xpath("//*[text()='Appointments']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PatientAppointment);
            PatientAppointment.click();

            //Appointment module  calender
            WebElement calendar= driver.findElement(xpath("(//*[@class=\"dx-button-content\"])[2]"));
            calendar.click();

           //filter week
            WebElement Week= driver.findElement(xpath("(//*[@class=\"dx-button-text\"])[3]"));
            Week.click();

            //filter month

            WebElement Month= driver.findElement(xpath("(//*[@class=\"dx-button-text\"])[4]"));
            Month.click();

            //Creat appointment

            WebElement Creatappointment= driver.findElement(xpath("//*[@class=\"create-app ng-star-inserted\"][1]"));
            Creatappointment.click();

            //Endering firstname
            Thread.sleep(3000);
            WebElement enteringFirstname = driver.findElement(id("mat-input-6"));
            enteringFirstname.sendKeys("Sg");

            //Endering Lastname

            Thread.sleep(3000);
            WebElement EnteringLastname = driver.findElement(id("mat-input-8"));
            EnteringLastname.sendKeys("Suriya");

            //Choosing Gender

            WebElement Gender= driver.findElement(xpath("//*[@id=\"mat-select-value-5\"]"));
            Gender.click();

            //Choosing Gender Male

            WebElement GenderMale= driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[1]"));
            GenderMale.click();

            //Choosing DOB

            WebElement DOB= driver.findElement(xpath("(//button[@aria-label=\"Open calendar\"])[1]"));
            DOB.click();

            // //Choosing DOB today date

            WebElement DOBToday= driver.findElement(xpath("//td[@aria-label=\"June 3, 2024\"]"));
            DOBToday.click();

            //Entering phonenumber

            Thread.sleep(3000);
            WebElement phonenumber = driver.findElement(xpath("//*[@id=\"mat-input-10\"]"));
            phonenumber.sendKeys("7373871966");

            //Entering e-mail

            Thread.sleep(3000);
            WebElement email = driver.findElement(xpath("//*[@id=\"mat-input-11\"]"));
            email.sendKeys("sgsuriya001@gmail.com");

            //Choosing  Facility dropdown

            Thread.sleep(1000);
            WebElement Facilitydropdown= driver.findElement(xpath("//*[@id=\"mat-select-value-7\"]"));
            Facilitydropdown.click();

            //Choosing  Facility

            Thread.sleep(1000);
            WebElement Facility= driver.findElement(xpath("//span[@class='mat-option-text']"));
            Facility.click();

            //Choosing physician
            Thread.sleep(1000);
            WebElement physiciandropdown= driver.findElement(xpath("//*[@id=\"mat-select-value-9\"]"));
            physiciandropdown.click();

            //Choosing physician

            Thread.sleep(1000);
            WebElement Facilityphysician= driver.findElement(xpath("//*[@class=\"mat-option-text\"]"));
            Facilityphysician.click();

           // //Choosing appointmentcalender
            Thread.sleep(5000);
          WebElement Appointmentcalender= driver.findElement(xpath("(//button[@aria-label=\"Open calendar\"])[2]"));
          Appointmentcalender.click();

          // //Choosing appointmenttoday date
           Thread.sleep(5000);
          WebElement  AppointmentToday= driver.findElement(xpath("//td[@aria-label=\"June 15, 2024\"]"));
           AppointmentToday.click();

            // //Choosing Get schedule time
            Thread.sleep(3000);
            WebElement  Appointmentcalen= driver.findElement(xpath("//mat-select[@aria-label=\"Get schedule time\"]"));
          Appointmentcalen.click();
//
//            //Choosing Appointmentcalendertoday
            Thread.sleep(3000);
//
//
            WebElement  Appointmentcalendertoday= driver.findElement(id("mat-select-10-panel"));
            Appointmentcalendertoday.click();

            //consultingType

            Thread.sleep(8000);
            WebElement  consultingType= driver.findElement(xpath("//mat-select[@formcontrolname=\"consultingType\"]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", consultingType);
            consultingType.click();

            //choosing  //consultingType
            Thread.sleep(8000);
            WebElement choosingconsultingType = driver.findElement(xpath("//span[text()='ClinicConsulting']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", choosingconsultingType);
            choosingconsultingType.click();

            //save
            Thread.sleep(3000);
            WebElement save = driver.findElement(xpath("//*[text()='Save']"));
            save.click();



























        }
}
