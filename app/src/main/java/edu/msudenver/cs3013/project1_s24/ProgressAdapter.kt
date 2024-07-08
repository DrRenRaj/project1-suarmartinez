package edu.msudenver.cs3013.project1_s24

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProgressAdapter(private val progressList: List<String>) : RecyclerView.Adapter<ProgressAdapter.ProgressViewHolder>() {

    class ProgressViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val progressTextView: TextView = itemView.findViewById(R.id.text_view_progress)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgressViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.progress_item, parent, false)
        return ProgressViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProgressViewHolder, position: Int) {
        holder.progressTextView.text = progressList[position]
    }

    override fun getItemCount() = progressList.size
}
