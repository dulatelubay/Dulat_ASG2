package Assignment3.Command;

public class RemoteControl {
    private Command[] buttons = new Command[6];

    public void setCommand(int index, Command command) {
        buttons[index] = command;
    }

    public void pressButton(int index) {
        if (buttons[index] != null) {
            buttons[index].execute();
        }
    }
}
