package WorkSchedule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BVA1 {
    WorkSchedule schedule;
    int size = 2;

    @BeforeEach()
    void setup() {
        schedule = new WorkSchedule(size);
    }

    @Test
    void BVA1_1() {
        schedule.setRequiredNumber(0, 0, 0);
        assertEquals(0, schedule.readSchedule(0).requiredNumber);
        for (int i = 0; i < size; i++) {
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_2() {
        schedule.setRequiredNumber(0, 0, -1);
        for (int i = 0; i < size; i++) {
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_3() {
        schedule.setRequiredNumber(0, -1, 0);
        for (int i = 0; i < size; i++) {
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_4() {
        schedule.setRequiredNumber(0, -1, -1);
        for (int i = 0; i < size; i++) {
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_5() {
        schedule.setRequiredNumber(-1, 0, 0);
        for (int i = 0; i < size; i++) {
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_6() {
        schedule.setRequiredNumber(-1, 0, -1);
        for (int i = 0; i < size; i++) {
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_7() {
        schedule.setRequiredNumber(-1, -1, 0);
        for (int i = 0; i < size; i++) {
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_8() {
        schedule.setRequiredNumber(-1, -1, -1);
        for (int i = 0; i < size; i++) {
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_9() {
        schedule.setRequiredNumber(Integer.MAX_VALUE, size - 1, size - 1);
        assertEquals(Integer.MAX_VALUE, schedule.readSchedule(size - 1).requiredNumber);
    }

    @Test
    void BVA1_10() {
        schedule.setRequiredNumber(Integer.MAX_VALUE, size - 1, size);
        for(int i = 0;i < size;i++){
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_11() {
        schedule.setRequiredNumber(Integer.MAX_VALUE, size, size - 1);
        for(int i = 0;i < size;i++){
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_12() {
        schedule.setRequiredNumber(Integer.MAX_VALUE, size, size);
        for(int i = 0;i < size;i++){
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_13() {
        schedule.setRequiredNumber(Integer.MAX_VALUE + 1, size - 1, size - 1);
        for(int i = 0;i < size;i++){
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_14() {
        schedule.setRequiredNumber(Integer.MAX_VALUE + 1, size - 1, size);
        for(int i = 0;i < size;i++){
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_15() {
        schedule.setRequiredNumber(Integer.MAX_VALUE + 1, size, size - 1);
        for(int i = 0;i < size;i++){
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }

    @Test
    void BVA1_16() {
        schedule.setRequiredNumber(Integer.MAX_VALUE + 1, size, size);
        for(int i = 0;i < size;i++){
            assertEquals(0, schedule.readSchedule(i).requiredNumber);
        }
    }
}
