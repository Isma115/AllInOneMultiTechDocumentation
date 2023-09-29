
package UtilsApp;

import Ventanas.Frame;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PopUps {
    
    public void anadirClickDerechoListener(Frame frame, JComponent componente, String texto) {
        JPopupMenu popupMenu = crearPopUp(texto);
        componente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    popupMenu.show(frame, e.getX(), e.getY());
                }
            }
        });
    }
    public JPopupMenu crearPopUp(String texto){
        JPopupMenu popupMenu = new JPopupMenu();
        JTextArea textArea = new JTextArea(20, 90);
        textArea.setText(texto);
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.BOLD, 16));
        popupMenu.add(new JScrollPane(textArea));
        return popupMenu;
    }

    
}
