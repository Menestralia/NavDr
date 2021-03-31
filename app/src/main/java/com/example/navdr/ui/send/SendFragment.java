package com.example.navdr.ui.send;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.navdr.R;
import com.example.navdr.ui.share.ShareViewModel;

public class SendFragment extends Fragment {

    private SendViewModel mViewModel;

    public static SendFragment newInstance() {
        return new SendFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(SendViewModel.class);
        View root = inflater.inflate(R.layout.send_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_send);
        mViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;

    }



}