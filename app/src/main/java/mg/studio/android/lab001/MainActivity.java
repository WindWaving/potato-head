package mg.studio.android.lab001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mouth, arms, ears, eyebrows, eyes, glasses, hat, mustache, nose, shoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mouth = findViewById(R.id.mouth);
        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mustache = findViewById(R.id.mustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);
    }
    private void setView(View view){
        if(view.getVisibility()==View.VISIBLE){
            view.setVisibility(View.GONE);
        }else{
            view.setVisibility(View.VISIBLE);
        }
    }
    public void cbMouth(View view){
        setView(mouth);
    }
    public void cbArms(View view){
        setView(arms);
    }
    public void cbEars(View view){
        setView(ears);
    }
    public void cbEyebrow(View view){
        setView(eyebrows);
    }
    public void cbEye(View view){
        setView(eyes);
    }
    public void cbGlasses(View view){
        setView(glasses);
    }
    public void cbHat(View view){
        setView(hat);
    }
    public void cbMustache(View view){
        setView(mustache);
    }
    public void cbNose(View view){
        setView(nose);
    }
    public void cbShoes(View view){
        setView(shoes);
    }


}
