package com.example.activitylifecyclesproject

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitylifecyclesproject.MainActivity.Companion

class MainActivity2 : AppCompatActivity() {

    companion object{
        private const val TAG = "MainActivity2"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(TAG, "onCreate Main2 Terpanggil")
    }

        fun launchMainActivity3(view: View){
            startActivity(Intent(this, MainActivity3::class.java))
        }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Main2 Terpanggil: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Main2 Terpanggil: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart Main2 Terpanggil: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Main2 Terpanggil: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop Main2 Terpanggil: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Main2 Terpanggil: ")
    }


}