import javax.swing.*;

public class Ejecutador {
    public void main() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Biblioteca bl = new Biblioteca();
                bl.setVisible(true);
            }
        });
    }
}
