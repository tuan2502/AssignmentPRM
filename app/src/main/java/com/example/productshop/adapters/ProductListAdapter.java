package com.example.productshop.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.productshop.databinding.ProductRowBinding;
import com.example.productshop.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductListAdapter extends ListAdapter<Product, ProductListAdapter.ProductListViewHolder> implements Filterable {

    ProductListInterface productListInterface;
//    ProductListInterface productListInterfaceOld;
    private List<Product> productList;
    private List<Product> productListOld;

    public ProductListAdapter() {
        super(Product.itemCallback);
        this.productListInterface = productListInterface;
        this.productList = productList;
        this.productListOld = productList;
//        this.productListInterfaceOld = productListInterface;
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

    @Override
    public Filter getFilter() {

        return null;
//        return new Filter() {
//            @Override
//            protected FilterResults performFiltering(CharSequence constraint) {
//                String strSearch = constraint.toString();
//                if (strSearch.isEmpty()) {
//                    productList = productListOld;
//                }else{
//                    List<Product> list = new ArrayList<>();
//                    for(Product product : productListOld ){
//                        if(product.getName().toLowerCase().contains(strSearch.toLowerCase())){
//                            list.add(product);
//                        }
//                    }
//                    productList = list;
//                }
//
//                FilterResults filterResults = new FilterResults();
//                filterResults.values = productList;
//
//                return filterResults;
//            }
//
//            @Override
//            protected void publishResults(CharSequence constraint, FilterResults results) {
//                productList = (List<Product>) results.values;
//                notifyDataSetChanged();
//            }
//        };
    }

}
