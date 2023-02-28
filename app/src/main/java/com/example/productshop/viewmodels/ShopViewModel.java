package com.example.productshop.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.productshop.models.Product;
import com.example.productshop.repositories.ProductRepo;

import java.util.List;

public class ShopViewModel extends ViewModel {

    ProductRepo productRepo = new ProductRepo();

    public LiveData<List<Product>> getProducts() {
        return productRepo.getProducts();
    }
}
