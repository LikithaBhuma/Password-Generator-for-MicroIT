# Password-Generator-for-MicroIT
A password generator is a tool that creates strong, random passwords to enhance security. Users can specify criteria such as password length and the inclusion of uppercase letters, lowercase letters, numbers, and special characters. The generated passwords are typically complex and difficult to guess, helping to protect user accounts and sensitive information. This project is a Password Generator application developed using Java Swing in Eclipse IDE. It allows users to generate strong and secure passwords by selecting desired character sets and specifying password length. 
Project Structure: 
PasswordGeneratorProject/
└── src/ 
└── Project/ 
└── PasswordGenerator.java 
Features: 
-Generates a random password based on: 
-Uppercase letters (A-Z) 
-Lowercase letters (a-z) 
-Numbers (0-9) 
-Special characters (!@#$%^&* etc.) 
-Allows users to: 
  -Enter desired password length 
  -Select which character sets to include 
  -Displays the password in a text area 
-Input validation for: 
-Missing character set selections 
-Invalid or empty length fields 
   ---UI Components Used JFrame 
   – Main window JPanel 
   – Layout containers JTextField 
   – For inputting password length JCheckBox
   – For selecting character types JTextArea 
   – For showing the generated password JButton 
   – Trigger password generation GridLayout and BorderLayout 
   – For organizing layout -UI is created and updated using the Event Dispatch Thread (SwingUtilities.invokeLater) -Random password generation uses java.util.Random
   Output:
![image](https://github.com/user-attachments/assets/f746f09d-8b33-467d-a37b-a710b0f5abf9)
