package WorkSchelude;

import WorkSchedule.WorkSchedule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WorkScheduleTests {

    private WorkSchedule schedule;

    @BeforeAll
    public void setUp(){
        schedule = new WorkSchedule(2);
    }

}
