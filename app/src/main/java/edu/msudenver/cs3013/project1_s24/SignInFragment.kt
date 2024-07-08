package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class SignInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_in, container, false)

        val usernameEditText: EditText = view.findViewById(R.id.edit_text_username)
        val passwordEditText: EditText = view.findViewById(R.id.edit_text_password)
        val loginButton: Button = view.findViewById(R.id.button_login)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            if (username.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(activity, "Signed in as $username", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(activity, "Please enter username and password", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}

