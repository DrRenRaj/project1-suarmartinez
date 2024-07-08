package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProgressTrackerFragment : Fragment() {

    private lateinit var progressAdapter: ProgressAdapter
    private val progressList = mutableListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_progress_tracker, container, false)

        val editTextProgress: EditText = view.findViewById(R.id.edit_text_progress)
        val buttonAddProgress: Button = view.findViewById(R.id.button_add_progress)
        val recyclerViewProgress: RecyclerView = view.findViewById(R.id.recycler_view_progress)

        progressAdapter = ProgressAdapter(progressList)
        recyclerViewProgress.layoutManager = LinearLayoutManager(requireContext())
        recyclerViewProgress.adapter = progressAdapter

        buttonAddProgress.setOnClickListener {
            val progress = editTextProgress.text.toString()
            if (progress.isNotEmpty()) {
                progressList.add(progress)
                progressAdapter.notifyItemInserted(progressList.size - 1)
                editTextProgress.text.clear()
            }
        }

        return view
    }
}



