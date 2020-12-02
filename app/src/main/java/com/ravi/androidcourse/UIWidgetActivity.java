package com.ravi.androidcourse;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class UIWidgetActivity extends AppCompatActivity {
    Button myButton,alertBtn;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i_widget);
        myButton = findViewById(R.id.myBtn);
        imageButton = findViewById(R.id.myImageBtn);
        alertBtn = findViewById(R.id.alertBtn);

        /// set button click listener
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /// toast
                Toast.makeText(UIWidgetActivity.this, "I love android", Toast.LENGTH_SHORT).show();
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(UIWidgetActivity.this, "this is an image button", Toast.LENGTH_SHORT).show();

            }
        });
        alertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlert();
            }
        });

    }
    private  void showAlert(){
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert Dialog");
        builder.setMessage("This is an alert dialog");

        // add the buttons
        builder.setPositiveButton("Continue", null);
        builder.setNegativeButton("Cancel", null);

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}