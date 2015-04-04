package com.example.nack.homeworkiv;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    private EditText edheight;
    private EditText edweight;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    protected void findViews(){
        edheight=(EditText)findViewById(R.id.edheight);
        edweight=(EditText)findViewById(R.id.edweight);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,ResultActivity.class);
                Bundle bundle=new Bundle();

                double height =Double.parseDouble(edheight.getText().toString());
                double weight =Double.parseDouble(edweight.getText().toString());

                //bundle.putDouble("height", height);
                //bundle.putDouble("weight", weight);
                double height2 =height/100*height/100;
                double BMI =weight/height2;
                bundle.putDouble("BMI",BMI);
                intent.putExtras(bundle);
                startActivity(intent);





            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
