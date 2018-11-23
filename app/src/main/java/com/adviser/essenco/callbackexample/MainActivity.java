package com.adviser.essenco.callbackexample;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CallbackInterface {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Messenger messenger = new Messenger(this);
    }
    @Override
    public void callbackMessage() {
        Log.d(TAG, "Callback");
        Toast.makeText(this, "MainActivity received callback" , Toast.LENGTH_LONG).show();
    }
}
