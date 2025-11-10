public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        time = time.replace(":",""); // removes : from the time input string
        int startTime = Integer.parseInt(time);
        int hours = startTime/100;
        int minutes = startTime%100;
        //System.out.println("startTime = "+startTime + ", minutes need to add " + minutesToAdd+" hours is: "+hours+" minutes is: "+minutes); // jjust to check
        int totalMin = (hours*60)+minutes+minutesToAdd;
        int totalHours = totalMin/60;
        int newHour = totalHours%24;
        int newMin = totalMin-(totalHours*60);
        //System.out.println("total min: "+totalMin+" totalHours: "+totalHours+" newHour: "+newHour+" newMin: "+newMin);
        if (newHour < 10 && newMin < 10)
            System.out.print("0"+newHour+":0"+newMin);
        else
            if (newHour > 9 && newMin<10)
                System.out.print(newHour+":"+"0"+newMin);
            else
                if (newHour<10 && newMin>9)
                    System.out.print("0"+newHour+":"+newMin);
                else
                    System.out.print(newHour+":"+newMin);
    }
}
