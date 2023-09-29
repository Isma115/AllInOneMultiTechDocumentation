package Codigos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CargadorCodigos {

    public CargadorCodigos() {

    }

    public Map<String, String> cargar() {
        Map<String, String> codigosMap = new HashMap<>();
        try {
            File fichero = new File("codigoguia.txt");
            Scanner s = new Scanner(fichero);
            String codigos = "";
            while (s.hasNextLine()) {
                codigos = codigos + s.nextLine() + "\n";
            }
            String[] codigoArr = codigos.split("---");
            for (int i = 0; i < codigoArr.length; i++) {
                String clave = codigoArr[i];
                i++;
                if (i < codigoArr.length) {
                    String codigo = codigoArr[i];
                    codigosMap.put(clave, codigo);

                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CargadorCodigos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return codigosMap;
    }
}
