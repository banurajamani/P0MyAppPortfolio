package banu.homesession.p0myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Toast mToast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAToast (String message){
        if (mToast != null) {
            mToast.cancel();
        }
        mToast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        mToast.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //launchApp1
    public void launchApp1(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        String text = "Launching " + context.getResources().getString(R.string.app1);

        showAToast(text);

    }

    public void launchApp2(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        String text = "Launching " + context.getResources().getString(R.string.app2);
        showAToast(text);
    }

    public void launchApp3(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "Launching " + context.getResources().getString(R.string.app3);
        showAToast(text.toString());
    }

    public void launchApp4(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        String text = "Launching " + context.getResources().getString(R.string.app4);
        showAToast(text);
    }
    public void launchApp5(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        String text = "Launching " + context.getResources().getString(R.string.app5);
        showAToast(text);
    }

    public void launchApp6(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        String text = "Launching " + context.getResources().getString(R.string.app6);
        showAToast(text);
    }
}
