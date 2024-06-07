import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.io.DataOutputStream;
import java.io.IOException;
public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enableAdbButton = findViewById(R.id.enableAdbButton);
        Button disableAdbButton = findViewById(R.id.disableAdbButton);
        enableAdbButton.setOnClickListener(v -> runAsRoot("setprop persist.sys.usb.config adb"));
        disableAdbButton.setOnClickListener(v -> runAsRoot("setprop persist.sys.usb.config none"));
    }
    private void runAsRoot(String command) {
        try {
            Process suProcess = Runtime.getRuntime().exec("su");
            DataOutputStream outputStream = new DataOutputStream(suProcess.getOutputStream());
            outputStream.writeBytes(command + "\n");
            outputStream.writeBytes("exit\n");
            outputStream.flush();
            suProcess.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
