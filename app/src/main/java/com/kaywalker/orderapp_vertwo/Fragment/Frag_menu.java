package com.kaywalker.orderapp_vertwo.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.kaywalker.orderapp_vertwo.R;
import com.kaywalker.orderapp_vertwo.Sub.CoffeeActivity;
import com.kaywalker.orderapp_vertwo.Sub.FoodActivity;
import com.kaywalker.orderapp_vertwo.Sub.YogutActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class Frag_menu extends Fragment {
    private View view;

    private LinearLayout menu_coffee,menu_yogut,menu_food;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_menu, container, false);

        menu_coffee = view.findViewById(R.id.menu_coffee);
        menu_coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CoffeeActivity.class);
                startActivity(intent);
            }
        });

        menu_food = view.findViewById(R.id.menu_food);
        menu_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FoodActivity.class);
                startActivity(intent);
            }
        });


        menu_yogut = view.findViewById(R.id.menu_yogut);
        menu_yogut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), YogutActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
