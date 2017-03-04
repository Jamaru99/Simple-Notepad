package com.idownward.android.taskreminder;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class About extends Activity {

    TextView lblInsta, lblFace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        lblInsta = (TextView) findViewById(R.id.lblInstagram);
        lblInsta.setMovementMethod(LinkMovementMethod.getInstance());

        lblFace = (TextView) findViewById(R.id.lblFacebook);
        lblFace.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
