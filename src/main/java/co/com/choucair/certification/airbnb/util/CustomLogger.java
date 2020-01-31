package co.com.choucair.certification.airbnb.util;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

import static com.diogonunes.jcdp.color.api.Ansi.FColor;

public class CustomLogger {

    private static ColoredPrinter cp = new ColoredPrinter.Builder(0, false).build();

    public static void printMessage(String message) {
        cp.println("CUSTOM LOGGERS",Ansi.Attribute.DARK, FColor.GREEN, Ansi.BColor.BLACK);
        cp.println(message, Ansi.Attribute.BOLD, FColor.YELLOW, Ansi.BColor.RED);
    }

}
