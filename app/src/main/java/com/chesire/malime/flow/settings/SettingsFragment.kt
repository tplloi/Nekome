package com.chesire.malime.flow.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.chesire.lifecyklelog.LogLifecykle
import com.chesire.malime.databinding.FragmentSettingsBinding
import dagger.android.support.DaggerFragment

@LogLifecykle
class SettingsFragment : DaggerFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentSettingsBinding.inflate(inflater, container, false).root

    companion object {
        const val TAG = "SettingsFragment"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment SettingsFragment.
         */
        fun newInstance() = SettingsFragment()
    }
}
