package me.abunka.multipleappmodules.feature1

import android.content.Context
import android.content.Intent
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_b2.*

class ActivityB1: DaggerAppCompatActivity() {
    companion object {
        fun getIntent(context: Context) = Intent(context, ActivityB2::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Force compilation failure :D
        setContentView(R.layout.activity_b2)
        goToC.setOnClickListener { startActivity(ActivityC2.getIntent(this)) }
    }
}