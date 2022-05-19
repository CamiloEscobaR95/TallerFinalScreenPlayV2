package co.com.tcs.tasks;

import co.com.tcs.userinterface.LinioHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OprimirBtnCategorias implements Task {

    private String palabra;

    public OprimirBtnCategorias(String palabra) {
        super();
        this.palabra = palabra;
    }

    public static OprimirBtnCategorias buscar (){
        return Tasks.instrumented(OprimirBtnCategorias.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(LinioHomePage.BOTON_CATEGORIAS));
    }
}
