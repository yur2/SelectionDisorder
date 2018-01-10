package yul.com.selectiondisorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_left = (Button) findViewById(R.id.btn_left);
        Button btn_right = (Button) findViewById(R.id.btn_right);

        btn_left.setText("막걸리");
        btn_right.setText("칵테일");

        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "막걸리를 선택하셨습니다", Toast.LENGTH_SHORT).show();
            }
        });

        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "칵테일을 선택하셨습니다", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
