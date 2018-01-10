package yul.com.selectiondisorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level1_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_2);

        Button btn_level1_2_left = (Button) findViewById(R.id.btn_level1_2_left);
        Button btn_level1_2_right = (Button) findViewById(R.id.btn_level1_2_right);

        btn_level1_2_left.setText("블랙러시안");
        btn_level1_2_right.setText("피치크러쉬");

        btn_level1_2_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level1_2Activity.this, "블랙러시안", Toast.LENGTH_SHORT).show();
            }
        });

        btn_level1_2_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level1_2Activity.this, "피치크러쉬", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
