package yul.com.selectiondisorder;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by dataking on 2018-01-15.
 */

public class Data implements Serializable {

    ArrayList<String> datas;
    int cnt;

    public Data(ArrayList<String> datas, int cnt) {
        this.datas = datas;
        this.cnt = cnt;
    }
}
