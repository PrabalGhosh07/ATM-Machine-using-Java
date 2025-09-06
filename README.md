ATM Simulation Project – Description

This project is a Java-based ATM Simulation System that demonstrates the principles of Object-Oriented Programming (OOP), including encapsulation, abstraction, inheritance, and polymorphism. The system allows users to log in with a customer number and PIN, and then perform typical ATM operations through a text-based menu.

🔑 Key Features:

Login Authentication

Validates customer number and PIN against stored records.

Restricts access for incorrect credentials.

Account Types

Users can select Checking Account or Saving Account.

Checking Account Operations

View Balance (formatted as currency using DecimalFormat).

Withdraw Funds (with validation for sufficient balance).

Deposit Funds.

Saving Account Operations

View Balance.

Withdraw Funds.

Deposit Funds.

User-Friendly Menu System

Loop-based menus for smooth navigation.

Input validation to handle incorrect or non-numeric inputs gracefully.

⚙️ Technical Highlights:

Java Core Concepts: Scanner for user input, HashMap for storing login credentials, exception handling for input errors.

Encapsulation: Account details (balances, customer number, PIN) are private and accessed through methods.

Abstraction: Users interact with high-level options (view balance, withdraw, deposit) without needing to know the implementation details.

Inheritance: The Menu class extends the Account class, reusing account-related methods.

Polymorphism (if used in Account methods): Overloaded methods for deposits and withdrawals could demonstrate polymorphism.

🎯 Purpose:

The project simulates the workflow of an ATM machine in a simple text-based format, making it an excellent demonstration of OOP in practice. It also strengthens understanding of Java concepts such as loops, exception handling, collections, and input/output operations.
