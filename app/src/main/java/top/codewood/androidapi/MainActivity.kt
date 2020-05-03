package top.codewood.androidapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import top.codewood.androidapi.activities.lifes.LifeActivity
import top.codewood.androidapi.activities.luanchactivity.SendActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        findViewById<Button>(R.id.btn_activity_launch).setOnClickListener(this)
        findViewById<Button>(R.id.btn_activity_life).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_activity_launch -> {
                var sendIntent = Intent(this, SendActivity::class.java);
                startActivity(sendIntent)
            }
            R.id.btn_activity_life -> {
                var lifeIntent = Intent(this, LifeActivity::class.java)
                startActivity(lifeIntent)
            }
        }
    }

}
