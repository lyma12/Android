package com.example.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.compose.ui.text.toUpperCase
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(val list: ArrayList<Contact>): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    private var onClickListener: OnClickListener? = null
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var name: TextView
        var image: TextView
        init{
            name = view.findViewById(R.id.name)
            image = view.findViewById(R.id.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.text = list[position].name.toUpperCase().first().toString()
        holder.name.text = list[position].name
        holder.itemView.setOnClickListener {
            if (onClickListener != null) {
                onClickListener!!.onClick(position, list[position] )
            }
        }
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    // onClickListener Interface
    interface OnClickListener {
        fun onClick(position: Int, model: Contact)
    }
}