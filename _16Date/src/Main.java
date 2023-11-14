import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        //Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(date);

        //Formatta la data ottenuta in FULL, MEDIUM e SHORT
        //Stampa le varie versioni
        String dateShort = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("SHORT: " + dateShort);

        String dateMedium = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("MEDIUM: " + dateMedium);

        String dateLong = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("LONG: "+ dateLong);

        String dateFull = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("FULL: "+ dateFull);

    }
}