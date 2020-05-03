package top.codewood.androidapi.activities.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import top.codewood.androidapi.R

class ToastActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)
        init()
    }

    fun init() {
        findViewById<Button>(R.id.btn_toast).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_toast -> {
                var toastTxt = findViewById<EditText>(R.id.et_toast_txt).text.toString()
                if (TextUtils.isEmpty(toastTxt)) return
                Toast.makeText(this, toastTxt, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
