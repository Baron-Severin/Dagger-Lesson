package baron.severin.daggerlesson.automatic

import dagger.Component
import dagger.Module

@Component(modules = arrayOf(AutoModule::class))
interface AutoComponent {

    fun inject(activity: AutoActivity)
}