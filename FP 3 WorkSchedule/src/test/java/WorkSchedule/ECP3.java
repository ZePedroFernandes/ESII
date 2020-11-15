package WorkSchedule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ECP3 {
    WorkSchedule schedule;

    @BeforeEach
    void setUp() {
        schedule = null;
    }

    @Test
    void ECP3_1() {
        schedule = new WorkSchedule(3);
        schedule.setRequiredNumber(2, 0, 2);
        schedule.addWorkingPeriod("Subject1", 0, 2);
        schedule.addWorkingPeriod("Subject2", 0, 2);
        assertEquals("Subject1", schedule.workingEmployees(0, 2)[0]);
        assertEquals("Subject2", schedule.workingEmployees(0, 2)[1]);

    }

    @Test
    void ECP3_2() {
        schedule = new WorkSchedule(10);
        schedule.setRequiredNumber(2, 0, 2);
        schedule.addWorkingPeriod("Subject1", 0, 2);
        schedule.addWorkingPeriod("Subject2", 0, 2);
        assertEquals(0, schedule.workingEmployees(-2, 2).length);
        assertEquals(0, schedule.workingEmployees(-2, 2).length);
    }

    @Test
    void ECP3_3() {
        schedule = new WorkSchedule(20);
        schedule.setRequiredNumber(2, 0, 2);
        schedule.addWorkingPeriod("Subject1", 0, 2);
        schedule.addWorkingPeriod("Subject2", 0, 2);
        assertEquals(0, schedule.workingEmployees(2, 30).length);
        assertEquals(0, schedule.workingEmployees(2, 30).length);
    }

    @Test
    void ECP3_4() {
        schedule = new WorkSchedule(12);
        schedule.setRequiredNumber(2, 0, 2);
        schedule.addWorkingPeriod("Subject1", 2, 2);
        schedule.addWorkingPeriod("Subject2", 2, 2);
        assertEquals(0, schedule.workingEmployees(2, -4).length);
        assertEquals(0, schedule.workingEmployees(2, -4).length);
    }

    @Test
    void ECP3_5() {
        schedule = new WorkSchedule(6);
        schedule.setRequiredNumber(2, 0, 2);
        schedule.addWorkingPeriod("Subject1", 2, 2);
        schedule.addWorkingPeriod("Subject2", 2, 2);
        assertEquals(0, schedule.workingEmployees(2, 1).length);
        assertEquals(0, schedule.workingEmployees(2, 1).length);
    }

    @Test
    void ECP3_6() {
        schedule = new WorkSchedule(6);
        assertEquals(0, schedule.workingEmployees(2, 4).length);
    }

    @Test
    void ECP3_7() {
        schedule = new WorkSchedule(6);
        schedule.setRequiredNumber(2, 0, 1);
        schedule.setRequiredNumber(3, 2, 4);
        schedule.setRequiredNumber(1, 5, 5);

        schedule.addWorkingPeriod("Subject1", 0, 1);
        schedule.addWorkingPeriod("Subject2", 0, 1);
        schedule.addWorkingPeriod("Subject3", 2, 4);
        schedule.addWorkingPeriod("Subject4", 2, 4);
        schedule.addWorkingPeriod("Subject5", 2, 4);
        schedule.addWorkingPeriod("Subject6", 5, 5);

        assertEquals(6, schedule.workingEmployees(0, 5).length);
    }
}
