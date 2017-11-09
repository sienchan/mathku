package mosxs.adhiaka.com.mymathq;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    int op;
    int angka, angka1, bener=0, salah=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttsb(View view) {
        EditText et1 = (EditText)findViewById(R.id.Number1);
        EditText et2 = (EditText)findViewById(R.id.Number2);
        EditText et3 = (EditText)findViewById(R.id.Op);

        int random1,random2,random3;

        random1=(int)(Math.random()*100+1);
        random2=(int)(Math.random()*100+1);
        random3=(int)(Math.random()*4);
        String e1 =String.valueOf(random1);
        String e2 =String.valueOf(random2);
        et1.setText(e1);
        et2.setText(e2);

        if(random3==0){
            et3.setText("+");
        }
        if(random3==1){
            et3.setText("-");
        }
        if(random3==2){
            et3.setText("/");
        }
        if(random3==3){
            et3.setText("*");
        }

        angka=random1;
        angka1=random2;
        op=random3;
    }

    public void cek(View view) {


        EditText et1 = (EditText)findViewById(R.id.Jawab);
        TextView tv1 = (TextView) findViewById(R.id.textBS);
        TextView tv2 = (TextView) findViewById(R.id.hasilB);
        TextView tv3 = (TextView) findViewById(R.id.hasilS);
        int hasil;

        if(op==0)
        {
            hasil=angka + angka1;
            if(hasil==Integer.parseInt(et1.getText().toString()))
            {
                tv1.setText("Jawaban Anda Benar");
                //tv2.setText(Integer.toString(hasil));
                //tv3.setText(Integer.toString((int)(Math.random()*100+1)));
                bener++;
                tv2.setText(Integer.toString(bener));
            }
            else
            {
                tv1.setText("Jawaban Anda Salah");
                //tv2.setText(Integer.toString(hasil));
                //tv3.setText(Integer.toString(Integer.parseInt(et1.getText().toString())));
                salah++;
                tv3.setText(Integer.toString(salah));
            }
        }
        else if(op==1)
        {
            hasil=angka - angka1;
            if(hasil==Integer.parseInt(et1.getText().toString()))
            {
                tv1.setText("Jawaban Anda Benar");
                //tv2.setText(Integer.toString(hasil));
                //tv3.setText(Integer.toString((int)(Math.random()*100+1)));
                bener++;
                tv2.setText(Integer.toString(bener));
            }
            else
            {
                tv1.setText("Jawaban Anda Salah");
                //tv2.setText(Integer.toString(hasil));
                //tv3.setText(Integer.toString(Integer.parseInt(et1.getText().toString())));
                salah++;
                tv3.setText(Integer.toString(salah));
            }
        }
        else if(op==2)
        {
            hasil = angka / angka1;
            if(hasil==Integer.parseInt(et1.getText().toString()))
            {
                tv1.setText("Jawaban Anda Benar");
                //tv2.setText(Integer.toString(hasil));
                //tv3.setText(Integer.toString((int)(Math.random()*100+1)));
                bener++;
                tv2.setText(Integer.toString(bener));
            }
            else
            {
                tv1.setText("Jawaban Anda Salah");
                //tv2.setText(Integer.toString(hasil));
                //tv3.setText(Integer.toString(Integer.parseInt(et1.getText().toString())));
                salah++;
                tv3.setText(Integer.toString(salah));
            }
        }
        else if(op==3)
        {
            hasil=angka * angka1;
            if(hasil==Integer.parseInt(et1.getText().toString()))
            {
                tv1.setText("Jawaban Anda Benar");
                //tv2.setText(Integer.toString(hasil));
                //tv3.setText(Integer.toString((int)(Math.random()*100+1)));
                bener++;
                tv2.setText(Integer.toString(bener));
            }
            else
            {
                tv1.setText("Jawaban Anda Salah");
                //tv2.setText(Integer.toString(hasil));
                //tv3.setText(Integer.toString(Integer.parseInt(et1.getText().toString())));
                salah++;
                tv3.setText(Integer.toString(salah));
            }

        }
    }
}
