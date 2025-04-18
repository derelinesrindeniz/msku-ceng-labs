public class MyDateTime {
    private MyDate date;
    private MyTime time;

    public MyDateTime(MyDate date, MyTime time) {
        this.date = date;
        this.time = time;
    }


    public void incrementDay() {
        date.incrementDay();
    }

    public void incrementHour() {
        time.incrementHour();
    }

    public void incrementHour(int diff) {
        int dayDiff = time.incrementHour(diff);
        if(dayDiff<0){
            date.decrementDay(-dayDiff);
        }else{
            date.incrementDay(dayDiff);
        }
    }

    public void decrementHour(int diff) {
        incrementHour(-diff);
    }


    public void incrementMinute(int diff) {
        int dayDiff = time.incrementMinute(diff);
        if (dayDiff <0) {
            date.decrementDay(-dayDiff);
        } else {
            date.incrementDay(dayDiff);
        }
    }

    public void decrementMinute(int diff) {
        incrementMinute(-diff);

    }

    public void incrementYear(int diff) {
        date.incrementYear(diff);
    }

    public void decrementDay() {
        date.decrementDay();
    }

    public void decrementYear() {
        date.decrementYear();
    }

    public void decrementMonth() {
        date.decrementMonth();
    }

    public void incrementDay(int i) {
        date.incrementDay(i);
    }

    public void decrementMonth(int i) {
        date.decrementMonth(i);
    }

    public void decrementDay(int i) {
        date.decrementDay(i);
    }

    public void incrementMonth(int i) {
        incrementMonth(i);
    }

    public void decrementYear(int i) {
        decrementYear();
    }

    public void incrementMonth() {
        date.incrementMonth();
    }

    public void incrementYear() {
        date.incrementYear();
    }

    public boolean isBefore(MyDateTime anotherDateTime) {
        if(date.isBefore(anotherDateTime.date)){
            return true;
        }
        else if(date.isAfter(anotherDateTime.date)){
            return false;
        }
        if(time.isBefore(anotherDateTime.time)){
            return true;
        }
        return false;
    }

    public boolean isAfter(MyDateTime anotherDateTime) {
        return false;
    }

    public String dayTimeDifference(MyDateTime anotherDateTime) {
        return " ";
    }

    @Override
    public String toString() {
        return date.toString() + ":" + time.toString();
    }
}

