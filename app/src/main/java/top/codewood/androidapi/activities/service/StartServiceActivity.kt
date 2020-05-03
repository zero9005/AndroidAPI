package top.codewood.androidapi.activities.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import top.codewood.androidapi.R

class StartServiceActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_service)
        init()
    }

    fun init() {
        findViewById<Button>(R.id.btn_start).setOnClickListener(this)
        findViewById<Button>(R.id.btn_stop).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var serviceIntent: Intent = Intent(this, TestService::class.java)
        when (v!!.id) {
            R.id.btn_start -> {
                startService(serviceIntent)
            }
            R.id.btn_stop -> {
                stopService(serviceIntent)
            }
        }
    }
}
