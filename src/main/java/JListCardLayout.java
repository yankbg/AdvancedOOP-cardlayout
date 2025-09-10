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
    // The creation of the addBtn method
    public void addBtn(){
        card1.add(btn1);
        card2.add(btn2);
        card3.add(btn3);
    }
    //The creation of the method mainPanelAdd
    public void mainPanelAdd(){
        mainPanel.add(card1, "card1");
        mainPanel.add(card2, "card2");
        mainPanel.add(card3, "card3");
    }


}
