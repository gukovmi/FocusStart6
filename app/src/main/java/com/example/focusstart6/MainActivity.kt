package com.example.focusstart6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.paid.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        when (BuildConfig.FLAVOR) {
            "free" -> appTypeTextView.text = getString(R.string.free_app_type)
            "paid" -> appTypeTextView.text = getString(R.string.paid_app_type)
            else -> appTypeTextView.text = getString(R.string.unknown_app_type)
        }
        //appTypeTextView.text="We are using ${BuildConfig.FLAVOR} flavor"
    }
}