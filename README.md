# Simple Expense Tracker

This project implements a command-line expense tracking application developed in Java. It provides core functionalities for managing personal finances by recording and summarizing expenses.  The application emphasizes a modular design and utilizes core Java data structures and input/output mechanisms.

## Overview

The Simple Expense Tracker allows users to input expense details, including category, description, and amount. These expenses are stored in memory using `ArrayList`s.  The application then provides a summary view, listing all recorded expenses and calculating the total expenditure.  The current version focuses on core functionality and command-line interaction.

## Features

* *Expense Entry:*  Users can add new expenses by providing the following information:
    * *Category:* A string representing the expense category (e.g., "Food," "Transportation," "Entertainment").
    * *Description:* A brief textual description of the expense.
    * *Amount:* A numerical value representing the expense amount. Input validation is performed to ensure the amount is a valid positive number.  The application handles InputMismatchException and prompts the user to re-enter a valid input.
* *Expense Summary:* The application displays a formatted list of all recorded expenses, including the category, description, and amount for each entry.  It also calculates and displays the total expenditure.
* *Menu-Driven Interface:*  A user-friendly menu system guides interaction with the application.  Users can select options to add an expense, view expenses, or exit the application.  Input validation is performed to handle invalid menu choices.
* *Data Storage (Current Implementation):* Expenses are currently stored in `ArrayList`s in memory.  This means that expense data is lost when the application terminates. See Future Enhancements for planned data persistence features.

## Technical Design

The application is designed with a simple, object-oriented approach.  The core class, ExpenseTracker, manages the expense data and provides the user interface.

* *Data Structures:* ArrayList`s are used to store the expense data.  Three `ArrayList`s are used in parallel: `categories, descriptions, and amounts.  This approach simplifies data management for this basic implementation.
* *Input/Output:* The Scanner class is used for reading user input from the command line.  System.out.println() is used for displaying output to the console.
* *Error Handling:* Basic error handling is implemented for invalid input (e.g., non-numeric amounts).  The application catches InputMismatchException and prompts the user to re-enter valid input.

## Getting Started

### Prerequisites

* Java Development Kit (JDK) 17 or higher

### Compilation and Execution

1. Clone the repository (or download the source code).
2. Open a terminal or command prompt and navigate to the project's root directory.
3. Compile the Java source file:
   ```bash
   javac ExpenseTracker.java
