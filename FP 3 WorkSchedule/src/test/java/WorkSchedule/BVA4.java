package WorkSchedule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BVA4 {
    WorkSchedule schedule;
    int size = 3;

    @BeforeEach
    void setUp() {
        schedule = new WorkSchedule(size);
    }

    @Test
    void BVA4_1(){
        assertEquals(-1,schedule.nextIncomplete(0));
    }

    @Test
    void BVA4_2(){
        assertEquals(-1,schedule.nextIncomplete(-1));
    }

    @Test
    void BVA4_3(){
        assertEquals(-1,schedule.nextIncomplete(size -1));
    }

    @Test
    void BVA4_4(){
        assertEquals(-1,schedule.nextIncomplete(size));
    }
}
