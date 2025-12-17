import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloFrame extends JFrame {

  private int numTimes = 0;
  private JLabel pesanLabel;
  private JButton resetButton;

  public HelloFrame() {
    super();

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    setTitle("Aplikasi GUI Melalui Hello Frame");
    setSize(300, 300);

    JLabel namaLabel = new JLabel("Nama");
    JTextField namaTextField = new JTextField(10);
    JButton tampilButton = new JButton("Tampilkan");

    pesanLabel = new JLabel("Counter Nilai " + numTimes);
    resetButton = new JButton("Reset Nilai");

    tampilButton.addActionListener(e -> {
      numTimes++;

      System.out.println(namaTextField.getText());

      pesanLabel.setText("Counter Nilai " + numTimes);

      JOptionPane.showMessageDialog(this, namaTextField.getText());
    });

    resetButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        numTimes = 0;

        pesanLabel.setText("Counter Nilai " + numTimes);
      }
    });

    add(namaLabel);
    add(namaTextField);
    add(tampilButton);
    add(pesanLabel);
    add(resetButton);
  }

}