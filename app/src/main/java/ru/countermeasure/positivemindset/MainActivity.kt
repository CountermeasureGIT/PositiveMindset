package ru.countermeasure.positivemindset

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        content_webview.setLayerType(View.LAYER_TYPE_HARDWARE, null)

        content_webview.loadUrl("file:///android_asset/index.html")
    }
}
