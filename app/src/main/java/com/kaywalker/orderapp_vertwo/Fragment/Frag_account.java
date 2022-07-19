package com.kaywalker.orderapp_vertwo.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.kaywalker.orderapp_vertwo.LoginActivity;
import com.kaywalker.orderapp_vertwo.R;

public class Frag_account extends Fragment {
    private View view;
    private FirebaseAuth firebaseAuth;
    private TextView account_Name;
    Button btn_logout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_account, container, false);

        firebaseAuth = FirebaseAuth.getInstance();

        ImageView iv_star = view.findViewById(R.id.iv_star);

        int color = ContextCompat.getColor(getActivity(), R.color.starbucks);

        iv_star.setColorFilter(color);
//
        btn_logout = view.findViewById(R.id.btn_logout);
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
                firebaseAuth.signOut();
            }
        });

        account_Name = view.findViewById(R.id.account_Name); //텍스트 변수 선언

        String content = account_Name.getText().toString(); //텍스트 가져옴.
        SpannableString spannableString = new SpannableString(content); //객체 생성

        String word ="김대각";
        int start = content.indexOf(word);
        int end = start + word.length();

        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#266328")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new StyleSpan(Typeface.BOLD), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new RelativeSizeSpan(1.2f), start, end, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
        account_Name.setText(spannableString);

        return view;
    }
}
