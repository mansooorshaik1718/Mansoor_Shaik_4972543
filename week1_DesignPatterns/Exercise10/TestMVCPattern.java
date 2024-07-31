package Exercise10;

public class TestMVCPattern {
    public static void main(String[] args) {
        // Create a Student model
        Student model = new Student("1", "Rahul", "A");

        // Create a Student view
        StudentView view = new StudentView();

        // Create a Student controller
        StudentController controller = new StudentController(model, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("KL Rahul");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}
