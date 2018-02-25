package com.google.firebase.codelab.friendlychat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class activity_main_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        EditText text = (EditText)findViewById(R.id.edTxtTask1);
        text.setCompoundDrawables(null, null, getResources().getDrawable(R.drawable.profile_icon), null);
    }
}
