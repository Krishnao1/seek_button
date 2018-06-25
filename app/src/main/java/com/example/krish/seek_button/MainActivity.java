package com.example.krish.seek_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar =(SeekBar)findViewById(R.id.sb);
        TextView textView = (TextView) findViewById(R.id.title);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, final int i, boolean b)
            {
                if(i>=65){
                    Toast.makeText(getApplicationContext(),"ur above 65 % ",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(),"u r below the 65 % ",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {
               Toast.makeText(getApplicationContext(),"U R toching the Tracking bar",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {
              Toast.makeText(getApplicationContext(),"U R Toching  way from the touch bar",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
