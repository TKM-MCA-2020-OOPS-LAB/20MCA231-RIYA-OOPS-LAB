import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

@SuppressWarnings("serial")
public class ComboBoxExample extends JFrame  {

  String[] messageStrings = { "rectangle", "triangle", "circle", "square" };
  @SuppressWarnings({ "unchecked", "rawtypes" })
  JComboBox cmbMessageList = new JComboBox(messageStrings);
  JLabel lblText = new JLabel();

  public static void main(String[] args) {
    ComboBoxExample fr = new ComboBoxExample();
    fr.cmbMessageList.addItemListener(new ItemListener() {

      @Override
      public void itemStateChanged(ItemEvent event,Graphics g) {
        
        @SuppressWarnings({ "unused", "rawtypes" })
        JComboBox comboBox = (JComboBox) event.getSource();
        Object item = event.getItem();
        if (event.getStateChange() == ItemEvent.SELECTED) {
          String msg = item.toString();
          switch (msg) {
          case "rectangle": g.drawLine(100,10,250,150);
            
            break;
          case "triangle":
            break;
          case "circle":
           
            break;
          case "square":
           
            break;
          }
          
                }
      }
          
        });
    fr.setVisible(true);
  }

  public ComboBoxExample() {
    setLayout(new FlowLayout());
    setSize(400, 300);
    setTitle("Drawing shapes");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    cmbMessageList.setSelectedIndex(1);
    
    add(cmbMessageList);
    add(lblText);
  }



}
/*
 * <applet code="Max.class" height=150 width=400> </applet>
 */