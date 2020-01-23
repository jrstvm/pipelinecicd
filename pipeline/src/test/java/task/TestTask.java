package task;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestTask {
    @Test
    public void test_taskHasNotNullResultAfterComplete() {
        Task task = new TaskImpl();
        task.execute();

        assertThat(task.getResult()).isNotNull();
    }
}