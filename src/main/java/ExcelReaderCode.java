/*
<Question> What this code do?
<Answer> This reads the cell's data from an Excel sheet at resources/WebURLs.xlsx & printing it
Output:
 a b f b
 b c g d
 a b h fg
 b c f sdf
 a b g gh
 b c h hgh
 a b f hgh
 b c g hgh
 */

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReaderCode {
    public static void main(String[] args) throws IOException {
        File excelPath = new File("resources/WebURLs.xlsx");
        FileInputStream fileX = new FileInputStream(excelPath);
        Workbook wb = WorkbookFactory.create(fileX);
        Sheet sh = wb.getSheet("Sheet1");
        int rows = sh.getLastRowNum();
        int cols = sh.getRow(0).getLastCellNum();
        Row r1;

        System.out.println("Rows: "+rows+", Cols: "+cols);
        for (int i=0; i<=rows ; i++)
        {
            for (int j=0; j < cols; j++)
            {
                r1 = sh.getRow(i);
                System.out.print(" "+r1.getCell(j));
            }
            System.out.println();
        }
    }
}
