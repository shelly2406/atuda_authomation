package Data;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Excel {
    public static String[][]
    getDataArrayFromExcel(String sheetName, String filePath)
            throws IOException {
        // Variable definition
        String[][] dataArray;
        String value;

        FileInputStream excelFile = new FileInputStream(filePath);
        XSSFWorkbook excelWBook = new XSSFWorkbook(excelFile);
        XSSFSheet excelWSheet = excelWBook.getSheet(sheetName);

        int totalRows = excelWSheet.getLastRowNum();
        int totalCol = excelWSheet.getRow(0).getLastCellNum();

        dataArray = new String[totalRows][totalCol];

        for (int i = 0; i < totalRows; i++) {
            XSSFRow currentRow = excelWSheet.getRow(i + 1);

            for (int j = 0; j < totalCol; j++) {
                XSSFCell currentCell = currentRow.getCell(j);

                if (currentCell == null) {
                    value = " ";
                }
                else {
                    value = currentRow.getCell(j).toString();
                }

                dataArray[i][j] = value;
                System.out.println(" " + value);
            }

            System.out.println();
        }

        excelWBook.close();

        return (dataArray);
    }
}
