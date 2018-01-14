package yul.com.selectiondisorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class OneActivity extends AppCompatActivity {

    ArrayList<String> datas = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        dataLoad();


    }

    private void dataLoad() {

        for(int i = 0 ; i < 10 ; i++){
            datas.add(i + "");
        }

    }
}
