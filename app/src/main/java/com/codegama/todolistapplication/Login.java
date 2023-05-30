package com.codegama.todolistapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.codegama.todolistapplication.activity.MainActivity;

public class Login extends AppCompatActivity {
    Button register,login;
    EditText txtUser,txtPasseord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUser=(EditText)findViewById(R.id.editTextusername);
        txtPasseord=(EditText)findViewById(R.id.editTextpassword);
        login=(Button)findViewById(R.id.buttonlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user_name = txtUser.getText().toString();
                String pass_word = txtPasseord.getText().toString();

                if (TextUtils.isEmpty(user_name)) {
                    txtUser.setError("Invalid User Name");
                    // Toast.makeText(getApplicationContext(), "invalid username", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(pass_word)) {
                    txtPasseord.setError("enter password");

                }else if(user_name.equalsIgnoreCase("admin") & pass_word.equalsIgnoreCase("admin") ){

                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                }else
                    Toast.makeText(getApplicationContext(), "Login Failure", Toast.LENGTH_SHORT).show();

            }
        });


    }
}