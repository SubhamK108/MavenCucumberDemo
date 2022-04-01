package utils;

import org.openqa.selenium.*;

import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

public class ScreenshotUtil {
    public static String takeScreenshot(WebDriver webDriver) {
        TakesScreenshot ss = (TakesScreenshot) webDriver;
        File screenshot = ss.getScreenshotAs(OutputType.FILE);
        String dateStr = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy_HHmmss"));
        String fileName = "TestX_" + dateStr + ".png";
        File destinationFile = new File("C:\\My_Files\\Temp\\" + fileName);
        try {
            Files.copy(screenshot.toPath(), destinationFile.toPath());
            return fileName;
        } catch (Exception e) {
            System.out.println("Error saving screenshot!");
            return "ERROR";
        }
    }
}
