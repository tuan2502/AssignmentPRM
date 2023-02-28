package com.example.productshop.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.productshop.adapters.ProductListAdapter;
import com.example.productshop.databinding.FragmentProductListBinding;
import com.example.productshop.models.Product;
import com.example.productshop.viewmodels.ShopViewModel;

import java.util.List;


public class ProductListFragment extends Fragment implements ProductListAdapter.ProductListInterface{

    FragmentProductListBinding fragmentProductListBinding;
    private ProductListAdapter productListAdapter;
    private ShopViewModel shopViewModel;

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

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        productListAdapter = new ProductListAdapter();
        fragmentProductListBinding.productRecycleView.setAdapter(productListAdapter);
        fragmentProductListBinding.productRecycleView.addItemDecoration(new DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL));
        fragmentProductListBinding.productRecycleView.addItemDecoration(new DividerItemDecoration(requireContext(), DividerItemDecoration.HORIZONTAL));


        shopViewModel = new ViewModelProvider(requireActivity()).get(ShopViewModel.class);
        shopViewModel.getProducts().observe(getViewLifecycleOwner(), new Observer<List<Product>>() {
            @Override
            public void onChanged(List<Product> products) {
                productListAdapter.submitList(products);
            }
        });
    }

    @Override
    public void addItem(Product product) {

    }

    @Override
    public void onItemClick(Product product) {

    }
}