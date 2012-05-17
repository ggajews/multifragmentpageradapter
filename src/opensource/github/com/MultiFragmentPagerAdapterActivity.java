package opensource.github.com;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class MultiFragmentPagerAdapterActivity extends Activity {

	 private ViewPager modulePager;
	 private static int NUM_PAGER_VIEWS = 3;

	 
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	  // TODO Auto-generated method stub
	  super.onCreate(savedInstanceState);
	           setContentView(R.layout.my_pager);
	            modulePager = (ViewPager) findViewById(R.id.pager);
	  //modulePager.setAdapter(new ModulePagerAdapter());

	 }

	 
}