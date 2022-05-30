package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;

import java.util.List;

public class DemoGuru99Stepdefinitions {
DemoGuruPage demoGuruPage=new DemoGuruPage();
    @Given("user web sayfasinda")
    public void user_web_sayfasinda() {


    }
    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String string) {


        List<WebElement> baslikWebelementListesi=demoGuruPage.baslikWebelementListesi;


    }






}
