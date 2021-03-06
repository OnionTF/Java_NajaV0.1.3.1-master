package com.javanajautc.theba.java_naja;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class QuizTrueFalse_Chap3_1Activity extends AppCompatActivity {

    private TextView mScoreView, mQuestion;
    private Button mTrueButton, mFalseButton;

    private FirebaseAuth mAuth;
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference myRef, current_user_db_score;
    private FirebaseUser user;
    private String user_id;

    private boolean mAnswer;
    private int mScore ;
    private int mQuizNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_true_false_chap3_1);

        mAuth = FirebaseAuth.getInstance();
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        myRef = mFirebaseDatabase.getReference();

        user = mAuth.getCurrentUser();
        user_id = user.getUid();
        current_user_db_score = FirebaseDatabase.getInstance().getReference().child("Users").child(user_id).child("UserScore");

        mScoreView = findViewById(R.id.score);
        mQuestion = findViewById(R.id.Quiz);
        mTrueButton = findViewById(R.id.trueButton);
        mFalseButton = findViewById(R.id.falseButton);

        current_user_db_score.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mScore = dataSnapshot.getValue(Integer.class);
                updateQuiz();
                //Toast.makeText(QuizChap3_1Activity.this,""+mScore,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAnswer == true){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuiz();

                    Toast.makeText(QuizTrueFalse_Chap3_1Activity.this,"คำตอบถูกต้อง",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizTrueFalse_Chap3_1Activity.this,"คำตอบไม่ถูกต้อง",Toast.LENGTH_SHORT).show();
                    finish();
                    updateQuiz();
                }
            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAnswer == false){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuiz();

                    Toast.makeText(QuizTrueFalse_Chap3_1Activity.this,"คำตอบถูกต้อง",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizTrueFalse_Chap3_1Activity.this,"คำตอบไม่ถูกต้อง",Toast.LENGTH_SHORT).show();
                    finish();
                    updateQuiz();
                }
            }
        });

    }

    private void updateQuiz(){

        if (mScore == 22) {

            mQuizNumber = 0;

            current_user_db_score = FirebaseDatabase.getInstance().getReference().child("Users").child(user_id);
            Map newpost = new HashMap();
            newpost.put("UserScore", mScore);
            current_user_db_score.updateChildren(newpost);

        } else if (mScore == 23) {

            mQuizNumber = 1;

            current_user_db_score = FirebaseDatabase.getInstance().getReference().child("Users").child(user_id);
            Map newpost = new HashMap();
            newpost.put("UserScore", mScore);
            current_user_db_score.updateChildren(newpost);

        } else if (mScore == 24) {

            mQuizNumber = 2;

            current_user_db_score = FirebaseDatabase.getInstance().getReference().child("Users").child(user_id);
            Map newpost = new HashMap();
            newpost.put("UserScore", mScore);
            current_user_db_score.updateChildren(newpost);
        } else if (mScore >= 26) {

                current_user_db_score = FirebaseDatabase.getInstance().getReference().child("Users").child(user_id);
                Map newpost = new HashMap();
                newpost.put("UserScore", mScore);
                current_user_db_score.updateChildren(newpost);
            Intent intent = new Intent(QuizTrueFalse_Chap3_1Activity.this, Chap3_10Activity.class);
            finish();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);

        } else {

            current_user_db_score = FirebaseDatabase.getInstance().getReference().child("Users").child(user_id);
            Map newpost = new HashMap();
            newpost.put("UserScore", mScore);
            current_user_db_score.updateChildren(newpost);
        }

        mQuestion.setText(Quiz_True_False_Chap3.questions[mQuizNumber]);
        mAnswer = Quiz_True_False_Chap3.answers[mQuizNumber];

        if (mQuizNumber <= 0) {
            mQuizNumber = 0;
        }
        if (mQuizNumber >= 2) {
            mQuizNumber = 2;
        }

    }

    public void updateScore(int point){
        mScoreView.setText("" + mScore);
    }

}
