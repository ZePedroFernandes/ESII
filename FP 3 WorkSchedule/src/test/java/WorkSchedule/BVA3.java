package WorkSchedule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BVA3 {
    WorkSchedule schedule;
    int size = 2;

    @BeforeEach
    void setUp() {
        schedule = new WorkSchedule(size);
    }

    @Test
    void BVA3_1() {
        assertEquals(0, schedule.workingEmployees(0, 0).length);
    }

    @Test
    void BVA3_1_1() {
        schedule.setRequiredNumber(1, 0, 0);
        schedule.addWorkingPeriod("Subject1", 0, 0);
        assertEquals(1, schedule.workingEmployees(0, 0).length);
        assertEquals("Subject1", schedule.workingEmployees(0, 0)[0]);
    }

    @Test
    void BVA3_2() {
        assertEquals(0, schedule.workingEmployees(0, -1).length);
    }

    @Test
    void BVA3_3() {
        assertEquals(0, schedule.workingEmployees(-1, 0).length);
    }

    @Test
    void BVA3_4() {
        assertEquals(0, schedule.workingEmployees(-1, -1).length);
    }

    @Test
    void BVA3_5() {
        assertEquals(0, schedule.workingEmployees(size - 1, size - 1).length);
        schedule.setRequiredNumber(2, size - 1, size - 1);
        schedule.addWorkingPeriod("Subject1", size - 1, size - 1);
        assertEquals(1, schedule.workingEmployees(size - 1, size - 1).length);
        assertEquals("Subject1", schedule.workingEmployees(size - 1, size - 1)[0]);
    }

    @Test
    void BVA3_6() {
        assertEquals(0, schedule.workingEmployees(size - 1, size).length);
    }

    @Test
    void BVA3_7() {
        assertEquals(0, schedule.workingEmployees(size, size - 1).length);
    }

    @Test
    void BVA3_8() {
        assertEquals(0, schedule.workingEmployees(size, size).length);
    }
}
