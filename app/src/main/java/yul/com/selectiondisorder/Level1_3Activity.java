package yul.com.selectiondisorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Level1_3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_3);


        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button btn4 = (Button)findViewById(R.id.btn4);
        Button btn5 = (Button)findViewById(R.id.btn5);


        ArrayList<String> sort = new ArrayList<>();
        sort.add("밥");
        sort.add("고기");
        sort.add("면");
        sort.add("밀가루");
        sort.add("해산물");


        btn1.setText(sort.get(0));
        btn1.setText(sort.get(1));
        btn1.setText(sort.get(2));
        btn1.setText(sort.get(3));
        btn1.setText(sort.get(4));


        //btn1.setText("밥");
        //btn2.setText("고기");
        //btn3.setText("면");
        //btn4.setText("밀가루");
        //btn5.setText("해산물");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                //Intent intent = new Intent(Level1_3Activity.this, Level2_1Activity.class);
               // Toast.makeText(Level1_3Activity.this, "밥", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Level1_3Activity.this, Level2_2Activity.class);
                Toast.makeText(Level1_3Activity.this, "고기", Toast.LENGTH_SHORT).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Level1_3Activity.this, Level2_1Activity.class);
                Toast.makeText(Level1_3Activity.this, "면", Toast.LENGTH_SHORT).show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent = new Intent(Level1_3Activity.this, Level2_1Activity.class);
                Toast.makeText(Level1_3Activity.this, "밀가루", Toast.LENGTH_SHORT).show();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Intent intent = new Intent(Level1_3Activity.this, Level2_1Activity.class);
                Toast.makeText(Level1_3Activity.this, "해산물", Toast.LENGTH_SHORT).show();
            }
        });


    }
}

