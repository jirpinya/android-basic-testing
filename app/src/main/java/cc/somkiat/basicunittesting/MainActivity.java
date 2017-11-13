package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String name;
    private  String email;
    private EditText nameInput;
    private EditText emailInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = findViewById(R.id.userNameInput);
        emailInput = findViewById(R.id.emailInput);
    }

    public void onSaveClick(View view) {

        name = nameInput.getText().toString();
        email = emailInput.getText().toString();

        NameValidation nameValidation = new NameValidation();
        //EmailValidation emailValidation = new EmailValidation();

        if (!nameValidation.validate(name)) {
            Toast.makeText(this, "NameValidationFailTest!", Toast.LENGTH_SHORT).show();
        }
//        else if (!emailValidation.validate(email)) {
//            Toast.makeText(this, "Email is not valid.",
//                    Toast.LENGTH_SHORT).show();
//        }
        else {
            Toast.makeText(this, "Success!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void onRevertClick(View view) {
        this.nameInput.setText(null);
        this.emailInput.setText(null);
    }
}
