package net.myanmarlink.smartcitydemo

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import com.github.paolorotolo.appintro.AppIntro
import ui.fragment.SampleSlide

class AppIntroActivity:AppIntro() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
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
}