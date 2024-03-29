package com.bs.qa.util;

import com.bs.qa.base.TestBase;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestUtil extends TestBase {
    public static String testDataPath = "C:\\Users\\HP\\IdeaProjects\\BookSwagon\\src\\main\\java\\com\\bs\\qa\\testdata\\Book.xlsx";
    static Workbook book;
    static org.apache.poi.ss.usermodel.Sheet sheet;

    public static Object[][] getTestData(String SheetName) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(testDataPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet(SheetName);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
            }
        }
        return data;
    }

    public void failedTest(String FTname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File SFile = ts.getScreenshotAs(OutputType.FILE);
        File DFile = new File("C:\\Users\\Admin\\eclipse-workspace\\Bookswagon\\BS_ScreenShots\\" + FTname + ".png");
        FileHandler.copy(SFile, DFile);
    }
}
