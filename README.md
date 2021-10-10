# ExpandedView

- MainActivity.java
```xml
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
```

- activity_main.xml
```xml
<androidx.cardview.widget.CardView
    android:id="@+id/base_cardview1"
    style="@style/Base.CardView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginLeft="@dimen/def_margin"
    android:layout_marginTop="@dimen/def_margin"
    android:layout_marginRight="@dimen/def_margin"
    app:cardCornerRadius="@dimen/radius">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <LinearLayout
            android:id="@+id/ll_expand1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@color/grey_300"
            android:gravity="center"
            android:padding="@dimen/space">

            <TextView
                android:id="@+id/heading1"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:text="Deskripsi Produk"
                android:textStyle="bold" />

            <ImageView
                android:id="@+id/arrow_button1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/ic_baseline_expand_more_24" />

        </LinearLayout>

        <LinearLayout
            android:id="@+id/hidden_view1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@color/grey_100"
            android:orientation="vertical"
            android:padding="@dimen/space"
            android:visibility="gone"
            tools:visibility="visible">

            <TextView
                android:id="@+id/tv_hidden1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="MyTextContent" />
        </LinearLayout>

    </LinearLayout>
</androidx.cardview.widget.CardView>
```

- dimens.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <dimen name="def_margin">16dp</dimen>
    <dimen name="radius">10dp</dimen>
    <dimen name="space">10dp</dimen>
</resources>
```

- colors.xml
```xml
<color name="grey_100">#F5F5F5</color>
<color name="grey_300">#E0E0E0</color>
<color name="grey_400">#BDBDBD</color>
```

---

```
Copyright 2021 M. Fadli Zein
```