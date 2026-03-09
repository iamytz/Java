import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(1019, 551);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#1e1e1e"));

     JTextArea input1 = new JTextArea("");
     input1.setBounds(156, 157, 107, 38);
     input1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     input1.setBackground(Color.decode("#B2B2B2"));
     input1.setForeground(Color.decode("#656565"));
     input1.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(input1, "", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(input1);

     JTextArea element3 = new JTextArea("");
     element3.setBounds(280, 155, 106, 41);
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element3.setBackground(Color.decode("#B2B2B2"));
     element3.setForeground(Color.decode("#656565"));
     element3.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element3, "", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element3);

     JTextArea element4 = new JTextArea("");
     element4.setBounds(513, 159, 106, 41);
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element4.setBackground(Color.decode("#B2B2B2"));
     element4.setForeground(Color.decode("#656565"));
     element4.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element4, "0", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element4);

     JButton element5 = new JButton("=");
     element5.setBounds(397, 163, 106, 29);
     element5.setBackground(Color.decode("#2e2e2e"));
     element5.setForeground(Color.decode("#D9D9D9"));
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element5.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element5.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element5, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element5);

     frame.add(panel);
     frame.setVisible(true);

  }
}