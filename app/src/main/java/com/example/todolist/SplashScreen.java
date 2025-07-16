package com.example.todolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // links to your XML

        // Animate progress bar
        ProgressBar progressBar = findViewById(R.id.progressBar);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.progressbar);
        progressBar.startAnimation(animation);

        // Go to MainActivity after 2.5 seconds
        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashScreen.this, MainActivity.class));
            finish(); // close splash so back button doesn't return to it
        }, 2500);
    }
}
