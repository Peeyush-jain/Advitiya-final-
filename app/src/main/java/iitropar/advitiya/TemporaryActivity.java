package iitropar.advitiya;

import android.graphics.Point;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class TemporaryActivity extends AppCompatActivity {

    RelativeLayout layout;
    SpiralView mrunner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    setBackgroundwithstars();
    }
    private void setBackgroundwithstars(){
        //layout is the main enclosing layout of the xml file
        //activity_competition is the xml file in which it is present
        layout= (RelativeLayout) View.inflate(this, R.layout.activity_temp,null);

        //Class object for running stars
        mrunner=new SpiralView(this);
        //adding view to layout
        layout.addView(mrunner);
        //Black colour of background
        layout.setBackgroundColor(0xF0000000);
        //setting height of the view
        mrunner.height = RelativeLayout.LayoutParams.MATCH_PARENT;
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        ImageView img=new ImageView(this);
        img.setImageResource(R.drawable.rsz_starman);
        RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(
                width-2*width/40,height/4);
        params.leftMargin=width/40;
        params.topMargin=height-height/4;
        layout.addView(img,params);

        setContentView(layout);
        // mrunner.IncreaseSpeed(200,10);
    }
}
