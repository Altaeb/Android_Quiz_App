package abdelfattah.AndroidQuiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Declaration of global variables used
     */
    Button submit;
    int correctAnswers = 0;
    CheckBox question1_choice3,
            question5_choice4,
            question7_choice4,
            question9_choice1, question9_choice2;
    RadioButton
            question2_choice1, question2_choice2, question2_choice3, question2_choice4,
            question3_choice1, question3_choice2, question3_choice3, question3_choice4,
            question4_choice1, question4_choice2, question4_choice3, question4_choice4,
            question6_choice1, question6_choice2, question6_choice3, question6_choice4,
            question8_choice1, question8_choice2, question8_choice3, question8_choice4,
            question10_choice1, question10_choice2, question10_choice3, question10_choice4;
    LinearLayout question1_choice1, question1_choice2, question1_choice4,
            question5_choice1, question5_choice2, question5_choice3,
            question7_choice1, question7_choice2, question7_choice3,
            question9_choice3, question9_choice4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        submit = (Button) findViewById ( R.id.submitButton );
        submit.setOnClickListener ( submitButtonOnClickListener );

    }

    /**
     * Check question one answers .
     */
    private void checkQuestionOneAnswers() {

        question1_choice3 = (CheckBox) findViewById ( R.id.question1_choice3 );
        boolean isquestion1_choice3Checked = question1_choice3.isChecked ();

        if (isquestion1_choice3Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question two answers .
     */
    private void checkQuestionTwoAnswers() {
        question2_choice3 = (RadioButton) findViewById ( R.id.question2_choice3 );
        boolean isquestion2_choice3Checked = question2_choice3.isChecked ();
        if (isquestion2_choice3Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question three answers .
     */
    private void checkQuestionThreeAnswers() {
        question3_choice1 = (RadioButton) findViewById ( R.id.question3_choice1 );
        boolean isquestion3_choice1Checked = question3_choice1.isChecked ();
        if (isquestion3_choice1Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question four answers .
     */
    private void checkQuestionFourAnswers() {
        question4_choice1 = (RadioButton) findViewById ( R.id.question4_choice1 );
        boolean isquestion4_choice1Checked = question4_choice1.isChecked ();
        if (isquestion4_choice1Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question five answers .
     */
    private void checkQuestionFiveAnswers() {
        question5_choice4 = (CheckBox) findViewById ( R.id.question5_choice4 );
        boolean isquestion5_choice4Checked = question5_choice4.isChecked ();

        if (isquestion5_choice4Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question sex answers .
     */
    private void checkQuestionSexAnswers() {
        question6_choice4 = (RadioButton) findViewById ( R.id.question6_choice4 );
        boolean isquestion6_choice4Checked = question6_choice4.isChecked ();
        if (isquestion6_choice4Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question seven answers .
     */
    private void checkQuestionSevenAnswers() {
        question7_choice4 = (CheckBox) findViewById ( R.id.question7_choice4 );
        boolean isquestion7_choice4Checked = question7_choice4.isChecked ();


        if (isquestion7_choice4Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question eighth answers .
     */
    private void checkQuestionEighthAnswers() {
        question8_choice3 = (RadioButton) findViewById ( R.id.question8_choice3 );
        boolean isquestion8_choice3Checked = question8_choice3.isChecked ();
        if (isquestion8_choice3Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question nine answers .
     */
    private void checkQuestionNineAnswers() {
        question9_choice1 = (CheckBox) findViewById ( R.id.question9_choice1 );
        question9_choice2 = (CheckBox) findViewById ( R.id.question9_choice2 );

        boolean isquestion9_choice1Checked = question9_choice1.isChecked ();
        boolean isquestion9_choice2Checked = question9_choice2.isChecked ();


        if (isquestion9_choice1Checked && isquestion9_choice2Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question ten answers .
     */
    private void checkQuestionTenAnswers() {
        question10_choice4 = (RadioButton) findViewById ( R.id.question10_choice4 );
        boolean isquestion10_choice4Checked = question10_choice4.isChecked ();
        if (isquestion10_choice4Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check all questions .
     */
    private void checkAllQuestions() {
        checkQuestionOneAnswers ();
        checkQuestionTwoAnswers ();
        checkQuestionThreeAnswers ();
        checkQuestionFourAnswers ();
        checkQuestionFiveAnswers ();
        checkQuestionSexAnswers ();
        checkQuestionSevenAnswers ();
        checkQuestionEighthAnswers ();
        checkQuestionNineAnswers ();
        checkQuestionTenAnswers ();
    }

    /**
     * Reset counter correct answers .
     */
    private void resetCounterCorrectAnswers() {
        correctAnswers = 0;
    }

    /**
     * Hide all wrong answers
     */
    private void getAnswer() {
        question1_choice1 = (LinearLayout) findViewById ( R.id.question1_choice1 );
        question1_choice2 = (LinearLayout) findViewById ( R.id.question1_choice2 );
        question1_choice4 = (LinearLayout) findViewById ( R.id.question1_choice4 );
        question1_choice1.setVisibility ( View.GONE );
        question1_choice2.setVisibility ( View.GONE );
        question1_choice4.setVisibility ( View.GONE );
        question2_choice1 = (RadioButton) findViewById ( R.id.question2_choice1 );
        question2_choice2 = (RadioButton) findViewById ( R.id.question2_choice2 );
        question2_choice4 = (RadioButton) findViewById ( R.id.question2_choice4 );
        question2_choice1.setVisibility ( View.GONE );
        question2_choice2.setVisibility ( View.GONE );
        question2_choice4.setVisibility ( View.GONE );
        question3_choice3 = (RadioButton) findViewById ( R.id.question3_choice3 );
        question3_choice2 = (RadioButton) findViewById ( R.id.question3_choice2 );
        question3_choice4 = (RadioButton) findViewById ( R.id.question3_choice4 );
        question3_choice3.setVisibility ( View.GONE );
        question3_choice2.setVisibility ( View.GONE );
        question3_choice4.setVisibility ( View.GONE );
        question4_choice3 = (RadioButton) findViewById ( R.id.question4_choice3 );
        question4_choice2 = (RadioButton) findViewById ( R.id.question4_choice2 );
        question4_choice4 = (RadioButton) findViewById ( R.id.question4_choice4 );
        question4_choice3.setVisibility ( View.GONE );
        question4_choice2.setVisibility ( View.GONE );
        question4_choice4.setVisibility ( View.GONE );
        question5_choice1 = (LinearLayout) findViewById ( R.id.question5_choice1 );
        question5_choice2 = (LinearLayout) findViewById ( R.id.question5_choice2 );
        question5_choice3 = (LinearLayout) findViewById ( R.id.question5_choice3 );
        question5_choice1.setVisibility ( View.GONE );
        question5_choice2.setVisibility ( View.GONE );
        question5_choice3.setVisibility ( View.GONE );
        question6_choice3 = (RadioButton) findViewById ( R.id.question6_choice3 );
        question6_choice2 = (RadioButton) findViewById ( R.id.question6_choice2 );
        question6_choice1 = (RadioButton) findViewById ( R.id.question6_choice1 );
        question6_choice3.setVisibility ( View.GONE );
        question6_choice2.setVisibility ( View.GONE );
        question6_choice1.setVisibility ( View.GONE );
        question7_choice1 = (LinearLayout) findViewById ( R.id.question7_choice1 );
        question7_choice2 = (LinearLayout) findViewById ( R.id.question7_choice2 );
        question7_choice3 = (LinearLayout) findViewById ( R.id.question7_choice3 );
        question7_choice1.setVisibility ( View.GONE );
        question7_choice2.setVisibility ( View.GONE );
        question7_choice3.setVisibility ( View.GONE );
        question8_choice4 = (RadioButton) findViewById ( R.id.question8_choice4 );
        question8_choice2 = (RadioButton) findViewById ( R.id.question8_choice2 );
        question8_choice1 = (RadioButton) findViewById ( R.id.question8_choice1 );
        question8_choice4.setVisibility ( View.GONE );
        question8_choice2.setVisibility ( View.GONE );
        question8_choice1.setVisibility ( View.GONE );
        question9_choice3 = (LinearLayout) findViewById ( R.id.question9_choice3 );
        question9_choice4 = (LinearLayout) findViewById ( R.id.question9_choice4 );
        question9_choice3.setVisibility ( View.GONE );
        question9_choice4.setVisibility ( View.GONE );
        question10_choice3 = (RadioButton) findViewById ( R.id.question10_choice3 );
        question10_choice2 = (RadioButton) findViewById ( R.id.question10_choice2 );
        question10_choice1 = (RadioButton) findViewById ( R.id.question10_choice1 );
        question10_choice3.setVisibility ( View.GONE );
        question10_choice2.setVisibility ( View.GONE );
        question10_choice1.setVisibility ( View.GONE );


    }

    /**
     * Set ClickListener for submit button .
     */
    final View.OnClickListener submitButtonOnClickListener = new View.OnClickListener () {
        public void onClick(final View v) {
            checkAllQuestions ();
            if (correctAnswers != 10) {
                String message = "Correct Answers: " + correctAnswers + "/10";
                Dialog ( message );
            } else {
                String message = "Congratulations, all your answers are correct";
                Dialog ( message );
            }
            resetCounterCorrectAnswers ();
        }
    };


    /**
     * dialog to display message When submit button clicked .
     *
     * @param Message A message containing congratulations  .
     */
    public void Dialog(String Message) {

        AlertDialog.Builder mBuilder = new AlertDialog.Builder ( MainActivity.this );

        //  Inflate the Layout Resource file.
        View mView = getLayoutInflater ().inflate ( R.layout.dialog, null );

        mBuilder.setTitle ( "The result" );

        final TextView theWinTextView = (TextView) mView.findViewById ( R.id.et_thewin );
        theWinTextView.setText ( Message );

        Button btnReset = (Button) mView.findViewById ( R.id.btnReset );
        Button btnAnswer = (Button) mView.findViewById ( R.id.btnAnswer );
        if (Message == "Congratulations, all your answers are correct") {
            btnReset.setVisibility ( View.GONE );
        }

        mBuilder.setView ( mView );
        final AlertDialog Dialog = mBuilder.create ();

        //  Set Listener for the Reset Button
        btnReset.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( getApplicationContext (), MainActivity.class );
                startActivity ( intent );
                Dialog.dismiss ();
            }
        } );

        //  Set Listener for the Answer Button
        btnAnswer.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                getAnswer ();
                Dialog.dismiss ();
            }
        } );

        //  Finally, SHOW your Dialog!
        Dialog.show ();

    }
}
