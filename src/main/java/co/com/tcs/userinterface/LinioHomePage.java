package co.com.tcs.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.linio.com.co/")
public class LinioHomePage extends PageObject {

    public static final Target BOTON_CATEGORIAS = Target.the("boton categoria").located(By.xpath("//*[@id=\"open-left-menu\"]"));
}
