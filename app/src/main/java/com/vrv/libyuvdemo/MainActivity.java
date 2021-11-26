package com.vrv.libyuvdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    // Used to load the 'libyuvdemo' library on application startup.
    static {
        System.loadLibrary("libyuvdemo");
    }

//    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'libyuvdemo' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}