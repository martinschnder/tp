package seedu.stocker.commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelpCommandTest {
    @Test
    public void executeTest() {
        HelpCommand command = new HelpCommand();

        String expectedOutput = System.getProperty("line.separator")
                + "add: Adds a new drug to the drug list. Parameters: NAME, EXPIRY DATE, SERIAL NUMBER, QUANTITY,  "
                + System.getProperty("line.separator")
                + "Example: add /n Doliprane /d 12/06/2035 /s ABC123 /q 52 /p 12.90"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")
                + "delete: Removes a drug from drug list. Parameters: Serial Number  "
                + System.getProperty("line.separator")
                + "Example: delete /s <Serial Number>"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")
                + "help: Shows program usage instructions. "
                + System.getProperty("line.separator")
                + "Example: help"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")
                + "list: List all drug information that is being tracked by the system. "
                + System.getProperty("line.separator")
                + "Example: list"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")
                + "stockLevel: List all drugs by quantity level tracked by the system in ascending order. "
                + System.getProperty("line.separator")
                + "Example: stockLevel"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")
                + "find /n: Finds drug in inventory using name."
                + System.getProperty("line.separator")
                + "Example: find /n panadol"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")
                + "find /d: Finds drug in inventory using date."
                + System.getProperty("line.separator")
                + "Example: find /d panadol"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")
                + "find /s: Finds drug in inventory using serial number."
                + System.getProperty("line.separator")
                + "Example: find /s ABC123"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")
                + "addToCart: Adds a new drug to the current cart. Parameters: SERIAL NUMBER, QUANTITY,"
                + System.getProperty("line.separator")
                + "Example: addToCart /s Doliprane /q 2"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")
                + "checkout: Checks out current cart. Parameters:"
                + System.getProperty("line.separator")
                + "Example: checkout"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")
                + "viewCart: View the current cart items."
                + System.getProperty("line.separator")
                + "Example: viewCart"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")
                + "login: Login new user into system."
                + System.getProperty("line.separator")
                + "Example: login"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")
                + "register: Register new user into system."
                + System.getProperty("line.separator")
                + "Example: register"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")
                + "save: Saves existing druglist that is loaded into inventory when system is booted up."
                + System.getProperty("line.separator")
                + "Example: save"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")

                + "addVendor: Adds a new vendor to the vendors list. Parameter: NAME"
                + System.getProperty("line.separator")
                + "Example: addVendor Moderna"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")

                + "listVendors: List all vendor information that is being tracked by the system."
                + System.getProperty("line.separator")
                + "Example: listVendors"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")

                + "setThreshold: Set the threshold quantity for a drug. (default 100)"
                + System.getProperty("line.separator")
                + "Example: setThreshold /s TC150 /tq 50"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")

                + "listThreshold: List all drugs and their threshold levels."
                + System.getProperty("line.separator")
                + "Example: listThreshold"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator")

                + "bye: Exits the program."
                + System.getProperty("line.separator")
                + "Example: bye";


        assertEquals(new CommandResult(expectedOutput).feedbackToUser, command.execute().feedbackToUser);
    }
}
