package co.com.tcs.tasks;

import co.com.tcs.userinterface.LinioHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    private LinioHomePage linioHomePage;

    public static Abrir paginaDeLinio(){
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Open.browserOn(linioHomePage));
    }
}
