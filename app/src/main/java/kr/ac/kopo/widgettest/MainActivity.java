package kr.ac.kopo.widgettest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enable_clickable_test);


//        rg=findViewById(R.id.rg);
//
//        Button btnDone=findViewById(R.id.btn_done);
//
//        btnDone.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String result="";
//                if(rg.getCheckedRadioButtonId()==R.id.rb_male){
//                    result="남성";
//                }else{
//                    result="여성";
//                }
//
//                Toast toast= Toast.makeText(getApplicationContext(),result+"을 선택하셨습니다.",Toast.LENGTH_LONG);
//                toast.show();
//            }
//        });

    }
}
