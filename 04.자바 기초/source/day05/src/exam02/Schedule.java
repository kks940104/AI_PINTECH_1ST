package exam02;

public class Schedule
{
    private int year;
    private int month;
    private int day;

    public void setYear(int _year)
    {
        year = _year < 1 ? 2024 : _year;
    }

    public void setMonth(int _month)
    {
        month = _month > 12 || _month < 1 ? 1 : _month;
    }

    public void setDay(int _day)
    {
        day = month == 2 && _day > 28 ? 28 : _day; // 통제 가능.
    }

    public int getYear()
    {
        return year;
    }

    public int getMonth()
    {
        return month;
    }

    public int getDay()
    {
        return day;
    }

    void  showDate()
    {
        System.out.printf("year = %d, month = %d, day = %d%n", year, month, day);
    }
}
