package me.abunka.multipleappmodules.feature1

import android.content.Context
import android.content.Intent
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity

class ActivityC2: DaggerAppCompatActivity() {
    companion object {
        fun getIntent(context: Context) = Intent(context, ActivityC2::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c2)
    }
}