package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.TextView;

import com.example.sharedpreferences.databinding.ActivityLoginFormBinding;
import com.example.sharedpreferences.databinding.ActivityMainBinding;

public class LoginFormActivity extends AppCompatActivity {
    ActivityLoginFormBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityLoginFormBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());
        TextView mUserName = bind.txtInputEmail;
        TextView mPasswordView = bind.txtInputPassword;
        Button mSignInButton = bind.btnSignIn;

        mPasswordView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == R.id.btn_sign_in || id == EditorInfo.IME_NULL) {
                    attemptLogin();
                    return true;
                }
                return false;
            }
        });

        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptLogin();
            }

            private void attemptLogin() {
                mUserName.setError(null);
                mPasswordView.setError(null);

                String name = mUserName.getText().toString();
                String password = mPasswordView.getText().toString();
            }
        });



        }

    private void attemptLogin() {
    }


}

