package com.example.productshop.views;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.example.productshop.R;
import com.example.productshop.adapters.PhotoAdapter;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class ProductDetailActivity extends AppCompatActivity {
    private ViewPager2 mViewPager2;
    private CircleIndicator3 mcircleIndicator3;
    private List<Photo> mListPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_product_detail);
        mViewPager2 = findViewById(R.id.view_pager2);
        mcircleIndicator3 = findViewById(R.id.circle_indicator3);

        //Setting viewPager2
        mViewPager2.setOffscreenPageLimit(3);
        mViewPager2.setClipToPadding(false);
        mViewPager2.setClipChildren(false);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        mViewPager2.setPageTransformer(compositePageTransformer);

        mListPhoto = getListPhoto();
        PhotoAdapter photoAdapter = new PhotoAdapter(mListPhoto);
        mViewPager2.setAdapter(photoAdapter);
        mcircleIndicator3.setViewPager(mViewPager2);
    }
    private List<Photo> getListPhoto(){
        List<Photo> list = new ArrayList<>();
        list.add(new Photo(R.drawable.may_giat_xiaomi_1));
        list.add(new Photo(R.drawable.may_giat_xiaomi2));
        list.add(new Photo(R.drawable.may_giat_xiaomi3));
        return list;
    }
}