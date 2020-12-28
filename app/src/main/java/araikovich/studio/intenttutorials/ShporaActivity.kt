package araikovich.studio.intenttutorials

import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class ShporaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shpora)
        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()
        val data: Uri? = intent.data
        webView.loadUrl(data.toString())
    }
}