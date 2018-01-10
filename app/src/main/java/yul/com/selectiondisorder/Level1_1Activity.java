package yul.com.selectiondisorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level1_1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_1);

        Button btn_level1_1_left = (Button) findViewById(R.id.btn_level1_1_left);
        Button btn_level1_1_right = (Button) findViewById(R.id.btn_level_1_1_right);

        btn_level1_1_left.setText("크림막걸리");
        btn_level1_1_right.setText("청포도막걸리");

        btn_level1_1_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level1_1Activity.this, "크림막걸리", Toast.LENGTH_SHORT).show();
            }
        });

        btn_level1_1_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level1_1Activity.this, "청포도막걸리", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
