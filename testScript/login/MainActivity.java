package ph.edu.apc.mtjproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Import components for username_editText
        final EditText username_editText = (EditText) findViewById(R.id.username_editText);
//Import components for password_editText
        final EditText password_editText = (EditText) findViewById(R.id.password_editText);

//Gets user input username and password Global
//        final String username = String.valueOf(username_editText.getText());
//        final String password = String.valueOf(password_editText.getText());

//Import components for login_button
        Button login_button = (Button) findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//Initialize login username and password
                String username = String.valueOf(username_editText.getText());
                String password = String.valueOf(password_editText.getText());
                if(username.equals("admin") && password.equals("pass")){
                    //Show alert
                    Toast loginAlert = Toast.makeText(MainActivity.this,"Login successful!",Toast.LENGTH_LONG);
                    loginAlert.show();
                } else {
                    Toast loginAlert = Toast.makeText(MainActivity.this,"Invalid username and password",Toast.LENGTH_LONG);
                    loginAlert.show();
                } // End for else
            } // End of onClick
        }); // Login ()
    } // Close protect void
}//Close main
