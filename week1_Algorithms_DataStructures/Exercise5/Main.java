package Exercise5;

public class Main {
    public static void main(String[] args) {
        SLinkedList taskList = new SLinkedList();

        // Adding tasks
        taskList.addTask(new Task(1, "Design System", "Pending"));
        taskList.addTask(new Task(2, "Implement Feature", "In Progress"));
        taskList.addTask(new Task(3, "Test Application", "Completed"));

        // Traversing tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Searching for a task
        System.out.println("\nSearching for Task with ID 2:");
        Task task = taskList.searchTask(2);
        System.out.println(task != null ? task : "Task not found");

        // Deleting a task
        System.out.println("\nDeleting Task with ID 2:");
        taskList.deleteTask(2);
        taskList.traverseTasks();
    }
}

