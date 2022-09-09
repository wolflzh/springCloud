import java.text.SimpleDateFormat;
import java.util.*;

public class test {
    public static void main(String[] args) {
        int size = 93;
        List<String> newList = new ArrayList<String>(20);
        if (size > 20) {
            for (int i = 0; i <= (size / 20); i++) {
                for (int j = 20 * i; j < ((i == size / 20) ? size : 20 * (i + 1)); j++) {
                    //newList.add(imeiList.get(j));
                    newList.add(String.valueOf(j));
                    System.out.println(j);
                }
                //Map<String, Object> resultMap = getCtmsSearchResp(newList);
                //此处不需要就绪状态判断
                // (returnProcedure(ctmsLogPOList, resultMap)) return;

                newList.clear();
            }
        } else {
            //小于限制imei个数的
            //Map<String, Object> resultMap = getCtmsSearchResp(imeiList);
           // if (returnProcedure(ctmsLogPOList, resultMap)) return;

        }
    }

}
