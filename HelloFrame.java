import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloFrame extends JFrame implements ActionListener {

  private int numTimes = 0;

  public HelloFrame() {
    super();

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    setTitle("Aplikasi GUI Melalui Hello Frame");
    setSize(300, 300);

    JLabel namaLabel = new JLabel("Nama");
    JTextField namaTextField = new JTextField(10);
    JButton tampilButton = new JButton("Tampilkan");

    tampilButton.addActionListener(this);

    add(namaLabel);
    add(namaTextField);
    add(tampilButton);
  }

  

}
