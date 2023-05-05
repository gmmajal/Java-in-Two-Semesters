public class TimeTable {
    private Booking times[][];

    public TimeTable(int days, int periods){
        times = new Booking[days][periods];
    }

    public boolean makeBooking(int day, int period, Booking b){
        if( (day < times.length) && (period < times[0].length)){
            if(times[day][period] == null){
                times[day][period] = b;
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean cancelBooking(int day, int period){
        if(  (day >= times.length) || (period >= times[0].length)){
            return false;
        } else if (times[day][period] == null ) {
            return false;
        } else{
            times[day][period] = null;
            return true;
        }
    }
    boolean isFree(int day, int period){
        if((day < times.length) && (period < times[0].length)){
            if(times[day][period] == null) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    Booking getBooking(int day, int period){
        if(day < times.length && period < times[0].length) {
            return times[day][period];
        }else{
            return null;
        }
    }

    int numberOfDays(){
        return times.length;
    }

    int numberOfPeriods(){
        return times[0].length;
    }
}
