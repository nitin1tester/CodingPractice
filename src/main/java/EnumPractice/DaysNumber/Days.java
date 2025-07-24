package EnumPractice.DaysNumber;

public enum Days {
    // declare ENUM
    // intialize private variable for enum value.
    // create constructor for private variable
    // write getter methord for variable;
    SUNDAY(1),MONDAY(2), TUESDAY(3),WEDNSDAY(4) , THURSDAY(5), FRIDAY(6), SATERDAY(7);

    private final int DayOfTheDay;

    Days(int DayOfTheDay) {
        this.DayOfTheDay = DayOfTheDay;
    }

    public int getDayOfTheDay(){
        return this.DayOfTheDay;
    }


}
