package com.kaywalker.orderapp_vertwo.Sub;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.kaywalker.orderapp_vertwo.R;

public class Menu_IceAme extends AppCompatActivity {

    private ImageButton btnAdd, btnMinus;
    private TextView tv_count,tv_bbPrice,tv_small;
    private Button btn_order;
    private int count = 0, bbprice = 2000;
    private LinearLayout layout_small;
    private int num = 0;
    private ImageView iv_small;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_iceame);

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
                Intent intent = new Intent(Menu_IceAme.this, PaymentActivity.class);
                startActivity(intent);
            }
        });

        layout_small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_small.setTextColor(Color.parseColor("#266328"));
                iv_small.setColorFilter(Color.parseColor("#55ff0000"));
            }
        });
    }
}