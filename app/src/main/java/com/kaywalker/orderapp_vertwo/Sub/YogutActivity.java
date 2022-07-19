package com.kaywalker.orderapp_vertwo.Sub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.kaywalker.orderapp_vertwo.DataList.FriendItem;
import com.kaywalker.orderapp_vertwo.Adapter.MyRecyclerAdapter;
import com.kaywalker.orderapp_vertwo.R;

import java.util.ArrayList;

public class YogutActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyRecyclerAdapter mRecyclerAdapter;
    private ArrayList<FriendItem> mfriendItems;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yogut);

        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return true;
            }
        });

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        /* initiate adapter */
        mRecyclerAdapter = new MyRecyclerAdapter();

        /* initiate recyclerview */
        mRecyclerView.setAdapter(mRecyclerAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        /* adapt data */
        mfriendItems = new ArrayList<>();

                mfriendItems.add(new FriendItem(R.drawable.yougut_blueberry,"블루베리 요거트", "6,000원","BlueBerry Yogut"));
                mfriendItems.add(new FriendItem(R.drawable.yougut_mango,"망고 요거트","7,000원","Mango Yogut"));
                mfriendItems.add(new FriendItem(R.drawable.yougut_mint,"민트 요거트","6,500원","Mint Yogut"));
                mfriendItems.add(new FriendItem(R.drawable.yougut_raspberries,"라즈베리 요거트","7,500원","RaspBerry Yogut"));
                mfriendItems.add(new FriendItem(R.drawable.yougut_strawberry,"딸기 요거트","6,500원","StrawBerry Yogut"));
                mfriendItems.add(new FriendItem(R.drawable.yougut_watermelon,"수박 요거트","8,500원","WaterMelon Yogut"));

        mRecyclerAdapter.setFriendList(mfriendItems);
    }

    private void filterList(String text) {

        ArrayList<FriendItem> filteredList = new ArrayList<>();

        for(FriendItem friendItem : mfriendItems){
            if(friendItem.getName().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(friendItem);
            }
        }

//        if(filteredList.isEmpty()){
//            Toast.makeText(this, "데이터가 없습니다", Toast.LENGTH_SHORT).show();
//        }else{
//
//        }

        mRecyclerAdapter.setFilteredList(filteredList);
    }
}