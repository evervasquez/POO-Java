import javax.swing.*;
import java.awt.*;

/**
 * Created by ever on 6/1/17.
 */
public class Main extends JFrame{
    JPanel panel1;
    public Main() {
        setTitle("Hola Mundo");
        setSize(390, 180);
        setContentPane(panel1);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
