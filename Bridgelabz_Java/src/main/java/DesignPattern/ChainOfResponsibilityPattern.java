
/*
Program 13: Chain of Responsibility Design Pattern

Purpose:
A request passes through a chain of handlers.
Each handler decides whether to process the request
or pass it to the next handler.
*/

// Base class for all support handlers
abstract class SupportHandler {
    protected SupportHandler nextHandler;

    // Connect this handler to the next handler
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Process the request or pass it forward
    public abstract void handleRequest(int level);
}

// Handles basic support requests
class BasicSupport extends SupportHandler {
    @Override
    public void handleRequest(int level) {
        if (level == 1) {
            System.out.println("Basic Support handled the request");
        } else if (nextHandler != null) {
            // Forward requests this handler cannot handle
            nextHandler.handleRequest(level);
        }
    }
}

// Handles intermediate support requests
class IntermediateSupport extends SupportHandler {
    @Override
    public void handleRequest(int level) {
        if (level == 2) {
            System.out.println("Intermediate Support handled the request");
        } else if (nextHandler != null) {
            // Pass the request to the next handler
            nextHandler.handleRequest(level);
        }
    }
}

// Handles advanced support requests
class AdvancedSupport extends SupportHandler {
    @Override
    public void handleRequest(int level) {
        if (level == 3) {
            System.out.println("Advanced Support handled the request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level);
        } else {
            // No handler in the chain can process the request
            System.out.println("Request could not be handled");
        }
    }
}

public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        // Create the handlers
        SupportHandler basic = new BasicSupport();
        SupportHandler intermediate = new IntermediateSupport();
        SupportHandler advanced = new AdvancedSupport();

        // Build the chain: Basic -> Intermediate -> Advanced
        basic.setNextHandler(intermediate);
        intermediate.setNextHandler(advanced);

        // Send requests through the first handler
        basic.handleRequest(1);
        basic.handleRequest(2);
        basic.handleRequest(3);
    }
}
