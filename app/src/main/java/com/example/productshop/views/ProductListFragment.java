package com.example.productshop.views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.productshop.R;
import com.example.productshop.databinding.FragmentProductListBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProductListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProductListFragment extends Fragment {

    FragmentProductListBinding fragmentProductListBinding;

    public ProductListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentProductListBinding = FragmentProductListBinding.inflate(inflater, container, false);
        return fragmentProductListBinding.getRoot();
    }
}