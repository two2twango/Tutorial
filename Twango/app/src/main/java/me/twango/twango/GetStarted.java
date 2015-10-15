package me.twango.twango;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by AVIATER on 13-Oct-15.
 */
public class GetStarted extends Activity{
    ViewPager viewPager;
    GetStartedSwipeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getstarted);
        viewPager =(ViewPager)findViewById(R.id.view_pager);
        adapter = new GetStartedSwipeAdapter(this);
        viewPager.setAdapter(adapter);
    }
    View.OnClickListener handler = new View.OnClickListener(){
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.getStart:
                    // doStuff
                    startActivity(new Intent(GetStarted.this, Login.class));
                    break;

            }
        }
    };
}
