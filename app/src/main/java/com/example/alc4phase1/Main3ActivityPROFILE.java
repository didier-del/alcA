package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3ActivityPROFILE extends AppCompatActivity {


    ImageView pc1;
    TextView textView2;
    TextView textView3;
    ImageView pc2;
    ImageView pc3;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    ImageView pc4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_profile);



        textView2=(TextView)findViewById(R.id.user_profile_name);
        textView3=(TextView)findViewById(R.id.user_profile_short_bio);
        textView6=(TextView)findViewById(R.id.country);
        textView7=(TextView)findViewById(R.id.Track);
        textView8=(TextView)findViewById(R.id.Slack_username);
        textView8=(TextView)findViewById(R.id.Phone_number);
        textView9=(TextView)findViewById(R.id.Email);

        pc1=(ImageView)findViewById(R.id.header_cover_image);
        pc2=(ImageView)findViewById(R.id.user_profile_photo);
        pc3=(ImageView)findViewById(R.id.drop_down_option_menu);
        pc4=(ImageView)findViewById(R.id.add_friend);







    }
}
