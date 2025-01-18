|| LAB 1 : Making Change ||
Description:
  Create an application that has a Register with a function makeChange(amt: double): Purse, that takes a double amount and returns a reference to a Purse object that contains the amount translated into the fewest possible coins and bills. 
    Use a record for denominations. You may add other classes and methods, but must contain the following:
      1. Denomination (record)
          name: String // name of the denomination. E.g. Ten Note, Five Note, Dime, Nickle, etc.
          amt: double // The amount of money this denomination represents
          form: String // “bill” or “coin”; This could be an enum, if you know them.
          img: String // The string containing the image name for an image of the type of money
      2. Purse (class)
          cash: Map<Denomination, Integer> // represents the money in the purse
          add(type: Denomination, num: int): void // adds a number of a particular denomination
          remove(type: Denomination, num: int): double //diminishes the money in the purse and returns that amount.
          getValue(): double // returns the amount of money in the Purse
          toString(): String // returns a string representation of the Purse and its contents
      3. Register (class)
          makeChange(amt: double): Purse // takes an amt and returns a Purse containing that amount in the fewest number of bills and coins.
          static main(string[] args): void // creates a Register and demonstrates that it works.

!! Create a GUI for this application. !!
    A. Create a new class called MakingChange. MakingChange should have a main function that create a JFrame and add a RegisterPanel to it.
    B. Create a new class called RegisterPanel.
        4. RegisterPanel (class, extends JPanel)
            register: Register // a register object to run the logic
            inputPanel: JPanel // a panel to hold the JTextField for the user to enter an amount
            input: JTextField // a place for the user to enter the amount
            changePanel: PursePanel // a panel to display the change
        5. InputListener (class, implements ActionListener)  // a listener for changes to the input
            actionPerformed(ActionEvent e): void // what happens when input changes
    C. Create a new class called PursePanel.
        6. PursePanel (class, extends JPanel)
            purse: Purse // represents the amount to display—initialize to empty Purse
            paintComponent(Graphics g): void  // holds the logic for displaying purse contents
