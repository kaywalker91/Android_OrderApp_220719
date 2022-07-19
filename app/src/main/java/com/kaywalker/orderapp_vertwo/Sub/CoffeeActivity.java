package com.kaywalker.orderapp_vertwo.Sub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.kaywalker.orderapp_vertwo.Fragment.Frag_ame;
import com.kaywalker.orderapp_vertwo.Fragment.Frag_coldBrew;
import com.kaywalker.orderapp_vertwo.Fragment.Frag_latte;
import com.kaywalker.orderapp_vertwo.Adapter.FragmentAdapter;
import com.kaywalker.orderapp_vertwo.R;

public class CoffeeActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private FragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        tabLayout=findViewById(R.id.tabs);
        viewPager=findViewById(R.id.view_pager);
        adapter=new FragmentAdapter(getSupportFragmentManager(),1);

        //FragmentAdapter에 컬렉션 담기
        adapter.addFragment(new Frag_ame());
        adapter.addFragment(new Frag_coldBrew());
        adapter.addFragment(new Frag_latte());

        //ViewPager Fragment 연결
        viewPager.setAdapter(adapter);

        //ViewPager과 TabLayout 연결
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText("아메리카노");
        tabLayout.getTabAt(1).setText("콜드브루");
        tabLayout.getTabAt(2).setText("프라푸치노");

    }

}