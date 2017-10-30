package my.edu.tarc.lab21explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE = "MainActivity.Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View v){
        //Intent is a message class to transfer
        //an activity to another activity
        Intent intent = new Intent(this,ResultActivity.class);
        EditText editTextMessage = (EditText)findViewById(R.id.editTextMessage);
        String message = editTextMessage.getText().toString();
        //(tag,value)
        intent.putExtra(MESSAGE,message);

        startActivity(intent);
    }

}
