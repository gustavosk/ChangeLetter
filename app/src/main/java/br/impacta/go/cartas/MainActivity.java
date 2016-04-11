package br.impacta.go.cartas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        Random randon = new Random();
        int i = randon.nextInt((54 -1 ) + 1) + 1;
        String rsc = "carta" + i;
        int resId = getResources().getIdentifier(rsc, "drawable", getPackageName());
        ImageView img = (ImageView)findViewById(R.id.Carta);
        img.setImageResource(resId);
        Intent intent = new Intent(this, this.getClass());
        return true;
    }
}
