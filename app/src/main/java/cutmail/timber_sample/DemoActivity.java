package cutmail.timber_sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;


public class DemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        ButterKnife.inject(this);
        Timber.tag("LifeCycles");
        Timber.d("Activity created");
    }

    @OnClick({ R.id.hello, R.id.hey, R.id.hi })
    public void greetingClicked(Button button) {
        Timber.i("A button with ID %s was clicked to say '%s'.", button.getId(), button.getText());
        Toast.makeText(this, "Check logcat for a greeting!", Toast.LENGTH_SHORT).show();
    }
}
