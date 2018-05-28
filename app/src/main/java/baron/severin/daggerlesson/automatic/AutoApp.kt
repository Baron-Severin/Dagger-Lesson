package baron.severin.daggerlesson.automatic

import android.app.Application

class AutoApp : Application() {

    val component = DaggerAutoComponent.create()

}