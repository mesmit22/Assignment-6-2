package com.marksmith.seviceapp;

        import android.os.Bundle;
        import android.app.Activity;
        import android.content.Intent;
        import android.view.View;

        import com.example.MyApplication.R;

public class ServiceActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
    }

    // Method to start the service
    public void startService(View view) {
        startService(new Intent(getBaseContext(), MyService.class));
    }

    // Method to stop the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), MyService.class));
    }
}