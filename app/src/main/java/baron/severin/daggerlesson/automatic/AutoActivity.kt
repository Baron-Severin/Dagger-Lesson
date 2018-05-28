package baron.severin.daggerlesson.automatic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import baron.severin.daggerlesson.R
import baron.severin.daggerlesson.Repo
import javax.inject.Inject

class AutoActivity : AppCompatActivity() {

    @Inject lateinit var repo : Repo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_automatic)
        val component = (application as AutoApp).component
        component.inject(this)
        println("Injected")
    }
}
