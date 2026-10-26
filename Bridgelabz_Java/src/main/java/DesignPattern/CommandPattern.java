
/*
Program 14: Command Design Pattern

Purpose:
Command Pattern encapsulates a request inside an object.
The RemoteControl invokes a command without knowing its details.
*/

// Common interface for all commands
interface Command {
    void execute();
}

// Receiver that performs the actual operation
class Light {
    public void turnOn() {
        System.out.println("Light turned ON");
    }

    public void turnOff() {
        System.out.println("Light turned OFF");
    }
}

// Command to turn the light on
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // Delegate the operation to the receiver
        light.turnOn();
    }
}

// Command to turn the light off
class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // Delegate the operation to the receiver
        light.turnOff();
    }
}

// Invoker executes the supplied command
class RemoteControl {
    public void pressButton(Command command) {
        command.execute();
    }
}

public class CommandPattern {
    public static void main(String[] args) {
        // Create the receiver
        Light light = new Light();

        // Create command objects
        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);

        // The remote executes commands without knowing their internals
        RemoteControl remote = new RemoteControl();

        remote.pressButton(onCommand);
        remote.pressButton(offCommand);
    }
}
