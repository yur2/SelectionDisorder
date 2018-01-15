package yul.com.selectiondisorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Intent intent = null;
    int cnt = 0;
    ArrayList<String> datas = new ArrayList<>();
    Data data;
    Button btn_select_one;
    Button btn_select_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDatas();

        btn_select_one = (Button) findViewById(R.id.btn_select_one);
        btn_select_two = (Button) findViewById(R.id.btn_select_two);

        btn_select_one.setText(datas.get(0));
        btn_select_two.setText(datas.get(1));

        btn_select_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt = 1;
                datas.remove(cnt);
                intent = new Intent(MainActivity.this, OneActivity.class);
                data = new Data(datas, cnt);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

        btn_select_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt = 0;
                datas.remove(cnt);
                intent = new Intent(MainActivity.this, OneActivity.class);
                intent.putExtra("data", "String");
                startActivity(intent);
            }
        });


//        // Collection Framework
//        // 1. array -> []
//        // 2. List  -> ArrayList
//        // 3. map   -> Hashmap (Intent) Intent intent = new Intent(mainactivity.this, oneactivity.class) intent.putExtra("msg",data);
//        // 4. set   -> Hashset
//
//
//        //array 선언
//        int[] student;
//        int[] student2 = new int[10];
//        int[] student3 = {1,2,3,4,5,6,7,8,9,10};
//
//        //array 값 입력
//        student = new int[10];
//        student[0] = 1;
//        student2[0] = 1;
//        Log.d("Student3", "===================="+student3[0]);
//
//
//        //ArrayList 선언
//        ArrayList data = new ArrayList();
//
//        //ArrayList 값 입력
//        data.add("1");
//        data.add(1);
//
//        //ArrayList 삭제
//        data.remove(0);
//
//        //ArrayList 특정위치 값 확인
//        data.get(1);
//
//
//        // Map 선언
//        HashMap map = new HashMap();
//        map.put("key",student3[0]);
//        map.put("key",student3[1]);
//
//
//        // Map 가져오기
//        map.get("key");

    }

    private void initDatas() {

        datas.add("1");
        datas.add("2");
        datas.add("3");
        datas.add("4");

    }
}
