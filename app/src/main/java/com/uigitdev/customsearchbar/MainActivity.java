package com.uigitdev.customsearchbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.uigitdev.customsearchbar.uigitdev.design.CustomSearchBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private CustomSearchBar searchBar;
    private ArrayList<String> arrayList;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();

        searchBar = new CustomSearchBar(MainActivity.this, findViewById(R.id.homeSearchBar));
        searchBar.getText();
        searchBar.changeClearIcon(R.drawable.ic_clear);
        searchBar.changeClearIconTint(getString(R.color.colorIconTint));
        searchBar.changeHintColor(getString(R.color.colorTextHint));
        searchBar.changeTextColor(getString(R.color.colorText));
        searchBar.changeHint(getString(R.string.search_something));
        searchBar.changeBackgroundColor(getString(R.color.colorSearchBarBackground));
        searchBar.changeDividerColor(getString(R.color.colorDivider));
//        searchBar.setText(getString(R.string.app_name));
//        searchBar.hideDivider();
        searchBar.setList(arrayList);
    }

    private void initList() {
        arrayList = new ArrayList<>();
        arrayList.add("Aaron Hank");
        arrayList.add("Abagnale Frank");
        arrayList.add("Ali ibn Abi Talib");
        arrayList.add("Barnes Julian");
        arrayList.add("Cavell Edith");
        arrayList.add("Delson Brad");
        arrayList.add("Douglass David");
        arrayList.add("Epictetus");
        arrayList.add("Fish Michael");
        arrayList.add("Gibran Khalil");
    }
}
