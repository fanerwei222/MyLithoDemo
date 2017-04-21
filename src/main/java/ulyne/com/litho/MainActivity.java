package ulyne.com.litho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        final ComponentContext componentContext = new ComponentContext(this);
        final LithoView lithoView = LithoView.create(this,
                Text.create(componentContext)
                        .text("HELLO WORLD")
                        .textSizeDip(58)
                        .build()
                );
        setContentView(lithoView);
    }
}
