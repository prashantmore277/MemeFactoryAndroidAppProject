package com.practicle.gallary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String [] name = {"Ye Billy Hai 😼","Ye main hu 👧","Ye Meri CaR 🚐 Haaai","Aur ye hamari PaWarii HoRii Hai","Aur Ye apki last Party Horii Hai 👮 ‍"};
    ImageButton prev, next;
    ImageView pic;
    TextView text ;
    int currentImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void prev(View v) {
        text = findViewById(R.id.nameText);

        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (5 + currentImage - 1) % 5;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);

        text.setText(name[currentImage]);

    }

    public void next(View v) {
        text = findViewById(R.id.nameText);

        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = ( currentImage + 1) % 5;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);

        text.setText(name[currentImage]);


    }

}