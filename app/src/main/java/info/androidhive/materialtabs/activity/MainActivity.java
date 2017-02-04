package info.androidhive.materialtabs.activity;

import android.app.SearchManager;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.fragments.OneFragment;

import static android.R.attr.alpha;

public class MainActivity  extends AppCompatActivity {


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#652d92'>হোম</font>"));

        viewPager = (ViewPager) findViewById(R.id.viewpager);


        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
        setUpTitle();



    }


    private void setUpTitle()
    {

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position==0)
                {
                    getSupportActionBar().setTitle(Html.fromHtml("<font color='#652d92'>হোম</font>"));

                }
                else if(position==1)
                {
                    getSupportActionBar().setTitle(Html.fromHtml("<font color='#652d92'>ইউরোপ</font>"));
                }
                else if(position==2)
                {
                    getSupportActionBar().setTitle(Html.fromHtml("<font color='#652d92'>আমেরিকা</font>"));
                }
                else if(position==3)
                {
                    getSupportActionBar().setTitle(Html.fromHtml("<font color='#652d92'>এশিয়া</font>"));
                }
                else if(position==4)
                {
                    getSupportActionBar().setTitle(Html.fromHtml("<font color='#652d92'>বাংলাদেশ</font>"));
                }
                else if(position==5)
                {
                    getSupportActionBar().setTitle(Html.fromHtml("<font color='#652d92'>অর্জন</font>"));
                }
                else if(position==6)
                {
                    getSupportActionBar().setTitle(Html.fromHtml("<font color='#652d92'>বাংলাদেশ</font>"));
                }
                else if(position==7)
                {
                    getSupportActionBar().setTitle(Html.fromHtml("<font color='#652d92'>আড্ডা</font>"));
                }
                else if(position==8)
                {
                    getSupportActionBar().setTitle(Html.fromHtml("<font color='#652d92'>আড্ডা</font>"));
                }


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }




    private void setupTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        //tabOne.setText(getString(R.string.one));
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, 0,R.drawable.rsz_1homeicon , 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        //tabTwo.setText(getString(R.string.two));
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.rsz_europe, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        // tabThree.setText(getString(R.string.three));
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.rsz_2america, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);

        TextView tabFour = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        //tabFour.setText(getString(R.string.four));
        tabFour.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.rsz_asia, 0);
        tabLayout.getTabAt(3).setCustomView(tabFour);

        TextView tabFive = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
       // tabFive.setText(getString(R.string.five));
        tabFive.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.rsz_bd, 0);
        tabLayout.getTabAt(4).setCustomView(tabFive);

        TextView tabSix = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        //tabSix.setText(getString(R.string.six));
        tabSix.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.rsz_achivement, 0);
        tabLayout.getTabAt(5).setCustomView(tabSix);

        TextView tabSeven = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        //tabSeven.setText(getString(R.string.seven));
        tabSeven.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.rsz_bd, 0);
        tabLayout.getTabAt(6).setCustomView(tabSeven);

        TextView tabEight = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        //tabEight.setText(getString(R.string.eight));
        tabEight.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.rsz_gossip, 0);
        tabLayout.getTabAt(7).setCustomView(tabEight);

        TextView tabNine = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        //tabNine.setText(getString(R.string.nine));
        tabNine.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.rsz_gossip, 0);
        tabLayout.getTabAt(8).setCustomView(tabNine);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new OneFragment(), "ONE");
        adapter.addFrag(new OneFragment(), "TWO");
        adapter.addFrag(new OneFragment(), "THREE");
        adapter.addFrag(new OneFragment(), "FOUR");
        adapter.addFrag(new OneFragment(), "FIVE");
        adapter.addFrag(new OneFragment(), "SIX");
        adapter.addFrag(new OneFragment(), "SEVEN");
        adapter.addFrag(new OneFragment(), "EIGHT");
        adapter.addFrag(new OneFragment(), "NINE");
        viewPager.setAdapter(adapter);

    }



    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();


        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {

            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }


        @Override
        public CharSequence getPageTitle(int position) {

            return mFragmentTitleList.get(position);
        }

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        // Retrieve the SearchView and plug it into SearchManager
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.action_search));
        SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        return true;


    }

}
