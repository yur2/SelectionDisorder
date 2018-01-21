package yul.com.selectiondisorder;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.ToggleButton;

public class leveliamfull extends AppCompatActivity {

    CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
    ToggleButton toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
    SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
    ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leveliamfull);


        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                                                @Override
                                                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                                                }

                                                @Override
                                                public void onStartTrackingTouch(SeekBar seekBar) {

                                                }

                                                @Override
                                                public void onStopTrackingTouch(SeekBar seekBar) {

                                                }
                                            }

                                            );


                toggleButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked == true) {
                            Toast.makeText(leveliamfull.this, "Switch ON", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(leveliamfull.this, "Switch Off", Toast.LENGTH_SHORT).show();
                        }
                    }


                });


            checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                         @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                               if (isChecked == true) {
                                        Toast.makeText(leveliamfull.this, "checkBox ON", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(leveliamfull.this, "checkBox OFF", Toast.LENGTH_SHORT).show();
                                    }
                           }
                   });


            imageView2.setOnClickListener(new View.OnClickListener() {

                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                @Override
                public void onClick(View view) {

                                          Toast.makeText(leveliamfull.this, "button", Toast.LENGTH_SHORT).show();

                    if(true == flag){
                        imageView2.setImageDrawable(getDrawable(R.drawable.ic_launcher_background));
                                                flag = false;
                                             }
                                         else if(flag == false){
                                                   imageView2.setImageDrawable(getDrawable(R.drawable.ic_launcher_foreground));
                                                   flag = true;
                                                }

                                             }
        });
                }
            }


