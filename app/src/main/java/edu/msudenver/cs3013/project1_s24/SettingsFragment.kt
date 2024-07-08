package edu.msudenver.cs3013.project1_s24

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class SettingsFragment : Fragment() {

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        sharedPreferences = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        val switchTheme: Switch = view.findViewById(R.id.switch_dark_mode)
        val buttonChangePassword: Button = view.findViewById(R.id.button_change_password)
        val buttonLogout: Button = view.findViewById(R.id.button_logout)

        // Load saved theme preference
        val isDarkMode = sharedPreferences.getBoolean("dark_mode", false)
        switchTheme.isChecked = isDarkMode

        switchTheme.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
            with(sharedPreferences.edit()) {
                putBoolean("dark_mode", isChecked)
                apply()
            }
        }

        buttonChangePassword.setOnClickListener {
            // Implement change password functionality
        }

        buttonLogout.setOnClickListener {
            // Implement logout functionality
            findNavController().navigate(R.id.action_settingsFragment_to_signInFragment)
        }

        return view
    }
}







