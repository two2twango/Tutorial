package me.twango.twango;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;

/**
 * Created by AVIATER on 13-Oct-15.
 */
public class GetStartedSwipeAdapter extends PagerAdapter{
    private  int[] swipe_data ={R.drawable.sample1,R.drawable.sample2,R.drawable.sample3};
    private Context cntx;
    private LayoutInflater layoutInflater;
    public GetStartedSwipeAdapter(Context cntx)
    {
        this.cntx = cntx;
    }
    @Override
    public int getCount(){
        return swipe_data.length;
    }
    @Override
    public boolean isViewFromObject(View view,Object o){
        return (view==(LinearLayout)o);
    }
    @Override
    public Object instantiateItem(ViewGroup container,int position) {
        layoutInflater = (LayoutInflater)cntx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipegetstarted,container,false);
        ImageView imageView = (ImageView)item_view.findViewById(R.id.swipe_view);
        TextView textView =(TextView)item_view.findViewById(R.id.swipe_count);
        imageView.setImageResource(swipe_data[position]);
        textView.setText("Image" + position);
        container.addView(item_view);
        return item_view;
    }
    @Override
    public void destroyItem(ViewGroup container,int position,Object object){
        container.removeView((LinearLayout)object);

    }

}
