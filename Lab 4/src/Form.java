import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {

    private JTextField vField;
    private JTextField RField;
    private JTextField aField;

    private JPanel mainPanel;

    public Form () {
        setTitle("Lab 4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 220);
        mainPanel = new JPanel();
        mainPanel.setBorder(new EmptyBorder(5,5,5,5));
        mainPanel.setLayout(null);

        setContentPane(mainPanel);
        JLabel vLabel = new JLabel("Швидкість");
        vField = new JTextField();
        JLabel RLabel = new JLabel("Радіус");
        RField = new JTextField();
        JLabel aLabel = new JLabel("Прискорення");
        aField = new JTextField();
        JLabel errorLabel = new JLabel();

        vLabel.setBounds(40, 30, 80, 20);
        RLabel.setBounds(40, 60, 80, 20);
        aLabel.setBounds(40, 90, 80, 20);

        vField.setBounds(150, 30, 150, 20);
        RField.setBounds(150, 60, 150, 20);
        aField.setBounds(150, 90, 150, 20);
        errorLabel.setBounds(40, 120, 260, 20);
        aField.setEditable(false);

        mainPanel.add(vLabel);
        mainPanel.add(vField);
        mainPanel.add(RLabel);
        mainPanel.add(RField);
        mainPanel.add(aLabel);
        mainPanel.add(aField);
        mainPanel.add(errorLabel);

        JButton btnCalculate = new JButton("Обчислити");
        btnCalculate.setBounds(150, 150, 150, 20);
        mainPanel.add(btnCalculate);

        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (vField.getText().isEmpty() || RField.getText().isEmpty()) {
                    errorLabel.setText("Всі поля повинні бути заповненими!");
                    aField.setText("");
                } else {
                    double v = Double.parseDouble(vField.getText());
                    double R = Double.parseDouble(RField.getText());
                    aField.setText(Double.toString(v*v/R));
                    errorLabel.setText("");
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Form();
    }
}
