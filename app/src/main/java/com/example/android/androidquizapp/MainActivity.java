package com.example.android.androidquizapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * This app test a student knowledge on java programming.
 */
public class MainActivity extends AppCompatActivity {

    float score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Question One - Increase score if C is checked.
     */
    public void onQuestionOneClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_one_option_c:
                if (checked)
                    score = score + 1;
                    break;
        }
    }

    /**
     * Question Two - Increase score if A is checked.
     */
    public void onQuestionTwoClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_two_option_a:
                if (checked)
                    score = score + 1;
                break;
        }
    }

    /**
     * Question Three - Increase score if D is checked.
     */
    public void onQuestionThreeClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_three_option_d:
                if (checked)
                    score = score + 1;
                break;
        }
    }

    /**
     * Question Four - Increase score if A,D,E,F is checked.
     */
    public void onQuestionFourClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.question_four_option_a:
                if (checked)
                    score = score + 1/4;
                    break;
            case R.id.question_four_option_d:
                if (checked)
                    score = score + 1/4;
                break;
            case R.id.question_four_option_e:
                if (checked)
                    score = score + 1/4;
                    break;
            case R.id.question_four_option_f:
                if (checked)
                    score = score + 1/4;
                break;
        }
    }

    /**
     * Question Five - Increase score if A,D is checked.
     */
    public void onQuestionFiveClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.question_five_option_a:
                if (checked)
                    score = score + 1/2;
                break;
            case R.id.question_five_option_d:
                if (checked)
                    score = score + 1/2;
                break;
        }
    }

    /**
     * Question Six - Increase score if A is checked.
     */
    public void onQuestionSixClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_six_option_a:
                if (checked)
                    score = score + 1;
                break;
        }
    }

    /**
     * Question Seven - Increase score if C is checked.
     */
    public void onQuestionSevenClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_seven_option_c:
                if (checked)
                    score = score + 1;
                break;
        }
    }

    /**
     * Question Eight - Increase score if A is checked.
     */
    public void onQuestionEightClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_eight_option_a:
                if (checked)
                    score = score + 1;
                break;
        }
    }

    /**
     * Question Nine - Increase score if A is checked.
     */
    public void onQuestionNineClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_nine_option_a:
                if (checked)
                    score = score + 1;
                break;
        }
    }

    /**
     * Question Ten - Increase score if D is checked.
     */
    public void onQuestionTenClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_ten_option_d:
                if (checked)
                    score = score + 1;
                break;
        }
    }

    /**
     * This method is called when the submitQuiz button is clicked.
     */
    public void submitQuiz(View view) {
        // Display the quiz score on the screen
         updateScore(score);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void updateScore(float number) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view);
        scoreTextView.setText("" + number);
    }
}
