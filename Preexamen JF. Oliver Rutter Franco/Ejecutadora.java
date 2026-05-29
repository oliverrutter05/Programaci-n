import javax.swing.*;

public class Ejecutadora {

    public void main() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                GestionarCoches gc = new GestionarCoches();
                gc.setVisible(true);
            }
        });
    }
}
