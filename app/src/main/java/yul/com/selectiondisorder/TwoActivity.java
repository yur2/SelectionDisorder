package yul.com.selectiondisorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TwoActivity extends AppCompatActivity {

    Intent intent;
    Data data;
    int cnt;
    ArrayList<String> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        getIntentprocess();

        TextView tv_two_left = (TextView) findViewById(R.id.tv_two_left);
        TextView tv_two_right = (TextView) findViewById(R.id.tv_two_right);

        tv_two_left.setText(datas.get(0) + "");
        tv_two_right.setText(datas.get(1) + "");

        tv_two_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt = 1;
                data = new Data(datas, cnt);

                Toast.makeText(TwoActivity.this, "최종선택 : " + datas.get(0), Toast.LENGTH_SHORT).show();
            }
        });
        tv_two_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt = 0;
                Toast.makeText(TwoActivity.this, "최종선택 : " + datas.get(1), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getIntentprocess() {
        intent = getIntent();
        data = (Data) intent.getSerializableExtra("data");

        for (int i = 0; i < data.datas.size(); i++) {
            datas.add(data.datas.get(i));
        }


    }
}
