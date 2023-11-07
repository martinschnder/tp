package seedu.stocker.commands;

import seedu.stocker.drugs.StockEntry;

/**
 * Adds a certain quantity of one drug into the current cart
 */
public class AddToCartCommand extends Command {

    public static final String COMMAND_WORD = "addtocart";

    public static final String MESSAGE_USAGE = COMMAND_WORD 
            + ": Adds a new drug to the current cart. "
            + "Parameters: SERIAL NUMBER, QUANTITY," + System.lineSeparator()
            + "Example: " + COMMAND_WORD
            + " /s Doliprane /q 2";

    public static final String MESSAGE_SUCCESS = "New drug added in the current cart: %1$s";

    private final String serialNumber;
    private final long quantity;

    public AddToCartCommand(String serialNumber, long quantity) {
        this.serialNumber = serialNumber;
        this.quantity = quantity;
    }

    @Override
    public CommandResult execute() {
        StockEntry entry = inventory.get(this.serialNumber);
        if (entry != null && entry.getQuantity() >= this.quantity) {
            currentCart.addEntry(this.serialNumber, this.quantity);
            return new CommandResult<>(String.format(MESSAGE_SUCCESS, entry.getDrug().getName()));
        } else {
            return new CommandResult<>("This drug is not in stock. ");
        }
    }

}
