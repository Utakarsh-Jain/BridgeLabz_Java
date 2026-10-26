
/*
Program 12: Proxy Design Pattern

Purpose:
Proxy Pattern controls access to a real object.
Here, a proxy checks the user's role before allowing file access.
*/

// Common interface for the real object and its proxy
interface FileService {
    void readFile();
}

// Real object performs the actual file operation
class RealFileService implements FileService {
    @Override
    public void readFile() {
        System.out.println("Reading confidential file");
    }
}

// Proxy checks access before calling the real service
class FileAccessProxy implements FileService {
    private RealFileService realFileService;
    private String role;

    public FileAccessProxy(String role) {
        this.role = role;

        // Create the real service when the proxy is initialized
        realFileService = new RealFileService();
    }

    @Override
    public void readFile() {
        // Only an admin is allowed to access the file
        if (role.equalsIgnoreCase("admin")) {
            realFileService.readFile();
        } else {
            System.out.println("Access denied");
        }
    }
}

public class ProxyPattern {
    public static void main(String[] args) {
        // A normal user tries to access the file
        FileService userService = new FileAccessProxy("user");
        userService.readFile();

        // An admin tries to access the file
        FileService adminService = new FileAccessProxy("admin");
        adminService.readFile();
    }
}
