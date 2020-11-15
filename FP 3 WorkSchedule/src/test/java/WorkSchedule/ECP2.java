package WorkSchedule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ECP2 {
    WorkSchedule schedule;

    @BeforeEach
    void setUp(){
        schedule = null;
    }

    @Test
    void ECP2_1(){
        WorkSchedule schedule = new WorkSchedule(3);
        schedule.setRequiredNumber(2,0,2);
        schedule.addWorkingPeriod("Subject",0,2);
        String[] workingEmployees;

        for(int i = 0; i < 3; i++){
            workingEmployees = schedule.readSchedule(i).workingEmployees;
            assertEquals("Subject",workingEmployees[0]);
            assertEquals(1,workingEmployees.length);
        }
    }

    @Test
    void ECP2_1_1(){
        WorkSchedule schedule = new WorkSchedule(3);
        schedule.setRequiredNumber(2,1,2);
        schedule.addWorkingPeriod("Subject",1,2);
        String[] workingEmployees;

        for(int i = 1; i < 3; i++){
            workingEmployees = schedule.readSchedule(i).workingEmployees;
            assertEquals("Subject",workingEmployees[0]);
            assertEquals(1,workingEmployees.length);
        }
    }

    @Test
    void ECP2_1_2(){
        WorkSchedule schedule = new WorkSchedule(3);
        schedule.setRequiredNumber(2,2,2);
        schedule.addWorkingPeriod("Subject",2,2);
        String[] workingEmployees;

        for(int i = 2; i < 3; i++){
            workingEmployees = schedule.readSchedule(i).workingEmployees;
            assertEquals("Subject",workingEmployees[0]);
            assertEquals(1,workingEmployees.length);
        }
    }

    @Test
    void ECP2_3(){
        WorkSchedule schedule = new WorkSchedule(3);
        schedule.setRequiredNumber(2,2,2);
        boolean added = schedule.addWorkingPeriod("Subject",-3,2);
        String[] workingEmployees;

        for(int i = 0; i < 3; i++){
            workingEmployees = schedule.readSchedule(i).workingEmployees;
            assertEquals(0,workingEmployees.length);
        }
        assertFalse(added);
    }

    @Test
    void ECP2_4(){
        WorkSchedule schedule = new WorkSchedule(3);
        schedule.setRequiredNumber(2,2,2);
        boolean added = schedule.addWorkingPeriod("Subject",2,4);
        String[] workingEmployees;

        for(int i = 0; i < 3; i++){
            workingEmployees = schedule.readSchedule(i).workingEmployees;
            assertEquals(0,workingEmployees.length);
        }
        assertFalse(added);
    }

    @Test
    void ECP2_5(){
        WorkSchedule schedule = new WorkSchedule(3);
        schedule.setRequiredNumber(2,2,2);
        boolean added = schedule.addWorkingPeriod("Subject",2,1);
        String[] workingEmployees;

        for(int i = 0; i < 3; i++){
            workingEmployees = schedule.readSchedule(i).workingEmployees;
            assertEquals(0,workingEmployees.length);
        }
        assertFalse(added);
    }

    @Test
    void ECP2_6(){
        WorkSchedule schedule = new WorkSchedule(3);
        boolean added = schedule.addWorkingPeriod("Subject",2,1);
        String[] workingEmployees;
        for(int i = 0; i < 3; i++){
            workingEmployees = schedule.readSchedule(i).workingEmployees;
            assertEquals(0,workingEmployees.length);
        }
        assertFalse(added);
    }

    @Test
    void ECP2_7(){
        WorkSchedule schedule = new WorkSchedule(4);
        schedule.setRequiredNumber(2,2,3);
        schedule.addWorkingPeriod("Subject",2,3);
        boolean added = schedule.addWorkingPeriod("Subject",2,3);
        assertFalse(added);
    }
}
