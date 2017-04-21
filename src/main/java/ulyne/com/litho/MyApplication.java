package ulyne.com.litho;

import android.app.Application;

import com.facebook.soloader.SoLoader;

/**
 * Created by fanwei on 2017/4/21.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        SoLoader.init(this, false);
    }
}
