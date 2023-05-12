package com.example.trigonometriccalculator;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PageFragment2 extends AuthorFragment {
    private int pageNumber;

    public static PageFragment2 newInstance(int page){
        PageFragment2 fragment = new PageFragment2();
        Bundle args = new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }
    public PageFragment2(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments() != null ? getArguments().getInt("num") : 1;
    }
}