package yul.com.selectiondisorder;

import java.util.ArrayList;

/**
 * Created by kimkyuwan on 2018. 1. 18..
 */

public class Data {

    int TAG = 0;

    ArrayList noodle;
    ArrayList rice;

    public Data() {

        dataSetting();

    }

    private void dataSetting() {

        noodle.add("라면");
        noodle.add("라멘");
        noodle.add("소바");
        noodle.add("냉면");

        rice.add("밥");
        rice.add("볶음밥");
        rice.add("오므라이스");
        rice.add("나유리가만든맛없는계란들어간밥");


    }

    public ArrayList getData(int TAG) {
        ArrayList result = null;

        if (TAG == 0) {

            result = noodle;
        } else if (TAG == 1) {

            result = rice;
        }

        return result;
    }
}
