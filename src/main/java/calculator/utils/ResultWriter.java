package calculator.utils;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ResultWriter {

    public static void writeResultToFile(String result) {

        try (DataOutputStream dataOutputStream = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("result.txt", true)))) {

            Date date = new Date();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

            String strDateTime = "Date = " + dateFormat.format(date) + "/Time = " + timeFormat.format(date);

            dataOutputStream.writeUTF(strDateTime + ", " + result + ";\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
