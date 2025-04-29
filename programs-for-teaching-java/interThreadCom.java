// A simple Java program to run 3 tasks (Notepad, Music, Message) one after another in loop
// Each task runs for a few seconds, then passes control to the next one

import java.io.IOException;

// This class helps all threads know whose turn it is to run
class TaskController {
    int turn = 1; // 1 = Notepad, 2 = Media, 3 = Message
}

// Task to open Notepad
class TaskNotepad extends Thread {
    TaskController controller;

    TaskNotepad(TaskController controller) {
        this.controller = controller;
    }

    public void run() {
        while (true) {
            synchronized (controller) {
                // Wait until it's Notepad's turn
                while (controller.turn != 1) {
                    try {
                        controller.wait();
                    } catch (InterruptedException e) {}
                }

                System.out.println("\n[📝] Opening Notepad for 5 seconds...");
                try {
                    // Open Notepad
                    Process p = Runtime.getRuntime().exec("notepad.exe");
                    Thread.sleep(5000); // Let it stay open for 5 sec
                    p.destroy();         // Close Notepad
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }

                // Pass turn to Media
                controller.turn = 2;
                controller.notifyAll(); // Wake up other threads
            }
        }
    }
}

// Task to open Media Player with a song
class TaskMedia extends Thread {
    TaskController controller;

    TaskMedia(TaskController controller) {
        this.controller = controller;
    }

    public void run() {
        while (true) {
            synchronized (controller) {
                // Wait until it's Media's turn
                while (controller.turn != 2) {
                    try {
                        controller.wait();
                    } catch (InterruptedException e) {}
                }

                System.out.println("\n[🎵] Playing music for 30 seconds...");
                try {
                    // Open music file using cmd
                    Process p = Runtime.getRuntime().exec(
                        "cmd /c start \"\" \"C:\\Users\\admin\\Downloads\\song-1.mp3\"");
                    Thread.sleep(30000); // Let it play for 30 sec
                    p.destroy();         // Stop process if possible
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }

                // Pass turn to Message
                controller.turn = 3;
                controller.notifyAll();
            }
        }
    }
}

// Task to show a simple message
class TaskMessage extends Thread {
    TaskController controller;

    TaskMessage(TaskController controller) {
        this.controller = controller;
    }

    public void run() {
        while (true) {
            synchronized (controller) {
                // Wait until it's Message's turn
                while (controller.turn != 3) {
                    try {
                        controller.wait();
                    } catch (InterruptedException e) {}
                }

                System.out.println("\n[💬] Message: Hello! This is your reminder.");

                try {
                    Thread.sleep(5000); // Show message for 5 seconds
                } catch (InterruptedException e) {}

                // Back to Notepad
                controller.turn = 1;
                controller.notifyAll();
            }
        }
    }
}

// Main class to start all threads
public class interThreadCom {
    public static void main(String[] args) {
        TaskController controller = new TaskController(); // Shared controller

        // Start all 3 tasks (threads)
        new TaskNotepad(controller).start();
        new TaskMedia(controller).start();
        new TaskMessage(controller).start();
    }
}
