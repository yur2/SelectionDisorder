package yul.com.selectiondisorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class OneActivity extends AppCompatActivity {

    Intent intent;
    Data data;
    int cnt;
    ArrayList<String> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);


        getIntentprocess();

        TextView tv_one_left = (TextView) findViewById(R.id.tv_one_left);
        TextView tv_one_right = (TextView) findViewById(R.id.tv_one_right);

        tv_one_left.setText(data.datas.get(0) + "");
        tv_one_right.setText(data.datas.get(1) + "");


        tv_one_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt = 1;
                datas.remove(cnt);
                intent = new Intent(OneActivity.this, TwoActivity.class);
                data = new Data(datas, cnt);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });
        tv_one_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt = 0;
                datas.remove(cnt);
                intent = new Intent(OneActivity.this, TwoActivity.class);
                data = new Data(datas, cnt);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

    }

    private void getIntentprocess() {

        Intent intent;
        intent = getIntent();
        Bundle bundle = intent.getExtras();
        String str = bundle.getString("datas");

        String strg = intent.getExtras().getString("data");

        data = (Data) intent.getSerializableExtra("data");


        for (int i = 0; i < data.datas.size(); i++) {
            datas.add(data.datas.get(i));
        }


    }

}
