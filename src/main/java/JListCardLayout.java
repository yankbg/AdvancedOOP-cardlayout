import javax.swing.*;
import java.awt.*;

public class JListCardLayout extends JFrame {
    CardLayout cardLayout = new CardLayout();

    // Declaration of JPanel
    JPanel mainPanel = new JPanel(cardLayout);
    JPanel card1 = new JPanel();
    JPanel card2 = new JPanel();
    JPanel card3 = new JPanel();
    JButton btn1 = new JButton("Go to card2");
    JButton btn2 = new JButton("Go to card3");
    JButton btn3 = new JButton("Go to card1");

}
