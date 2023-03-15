package functions;
import javax.swing.JOptionPane;

public class calculadora {

    public void calculadora() {
        try {
            Runtime.getRuntime().exec("calc.exe");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao abrir a calculadora: " + e);
        }
    }
}
