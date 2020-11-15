package WorkSchedule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ECP4 {
    WorkSchedule schedule;


    @Test
    void ECP4_1(){
        WorkSchedule schedule = new WorkSchedule(7);
        schedule.setRequiredNumber(2,0,6);
        assertEquals(3,schedule.nextIncomplete(3));
    }

    @Test
    void ECP4_2(){
        WorkSchedule schedule = new WorkSchedule(2);
        schedule.setRequiredNumber(2,0,1);
        assertEquals(-1,schedule.nextIncomplete(-10));
    }

    @Test
    void ECP4_3(){
        WorkSchedule schedule = new WorkSchedule(2);
        schedule.setRequiredNumber(2,0,1);
        assertEquals(-1,schedule.nextIncomplete(2));
    }
}
