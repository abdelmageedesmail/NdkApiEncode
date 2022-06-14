package com.abdelmageed.myapplication

import android.os.Bundle
import android.util.Base64
import androidx.appcompat.app.AppCompatActivity
import com.abdelmageed.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        val key1 = String(Base64.decode(apiFromJNI(), Base64.DEFAULT))
        val key2 = String(Base64.decode(urlFromJNI(), Base64.DEFAULT))
        binding.sampleText.text = key1 + "\n" + key2
    }

    /**
     * A native method that is implemented by the 'myapplication' native library,
     * which is packaged with this application.
     */
    external fun apiFromJNI(): String
    external fun urlFromJNI(): String

    companion object {
        // Used to load the 'myapplication' library on application startup.
        init {
            System.loadLibrary("myapplication")
        }
    }
}