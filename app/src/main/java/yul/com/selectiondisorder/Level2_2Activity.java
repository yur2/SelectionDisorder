package yul.com.selectiondisorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level2_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_2);

        Button btn2_1_1 = (Button)findViewById(R.id.btn2_1_1);
        Button btn2_1_2 = (Button)findViewById(R.id.btn2_1_2);
        Button btn2_1_3 = (Button)findViewById(R.id.btn2_1_3);
        Button btn2_1_4 = (Button)findViewById(R.id.btn2_1_4);
        Button btn2_1_5 = (Button)findViewById(R.id.btn2_1_5);

        btn2_1_1.setText("소고기");
        btn2_1_2.setText("돼지고기");
        btn2_1_3.setText("오리고기");
        btn2_1_4.setText("닭고기");
        btn2_1_5.setText("기타");

        btn2_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level2_2Activity.this, "소고기", Toast.LENGTH_SHORT).show();
            }
        });

        btn2_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level2_2Activity.this, "돼지고기", Toast.LENGTH_SHORT).show();
            }
        });

        btn2_1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level2_2Activity.this, "오리고기", Toast.LENGTH_SHORT).show();
            }
        });

        btn2_1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level2_2Activity.this, "닭고기", Toast.LENGTH_SHORT).show();
            }
        });

        btn2_1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(Level2_2Activity.this, "기타", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
