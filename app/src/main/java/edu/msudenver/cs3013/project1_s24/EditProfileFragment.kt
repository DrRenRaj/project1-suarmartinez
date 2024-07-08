package edu.msudenver.cs3013.project1_s24

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class EditProfileFragment : Fragment() {

    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var editTextUsername: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_edit_profile, container, false)
        sharedPreferences = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        editTextUsername = view.findViewById(R.id.edit_text_username)
        val buttonSave: Button = view.findViewById(R.id.button_save)
        val buttonBack: Button = view.findViewById(R.id.button_back)

        // Load saved username
        val savedUsername = sharedPreferences.getString("username", "default_username")
        editTextUsername.setText(savedUsername)

        buttonSave.setOnClickListener {
            val username = editTextUsername.text.toString()
            with(sharedPreferences.edit()) {
                putString("username", username)
                apply()
            }
            Toast.makeText(requireContext(), "Username saved", Toast.LENGTH_SHORT).show()
        }

        buttonBack.setOnClickListener {
            findNavController().navigate(R.id.action_editProfileFragment_to_profileFragment)
        }

        return view
    }
}



