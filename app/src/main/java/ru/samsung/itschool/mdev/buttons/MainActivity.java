package ru.samsung.itschool.mdev.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //объявляем переменные для компонент (виджетов)
    private TextView txt;
    private EditText etxt;
    private Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // инициализируем переменные объектами связанными с ID виджетов
        txt = findViewById(R.id.txt1);
        etxt = findViewById(R.id.etxt1);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        //создаем обработчик
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v){
                switch(v.getId()){
                    case R.id.bt1: txt.setText(etxt.getText().toString()); break;
                    case R.id.bt2: txt.setText("ничего не напишу!"); break;
                }
            }
        };
        bt1.setOnClickListener(listener);
        bt2.setOnClickListener(listener);
    }


    // декларативно заданный обработчик (атрибут onClick)
    public void quit(View view){
        finish();
    }

}