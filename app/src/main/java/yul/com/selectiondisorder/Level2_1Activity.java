package yul.com.selectiondisorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Level2_1Activity extends AppCompatActivity {

    ArrayList<String> sort1 = new ArrayList<>();
    Intent intent;
    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_1);

        getIntentprocess();


        Button btn2_1 = (Button) findViewById(R.id.btn2_1);
        Button btn2_2 = (Button) findViewById(R.id.btn2_2);
        Button btn2_3 = (Button) findViewById(R.id.btn2_3);
        Button btn2_4 = (Button) findViewById(R.id.btn2_4);

        sort1.add("볶은류");
        sort1.add("한식");
        sort1.add("탕");
        sort1.add("국");


        btn2_1.setText(sort1.get(0));
        btn2_2.setText(sort1.get(1));
        btn2_3.setText(sort1.get(2));
        btn2_4.setText(sort1.get(3));


//        btn2_1.setText("볶은류");
//        btn2_2.setText("한식");
//        btn2_3.setText("탕");
//        btn2_4.setText("국");

        btn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ("볶은류".equals(sort1.get(0))) {
                    Intent intent = new Intent(Level2_1Activity.this, Level3_1Activity.class);
                    data = new Data(sort1, sort1.get(0));
                    intent.putExtra("data", data);
                    startActivity(intent);

                    //Toast.makeText(Level2_1Activity.this, "볶은류", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btn2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ("한식".equals(sort1.get(1))) {
                    Intent intent = new Intent(Level2_1Activity.this, Level3_1Activity.class);
                    data = new Data(sort1, sort1.get(1));
                    intent.putExtra("data", data);
                    startActivity(intent);

                    //  Toast.makeText(Level2_1Activity.this, "한식", Toast.LENGTH_SHORT).show();

                }

            }
        });

        btn2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ("탕".equals(sort1.get(2))) {
                    Intent intent = new Intent(Level2_1Activity.this, Level3_1Activity.class);
                    data = new Data(sort1, sort1.get(2));
                    intent.putExtra("data", data);
                    startActivity(intent);

                    //  Toast.makeText(Level2_1Activity.this, "탕", Toast.LENGTH_SHORT).show();

                }


            }
        });

        btn2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ("국".equals(sort1.get(3))) {
                    Intent intent = new Intent(Level2_1Activity.this, Level3_1Activity.class);
                    data = new Data(sort1, sort1.get(3));
                    intent.putExtra("data", data);
                    startActivity(intent);

                    //   Toast.makeText(Level2_1Activity.this, "국", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
//    private void getIntentprocess() {
//
//        Intent intent;
//        intent = getIntent();
//        Bundle bundle = intent.getExtras();
//        String abc = bundle.getString("sort1");
//        String abc1 = intent.getExtras().getString("data");
//        data = (Data) intent.getSerializableExtra("data");
//
//        for (int i = 0; i < data.sort1.size(); i++) {
//            sort1.add(data.sort1.get(i));
//        }
}
}
