public class Main {
    public static void main(String[] args) {
        TodoManager manager = new TodoManager();

        manager.addTask("Belajar Java");
        manager.addTask("Daftar Magang");

        manager.viewTasks();

        System.out.println("\n------------------");

        manager.markTaskAsDone(1);

        System.out.println("------------------");

        manager.viewTasks();
    }
}
