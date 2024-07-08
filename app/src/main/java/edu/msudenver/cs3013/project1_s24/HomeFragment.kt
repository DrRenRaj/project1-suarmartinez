package edu.msudenver.cs3013.project1_s24

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val signInButton: Button = view.findViewById(R.id.button_sign_in)
        signInButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_signInFragment)
        }

        val aboutButton: Button = view.findViewById(R.id.button_about)
        aboutButton.setOnClickListener {
            val intent = Intent(activity, AboutActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}







