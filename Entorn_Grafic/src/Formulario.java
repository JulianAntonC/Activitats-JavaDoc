import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame {

    private JLabel welcomeLabel;
    private JTextField name;
    private JLabel nameLabel;
    private JTextField password;
    private JLabel passLabel;
    private JButton logInButton;


    public Formulario() {

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        welcomeLabel = new JLabel("Welcome!");
        name = new JTextField(20);
        nameLabel = new JLabel("USER");
        password = new JTextField(20);
        passLabel = new JLabel("PASSWORD");
        logInButton = new JButton("LOG IN");
        Font titleFont = new Font("Source Code Pro", Font.BOLD, 24);
        welcomeLabel.setFont(titleFont);

        // Add ActionListener to the submit button
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent introducirDatos) {
                // Get the text from the textField
                String nameTest = name.getText();
                String passTest = password.getText();

                // Add the text to the comboBox
                if (nameTest.equals(passTest)) {
                    JOptionPane.showMessageDialog(Formulario.this, "You're in!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(Formulario.this, "Incorrect access", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setLayout(new FlowLayout());

        add(welcomeLabel);
        add(nameLabel);
        add(name);
        add(passLabel);
        add(password);
        add(logInButton);

    }

    public static void main(String[] args) {
        // Create and display the SimpleSwingExample JFrame
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }
}