package com.wookie_soft.ex098kotlinpreferencefragment

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class SettingSubNetworkFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.setting_sub_network,rootKey)
    }
}