package abdulfatah.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etUsername,etPassword;
    Button btnlogin;
    TextView tvcreateaccount;
    String username,password;
    int formsuccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnlogin = findViewById(R.id.btnlogin);
        tvcreateaccount = findViewById(R.id.tvcreateaccount);


        btnlogin.setOnClickListener(this);
        tvcreateaccount.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnlogin:

                formsuccess = 2;
                username = etUsername.getText().toString();
                password = etPassword.getText().toString();

                if(username.equals("")) {
                    etUsername.setError("This field is required");
                    formsuccess--;

                }

                if(password.equals(""))    {
                    etPassword.setError("This field is required");
                    formsuccess--;
                }


                if(formsuccess == 2) {
                    Toast.makeText(this, "Login Form Successfully Validated", Toast.LENGTH_SHORT).show();
                }


                break;
            case R.id.tvcreateaccount:
                startActivity(new Intent(this, SignupActivity.class));
                break;
        }

    }
}
