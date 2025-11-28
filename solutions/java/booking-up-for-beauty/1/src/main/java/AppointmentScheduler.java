import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
   
    public LocalDateTime schedule(String a) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(a,format);

        return ldt;
    }

    public boolean hasPassed(LocalDateTime a) {
        return a.isBefore(LocalDateTime.now());
        
    }

    public boolean isAfternoonAppointment(LocalDateTime a) {
        int h = a.getHour();
        return (h >= 12 && h < 18);
    }

    public String getDescription(LocalDateTime a) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        return "You have an appointment on " + a.format(formatter) + ".";
    }

    public LocalDate getAnniversaryDate() {
        int y = LocalDate.now().getYear();
        LocalDate d = LocalDate.of(y,9,15);
        return d;
    }
}
