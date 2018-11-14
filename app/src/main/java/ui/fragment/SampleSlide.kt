package ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SampleSlide:Fragment() {
    private var layoutResId: Int = 0
    private val layoutResIdKey = "layoutResId"

    companion object {

        fun newInstance(layoutResId: Int): SampleSlide {

            val sampleSlide = SampleSlide()

            val args = Bundle()
            args.putInt("layoutResId", layoutResId)
            sampleSlide.arguments = args

            return sampleSlide
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        if (arguments != null && arguments!!.containsKey(layoutResIdKey)) {
            layoutResId = arguments!!.getInt(layoutResIdKey)
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(layoutResId, container, false)
    }
}