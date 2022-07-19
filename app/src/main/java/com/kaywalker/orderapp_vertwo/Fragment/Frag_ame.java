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
import com.kaywalker.orderapp_vertwo.Sub.Menu_Ame;
import com.kaywalker.orderapp_vertwo.Sub.Menu_IceAme;

import de.hdodenhof.circleimageview.CircleImageView;

public class Frag_ame extends Fragment {

    private View view;
    CircleImageView iv_ame;
    private LinearLayout layout_iceame;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_ame, container, false);

        iv_ame = view.findViewById(R.id.iv_ame1);
        layout_iceame = view.findViewById(R.id.layout_iceame);

        iv_ame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Menu_Ame.class);
                startActivity(intent);
            }
        });

        layout_iceame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Menu_IceAme.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
