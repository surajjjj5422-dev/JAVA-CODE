import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxDemo implements ItemListener
{
        private Checkbox cbJava, cbPython, cbPlusPlus;
        private Label messageLabel;
        private String text =""   ;

        public CheckBoxDemo()
        {
            Frame frame =new Frame("AWT CheckBox");
            Font font =new Font("SansSerif", Font.BOLD,12);

            cbJava=new Checkbox("JAVA");
            cbPython= new Checkbox("Python");
            cbPlusPlus= new Checkbox("C++");
            messageLabel=new Label();

            cbJava.setBounds(10,40,160,30);
            cbPython.setBounds(10,80,160,30);
            cbPlusPlus.setBounds(10,120,160,30);
            messageLabel.setBounds(10,160,160,100);

            cbJava.setFont(font);
            cbPlusPlus.setFont(font);
            cbPython.setFont(font);

            frame.add(cbJava);
            frame.add(cbPython);
            frame.add(cbPlusPlus);

            cbJava.addItemListener(this);
            cbPlusPlus.addItemListener(this);
            cbPython.addItemListener(this);

            frame.setSize(400,350);
            frame.setVisible(true);


        }
        public static void main(String[] args) {
            new CheckBoxDemo();
        }

        @Override
        public void itemStateChanged(ItemEvent e)
        {
            text="";
            text += "Languages : ";
            text +=" Java :"+cbJava.getState();
            text +="Python :"+cbPython.getState();
            text+= "C++ :"+cbPlusPlus.getState();
            messageLabel.setText(text);
        }
}