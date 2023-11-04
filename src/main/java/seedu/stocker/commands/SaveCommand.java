package seedu.stocker.commands;

import seedu.stocker.drugs.StockEntry;
import seedu.stocker.storage.Storage;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Backups existing drug list inventory into txt file to be uploaded later.
 */
public class SaveCommand extends Command{
    public static final String COMMAND_WORD = "save";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Saves existing druglist that is loaded "
            +"into inventory when system is booted up."
            + System.lineSeparator()
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Drugs successfully saved.";

    public CommandResult execute() throws IOException {

        File holder = new File("./drugs.txt");
        if (!holder.exists()) {
            holder.createNewFile();
        }

        List<StockEntry> entries= inventory.getStockEntries();
        Storage storageManager = new Storage(inventory);
        storageManager.writeToFile("drugs.txt", "");

        for(int i = 0; i < entries.size(); i += 1){
            String name =entries.get(i).getDrug().getName();
            String date = entries.get(i).getDrug().getExpiryDate();
            String serialNumber = entries.get(i).getSerialNumber();
            String quantity = String.valueOf(entries.get(i).getQuantity());
            String toBeAppended = "Name: " + name + ", " + "Expiry date: " + date + ", "
                    + "Serial Number: " + serialNumber + ", " + "Quantity: " + quantity;
            storageManager.appendToFile("drugs.txt",toBeAppended);
        }
        return new CommandResult<>(MESSAGE_SUCCESS);
    }
}
