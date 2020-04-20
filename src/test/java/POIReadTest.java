import java.util.List;
import java.util.Map;

import com.huahua.base.utils.file.POIUtils;


/**
 * Created by GM on 2017/9/3.
 */
public class POIReadTest {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        String destFilePath = "C:\\Users\\GYM\\Desktop\\downloadfile.xlsx";
        List list = POIUtils.readExcelWithTitle(destFilePath);
        List<Map<String,Object>> sheetList = (List) list.get(0);
        for (Map<String, Object> stringObjectMap : sheetList) {
            System.err.println(stringObjectMap);
        }
        System.out.println(sheetList.size()+"条数据");
        System.out.println(System.currentTimeMillis()-startTime);
    }


}