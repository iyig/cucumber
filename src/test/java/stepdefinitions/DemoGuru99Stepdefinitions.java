package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.ReusableMethods;

import java.util.List;

public class DemoGuru99Stepdefinitions {
   DemoGuruPage demoGuruPage=new DemoGuruPage();

    @And("{string}, sutundaki tum degerleri yazdirir")
    public void sutundakiTumDegerleriYazdirir(String istenenBaslikStr) {

  List<WebElement> baslikWebelementListesi= demoGuruPage.baslikWebelementListesi;
List<String> baslikStringListesi= ReusableMethods.getElementsText(baslikWebelementListesi);

   int istenenSutunIndexi=baslikStringListesi.indexOf(istenenBaslikStr);

   //    //tbody//tr//td[3]

           List<WebElement> istenenSutunWebelementListesi=demoGuruPage.sutunListesiGetir(istenenSutunIndexi);

    }
}







