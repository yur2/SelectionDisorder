package yul.com.selectiondisorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

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
                data = new Data(datas, cnt);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });


    }

    private void initDatas() {

        datas.add("1");
        datas.add("2");
        datas.add("3");
        datas.add("4");

    }
}
