package adhilrahiman.androidmvvmbase.data;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppDataManager implements DataManager {

    public static final String TAG = AppDataManager.class.getSimpleName();
    private final Context mContext;

    @Inject
    public AppDataManager(Context context) {
        mContext = context;
    }
}
