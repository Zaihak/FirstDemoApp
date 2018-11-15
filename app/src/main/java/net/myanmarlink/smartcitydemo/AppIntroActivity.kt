package net.myanmarlink.smartcitydemo

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.view.View
import android.view.WindowManager
import com.github.paolorotolo.appintro.AppIntro
import ui.fragment.SampleSlide

class AppIntroActivity:AppIntro() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

                 this.makeFullScreen()
        this.changeStatusBarColor()

        addSlide(SampleSlide.newInstance(R.layout.view_intro_layout_one))
        addSlide(SampleSlide.newInstance(R.layout.view_intro_layout_two))
        addSlide(SampleSlide.newInstance(R.layout.view_intro_layout_three))
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        finish()
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        finish()
    }
    /**
     * Making full screen
     */
    private fun makeFullScreen() {

        if (Build.VERSION.SDK_INT >= 21) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
    }
    /**
     * Making notification bar transparent
     */
    private fun changeStatusBarColor() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
        }
    }

}