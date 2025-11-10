public class TimeCalc {
    public static void main(String[] args) {
        String timeInput = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        timeInput = timeInput.replace(":",""); // removes : from the time input string
        int startTime = Integer.parseInt(timeInput);
        System.out.println("startTime = "+startTime + ", minutes need to add " + minutesToAdd); // jjust to check
        int hoursToAdd = (minutesToAdd/60);
        int finalHour = 0;
        int startHour = startTime/100;
        int startMinutes = startTime%60;
        int extraHours = 0;
        if (startMinutes+(minutesToAdd%60)>60)
            extraHours = (startMinutes+(minutesToAdd%60)/60);
        // next if block computes the final hour
        if (minutesToAdd>60) { 
            //startHour = hoursToAdd;
            finalHour = startHour+hoursToAdd;
            minutesToAdd= minutesToAdd%60;
            System.out.println("start hour :"+startHour+" final hour rn is: "+finalHour+" minutes left to add: "+minutesToAdd);
    }   else {
            if (startHour < 10)
                System.out.print("0"+startHour+":");
            else
                System.out.print(startHour+":");


    }
        if (finalHour > 10 && finalHour < 24) 
            System.out.print(finalHour+":");
        if (finalHour >24) {
                finalHour = finalHour-24;
                if (finalHour<10)
                    System.out.print("0"+finalHour+":");
                else
                    System.out.print(finalHour);
                
        }
        if (minutesToAdd> 9 && minutesToAdd < 60)
            System.out.println(minutesToAdd);
        else
            System.out.println("0"+minutesToAdd);
        
        
    }
}
