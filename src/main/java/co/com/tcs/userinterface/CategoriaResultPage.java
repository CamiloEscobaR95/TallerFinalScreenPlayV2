package co.com.tcs.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaResultPage {
    public static final Target LABEL_PALABRA = Target.the("palabra resulatnte").located(By.xpath("//*[@id=\"main-menu\"]/nav/ul/li[8]/a/span[2]"));
}
