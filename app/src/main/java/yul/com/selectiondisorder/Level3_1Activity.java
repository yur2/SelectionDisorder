package yul.com.selectiondisorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Level3_1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3_1);

        Button btn3_1 = (Button)findViewById(R.id.btn3_1);
        Button btn3_2 = (Button)findViewById(R.id.btn3_2);
        Button btn3_3 = (Button)findViewById(R.id.btn3_3);
        Button btn3_4 = (Button)findViewById(R.id.btn3_4);

        ArrayList<String> sort = new ArrayList<>();

        sort.add("볶음밥, 볶은나물");
        sort.add("구절판, 비빔밥");
        sort.add("대구탕, 메기탕, 곰탕");
        sort.add("돼지국밥, 미역국, 된장국");



        btn3_1.setText(sort.get(0));
        btn3_2.setText(sort.get(1));
        btn3_3.setText(sort.get(2));
        btn3_4.setText(sort.get(3));

        btn3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level3_1Activity.this, "볶음밥, 볶은나물", Toast.LENGTH_SHORT).show();
            }
        });

        btn3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level3_1Activity.this, "구절판, 비빔밥", Toast.LENGTH_SHORT).show();
            }
        });

        btn3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level3_1Activity.this, "대구탕, 메기탕, 곰탕", Toast.LENGTH_SHORT).show();
            }
        });

        btn3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level3_1Activity.this, "돼지국밥, 미역국, 된장국", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
