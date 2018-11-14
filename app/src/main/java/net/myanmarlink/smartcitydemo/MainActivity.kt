package net.myanmarlink.smartcitydemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({this.goToNextActivity()},500)
    }
    fun goToNextActivity()
    {
            startActivity(Intent(this,AppIntroActivity::class.java))
        this.finish()
    }
}
