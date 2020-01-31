package co.com.choucair.certification.airbnb.util;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

import static com.diogonunes.jcdp.color.api.Ansi.FColor;

public class CustomLogger {

    private static ColoredPrinter cp = new ColoredPrinter.Builder(0, false)
            .foreground(FColor.WHITE).background(Ansi.BColor.BLUE)   //setting format
            .build();

    public static void printMessage(String message) {
        cp.println(message);
    }

}
