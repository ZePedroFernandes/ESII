/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package WorkSchedule;

import WorkSchedule.WorkSchedule;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        WorkSchedule schedule = new WorkSchedule(3);

        schedule = new WorkSchedule(3);
        schedule.setRequiredNumber(2,1,2);
    }
}
