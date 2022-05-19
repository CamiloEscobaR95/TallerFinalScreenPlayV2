package co.com.tcs.questions;

import co.com.tcs.userinterface.CategoriaResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Calendar;

public class LaRespuesta implements Question<String> {

    public static LaRespuesta es(){
        return new LaRespuesta();
    }

    @Override
    public String answeredBy (Actor actor){
        return Text.of(CategoriaResultPage.LABEL_PALABRA).viewedBy(actor).asString();
    }
}
