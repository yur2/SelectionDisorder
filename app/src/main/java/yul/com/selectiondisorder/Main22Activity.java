package yul.com.selectiondisorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Main22Activity extends AppCompatActivity {

    ArrayList<String> foods = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        Button btn221 = (Button)findViewById(R.id.btn221);
        Button btn222 = (Button)findViewById(R.id.btn222);
        Button btn223 = (Button)findViewById(R.id.btn223);
        Button btn224 = (Button)findViewById(R.id.btn224);
        Button btn225 = (Button)findViewById(R.id.btn225);

        foods.add("밥");
        foods.add("면");
        foods.add("고기");
        foods.add("밀가루");
        foods.add("해산물");

        btn221.setText(foods.get(0));
        btn221.setText(foods.get(1));
        btn221.setText(foods.get(2));
        btn221.setText(foods.get(3));
        btn221.setText(foods.get(4));

        btn221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main22Activity.this, Main22_1Activity.class);
                startActivity(intent);

            }
        });

        btn222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main22Activity.this, Main22_1Activity.class);
                startActivity(intent);

            }
        });


        btn223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main22Activity.this, Main22_1Activity.class);
                startActivity(intent);

            }
        });


        btn224.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main22Activity.this, Main22_1Activity.class);
                startActivity(intent);

            }
        });


        btn225.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main22Activity.this, Main22_1Activity.class);
                startActivity(intent);

            }
        });


    }
}
