import java.util.LinkedList;
import java.util.Queue;

/**
 * Represents a task in the distributed task queue.
 */
class Task {
    private String taskName; // Name of the task
    private int priority; // Task priority (optional for now)

    /**
     * Constructor to initialize a new task with a name and priority.
     *
     * @param taskName
     *            The name of the task.
     * @param priority
     *            The priority level of the task.
     */
    public Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    /**
     * Retrieves the name of the task.
     *
     * @return Task name as a String.
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * Converts task details to a string representation.
     *
     * @return String representation of the task.
     */
    @Override
    public String toString() {
        return "Task: " + this.taskName + " (Priority: " + this.priority + ")";
    }
}

/**
 * Implements a simple distributed task queue. Tasks can be added, retrieved,
 * and processed in FIFO (First-In, First-Out) order.
 */
public class DistributedTaskQueue {
    private Queue<Task> taskQueue; // Internal queue to store tasks

    /**
     * Constructor initializes an empty task queue.
     */
    public DistributedTaskQueue() {
        this.taskQueue = new LinkedList<>();
    }

    /**
     * Adds a new task to the queue.
     *
     * @param task
     *            The task object to be added.
     */
    public void enqueueTask(Task task) {
        this.taskQueue.add(task); // Adds task to the queue
        System.out.println("Enqueued: " + task); // Print confirmation
    }

    /**
     * Retrieves and removes the next task from the queue. If the queue is
     * empty, it prints a message and returns null.
     *
     * @return The next task in the queue or null if empty.
     */
    public Task dequeueTask() {
        if (this.taskQueue.isEmpty()) {
            System.out.println("Queue is empty."); // Inform user queue is empty
            return null;
        }
        Task task = this.taskQueue.poll(); // Retrieves and removes the task from the queue
        System.out.println("Dequeued: " + task); // Print confirmation
        return task;
    }

    /**
     * Returns the number of tasks currently in the queue.
     *
     * @return The number of tasks in the queue.
     */
    public int getQueueSize() {
        return this.taskQueue.size();
    }

    /**
     * Retrieves the next task in the queue without removing it.
     *
     * @return The next task or null if the queue is empty.
     */
    public Task peekNextTask() {
        return this.taskQueue.peek();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return True if the queue has no tasks, false otherwise.
     */
    public boolean isQueueEmpty() {
        return this.taskQueue.isEmpty();
    }

    /**
     * Main method to test the distributed task queue.
     */
    public static void main(String[] args) {
        // Create a new task queue
        DistributedTaskQueue queue = new DistributedTaskQueue();

        // Add sample tasks to the queue
        queue.enqueueTask(new Task("Process Data", 1));
        queue.enqueueTask(new Task("Generate Report", 2));

        // Display queue status
        System.out.println("Queue Size: " + queue.getQueueSize());
        System.out.println("Next Task: " + queue.peekNextTask());

        // Process (dequeue) tasks
        queue.dequeueTask();
        queue.dequeueTask();
        queue.dequeueTask(); // Testing case when queue is empty
    }
}