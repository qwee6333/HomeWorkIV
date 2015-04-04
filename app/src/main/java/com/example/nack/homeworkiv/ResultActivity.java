package com.example.nack.homeworkiv;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Nack on 2015/4/3.
 */
public class ResultActivity extends Activity {
    private TextView tvheight;
    private TextView tvweight;
    private Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        findViews();
        ShowResult();
    }
    protected void findViews(){
        tvheight =(TextView)findViewById(R.id.tvheight);
        tvweight =(TextView)findViewById(R.id.tvweight);
        btnback =(Button)findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivity.this.finish();
            }
        });
    }
    protected void ShowResult(){
        Bundle bundle=this.getIntent().getExtras();
        double BMI =bundle.getDouble("BMI");
        tvheight.setText("您的BMI值為:"+BMI);
        if (BMI > 24)
        {
        tvweight.setText("過重,超出標準了,多運動,控制一下飲食吧");
        }
        else
        {

            if (BMI<=18.5)
            {
                tvweight.setText("過輕,未達標準體重,多吃點對你才有好處.");
            }else
            {
                tvweight.setText("正常,請繼續保持下去!");
            }
        }

    }
}
