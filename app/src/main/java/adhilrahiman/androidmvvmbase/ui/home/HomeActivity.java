package adhilrahiman.androidmvvmbase.ui.home;

import android.os.Bundle;

import javax.inject.Inject;

import adhilrahiman.androidmvvmbase.BR;
import adhilrahiman.androidmvvmbase.R;
import adhilrahiman.androidmvvmbase.databinding.ActivityHomeBinding;
import adhilrahiman.androidmvvmbase.factory.ViewModelFactory;
import adhilrahiman.androidmvvmbase.ui.base.BaseActivity;
import androidx.lifecycle.ViewModelProviders;

public class HomeActivity extends BaseActivity<ActivityHomeBinding, HomeViewModel> {

    @Inject
    ViewModelFactory mViewModelFactory;
    private HomeViewModel mHomeViewModel;

    @Override
    public int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public HomeViewModel getViewModel() {
        mHomeViewModel = ViewModelProviders.of(this, mViewModelFactory).get(HomeViewModel.class);
        return mHomeViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}