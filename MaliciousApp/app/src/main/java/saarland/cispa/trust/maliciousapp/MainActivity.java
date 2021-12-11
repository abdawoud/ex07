package saarland.cispa.trust.maliciousapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!isAccessServiceEnabled(this, AppAccessibilityService.class)) {
            // @TODO: Implement this
            // ask user to enable it and take them to the settings page
        } else {
            Toast.makeText(this, "Accessibility Service is enabled!",
                    Toast.LENGTH_LONG).show();
        }

        if (!isSystemAlertPermissionGranted(this)) {
            // @TODO: Implement this
            // ask user to enable it and take them to the settings page
        } else {
            Toast.makeText(this, "Overlying is enabled!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && isAccessServiceEnabled(this, AppAccessibilityService.class)) {
            Toast.makeText(this, "Accessibility Service is enabled!",
                    Toast.LENGTH_LONG).show();
        } else if (requestCode == 1) {
            Toast.makeText(this, "Overlying is enabled!", Toast.LENGTH_LONG).show();
        }
    }

    public boolean isAccessServiceEnabled(Context context, Class accessibilityServiceClass)
    {
        // @TODO: Implement this
        return false;
    }

    static boolean isSystemAlertPermissionGranted(Context context) {
        // @TODO: Implement this
        return false;
    }
}