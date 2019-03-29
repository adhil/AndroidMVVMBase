package adhilrahiman.androidmvvmbase.ui.home;

import javax.inject.Inject;

import adhilrahiman.androidmvvmbase.data.DataManager;
import adhilrahiman.androidmvvmbase.ui.base.BaseViewModel;
import adhilrahiman.androidmvvmbase.utils.rx.SchedulerProvider;

public class HomeViewModel extends BaseViewModel {

    @Inject
    public HomeViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }
}
