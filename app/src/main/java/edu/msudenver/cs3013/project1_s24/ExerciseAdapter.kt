package edu.msudenver.cs3013.project1_s24

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ExerciseAdapter(private val onItemClick: (Exercise) -> Unit) : ListAdapter<Exercise, ExerciseAdapter.ExerciseViewHolder>(ExerciseDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.exercise_item, parent, false)
        return ExerciseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        val exercise = getItem(position)
        holder.bind(exercise, onItemClick)
    }

    class ExerciseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val exerciseName: TextView = itemView.findViewById(R.id.exercise_name)
        private val exerciseReps: TextView = itemView.findViewById(R.id.exercise_reps)
        private val exerciseSets: TextView = itemView.findViewById(R.id.exercise_sets)

        fun bind(exercise: Exercise, onItemClick: (Exercise) -> Unit) {
            exerciseName.text = exercise.name
            exerciseReps.text = "Reps: ${exercise.reps}"
            exerciseSets.text = "Sets: ${exercise.sets}"

            itemView.setOnClickListener {
                onItemClick(exercise)
            }
        }
    }
}

class ExerciseDiffCallback : DiffUtil.ItemCallback<Exercise>() {
    override fun areItemsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
        return oldItem.name == newItem.name && oldItem.reps == newItem.reps && oldItem.sets == newItem.sets
    }
}










