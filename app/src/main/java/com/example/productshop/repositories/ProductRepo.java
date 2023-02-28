package com.example.productshop.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.productshop.models.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "Máy giặt 1", 1299, true, "https://phukienthongminh.net.vn/upload/image/06-2020/may-giat-xiami-8kg-say-5kg-2.jpg" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Máy giặt 2", 799, true, "https://phukienthongminh.net.vn/upload/image/06-2020/may-giat-xiami-8kg-say-5kg-2.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Máy giặt 3", 999, true, "https://phukienthongminh.net.vn/upload/image/06-2020/may-giat-xiami-8kg-say-5kg-2.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Máy giặt 4", 699, false, "https://phukienthongminh.net.vn/upload/image/06-2020/may-giat-xiami-8kg-say-5kg-2.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Máy giặt 5", 999, true, "https://phukienthongminh.net.vn/upload/image/06-2020/may-giat-xiami-8kg-say-5kg-2.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Tivi 1", 1099, true, "https://quangminh.vn/image/cache/catalog/product/tivi-led-sony-32-klv-32r402a-1913-700x700-product_popup.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Tivi 2", 399, true, "https://quangminh.vn/image/cache/catalog/product/tivi-led-sony-32-klv-32r402a-1913-700x700-product_popup.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Tivi 3", 999, true, "https://quangminh.vn/image/cache/catalog/product/tivi-led-sony-32-klv-32r402a-1913-700x700-product_popup.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Tivi 4", 1299, true, "https://quangminh.vn/image/cache/catalog/product/tivi-led-sony-32-klv-32r402a-1913-700x700-product_popup.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Tivi 5", 2399, true, "https://quangminh.vn/image/cache/catalog/product/tivi-led-sony-32-klv-32r402a-1913-700x700-product_popup.jpg"));
        mutableProductList.setValue(productList);
    }
}
