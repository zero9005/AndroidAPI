package top.codewood.androidapi.activities.lifes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import top.codewood.androidapi.R

class LifeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifes)

        Log.i(LifeActivity::class.java.simpleName, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(LifeActivity::class.java.simpleName, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(LifeActivity::class.java.simpleName, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(LifeActivity::class.java.simpleName, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(LifeActivity::class.java.simpleName, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(LifeActivity::class.java.simpleName, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(LifeActivity::class.java.simpleName, "onDestroy")
    }


}
