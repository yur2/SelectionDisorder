package yul.com.selectiondisorder;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Main22_1Activity extends AppCompatActivity {

    Intent intent;
    Datas datas = new Datas();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22_1);

        Button btn2_1 = (Button)findViewById(R.id.btn2_1);
        Button btn2_2 = (Button)findViewById(R.id.btn2_2);
        Button btn2_3 = (Button)findViewById(R.id.btn2_3);
        Button btn2_4 = (Button)findViewById(R.id.btn2_4);

        btn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main22_1Activity.this, Main22_2Activity.class);
                //intent.getExtras().data();
               // dataSetting1();
                //intent = getIntent();
                //ArrayList<String> datas = (ArrayList<String>) intent.getExtras().get("key");
                intent.putExtra("key", datas)
                startActivity(intent);

            }

        });

        btn2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main22_1Activity.this, Main22_2Activity.class);
                //intent.getExtras().data();
                // dataSetting1();
                //intent = getIntent();
                //ArrayList<String> datas = (ArrayList<String>) intent.getExtras().get("key");
                intent.putExtra("key", datas)
                startActivity(intent);

            }

        });

        btn2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main22_1Activity.this, Main22_2Activity.class);
                //intent.getExtras().data();
                // dataSetting1();
                //intent = getIntent();
                //ArrayList<String> datas = (ArrayList<String>) intent.getExtras().get("key");
                intent.putExtra("key", datas)
                startActivity(intent);

            }

        });

        btn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main22_1Activity.this, Main22_2Activity.class);
                //intent.getExtras().data();
                // dataSetting1();
                //intent = getIntent();
                //ArrayList<String> datas = (ArrayList<String>) intent.getExtras().get("key");
                intent.putExtra("key", datas)
                startActivity(intent);

            }

        });

        btn2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main22_1Activity.this, Main22_2Activity.class);
                //intent.getExtras().data();
                // dataSetting1();
                //intent = getIntent();
                //ArrayList<String> datas = (ArrayList<String>) intent.getExtras().get("key");
                intent.putExtra("key", datas)
                startActivity(intent);

            }

        });


    }
}
