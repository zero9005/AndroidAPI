package top.codewood.androidapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import top.codewood.androidapi.activities.lifes.LifeActivity
import top.codewood.androidapi.activities.luanchactivity.SendActivity
import top.codewood.androidapi.activities.service.StartServiceActivity
import top.codewood.androidapi.activities.toast.ToastActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        findViewById<Button>(R.id.btn_activity_launch).setOnClickListener(this)
        findViewById<Button>(R.id.btn_activity_life).setOnClickListener(this)
        findViewById<Button>(R.id.btn_activity_toast).setOnClickListener(this)
        findViewById<Button>(R.id.btn_activity_service).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var targetActivity: Intent? = null
        when (v!!.id) {
            R.id.btn_activity_launch -> {
                targetActivity = Intent(this, SendActivity::class.java);
            }
            R.id.btn_activity_life -> {
                targetActivity = Intent(this, LifeActivity::class.java)
            }
            R.id.btn_activity_toast -> {
                targetActivity = Intent(this, ToastActivity::class.java)
            }
            R.id.btn_activity_service -> {
                targetActivity = Intent(this, StartServiceActivity::class.java)
            }
        }
        targetActivity?.apply {
            startActivity(targetActivity)
        }

    }

}
