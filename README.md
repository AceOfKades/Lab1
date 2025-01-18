# LAB 1 : Making Change
## Description:
Create an application that has a Register with a function makeChange(amt: double): Purse, that takes a double amount and returns a reference to a Purse object that contains the amount translated into the fewest possible coins and bills.</br>
Use a record for denominations. You may add other classes and methods, but must contain the following:
### 1. Denomination (record)
* name: *String*
  * Name of the denomination. E.g. Ten Note, Five Note, Dime, Nickle, etc.
* amt: *double*
  * The amount of money this denomination represents
* form: *String*
  * “bill” or “coin”; This could be an enum, if you know them.
* img: *String*
  * The string containing the image name for an image of the type of money
### 2. Purse (class)
* cash: *Map<Denomination, Integer>* 
  * Represents the money in the purse
* add(type: *Denomination*, num: *int*): *void*
  * Adds a number of a particular denomination
* remove(type: *Denomination*, num: *int*): *double* 
  * Diminishes the money in the purse and returns that amount.
* getValue(): *double* 
  * Returns the amount of money in the Purse</br>
* toString(): *String* 
  * Returns a string representation of the Purse and its contents
### 3. Register (class)
* makeChange(amt: *double*): Purse 
  * Takes an amt and returns a Purse containing that amount in the fewest number of bills and coins.
* static main(string[] args): void
  * Creates a Register and demonstrates that it works.

# Create a GUI for this application.
## Create a new class called MakingChange. 
MakingChange should have a main function that create a JFrame and add a RegisterPanel to it.
### 4. RegisterPanel (class, extends JPanel)
* register: Register 
  * A register object to run the logic
* inputPanel: JPanel 
  * A panel to hold the JTextField for the user to enter an amount
* input: JTextField 
  * A place for the user to enter the amount
* changePanel: PursePanel 
  * A panel to display the change
* InputListener (class, implements ActionListener)  
  * A listener for changes to the input
* actionPerformed(ActionEvent e): void 
  * What happens when input changes
### 5. PursePanel (class, extends JPanel)
* purse: Purse 
  * Represents the amount to display—initialize to empty Purse
* paintComponent(Graphics g): void  
  * Holds the logic for displaying purse contents
