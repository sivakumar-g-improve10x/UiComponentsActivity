package com.improve10x.uicomponentsactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class MultipleWidgetActivity extends AppCompatActivity {
    Button submitBtn;
    Button seekbarBtn;
    SeekBar seekbarSb;
    TextView progressTxt;
    Button ratingbarBtn;
    RatingBar ratingBarRb;
    Button datePickerBtn;
    DatePicker dateDp;
    Button timePickerBtn;
    TimePicker timeTp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_widget);
        handleIniteViews();
        handleHideComponents();
        handleSeekbarBtn();
        handleSubmitBtn();
        handleRatingBarBtn();
        handleDatePickerBtn();
        handleTimePickerBtn();
    }

    private void handleHideComponents() {
        seekbarSb.setVisibility(View.GONE);
        ratingBarRb.setVisibility(View.GONE);
        dateDp.setVisibility(View.GONE);
        timeTp.setVisibility(View.GONE);
        submitBtn.setVisibility(View.GONE);
        progressTxt.setVisibility(View.GONE);
    }

    private void handleSubmitBtn() {
        submitBtn.setOnClickListener(v -> {
            if (seekbarSb.getVisibility() == View.VISIBLE) {
                int progress = seekbarSb.getProgress();
                progressTxt.setText(progress + "");
            }
            if (ratingBarRb.getVisibility() == View.VISIBLE) {
                String rating = String.valueOf(ratingBarRb.getRating());
                progressTxt.setText(rating);
            }
            if (dateDp.isShown() == true) {
                String date = String.valueOf(dateDp.getDayOfMonth());
                String month = String.valueOf(dateDp.getMonth()+1);
                String year = String.valueOf(dateDp.getYear());
                progressTxt.setText(date + "/" + month + "/" + year);
            }
            if (timeTp.isShown() == true) {
                String hour = String.valueOf(timeTp.getCurrentHour());
                String minute = String.valueOf(timeTp.getCurrentMinute());
                progressTxt.setText(hour + ":" + minute);
            }
        });

    }

    private void handleSeekbarBtn() {
        seekbarBtn.setOnClickListener(v -> {
            seekbarSb.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            progressTxt.setText("");
            progressTxt.setVisibility(View.VISIBLE);
            ratingBarRb.setVisibility(View.GONE);
            dateDp.setVisibility(View.GONE);
            timeTp.setVisibility(View.GONE);
        });
    }

    public void handleRatingBarBtn() {
        ratingbarBtn.setOnClickListener(view -> {
            ratingBarRb.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            progressTxt.setText("");
            progressTxt.setVisibility(View.VISIBLE);
            seekbarSb.setVisibility(View.GONE);
            dateDp.setVisibility(View.GONE);
            timeTp.setVisibility(View.GONE);
        });
    }

    public void handleDatePickerBtn() {
        datePickerBtn.setOnClickListener(view -> {
            dateDp.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            progressTxt.setText("");
            progressTxt.setVisibility(View.VISIBLE);
            seekbarSb.setVisibility(View.GONE);
            ratingBarRb.setVisibility(View.GONE);
            timeTp.setVisibility(View.GONE);
        });
    }

    public void handleTimePickerBtn() {
        timePickerBtn.setOnClickListener(view -> {
            timeTp.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            progressTxt.setText("");
            progressTxt.setVisibility(View.VISIBLE);
            seekbarSb.setVisibility(View.GONE);
            ratingBarRb.setVisibility(View.GONE);
            dateDp.setVisibility(View.GONE);
        });
    }

    private void handleIniteViews() {
        seekbarBtn = findViewById(R.id.seekbar_btn);
        seekbarSb = findViewById(R.id.seekbar_sb);
        submitBtn = findViewById(R.id.submit_btn);
        progressTxt = findViewById(R.id.progress_txt);
        ratingbarBtn = findViewById(R.id.ratingbar_btn);
        ratingBarRb = findViewById(R.id.rating_rb);
        datePickerBtn = findViewById(R.id.date_btn);
        dateDp = findViewById(R.id.date_dp);
        timePickerBtn = findViewById(R.id.timepicker_btn);
        timeTp = findViewById(R.id.time_tp);
    }
}