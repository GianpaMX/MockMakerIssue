package io.github.gianpamx.mylibrary

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dummyObject = (requireActivity().application as DummyInterface).dummyObject()
        textView.text = dummyObject.dummyMethod()
    }
}
