
package docup;

import Ventanas.Frame;
import Ventanas.Formulario;

public class Main {

    public static void main(String[] args) {
        //Iniciar app
        Frame frame = new Frame();
        Formulario panelPrincipal = new Formulario();
        frame.setContentPane(panelPrincipal);
        frame.setVisible(true);
    }
    
}
