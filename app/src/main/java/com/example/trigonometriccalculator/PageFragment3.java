package com.example.trigonometriccalculator;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PageFragment3 extends ProgramFragment {
    private int pageNumber;

    public static PageFragment3 newInstance(int page){
        PageFragment3 fragment = new PageFragment3();
        Bundle args = new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }
    public PageFragment3(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments() != null ? getArguments().getInt("num") : 1;
    }
}