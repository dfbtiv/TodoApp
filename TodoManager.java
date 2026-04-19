import java.util.ArrayList;

public class TodoManager {
    private ArrayList<Task> taskList;

    public TodoManager() {
        taskList = new ArrayList<>();
    }

    public void addTask(String title) {
        Task newTask = new Task(title);
        taskList.add(newTask);
        System.out.println("Tugas ditambahkan: " + title);
    }

    public void viewTasks() {
        if (taskList.isEmpty()) {
            System.out.println("\nTidak ada tugas saat ini.");
            return;
        }

        System.out.println("\n Daftar Tugas!");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println((i + 1) + " . " + taskList.get(i).toString());
        }

    }

    public void markTaskAsDone(int index) {
        if (index >= 0 && index < taskList.size()) {
            taskList.get(index).setDone(true);
            System.out.println("Tugas Selesai!");
        } else {
            System.out.println("\n Gagal: Tugas tidak ditemukan.");
        }
    }

    public boolean isEmpty() {
        return taskList.isEmpty();
    }

    public void deleteTasks(int index) {
        if (index >= 0 && index < taskList.size()) {
            String removedTask = taskList.get(index).getTitle();
            taskList.remove(index);
            System.out.println("Tugas '" + removedTask + "' berhasil dihapus.");
        } else {
            System.out.println("Gagal: Nomor tugas tidak ditemukan.");
        }
    }
}
