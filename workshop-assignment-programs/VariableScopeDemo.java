
public class VariableScopeDemo {

    // Static variable (class-level scope)
    static int staticVar = 10;

    // Instance variable (object-level scope)
    int instanceVar = 20;

    public void demonstrateScope() {
        // Local variable (method-level scope)
        int localVar = 30;

        System.out.println("Static Variable: " + staticVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        // Accessing static variable directly
        System.out.println("Accessing Static Variable in main: " + staticVar);

        // Creating an object to access instance variables
        VariableScopeDemo demo = new VariableScopeDemo();
        demo.demonstrateScope();

        // Uncommenting the next line will cause an error because localVar is not accessible here
        // System.out.println(localVar);
    }
}

