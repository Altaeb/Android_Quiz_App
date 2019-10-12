package abdelfattah.AndroidQuiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Declaration of global variables used
     */
    Button submit;
    EditText userInputLastName;
    int correctAnswers = 0;
    CheckBox question5_choice4, question5_choice1, question5_choice2, question5_choice3,
            question7_choice4, question7_choice1, question7_choice2, question7_choice3,
            question9_choice1, question9_choice2, question9_choice3, question9_choice4;
    RadioButton
            question2_choice1, question2_choice2, question2_choice3, question2_choice4,
            question3_choice1, question3_choice2, question3_choice3, question3_choice4,
            question4_choice1, question4_choice2, question4_choice3, question4_choice4,
            question6_choice1, question6_choice2, question6_choice3, question6_choice4,
            question8_choice1, question8_choice2, question8_choice3, question8_choice4,
            question10_choice1, question10_choice2, question10_choice3, question10_choice4;
    LinearLayout linearLayout5_choice1, linearLayout5_choice2, linearLayout5_choice3,
            linearLayout7_choice1, linearLayout7_choice2, linearLayout7_choice3,
            linearLayout9_choice3, linearLayout9_choice4;

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
    private String getQuestionOneUserInput() {
        userInputLastName = (EditText) findViewById ( R.id.answerInputUserLanguage );
        String name = userInputLastName.getText ().toString ();
        return name;
    }

    /**
     * Check question two answers .
     */
    private void checkQuestionTwoAnswers() {
        question2_choice3 = (RadioButton) findViewById ( R.id.question2_choice3 );
        boolean isQuestion2_choice3Checked = question2_choice3.isChecked ();
        if (isQuestion2_choice3Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question three answers .
     */
    private void checkQuestionThreeAnswers() {
        question3_choice1 = (RadioButton) findViewById ( R.id.question3_choice1 );
        boolean isQuestion3_choice1Checked = question3_choice1.isChecked ();
        if (isQuestion3_choice1Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question four answers .
     */
    private void checkQuestionFourAnswers() {
        question4_choice1 = (RadioButton) findViewById ( R.id.question4_choice1 );
        boolean isQuestion4_choice1Checked = question4_choice1.isChecked ();
        if (isQuestion4_choice1Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question five answers .
     */
    private void checkQuestionFiveAnswers() {
        question5_choice1 = (CheckBox) findViewById ( R.id.question5_choice1 );
        question5_choice2 = (CheckBox) findViewById ( R.id.question5_choice2 );
        question5_choice3 = (CheckBox) findViewById ( R.id.question5_choice3 );
        question5_choice4 = (CheckBox) findViewById ( R.id.question5_choice4 );
        boolean isQuestion5_choice1Checked = question5_choice1.isChecked ();
        boolean isQuestion5_choice2Checked = question5_choice2.isChecked ();
        boolean isQuestion5_choice3Checked = question5_choice3.isChecked ();
        boolean isQuestion5_choice4Checked = question5_choice4.isChecked ();

        if (isQuestion5_choice4Checked && !isQuestion5_choice1Checked
            && !isQuestion5_choice2Checked && !isQuestion5_choice3Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question sex answers .
     */
    private void checkQuestionSexAnswers() {
        question6_choice4 = (RadioButton) findViewById ( R.id.question6_choice4 );
        boolean isQuestion6_choice4Checked = question6_choice4.isChecked ();
        if (isQuestion6_choice4Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question seven answers .
     */
    private void checkQuestionSevenAnswers() {
        question7_choice1 = (CheckBox) findViewById ( R.id.question7_choice1 );
        question7_choice2 = (CheckBox) findViewById ( R.id.question7_choice2 );
        question7_choice3 = (CheckBox) findViewById ( R.id.question7_choice3 );
        question7_choice4 = (CheckBox) findViewById ( R.id.question7_choice4 );
        boolean isQuestion7_choice1Checked = question7_choice1.isChecked ();
        boolean isQuestion7_choice2Checked = question7_choice2.isChecked ();
        boolean isQuestion7_choice3Checked = question7_choice3.isChecked ();
        boolean isQuestion7_choice4Checked = question7_choice4.isChecked ();


        if (isQuestion7_choice4Checked && !isQuestion7_choice1Checked
            && !isQuestion7_choice2Checked && !isQuestion7_choice3Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question eighth answers .
     */
    private void checkQuestionEighthAnswers() {
        question8_choice3 = (RadioButton) findViewById ( R.id.question8_choice3 );
        boolean isQuestion8_choice3Checked = question8_choice3.isChecked ();
        if (isQuestion8_choice3Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question nine answers .
     */
    private void checkQuestionNineAnswers() {
        question9_choice1 = (CheckBox) findViewById ( R.id.question9_choice1 );
        question9_choice2 = (CheckBox) findViewById ( R.id.question9_choice2 );
        question9_choice3 = (CheckBox) findViewById ( R.id.question9_choice3 );
        question9_choice4 = (CheckBox) findViewById ( R.id.question9_choice4 );

        boolean isQuestion9_choice1Checked = question9_choice1.isChecked ();
        boolean isQuestion9_choice2Checked = question9_choice2.isChecked ();
        boolean isQuestion9_choice3Checked = question9_choice3.isChecked ();
        boolean isQuestion9_choice4Checked = question9_choice4.isChecked ();
        if (isQuestion9_choice1Checked && isQuestion9_choice2Checked
            && !isQuestion9_choice3Checked && !isQuestion9_choice4Checked) {
            correctAnswers += 1;
        }
    }

    /**
     * Check question ten answers .
     */
    private void checkQuestionTenAnswers() {
        question10_choice4 = (RadioButton) findViewById ( R.id.question10_choice4 );
        boolean isQuestion10_choice4Checked = question10_choice4.isChecked ();
        if (isQuestion10_choice4Checked) {
            correctAnswers += 1;
        }
    }

    private void checkQuestionOneAnswer() {
        String name = getQuestionOneUserInput ();
        if (name.trim ().equalsIgnoreCase ( "java" )) {
            correctAnswers += 1;
        }
    }

    /**
     * Check all questions .
     */
    private void checkAllQuestions() {
        checkQuestionOneAnswer ();
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
        userInputLastName.setText ( "JAVA" );
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
        linearLayout5_choice1 = (LinearLayout) findViewById ( R.id.linearLayout5_choice1 );
        linearLayout5_choice2 = (LinearLayout) findViewById ( R.id.linearLayout5_choice2 );
        linearLayout5_choice3 = (LinearLayout) findViewById ( R.id.linearLayout5_choice3 );
        linearLayout5_choice1.setVisibility ( View.GONE );
        linearLayout5_choice2.setVisibility ( View.GONE );
        linearLayout5_choice3.setVisibility ( View.GONE );
        question6_choice3 = (RadioButton) findViewById ( R.id.question6_choice3 );
        question6_choice2 = (RadioButton) findViewById ( R.id.question6_choice2 );
        question6_choice1 = (RadioButton) findViewById ( R.id.question6_choice1 );
        question6_choice3.setVisibility ( View.GONE );
        question6_choice2.setVisibility ( View.GONE );
        question6_choice1.setVisibility ( View.GONE );
        linearLayout7_choice1 = (LinearLayout) findViewById ( R.id.linearLayout7_choice1 );
        linearLayout7_choice2 = (LinearLayout) findViewById ( R.id.linearLayout7_choice2 );
        linearLayout7_choice3 = (LinearLayout) findViewById ( R.id.linearLayout7_choice3 );
        linearLayout7_choice1.setVisibility ( View.GONE );
        linearLayout7_choice2.setVisibility ( View.GONE );
        linearLayout7_choice3.setVisibility ( View.GONE );
        question8_choice4 = (RadioButton) findViewById ( R.id.question8_choice4 );
        question8_choice2 = (RadioButton) findViewById ( R.id.question8_choice2 );
        question8_choice1 = (RadioButton) findViewById ( R.id.question8_choice1 );
        question8_choice4.setVisibility ( View.GONE );
        question8_choice2.setVisibility ( View.GONE );
        question8_choice1.setVisibility ( View.GONE );
        linearLayout9_choice3 = (LinearLayout) findViewById ( R.id.linearLayout9_choice3 );
        linearLayout9_choice4 = (LinearLayout) findViewById ( R.id.linearLayout9_choice4 );
        linearLayout9_choice3.setVisibility ( View.GONE );
        linearLayout9_choice4.setVisibility ( View.GONE );
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
                String message = getString ( R.string.correct_answers ) + correctAnswers + getString ( R.string._10 );
                Dialog ( message );
            } else {
                String message = getString ( R.string.congratulations_ );
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

        mBuilder.setTitle ( getString ( R.string.the_result ) );

        final TextView theWinTextView = (TextView) mView.findViewById ( R.id.et_theresult );
        theWinTextView.setText ( Message );

        Button btnReset = (Button) mView.findViewById ( R.id.btnReset );
        Button btnAnswer = (Button) mView.findViewById ( R.id.btnAnswer );
        if (Message == getString ( R.string.congratulations_ )) {
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
