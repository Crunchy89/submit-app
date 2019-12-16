package ferdy.com.submitapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        ActionBar actionBar;
        actionBar = getSupportActionBar();assert actionBar != null;
        actionBar.setTitle("About");
    }
}
