package com.example.a2tripplanner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    String EXTRA_TRIP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setupRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.trip_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // TODO: Set up adapter for RecyclerView
    }

    private void showTripDetail(Trip trip) {
        Intent intent = new Intent(this, TripDetailActivity.class);
        intent.putExtra(TripDetailActivity.EXTRA_TRIP, trip);
        startActivity(intent);
    }

}

