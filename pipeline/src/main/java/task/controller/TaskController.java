package task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import task.Task;
import task.TaskImpl;

@RestController
public class TaskController {

    @GetMapping("*")
    public String task() {
        Task task = new TaskImpl();

        task.execute();

        String result = "Not Executed!";
        if(task.isComplete()) {
            result = task.getResult();
        }
        return result;
    }
}