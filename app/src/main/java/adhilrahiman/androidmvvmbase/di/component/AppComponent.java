package adhilrahiman.androidmvvmbase.di.component;

import android.app.Application;

import javax.inject.Singleton;

import adhilrahiman.androidmvvmbase.MVVMBaseApp;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Guardian Of The Dependency
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class})
public interface AppComponent {

    void inject(MVVMBaseApp application);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}
