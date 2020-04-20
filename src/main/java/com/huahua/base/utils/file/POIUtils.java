package com.huahua.base.utils.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIUtils {
	/**
     * poi读取excle文件
     * @param filepath
     * @return
     * @throws Exception
     */
    public static List readExcelWithTitle(String filepath) throws Exception{
        String fileType = filepath.substring(filepath.lastIndexOf(".") + 1, filepath.length());// 获得文件类型
        // 获得流对象
        InputStream is = null;
        Workbook wb;
        try {
            is = new FileInputStream(filepath);
            if (fileType.equals("xls")) {
                wb = new HSSFWorkbook(is);
            } else if (fileType.equals("xlsx")) {
                wb = new XSSFWorkbook(is);
            } else {
                throw new Exception("读取的不是excel文件");
            }
            List result = new ArrayList();//对应excel文件
            int sheetSize = wb.getNumberOfSheets();// 获得对应的sheet页数
            for (int i = 0; i < sheetSize; i++) {  //遍历sheet页
                Sheet sheet = wb.getSheetAt(i);    //获得当前sheet页
                List<String> titles = new ArrayList<>();//放置所有的标题
                List<Map<String,String>> sheetList = new ArrayList<>();//对应sheet页的数据
                int rowSize = sheet.getLastRowNum() + 1;
                for (int j = 0; j < rowSize; j++) {//遍历行
                    Row row = sheet.getRow(j);
                    if (row == null) {//略过空行
                        continue;
                    }
                    int cellSize = row.getLastCellNum();//行中有多少个单元格，也就是有多少列
                    if (j == 0) {//第一行是标题行
                        for (int k = 0; k < cellSize; k++) {
                            Cell cell = row.getCell(k);
                            titles.add(cell.toString());
                        }
                    } else {//其他行是数据行
                        Map<String,String> rowMap = new HashMap<>();//对应一个数据行
                        for (int k = 0; k < titles.size(); k++) { // 遍历每个单元格
                            Cell cell =  row.getCell(k);
                            String key = titles.get(k);
                            String value = null;
                            if (cell != null) {
                                value = cell.toString();
                            }
                            rowMap.put(key, value);
                        }
                        sheetList.add(rowMap);
                    }
                }
                result.add(sheetList);
            }
            return result;
        } catch (FileNotFoundException e) {
            throw e;
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }
}
