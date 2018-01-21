package yul.com.selectiondisorder;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main22_2Activity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    ToggleButton toggleButton23;
    CheckBox checkBox23;

}

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22_2);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton = (RadioButton) findViewById(R.id.radioButton);

        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.radioButton:
                    Toast.makeText(Main22_2Activity.this, "radioButton", Toast.LENGTH_SHORT).show();

                    break;

                case R.id.radioButton2:
    }



    toggleButton23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked == true) {
                Toast.makeText(Main22_2Activity.this, "Switch ON", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Main22_2Activity.this, "Switch Off", Toast.LENGTH_SHORT).show();
            }
        }


    });


    checkBox23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked == true) {
                Toast.makeText(Main22_2Activity.this, "checkBox ON", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Main22_2Activity.this, "checkBox OFF", Toast.LENGTH_SHORT).show();
            }
        }
    });

}
