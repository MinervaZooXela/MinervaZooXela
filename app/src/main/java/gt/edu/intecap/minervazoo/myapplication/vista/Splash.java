package gt.edu.intecap.minervazoo.myapplication.vista;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import gt.edu.intecap.minervazoo.myapplication.R;
import gt.edu.intecap.minervazoo.myapplication.controlador.MainActivity;

public class Splash extends Activity {

    private static final long TIEMPO = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread splash = new Thread(){

            @Override
            public void run() {
                try{
                    sleep(TIEMPO);

                }catch(InterruptedException e){
                    e.getMessage();

                }finally{
                    Intent menu = new Intent(Splash.this, MainActivity.class);
                    startActivity(menu);
                }
            }
        };
        splash.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

