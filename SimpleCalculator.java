import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame {

  private JLabel bilanganALabel;
  private JLabel bilanganBLabel;
  private JTextField bilanganATextField;
  private JTextField bilanganBTextField;
  private JButton hitungButton;

  public SimpleCalculator() {
    super();

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new GridLayout(3, 2, 10, 10));

    setTitle("Kalkulator");
    setSize(300, 300);

    bilanganALabel = new JLabel("Bilangan 1");
    bilanganBLabel = new JLabel("Bilangan 2");
    bilanganATextField = new JTextField(10);
    bilanganBTextField = new JTextField(10);
    hitungButton = new JButton("Hitung");

    hitungButton.addActionListener(e -> {
      try {
        int bilanganA = Integer.parseInt(bilanganATextField.getText());
        int bilanganB = Integer.parseInt(bilanganBTextField.getText());

        JOptionPane.showMessageDialog(this, (bilanganA + bilanganB));
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Input Harus Angka");
      }
    });

    add(bilanganALabel);
    add(bilanganATextField);
    add(bilanganBLabel);
    add(bilanganBTextField);
    add(new JLabel(""));
    add(hitungButton);
  }

}
