package com.example.weatherapp

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ForecastListAdapter(private val items: List<String>) :
    RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(TextView(parent.context))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}