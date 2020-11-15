package WorkSchedule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BVA2 {
    WorkSchedule schedule;
    int size = 3;

    @BeforeEach
    void setUp() {
        schedule = new WorkSchedule(size);
    }

    @Test
    void BVA2_1() {
        schedule.setRequiredNumber(1, 0, size - 1);
        assertFalse(schedule.addWorkingPeriod(null, 0, 0));
    }

    @Test
    void BVA2_2() {
        schedule.setRequiredNumber(1, 0, size - 1);
        assertTrue(schedule.addWorkingPeriod("Subject", 0, 0));
        assertEquals("Subject", schedule.readSchedule(0).workingEmployees[0]);
        for (int i = 1; i < size; i++) {
            assertEquals(0, schedule.readSchedule(i).workingEmployees.length);
        }
    }

    @Test
    void BVA2_3() {
        schedule.setRequiredNumber(1, 0, size - 1);
        boolean added = schedule.addWorkingPeriod("Subject", 0, -1);
        for (int i = 0; i < size; i++) {
            assertEquals(0, schedule.readSchedule(i).workingEmployees.length);
        }
        assertFalse(added);
    }

    @Test
    void BVA2_4() {
        schedule.setRequiredNumber(1, 0, size - 1);
        boolean added = schedule.addWorkingPeriod("Subject", -1, 0);
        for (int i = 0; i < size; i++) {
            assertEquals(0, schedule.readSchedule(i).workingEmployees.length);
        }
        assertFalse(added);
    }

    @Test
    void BVA2_5() {
        schedule.setRequiredNumber(1, 0, size - 1);
        boolean added = schedule.addWorkingPeriod("Subject", -1, -1);
        for (int i = 0; i < size; i++) {
            assertEquals(0, schedule.readSchedule(i).workingEmployees.length);
        }
        assertFalse(added);
    }

    @Test
    void BVA2_6() {
        schedule.setRequiredNumber(1, 0, size - 1);
        boolean added = schedule.addWorkingPeriod(null, size - 1, size - 1);
        assertEquals(0, schedule.readSchedule(size - 1).workingEmployees.length);
        assertFalse(added);
    }

    @Test
    void BVA2_7() {
        schedule.setRequiredNumber(1, 0, size - 1);
        boolean added = schedule.addWorkingPeriod("Subject", size - 1, size - 1);
        for (int i = 0; i < size - 1; i++) {
            assertEquals(0, schedule.readSchedule(i).workingEmployees.length);
        }
        assertEquals("Subject", schedule.readSchedule(size - 1).workingEmployees[0]);
        assertTrue(added);
    }

    @Test
    void BVA2_8() {
        schedule.setRequiredNumber(1, 0, size - 1);
        boolean added = schedule.addWorkingPeriod("Subject", size - 1, size);
        for (int i = 0; i < size - 1; i++) {
            assertEquals(0, schedule.readSchedule(i).workingEmployees.length);
        }
        assertFalse(added);
    }

    @Test
    void BVA2_9() {
        schedule.setRequiredNumber(1, 0, size - 1);
        boolean added = schedule.addWorkingPeriod("Subject", size, size);
        for (int i = 0; i < size - 1; i++) {
            assertEquals(0, schedule.readSchedule(i).workingEmployees.length);
        }
        assertFalse(added);
    }

    @Test
    void BVA2_10() {
        schedule.setRequiredNumber(1, 0, size - 1);
        boolean added = schedule.addWorkingPeriod("Subject", size, size - 1);
        for (int i = 0; i < size - 1; i++) {
            assertEquals(0, schedule.readSchedule(i).workingEmployees.length);
        }
        assertFalse(added);
    }
}
