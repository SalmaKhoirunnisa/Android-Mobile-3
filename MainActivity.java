import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import iat.pam.intentproject.R;

public class MainActivity extends AppCompatActivity {
    private static final int TEXT_REQUEST = 1;

    // ... (Kode lainnya dalam MainActivity)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ... (Kode lainnya dalam onCreate)
    }

    // ... (Metode lain dalam MainActivity)

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                // Handle the reply from SecondActivity
            }
        }
    }
}
