package opensource.github.com;

import futuresimple.github.com.R;
import android.os.Parcelable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;

public class MultiFragmentPagerAdapter extends PagerAdapter {

	  @Override
	  public int getCount() {
	   return 0;
	  }

	  
	  @Override
	  public Object instantiateItem(View collection, int position) {
		// TODO Auto-generated method stub
        return null;
	  }

	  @Override
	  public void destroyItem(View collection, int position, Object view) {
	   ((ViewPager) collection).removeView((LinearLayout) view);
	  }

	  @Override
	  public boolean isViewFromObject(View view, Object object) {
	   return view == ((LinearLayout) object);
	  }

	  @Override
	  public void finishUpdate(View arg0) {
	  }

	  @Override
	  public Parcelable saveState() {
	   return null;
	  }

	  @Override
	  public void startUpdate(View arg0) {
	  }

	  @Override
	  public void restoreState(Parcelable arg0, ClassLoader arg1) {
	   // TODO Auto-generated method stub

	  }

	 

}
