package yul.com.selectiondisorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Datas extends AppCompatActivity {

    public class Data {
      //this.dataSettiong = dataSetting;
      //this.Data = Data;

        ArrayList<String> rices = new ArrayList<>();
        ArrayList<String> noodles = new ArrayList<>();
        ArrayList<String> meats = new ArrayList<>();
        ArrayList<String> flour = new ArrayList<>();
        ArrayList<String> seafood = new ArrayList<>();

        ArrayList<String> rices1 = new ArrayList<>();
        ArrayList<String> rices2 = new ArrayList<>();
        ArrayList<String> rices3 = new ArrayList<>();
        ArrayList<String> rices4 = new ArrayList<>();

        public Data() {
            dataSetting1();
            dataSetting2();
            //dataSetting3();
           // dataSetting4();

        }

        private void dataSetting1() {
            rices.add("볶음밥");
            rices.add("탕");
            rices.add("국");
            rices.add("한식");

            noodles.add("냉면");
            noodles.add("라멘");
            noodles.add("국수");
            noodles.add("소바");

            meats.add("소");
            meats.add("돼지");
            meats.add("오리");
            meats.add("닭");

            flour.add("전");
            flour.add("패스트푸드");
            flour.add("빵");
            flour.add("해외 음식");

            seafood.add("조개류");
            seafood.add("회");
            seafood.add("탕");
            seafood.add("구이");
        }

        private void dataSetting2(){

            rices1.add("김치볶음밥");
            rices1.add("잡탕볶음밥");
            rices1.add("해물볶음밥");
            rices1.add("기본볶음밥");

            rices2.add("곰탕");
            rices2.add("메기탕");
            rices2.add("목욕탕");
            rices2.add("해물탕");

            rices3.add("김칫국");
            rices3.add("배춧국");
            rices3.add("뭇국");
            rices3.add("오징어국");

            rices4.add("구절판");
            rices4.add("비빔밥");
            rices4.add("불고기밥");
            rices4.add("덮밥");


        }
    }}