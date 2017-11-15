package cc.somkiat.basicunittesting.Controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import cc.somkiat.basicunittesting.R;
import cc.somkiat.basicunittesting.Validation.EmailValidation;
import cc.somkiat.basicunittesting.Validation.NameValidation;

public class MainActivity extends AppCompatActivity {

    private EditText nameInput;
    private EditText emailInput;
    private String name, email;
    private String resultNameValidation, resultEmailValidation;
    private static final String VALID_NAME = "Success name validate!!";
    private static final String VALID_EMAIL = "Success email validate!!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = findViewById(R.id.userNameInput);
        emailInput = findViewById(R.id.emailInput);
    }

    public void onSaveClick(View view){

        name = nameInput.getText().toString();
        email = emailInput.getText().toString();

        NameValidation nameValidation = new NameValidation();
        resultNameValidation = nameValidation.validate(name);

        EmailValidation emailValidation = new EmailValidation();
        resultEmailValidation = emailValidation.validate(email);

        if (!nameValidation.validate(name).equals(VALID_NAME)) {
            Toast.makeText(this,
                    "Fail!!! "+ resultNameValidation, Toast.LENGTH_SHORT).show();
        }

        else if (!emailValidation.validate(email).equals(VALID_EMAIL)) {
            Toast.makeText(this,
                    "Fail!!! " + resultEmailValidation, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Success!!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void onRevertClick(View view) {
        this.nameInput.setText(null);
        this.emailInput.setText(null);
    }

}
