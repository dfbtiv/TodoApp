import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoManager manager = new TodoManager();
        Scanner input = new Scanner(System.in);
        boolean isRunning = true; /* Tombol on off */

        System.out.println("Welcome di To Do App dfbtiv!");

        // loop: aplikasi akan terus berputar selama isRunning = true
        while (isRunning) {
            System.out.println("\n MENU TO DO APP");
            System.out.println("1. Tambah Task Baru");
            System.out.println("2. Lihat Semua Task");
            System.out.println("3. Selesaikan Tugas");
            System.out.println("4. Exit");
            System.out.print("Pilih Menu (1-4): ");

            int pilihan = input.nextInt();
            input.nextLine(); /* utk membersihkan enter */

            if (pilihan == 1) {
                System.out.println("Ketik tugas yang mau ditambahkan: ");
                String namaTugas = input.nextLine();
                manager.addTask(namaTugas);
            }

            else if (pilihan == 2) {
                manager.viewTasks();
            }

            else if (pilihan == 3) {
                // cek apakah kosong atau ada task
                if (manager.isEmpty()) {
                    System.out.println("\nBelum ada tugas yang dapat diselesaikan. Add Task dulu ya!");
                } else {
                    // kalau ada list tasknya, tampilkan dan tanya
                    manager.viewTasks();
                    System.out.print("\nMasukan nomor tugas yang sudah selesai: ");
                    int nomor = input.nextInt();
                    manager.markTaskAsDone(nomor - 1);
                }
            }

            else if (pilihan == 4) {
                System.out.println("Terimakasih sudah menggunakan aplikasi ini. See You!");
                isRunning = false; /* matikan loop */
            }

            else {
                System.out.println("Pilihan Tidak Valid, coba lagi!");
            }
        }
        input.close(); /* matikan scanner agar hemat memori */
    }
}
