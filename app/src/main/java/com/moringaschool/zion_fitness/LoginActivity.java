package com.moringaschool.zion_fitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class LoginActivity extends AppCompatActivity {


    private static final String TAG = "LoginActivity";
    public FirebaseAuth mAuth;

    private TextView msignuptext,mrecover;
    private EditText mloginemail;
    private EditText mloginpassword;
    private Button mlogin1;
    private Button mverifyEmailAgainButton;
    TextView errorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        msignuptext=findViewById(R.id.signuptext);
        mrecover=findViewById(R.id.recover);
        mloginemail=findViewById(R.id.loginemail);
        mloginpassword=findViewById(R.id.loginpassword);
        mlogin1=findViewById(R.id.login1);
        errorView = findViewById(R.id.signInErrorView);
        mverifyEmailAgainButton=
                findViewById(R.id.verifyEmailAgainButton);

        mverifyEmailAgainButton.setVisibility(View.INVISIBLE);

        mAuth = FirebaseAuth.getInstance();


        msignuptext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,SignUpActivity.class));
            }
        });




        mlogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mloginemail.getText().toString().contentEquals("")) {


                    errorView.setText("Email cant be empty");


                } else if (mloginpassword.getText().toString().contentEquals("")) {

                    errorView.setText("Password cant be empty");

                } else {


                    mAuth.signInWithEmailAndPassword(mloginemail.getText().toString(), mloginpassword.getText().toString())
                            .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success
                                        Log.d(TAG, "signInWithEmail:success");

                                        FirebaseUser user = mAuth.getCurrentUser();

                                        if (user != null) {
                                            if (user.isEmailVerified()) {


                                                System.out.println("Email Verified : " + user.isEmailVerified());
                                                Intent NotesActivity = new Intent(LoginActivity.this,LevelActivity.class);
                                                setResult(RESULT_OK, null);
                                                startActivity(NotesActivity);
                                                LoginActivity.this.finish();


                                            }
                                            else if(user.isEmailVerified()) {
                                                Toast.makeText(LoginActivity.this, "Logged in", Toast.LENGTH_SHORT).show();
                                                finish();
                                                startActivity(new Intent(LoginActivity.this, LevelActivity.class));
                                            }
                                            else {

                                                mverifyEmailAgainButton.setVisibility(View.VISIBLE);
                                                errorView.setText("Please Verify your EmailID and SignIn");

                                            }
                                        }

                                    }


                                    else {
                                        // If sign in fails, display a message to the user.
                                        Log.w(TAG, "signInWithEmail:failure", task.getException());
                                        Toast.makeText(LoginActivity.this, "Authentication failed.",
                                                Toast.LENGTH_SHORT).show();
                                        if (task.getException() != null) {
                                            errorView.setText(task.getException().getMessage());
                                        }

                                    }

                                }

                            });


                }


            }
        });

        mrecover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,ForgotPasswordActivity.class));
            }
        });
    }
}