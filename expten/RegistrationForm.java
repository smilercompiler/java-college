import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    private JTextField nameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JLabel nameError, emailError, passwordError, confirmPasswordError, statusLabel;
    private JButton registerButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        getContentPane().setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("Name:"), gbc);
        nameField = new JTextField();
        gbc.gridx = 1;
        add(nameField, gbc);
        nameError = new JLabel(" ");
        nameError.setForeground(Color.RED);
        gbc.gridx = 1; gbc.gridy = 1;
        add(nameError, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Email:"), gbc);
        emailField = new JTextField();
        gbc.gridx = 1;
        add(emailField, gbc);
        emailError = new JLabel(" ");
        emailError.setForeground(Color.RED);
        gbc.gridx = 1; gbc.gridy = 3;
        add(emailError, gbc);

        gbc.gridx = 0; gbc.gridy = 4;
        add(new JLabel("Password:"), gbc);
        passwordField = new JPasswordField();
        gbc.gridx = 1;
        add(passwordField, gbc);
        passwordError = new JLabel(" ");
        passwordError.setForeground(Color.RED);
        gbc.gridx = 1; gbc.gridy = 5;
        add(passwordError, gbc);

        gbc.gridx = 0; gbc.gridy = 6;
        add(new JLabel("Confirm Password:"), gbc);
        confirmPasswordField = new JPasswordField();
        gbc.gridx = 1;
        add(confirmPasswordField, gbc);
        confirmPasswordError = new JLabel(" ");
        confirmPasswordError.setForeground(Color.RED);
        gbc.gridx = 1; gbc.gridy = 7;
        add(confirmPasswordError, gbc);

        registerButton = new JButton("Register");
        registerButton.setBackground(new Color(100, 149, 237)); // Cornflower Blue
        registerButton.setForeground(Color.WHITE);
        registerButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        registerButton.addActionListener(this);
        gbc.gridx = 1; gbc.gridy = 8;
        add(registerButton, gbc);

        statusLabel = new JLabel(" ");
        statusLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        gbc.gridx = 1; gbc.gridy = 9;
        add(statusLabel, gbc);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        nameError.setText(" ");
        emailError.setText(" ");
        passwordError.setText(" ");
        confirmPasswordError.setText(" ");
        statusLabel.setText(" ");

        boolean isValid = true;
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        if (name.isEmpty()) {
            nameError.setText("Name is required.");
            isValid = false;
        }

        if (email.isEmpty()) {
            emailError.setText("Email is required.");
            isValid = false;
        } else if (!email.contains("@")) {
            emailError.setText("Invalid email format.");
            isValid = false;
        }

        if (password.isEmpty()) {
            passwordError.setText("Password is required.");
            isValid = false;
        }

        if (confirmPassword.isEmpty()) {
            confirmPasswordError.setText("Confirm your password.");
            isValid = false;
        } else if (!password.equals(confirmPassword)) {
            confirmPasswordError.setText("Passwords do not match.");
            isValid = false;
        }

        if (isValid) {
            statusLabel.setText("Registration Successful!");
            statusLabel.setForeground(new Color(34, 139, 34)); // Forest Green
        } else {
            statusLabel.setText("Please fix the errors above.");
            statusLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        new RegistrationForm();
    }
}
