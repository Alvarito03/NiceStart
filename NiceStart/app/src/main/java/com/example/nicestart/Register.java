package com.example.nicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ImageView mBoy = findViewById(R.id.chico);
        Glide.with(this)
                .load(R.drawable.hipman)
                .transition(DrawableTransitionOptions.withCrossFade(4000))
                .centerCrop()
                //.circleCrop()
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.teal_200)))
                .into(mBoy);
    }

    public void openMain(View v){
        Intent intent = new Intent(Register.this,MainActivity.class);
        startActivity(intent);
    }
}