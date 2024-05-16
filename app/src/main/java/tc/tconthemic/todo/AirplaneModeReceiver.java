package tc.tconthemic.todo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction())) {
            boolean isAirplaneModeOn = intent.getBooleanExtra("state", false);
            String message = isAirplaneModeOn ? "Airplane mode vừa Bật" : "Airplane mode vừa Tắt";
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }
}
