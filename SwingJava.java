import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Converter {
    public static void main(String[] args) {
        MeasureMent mm = new MeasureMent();

    }
}

class MeasureMent extends JFrame {
    JTextField t1;
    JButton b1, b2;
    JLabel l1, l2, l;

    MeasureMent() {
        ImageIcon im = new ImageIcon("conversion.png");
        l1 = new JLabel("Centimeter:");
        l1.setForeground(Color.CYAN);
        t1 = new JTextField(15);
        t1.setBackground(Color.BLACK);
        t1.setForeground(new Color(204, 255, 102));
        t1.setCaretColor(Color.white);
        t1.setPreferredSize(new Dimension(120, 30));

        l2 = new JLabel();
        l2.setIcon(im);

        b1 = new JButton("Meter");
        b1.setForeground(Color.green);
        b1.setBackground(Color.BLACK);
        b1.setOpaque(true);
        b2 = new JButton("Kilometer");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.green);

        l = new JLabel("Result");
        l.setForeground(Color.CYAN);
        l.setBackground(Color.ORANGE);
        // l.isOpaque(true);
        add(l2);
        add(l1);
        add(t1);
        add(b1);
        add(b2);
        add(l);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(t1.getText());
                Double value = (num1 * 0.01);
                l.setText(value + " " + "m");
            }
        });
        b2.addActionListener(e -> // this is an ananyous object which is using after 8 version of JDK
        {
            Double num1 = Double.parseDouble(t1.getText());
            Double value = (num1 / 100000);
            l.setText(value + " " + "km");
        });

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Conversion");
        setSize(300, 250);
        getContentPane().setBackground(new Color(123, 50, 20));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
}
