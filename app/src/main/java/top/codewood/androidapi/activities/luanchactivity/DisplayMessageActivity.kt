package top.codewood.androidapi.activities.luanchactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import top.codewood.androidapi.R

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        init()
    }

    fun init() {
        var message = intent.getStringExtra(EXTRA_MESSAGE)
        findViewById<TextView>(R.id.tv_txt).apply {
            text = message
        }
    }

}
