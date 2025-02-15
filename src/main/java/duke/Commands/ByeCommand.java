package duke.Commands;

import duke.Tasks.TaskList;
import duke.util.Storage;
import duke.util.Ui;

/**
 * ByeCommand is a subclass of DukeCommand that is used when the user inputs "bye"
 */
public class ByeCommand extends DukeCommand{
    public ByeCommand(String description) {
        super(description);
    }

    /**
     * Executes when the user inputs the keyword "bye"
     * @param tasks The current list of tasks
     * @param ui The object that deals with user interaction
     * @param storage The object that deals with the management of the database
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        return ui.showByeMessage();
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
