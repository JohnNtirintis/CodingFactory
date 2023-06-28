package gr.aueb.cf.ch19.enums;

/**
 * @author Ntirintis John
 */
public class Main {
    public static void main(String[] args) {
        WeekDay weekDays;

        for(WeekDay day : WeekDay.values()){
            System.out.println(day.getDay());
        }
    }
}
