package youtube.app.myyoutube;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {

    private EditText name,password;
    private Button login;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        name = (EditText)findViewById(R.id.txtName);
        password = (EditText)findViewById(R.id.txtPassword);

        login = (Button)findViewById(R.id.btnLogin);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final String Name = name.getText().toString();
                final String Password = password.getText().toString();

                if(Name.equals("ubaid") && Password.equals("1234")){

                    Toast.makeText(getApplicationContext(),"Logged In",Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG).show();
                }







            }
        });



    }
}
