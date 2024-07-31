package Exercise4;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(3);

        // Adding employees
        ems.addEmployee(new Employee(1, "Alice", "Developer", 75000));
        ems.addEmployee(new Employee(2, "Bob", "Manager", 85000));
        ems.addEmployee(new Employee(3, "Charlie", "Designer", 65000));

        // Traversing employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Searching for an employee
        System.out.println("\nSearching for Employee with ID 2:");
        Employee employee = ems.searchEmployee(2);
        System.out.println(employee != null ? employee : "Employee not found");

        // Deleting an employee
        System.out.println("\nDeleting Employee with ID 2:");
        ems.deleteEmployee(2);
        ems.traverseEmployees();
    }
}

