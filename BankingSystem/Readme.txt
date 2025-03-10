Project Title:  
Simple Java Banking Application

Description:  
This is a simple command-line banking application developed in Java. The program allows users to perform basic banking operations such as creating an account, depositing money, withdrawing money, and checking account balances.

Features:  
- Create a new bank account with a unique account number.  
- Deposit money into an account.  
- Withdraw money from an account with balance checks.  
- View account balance and holder information.  
- Console-based interactive menu.

How It Works:  
1. When the application starts, it displays a menu with options.
2. The user can choose to:
   - Create a new account by entering their name and initial deposit.
   - Deposit money into an existing account using the account number.
   - Withdraw money (if sufficient balance is available).
   - Check the current balance of an account.
3. Each account is assigned a unique account number starting from 1000.
4. All account data is stored in memory using an ArrayList.

How to Run:  
1. Compile the Java file using a terminal or command prompt:
   javac BankingApplication.java

2. Run the compiled class:
   java BankingApplication

Example Menu Output:
Welcome to the Banking Application
1. Create Account
2. Deposit
3. Withdraw
4. Check Balance
5. Exit
Enter your choice: 

Note:  
- This is a console-based application. All data will be lost once the program exits.
- For production or real-world use, consider integrating file/database storage and improving security.

Author:  
Vijaykumar Pandina

License:  
This project is provided for educational purposes. No warranties or guarantees.
