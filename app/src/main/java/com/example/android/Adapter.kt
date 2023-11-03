package com.example.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val arrayList: ArrayList<Message>): RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameView: TextView
        val imageView: TextView
        val hourView: TextView
        val detailView: TextView

        init {
            nameView = view.findViewById(R.id.Name)
            imageView = view.findViewById(R.id.image)
            hourView = view.findViewById(R.id.hour)
            detailView = view.findViewById(R.id.detail)
        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_view, viewGroup, false)

        return ViewHolder(view)
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
            viewHolder.nameView.text = arrayList[position].Name
            viewHolder.hourView.text = arrayList[position].Hour
            val firstLetter = arrayList[position].Name.uppercase().first()
            viewHolder.imageView.text = firstLetter.toString()
            var detailMessage = arrayList[position].Detail
            if (detailMessage.length > 60) detailMessage = detailMessage.substring(0, 60)
            viewHolder.detailView.text = detailMessage
            when (position % 4) {
                0 -> viewHolder.imageView.setBackgroundResource(R.drawable.circle_1)
                1 -> viewHolder.imageView.setBackgroundResource(R.drawable.circle_2)
                2 -> viewHolder.imageView.setBackgroundResource(R.drawable.circle_3)
            }

    }
    override fun getItemCount() = arrayList.size
}