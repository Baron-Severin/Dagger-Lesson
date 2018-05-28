package baron.severin.daggerlesson.automatic

import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Component(modules = arrayOf(AutoModule::class))
@Singleton interface AutoComponent {

    fun inject(activity: AutoActivity)
}