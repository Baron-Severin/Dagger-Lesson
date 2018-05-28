package baron.severin.daggerlesson.manual

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import baron.severin.daggerlesson.R
import baron.severin.daggerlesson.Repo

class ManualActivity : AppCompatActivity() {

    lateinit var repo : Repo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = ManualComponent()
        component.inject(this)
        println("Injected")
    }
}
