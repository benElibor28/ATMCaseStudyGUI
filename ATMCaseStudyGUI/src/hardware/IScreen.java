package hardware;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zunigaur
 */
public interface IScreen {

    // display a dollar amount
    void displayDollarAmount(double amount);

    // displays a message without a carriage return
    void displayMessage(String message);

    // display a message with a carriage return
    void displayMessageLine(String message);
    
}
