package com.gzeinnumer.expandedview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.os.Bundle;
import android.view.View;

import com.gzeinnumer.expandedview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initView();
    }

    private void initView() {
        binding.llExpand1.setOnClickListener(view -> {
            if (binding.hiddenView1.getVisibility() == View.VISIBLE) {
                TransitionManager.beginDelayedTransition(binding.baseCardview1, new AutoTransition());
                binding.hiddenView1.setVisibility(View.GONE);
                binding.arrowButton1.setImageResource(R.drawable.ic_baseline_expand_more_24);
                binding.llExpand1.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.grey_300));
            } else {
                TransitionManager.beginDelayedTransition(binding.baseCardview1, new AutoTransition());
                binding.hiddenView1.setVisibility(View.VISIBLE);
                binding.arrowButton1.setImageResource(R.drawable.ic_baseline_expand_less_24);
                binding.llExpand1.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.grey_400));
            }
        });
    }
}