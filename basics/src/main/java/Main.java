import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame();

    frame.setSize(400 , 400);

    GridLayout layout = new GridLayout(3,3);
    JPanel panel = new JPanel();
    panel.setLayout(layout);

    for(int i = 1; i < 10; i++){
      addButton(i, panel, 5);
    }

    frame.add(panel);
    frame.setVisible(true);
  }

  private static void addButton(int i, JPanel panel, int padding){
      Button btn = new Button();
      btn.setLabel("" + i);
      btn.addActionListener(e -> {
        System.out.println("Hello world from " + i);
      });
      JPanel subPanel = new JPanel();
      subPanel.setBorder(new EmptyBorder(padding, padding, padding, padding));
      subPanel.setLayout(new BorderLayout());
      subPanel.add(btn, BorderLayout.CENTER);
      panel.add(subPanel);
  }
}
