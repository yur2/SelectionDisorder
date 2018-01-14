package yul.com.selectiondisorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level2_1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_1);

        Button btn2_1 = (Button)findViewById(R.id.btn2_1);
        Button btn2_2 = (Button)findViewById(R.id.btn2_2);
        Button btn2_3 = (Button)findViewById(R.id.btn2_3);
        Button btn2_4 = (Button)findViewById(R.id.btn2_4);

        btn2_1.setText("볶은류");
        btn2_2.setText("한식");
        btn2_3.setText("탕");
        btn2_4.setText("국");

        btn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level2_1Activity.this, "볶은류", Toast.LENGTH_SHORT).show();
            }
        });

        btn2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level2_1Activity.this, "한식", Toast.LENGTH_SHORT).show();
            }
        });

        btn2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level2_1Activity.this, "탕", Toast.LENGTH_SHORT).show();
            }
        });

        btn2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Level2_1Activity.this, "국", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
