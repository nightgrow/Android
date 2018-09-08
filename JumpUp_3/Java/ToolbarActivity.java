package com.example.dsm2018.calculator_jumpup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class ToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar2);

        Toolbar myToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolBar);

        /*
        SearchView searchView = (SearchView) findViewById(R.id.search_view);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(ToolbarActivity.this, "onQueryTextSubmit", Toast.LENGTH_SHORT).show();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.d("ToolbarAcivity", "onQueryTextChange: " + newText);
                return true;
            }
        });
        */

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list, menu);

        MenuItem SearchItem = menu.findItem(R.id.app_bar_search);
        SearchView searchView = (SearchView) SearchItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(getApplicationContext(), "onQueryTextSubmit", Toast.LENGTH_SHORT).show();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.d("ToolbarAcivity", "onQueryTextChange: " + newText);
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.menu1:
                Toast.makeText(this, "첫번째 메뉴", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu2:
                Toast.makeText(this, "두번째 메뉴", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
