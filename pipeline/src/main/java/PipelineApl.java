import task.Task;
import task.TaskImpl;

public class PipelineApl {
    public static void main(String[] args) {
        Task task = new TaskImpl();

        task.execute();

        if(task.isComplete()) {
            System.out.println(task.getResult());
        }
    }
}