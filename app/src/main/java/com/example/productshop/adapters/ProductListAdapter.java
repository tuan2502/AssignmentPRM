package com.example.productshop.adapters;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.productshop.databinding.ProductRowBinding;
import com.example.productshop.models.Product;

public class ProductListAdapter extends ListAdapter<Product, ProductListAdapter.ProductListViewHolder> {

    ProductListInterface productListInterface;

    public ProductListAdapter() {
        super(Product.itemCallback);
        this.productListInterface = productListInterface;
    }

    @NonNull
    @Override
    public ProductListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ProductRowBinding productRowBinding = ProductRowBinding.inflate(layoutInflater, parent, false);
//        productRowBinding.setPr
        return new ProductListViewHolder(productRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductListViewHolder holder, int position) {
        Product product = getItem(position);
        holder.productRowBinding.setProduct(product);
        holder.productRowBinding.executePendingBindings();
    }

    class ProductListViewHolder extends RecyclerView.ViewHolder{

        ProductRowBinding  productRowBinding;

        public ProductListViewHolder(ProductRowBinding binding){
            super(binding.getRoot());
            this.productRowBinding = binding;
        }
    }

    public interface ProductListInterface {
        void addItem(Product product);
        void onItemClick (Product product);
    }

}
