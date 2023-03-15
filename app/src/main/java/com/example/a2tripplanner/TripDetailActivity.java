package com.example.a2tripplanner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class TripDetailActivity extends AppCompatActivity {

    String EXTRA_TRIP;

    Trip trip = getIntent().getParcelableExtra(EXTRA_TRIP);

    TextView nameTextView = findViewById(R.id.trip_name_detail);
nameTextView.setText(trip.getName());

    TextView locationTextView = findViewById(R.id.trip_location_detail);
locationTextView.setText(trip.getLocation());

    TextView datesTextView = findViewById(R.id.trip_dates_detail);
datesTextView.setText(trip.getDates());


    Button callButton = findViewById(R.id.call_button);

    callButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String phone = trip.getPhone();
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
            startActivity(intent);
        }
    });


}
