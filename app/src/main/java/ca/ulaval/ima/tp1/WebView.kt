package ca.ulaval.ima.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class WebView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        var myStringUrl: String = intent.getStringExtra("My_Url_String").toString()

        val myWebView: WebView = findViewById(R.id.my_webview)
        myWebView.loadUrl(myStringUrl)

        val closeActivity: Button = findViewById(R.id.fermer_webview)

        closeActivity.setOnClickListener {
            this.finish()
        }
    }
}