package seedu.stocker.commands;

import seedu.stocker.drugs.StockEntry;

import java.util.List;
import java.util.Map;

/**
 * Represents a command to list all drugs in the inventory.
 * This command retrieves the list of drugs from the inventory and provides it as part of the command result.
 * If the inventory is empty, it informs the user that the inventory has no drugs.
 */
public class ListCommand extends Command {

    public static final String COMMAND_WORD = "list";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": List all drug information that is being "
            + "tracked by the system. " + System.lineSeparator()
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Listed all drugs in the inventory.";

    /**
     * Executes the list command.
     *
     * @return A CommandResult containing the success message and the list of drugs.
     */
    @Override
    public CommandResult execute() {
        // Assertion: Check if the inventory is properly initialized
        assert inventory != null : "Inventory should be initialized before executing ListCommand.";
        // Retrieve the list of drugs from the inventory
        List<Map.Entry<String, StockEntry>> stockEntries = inventory.getStockEntries();

        // Check if the inventory is empty
        if (stockEntries.isEmpty()) {
            // Return a CommandResult indicating that the inventory is empty
            return new CommandResult<>("The inventory is empty.");
        } else {
            // Prepare a StringBuilder to construct the output message
            StringBuilder resultMessage = new StringBuilder(MESSAGE_SUCCESS + System.lineSeparator());
            int index = 1;
            for (Map.Entry<String, StockEntry> entry : stockEntries) {
                resultMessage.append("\t").append(index).append(". ")
                        .append("Name: ").append(entry.getValue().getDrug().getName())
                        .append(", Expiry date: ").append(entry.getValue().getDrug().getExpiryDate())
                        .append(", Serial number: ").append(entry.getKey())
                        .append(", Quantity: ").append(entry.getValue().getQuantity())
                        .append(", Selling Price: ").append(entry.getValue().getDrug().getSellingPrice())
                        .append(System.lineSeparator());
                index++;
            }
            // Return a CommandResult with the success message and the list of drugs
            return new CommandResult<>(resultMessage.toString().trim());
        }
    }
}
