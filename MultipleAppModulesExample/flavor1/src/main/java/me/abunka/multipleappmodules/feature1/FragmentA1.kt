package me.abunka.multipleappmodules.feature1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_a1.*
import javax.inject.Inject

class FragmentA1: DaggerFragment() {
    companion object {
        fun newInstance() = FragmentA1()
    }

    @Inject
    lateinit var navigation: Feature1Navigation1

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_a1, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goToB.setOnClickListener { startActivity(ActivityB1.getIntent(requireContext())) }
        goToF.setOnClickListener { navigation.goToF(requireActivity()) }
    }
}

