/*
7: Exception Handling with Resource Cleanup
Problem:
You need to manage a connection that requires cleanup. Implement a class that demonstrates
handling exceptions while ensuring proper resource cleanup.
*/

package main.java.ExceptionHandling;

public class ExceptionWithResource {
    public static void main(String[] args) {
        // try-with-resources ensures close() is called automatically
        try (ResourceConnection conn = new ResourceConnection("database.url")) {
            conn.connect();
            conn.execute("SELECT * FROM users");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
