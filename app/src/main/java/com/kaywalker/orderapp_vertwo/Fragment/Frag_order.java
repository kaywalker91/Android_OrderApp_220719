package com.kaywalker.orderapp_vertwo.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kaywalker.orderapp_vertwo.Adapter.MyRecyclerAdapter;
import com.kaywalker.orderapp_vertwo.Adapter.OrderRecyclerAdapter;
import com.kaywalker.orderapp_vertwo.DataList.FriendItem;
import com.kaywalker.orderapp_vertwo.R;

import java.util.ArrayList;

public class Frag_order extends Fragment {
    private View view;
    private RecyclerView mRecyclerView;
    private OrderRecyclerAdapter orderRecyclerAdapter;
    private ArrayList<FriendItem> mfriendItems;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_order, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        /* initiate adapter */
        orderRecyclerAdapter = new OrderRecyclerAdapter();

        /* initiate recyclerview */
        mRecyclerView.setAdapter(orderRecyclerAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        /* adapt data */
        mfriendItems = new ArrayList<>();

        mfriendItems.add(new FriendItem(R.drawable.yougut_blueberry,"블루베리 요거트", "6,000원","BlueBerry Yogut"));
        mfriendItems.add(new FriendItem(R.drawable.yougut_mango,"망고 요거트","7,000원","Mango Yogut"));
        mfriendItems.add(new FriendItem(R.drawable.yougut_mint,"민트 요거트","6,500원","Mint Yogut"));
        mfriendItems.add(new FriendItem(R.drawable.yougut_raspberries,"라즈베리 요거트","7,500원","RaspBerry Yogut"));
        mfriendItems.add(new FriendItem(R.drawable.yougut_strawberry,"딸기 요거트","6,500원","StrawBerry Yogut"));
        mfriendItems.add(new FriendItem(R.drawable.yougut_watermelon,"수박 요거트","8,500원","WaterMelon Yogut"));

        orderRecyclerAdapter.setFriendList(mfriendItems);

        return view;
    }
}
