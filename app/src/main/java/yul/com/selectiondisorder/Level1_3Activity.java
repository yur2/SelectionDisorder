package yul.com.selectiondisorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Level1_3Activity extends AppCompatActivity {

    ArrayList<String> sort = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_3);


        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button btn4 = (Button)findViewById(R.id.btn4);
        Button btn5 = (Button)findViewById(R.id.btn5);


       // ArrayList<String> sort = new ArrayList<>();

        sort.add("밥");
        sort.add("고기");
        sort.add("면");
        sort.add("밀가루");
        sort.add("해산물");


        btn1.setText(sort.get(0));
        btn2.setText(sort.get(1));
        btn3.setText(sort.get(2));
        btn4.setText(sort.get(3));
        btn5.setText(sort.get(4));


        //btn1.setText("밥");
        //btn2.setText("고기");
        //btn3.setText("면");
        //btn4.setText("밀가루");
        //btn5.setText("해산물");



//        for(int i = 0 ; i < 4; i++)
//        {
//            // 버튼의 포지션(배열에서의 index)를 태그로 저장
//            btn[i].setTag(i);
//
//            // 클릭 리스너 등록
//            mButton[i].setOnClickListener(this);
//
//            // 출력할 데이터 생성
//            mDataList.add("하이" + i + "입니다");
//        }
//    }
//
//    /* (non-Javadoc)
//     * @see android.view.View.OnClickListener#onClick(android.view.View)
//     */
//    @Override
//    public void onClick(View v)
//    {
//        // 클릭된 뷰를 버튼으로 받아옴
//        Button newButton = (Button) v;
//
//        // 향상된 for문을 사용, 클릭된 버튼을 찾아냄
//        for(Button tempButton : mButton)
//        {
//            // 클릭된 버튼을 찾았으면
//            if(tempButton == newButton)
//            {
//                // 위에서 저장한 버튼의 포지션을 태그로 가져옴
//                int position = (Integer)v.getTag();
//
//                // 태그로 가져온 포지션을 이용해 리스트에서 출력할 데이터를 꺼내서 토스트 메시지 출력
//                Toast.makeText(this, mDataList.get(position), Toast.LENGTH_SHORT).show();
//            }
//        }
//    }


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("밥".equals(sort.get(0)))
                {
                    Intent intent = new Intent(Level1_3Activity.this, Level2_1Activity.class);
                    startActivity(intent);
                    //Toast.makeText(Level1_3Activity.this, "밥", Toast.LENGTH_SHORT).show();

                }
                //if (sort.get(0)="밥")
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("고기".equals(sort.get(1)))
                {
                    Intent intent = new Intent(Level1_3Activity.this, Level2_2Activity.class);
                    startActivity(intent);
                    //Toast.makeText(Level1_3Activity.this, "고기", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("면".equals(sort.get(2)))
                {
                    //Intent intent = new Intent(Level1_3Activity.this, Level2_2Activity.class);
                    //startActivity(intent);
                   // Toast.makeText(Level1_3Activity.this, "면", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("밀가루".equals(sort.get(3)))
                {
                    // Intent intent = new Intent(Level1_3Activity.this, Level2_1Activity.class);
                    //startActivity(intent);
                    //Toast.makeText(Level1_3Activity.this, "밀가루", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if("해산물".equals(sort.get(4)))
                {
                    //Intent intent = new Intent(Level1_3Activity.this, Level2_1Activity.class);
                    //startActivity(intent);
                    //Toast.makeText(Level1_3Activity.this, "해산물", Toast.LENGTH_SHORT).show();
                }

            }


        });


    }
}

