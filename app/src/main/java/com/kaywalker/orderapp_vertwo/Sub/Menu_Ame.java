package com.kaywalker.orderapp_vertwo.Sub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kaywalker.orderapp_vertwo.LoginActivity;
import com.kaywalker.orderapp_vertwo.R;
import com.kaywalker.orderapp_vertwo.RegisterActivity;

public class Menu_Ame extends AppCompatActivity {

    private ImageButton btnAdd, btnMinus;
    private TextView tv_count,tv_bbPrice,tv_small,tv_medium,tv_large;
    private Button btn_order;
    private int count = 0, bbprice = 2000;
    private LinearLayout layout_small,layout_medium,layout_large;
    private int num = 0;
    private ImageView iv_small,iv_medium,iv_large;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ame);

        tv_count = findViewById(R.id.tv_ctn);
        tv_count.setText(count+"");
        tv_bbPrice = findViewById(R.id.tv_bbPrice);
        tv_bbPrice.setText(count*bbprice+"");
        btnAdd = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btn_order = findViewById(R.id.btn_order);
        layout_small = findViewById(R.id.layout_small);
        iv_small = findViewById(R.id.iv_small);
        tv_small = findViewById(R.id.tv_small);
        layout_medium = findViewById(R.id.layout_medium);
        iv_medium = findViewById(R.id.iv_medium);
        tv_medium = findViewById(R.id.tv_medium);
        layout_large = findViewById(R.id.layout_large);
        iv_large = findViewById(R.id.iv_large);
        tv_large = findViewById(R.id.tv_large);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tv_count.setText(count+"");
                tv_bbPrice.setText(count*bbprice+""+"원");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                tv_count.setText(count+"");
                tv_bbPrice.setText(count*bbprice+""+"원");
            }
        });

        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_Ame.this, PaymentActivity.class);
                startActivity(intent);
            }
        });

        layout_small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num == 0){
                    layout_small.setBackgroundResource(R.drawable.button_sel);
                    layout_medium.setBackgroundResource(R.drawable.button_white);
                    layout_large.setBackgroundResource(R.drawable.button_white);
                    tv_small.setTextColor(Color.parseColor("#268329"));
                    iv_small.setColorFilter(Color.parseColor("#268329"));
                    tv_medium.setTextColor(Color.parseColor("#000000"));
                    iv_medium.setColorFilter(Color.parseColor("#000000"));
                    tv_large.setTextColor(Color.parseColor("#000000"));
                    iv_large.setColorFilter(Color.parseColor("#000000"));
                }

            }
        });

        layout_medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num == 0){
                    layout_medium.setBackgroundResource(R.drawable.button_sel);
                    layout_large.setBackgroundResource(R.drawable.button_white);
                    layout_small.setBackgroundResource(R.drawable.button_white);
                    tv_medium.setTextColor(Color.parseColor("#268329"));
                    iv_medium.setColorFilter(Color.parseColor("#268329"));
                    tv_small.setTextColor(Color.parseColor("#000000"));
                    iv_small.setColorFilter(Color.parseColor("#000000"));
                    tv_large.setTextColor(Color.parseColor("#000000"));
                    iv_large.setColorFilter(Color.parseColor("#000000"));
                }

            }
        });

        layout_large.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num == 0){
                    layout_large.setBackgroundResource(R.drawable.button_sel);
                    layout_medium.setBackgroundResource(R.drawable.button_white);
                    layout_small.setBackgroundResource(R.drawable.button_white);
                    tv_large.setTextColor(Color.parseColor("#268329"));
                    iv_large.setColorFilter(Color.parseColor("#268329"));
                    tv_medium.setTextColor(Color.parseColor("#000000"));
                    iv_medium.setColorFilter(Color.parseColor("#000000"));
                    tv_small.setTextColor(Color.parseColor("#000000"));
                    iv_small.setColorFilter(Color.parseColor("#000000"));
                }

            }
        });
    }
}