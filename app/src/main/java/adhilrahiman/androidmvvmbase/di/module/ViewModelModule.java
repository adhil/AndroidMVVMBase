package adhilrahiman.androidmvvmbase.di.module;

import javax.inject.Singleton;

import adhilrahiman.androidmvvmbase.di.ViewModelKey;
import adhilrahiman.androidmvvmbase.factory.ViewModelFactory;
import adhilrahiman.androidmvvmbase.ui.home.HomeViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * I'll supply ViewModels
 */
@Singleton
@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    abstract ViewModel bindHomeViewModel(HomeViewModel homeViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}