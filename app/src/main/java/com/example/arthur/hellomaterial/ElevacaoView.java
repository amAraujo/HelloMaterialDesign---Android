package com.example.arthur.hellomaterial;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

public class ElevacaoView extends AppCompatActivity {

    private SeekBar mSeekBar;
    private Button mButton;
    private ImageView mPlaneta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elevacao_view);

        mButton = (Button) findViewById(R.id.btn_button);
        mPlaneta = (ImageView) findViewById(R.id.iv_planeta);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mSeekBar = (SeekBar) findViewById(R.id.seekBar);
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    // Altera a elevação da view ao mexer no SeekBar
                    mButton.setElevation(progress);
                    mPlaneta.setElevation(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }
}
