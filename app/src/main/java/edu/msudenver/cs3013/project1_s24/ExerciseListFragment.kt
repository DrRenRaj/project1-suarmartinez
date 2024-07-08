package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ExerciseListFragment : Fragment() {

    private val addExerciseViewModel: AddExerciseViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_exercise_list, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view_exercises)
        val adapter = ExerciseAdapter { exercise ->
            val bundle = Bundle().apply {
                putString("exerciseName", exercise.name)
                putInt("exerciseReps", exercise.reps)
                putInt("exerciseSets", exercise.sets)
            }
            findNavController().navigate(R.id.action_exerciseListFragment_to_exerciseDetailFragment, bundle)
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        addExerciseViewModel.exercises.observe(viewLifecycleOwner, Observer { exercises ->
            exercises?.let { adapter.submitList(it.toList()) }
        })

        return view
    }
}









