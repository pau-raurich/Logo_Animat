package cat.dam.pau.logo_animat;


import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv_rad = (ImageView) findViewById(R.id.iv_rad);
        ImageView iv_ant = (ImageView) findViewById(R.id.iv_ant);
        ImageView iv_y = (ImageView) findViewById(R.id.iv_y);

        iv_y.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Animation anim_rad = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_bart);
                iv_rad.setVisibility(View.VISIBLE);
                iv_rad.startAnimation(anim_rad);

                Animation anim_ant = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_lisa);
                iv_ant.setVisibility(View.VISIBLE);
                iv_ant.startAnimation(anim_ant);
            }
        });
    }
}