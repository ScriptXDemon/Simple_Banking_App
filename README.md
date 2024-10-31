## Simple_Banking_App
A basic Java Swing application for managing a simple banking account, allowing users to deposit, withdraw, and check their balance via a graphical user interface (GUI).

# Features
Deposit: Add money to the balance.
Withdraw: Remove money from the balance (only if sufficient funds are available).
Check Balance: Display the current balance.
GUI-Based: User-friendly graphical interface made with Java Swing.
Getting Started
Prerequisites
Java Development Kit (JDK): Ensure you have JDK 8 or higher installed.
IDE (optional): Any Java-supported IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans).

# Installation
Clone the repository:

bash
Copy code
git clone https://github.com/yourusername/SimpleBankingAppGUI.git
cd SimpleBankingAppGUI
Compile the code:

bash
Copy code
javac SimpleBankingAppGUI.java
Run the application:

bash
Copy code
java SimpleBankingAppGUI

# Usage
Deposit: Enter an amount and click "Deposit" to add to the balance.
Withdraw: Enter an amount and click "Withdraw" to subtract from the balance (ensuring funds are available).
Check Balance: Click "Check Balance" to display the current balance in a popup dialog.
View Balance: The main screen always shows the updated balance.
Code Overview
Class: SimpleBankingAppGUI
SimpleBankingAppGUI(): Initializes the GUI components and sets up the main frame.
deposit(): Adds a valid deposit amount to the balance.
withdraw(): Subtracts a valid amount if it does not exceed the current balance.
checkBalance(): Displays the balance in a dialog box.
updateBalanceLabel(): Updates the balance label to reflect changes.
Main Components
JFrame: The main window containing all UI components.
JTextField: Input fields for deposit and withdrawal amounts.
JButton: Buttons for actions (Deposit, Withdraw, Check Balance).
JLabel: Label for displaying the current balance.
Screenshots

Contributing
Fork the repository.
Create your feature branch: git checkout -b feature/YourFeature
Commit your changes: git commit -m 'Add YourFeature'
Push to the branch: git push origin feature/YourFeature
Submit a pull request.
