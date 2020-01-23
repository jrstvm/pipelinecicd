package task;

public class TaskImpl implements Task {
    private boolean complete = false;
    private String result = null;

    public void execute() {
        System.out.println("Task execution is begin...");
        //....
        complete = true;
        result = "READY!";
        System.out.println("Task is complete...");
    }

    public boolean isComplete() {
        return complete;
    }

    public String getResult() {
        return result;
    }
}