/*
Problem Statement 7: Exception Handling with Resource Cleanup
Problem:
You need to manage a connection that requires cleanup. Implement a class that demonstrates
handling exceptions while ensuring proper resource cleanup.
Name: Utakarsh Jain
Date: 19/10/2026
*/
package main.java.ExceptionHandling;

public class ExceptionWithCleanup {
    public static void main(String[] args) {

    ResourceConnection conn =
            new ResourceConnection("database.url");

    try {
        conn.connect(); //connecting to the database
        conn.execute("SELECT * FROM users"); //executing the query

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage()); //printing the error message

    } finally {
        // this ALWAYS runs, whether exception OR not
        conn.close();
    }
}

// --- Helper class with resource management ---
static class ResourceConnection implements AutoCloseable {
    private String url;
    private boolean connected = false;

    public ResourceConnection(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("Connecting to " + url);
        connected = true;
    }

    public void execute(String query) {
        if (!connected) {
            throw new IllegalStateException("Not connected");
        }
        System.out.println("Executing: " + query);
    }

    // Required for try-with-resources
    @Override
    public void close() {
        System.out.println("Closing connection to " + url);
        connected = false;
    }
}

}
