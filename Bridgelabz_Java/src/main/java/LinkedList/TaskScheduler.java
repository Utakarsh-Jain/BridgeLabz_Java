/*

Circular Linked List: Task Scheduler
Problem Statement: Create a task scheduler using a circular linked list. Each node in the list represents a task with Task ID, Task Name, Priority, and Due Date. Implement the following functionalities:
Add a task at the beginning, end, or at a specific position in the circular list.
Remove a task by Task ID.
View the current task and move to the next task in the circular list.
Display all tasks in the list starting from the head node.
Search for a task by Priority.
Hint:
Use a circular linked list where the last node’s next pointer points back to the first node, creating a circular structure.
Ensure that the list loops when traversed from the head node, so tasks can be revisited in a circular manner.
When deleting or adding tasks, maintain the circular nature by updating the appropriate next pointers.

Name : Utakarsh Jain
Date : 6/10/2026

*/

package main.java.LinkedList;
class Task {
    int taskId;
    String taskName;
    String priority;
    String dueDate;
    Task next;
    public Task(int taskId, String taskName, String priority, String dueDate) { // Constructor to initialize a task record
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}
public class TaskScheduler { // Class to manage task records
    private Task head;
    private Task tail;
    private Task currentTask;
    public void addTaskAtBeginning(int taskId, String taskName, String priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            newTask.next = head;
            tail.next = newTask;
            head = newTask;
        }
        System.out.println("Task added at the beginning.");
    }
    public void addTaskAtEnd(int taskId, String taskName, String priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            tail.next = newTask;
            newTask.next = head;
            tail = newTask;
        }
        System.out.println("Task added at the end.");
    }
    public void addTaskAtSpecificPosition(int position, int taskId, String taskName, String priority, String dueDate) {
        if (position == 1) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        Task temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position is out of bounds.");
            return;
        }
        newTask.next = temp.next;
        temp.next = newTask;
        if (temp == tail) {
            tail = newTask;
        }
        System.out.println("Task added at the specific position.");
    }
    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.taskId == taskId) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            if (currentTask != null && currentTask.taskId == taskId) {
                currentTask = null;
            }
            System.out.println("Task with ID " + taskId + " deleted.");
            return;
        }
        Task temp = head;
        Task prev = null;
        while (temp != null && temp.taskId != taskId) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Task with ID " + taskId + " not found.");
            return;
        }
        prev.next = temp.next;
        if (temp == tail) {
            tail = prev;
        }
        if (currentTask != null && currentTask.taskId == taskId) {
            currentTask = null;
        }
        System.out.println("Task with ID " + taskId + " deleted.");
    }
    public void viewCurrentTask() {
        if (currentTask == null) {
            System.out.println("No current task set.");
            return;
        }
        System.out.println("Current Task: ID: " + currentTask.taskId + ", Name: " + currentTask.taskName + ", Priority: " + currentTask.priority + ", Due Date: " + currentTask.dueDate);
    }
    public void moveToNextTask() {
        if (currentTask == null) {
            System.out.println("No current task set.");
            return;
        }
        currentTask = currentTask.next;
        System.out.println("Moved to next task.");
        viewCurrentTask();
    }
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Task temp = head;
        System.out.println("All Tasks:");
        do {
            System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
    public void searchByPriority(String priority) {
        Task temp = head;
        boolean found = false;
        System.out.println("Tasks with priority " + priority + ":");
        if (temp != null) {
            do {
                if (temp.priority.equals(priority)) {
                    System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName + ", Due Date: " + temp.dueDate);
                    found = true;
                }
                temp = temp.next;
            } while (temp != head);
        }
        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }
    public void setCurrentTask(int taskId) {
        Task temp = head;
        if (temp != null) {
            do {
                if (temp.taskId == taskId) {
                    currentTask = temp;
                    System.out.println("Current task set to ID: " + taskId);
                    return;
                }
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }
    public static void main(String[] args) {
        TaskScheduler taskScheduler = new TaskScheduler();
        taskScheduler.addTaskAtEnd(1, "Task 1", "High", "2022-01-01");
        taskScheduler.addTaskAtEnd(2, "Task 2", "Medium", "2022-01-02");
        taskScheduler.addTaskAtEnd(3, "Task 3", "Low", "2022-01-03");
        taskScheduler.displayAllTasks();
        taskScheduler.setCurrentTask(2);
        taskScheduler.viewCurrentTask();
        taskScheduler.moveToNextTask();
        taskScheduler.searchByPriority("High");
        taskScheduler.removeTaskById(2);
        taskScheduler.displayAllTasks();
    }
}
