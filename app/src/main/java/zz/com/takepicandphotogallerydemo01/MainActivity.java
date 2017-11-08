package zz.com.takepicandphotogallerydemo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * @author zhengzhong
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhotoImageFragment fragment = new PhotoImageFragment();
        getFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_contain, fragment)
                .commit();
    }
}
