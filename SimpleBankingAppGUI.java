import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleBankingAppGUI extends JFrame {
    private double balance;
    private JLabel balanceLabel;
    private JTextField amountField;
    
    // Constructor to initialize balance and set up GUI components
    public SimpleBankingAppGUI() {
        balance = 0.0;
        
        // Set up JFrame
        setTitle("Simple Banking Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create and configure components
        balanceLabel = new JLabel("Current Balance: $0.0");
        amountField = new JTextField(10);
        
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JButton checkBalanceButton = new JButton("Check Balance");

        // Add ActionListeners for buttons
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deposit();
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                withdraw();
            }
        });

        checkBalanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkBalance();
            }
        });

        // Set up layout and add components to the frame
        setLayout(new GridLayout(5, 1, 10, 10));
        add(balanceLabel);
        add(new JLabel("Enter amount:"));
        add(amountField);
        add(depositButton);
        add(withdrawButton);
        add(checkBalanceButton);
    }
    
    // Method to deposit money
    private void deposit() {
        double amount = getAmount();
        if (amount > 0) {
            balance += amount;
            updateBalanceLabel();
            JOptionPane.showMessageDialog(this, "Deposited: $" + amount);
        } else {
            JOptionPane.showMessageDialog(this, "Amount to deposit must be greater than 0.");
        }
    }

    // Method to withdraw money
    private void withdraw() {
        double amount = getAmount();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            updateBalanceLabel();
            JOptionPane.showMessageDialog(this, "Withdrew: $" + amount);
        } else if (amount > balance) {
            JOptionPane.showMessageDialog(this, "Insufficient balance.");
        } else {
            JOptionPane.showMessageDialog(this, "Amount to withdraw must be greater than 0.");
        }
    }

    // Method to check balance
    private void checkBalance() {
        JOptionPane.showMessageDialog(this, "Current Balance: $" + balance);
    }

    // Helper method to get the amount entered by user
    private double getAmount() {
        try {
            return Double.parseDouble(amountField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
            return 0;
        }
    }

    // Update balance label
    private void updateBalanceLabel() {
        balanceLabel.setText("Current Balance: $" + balance);
    }

    // Main method to launch the GUI application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleBankingAppGUI app = new SimpleBankingAppGUI();
            app.setVisible(true);
        });
    }
}
