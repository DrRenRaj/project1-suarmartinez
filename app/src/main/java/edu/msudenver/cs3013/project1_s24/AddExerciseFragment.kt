package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import android.content.SharedPreferences
import android.content.Context
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController

class AddExerciseFragment : Fragment() {

    private lateinit var sharedPreferences: SharedPreferences
    private val addExerciseViewModel: AddExerciseViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_exercise, container, false)

        sharedPreferences = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        val editTextExerciseName: EditText = view.findViewById(R.id.edit_text_exercise_name)
        val editTextExerciseReps: EditText = view.findViewById(R.id.edit_text_exercise_reps)
        val editTextExerciseSets: EditText = view.findViewById(R.id.edit_text_exercise_sets)
        val buttonAddExercise: Button = view.findViewById(R.id.button_add_exercise)

        buttonAddExercise.setOnClickListener {
            val exerciseName = editTextExerciseName.text.toString()
            val exerciseReps = editTextExerciseReps.text.toString().toIntOrNull()
            val exerciseSets = editTextExerciseSets.text.toString().toIntOrNull()

            if (exerciseName.isNotEmpty() && exerciseReps != null && exerciseSets != null) {
                // Save exercise details to shared preferences or a database
                val newExercise = Exercise(exerciseName, exerciseReps, exerciseSets)
                addExerciseViewModel.addExercise(newExercise)

                Toast.makeText(requireContext(), "Exercise added", Toast.LENGTH_SHORT).show()

                // Navigate back to exercise list or home fragment
                findNavController().navigate(R.id.action_addExerciseFragment_to_exerciseListFragment)
            } else {
                Toast.makeText(requireContext(), "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}






