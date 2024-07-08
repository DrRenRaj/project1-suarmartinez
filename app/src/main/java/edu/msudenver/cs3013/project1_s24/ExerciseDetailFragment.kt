package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ExerciseDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_exercise_detail, container, false)

        val exerciseNameTextView: TextView = view.findViewById(R.id.exercise_name)
        val exerciseRepsTextView: TextView = view.findViewById(R.id.exercise_reps)
        val exerciseSetsTextView: TextView = view.findViewById(R.id.exercise_sets)

        val args = requireArguments()
        val exerciseName = args.getString("exerciseName")
        val exerciseReps = args.getInt("exerciseReps")
        val exerciseSets = args.getInt("exerciseSets")

        exerciseNameTextView.text = exerciseName
        exerciseRepsTextView.text = exerciseReps.toString()
        exerciseSetsTextView.text = exerciseSets.toString()

        return view
    }
}





