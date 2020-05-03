package top.codewood.androidapi.activities.luanchactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import top.codewood.androidapi.R

const val EXTRA_MESSAGE = "top.codewood.androidapi.MESSAGE"

class SendActivity : AppCompatActivity(), View.OnClickListener {

    var editTxt: EditText ?= null
    var btnSend: Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send)

        init()
    }

    fun init() {
        editTxt = findViewById(R.id.et_txt)
        btnSend = findViewById(R.id.btn_send)

        btnSend!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var txt = editTxt!!.text.toString()

        if (TextUtils.isEmpty(txt)) {
            Toast.makeText(this, "输入信息不能为空!", Toast.LENGTH_SHORT).show()
            return
        }

        val displayMsgIntent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, txt)
        }
        startActivity(displayMsgIntent)
    }

}