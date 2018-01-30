package yul.com.selectiondisorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class yulActivity {

    static final int d = 1;

    int a;
    int b;

    public yulActivity(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public yulActivity(int c) {
        System.out.println(this.a + this.b);
    }


        public void aa(int ee, int ll){

            System.out.println(this.a + this.b);
    }




        public static void main(String []args) {

            yulActivity hh = new yulActivity(3,4);
           // System.out.println(hh.aa());
            hh.aa(3,4);
            
        }


        }



}
