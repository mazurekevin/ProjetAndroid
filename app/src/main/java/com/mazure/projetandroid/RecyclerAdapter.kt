package com.mazure.projetandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()  {
    private var name = arrayOf("Name 1","Name2")

    private var image = intArrayOf(R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.search_recyclerview_model, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return name.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemName.text = name[position]
        holder.itemImage.setImageResource(image[position])

        holder.itemView.setOnClickListener { v: View->
            Toast.makeText(v.context,"je suis le texte", Toast.LENGTH_SHORT).show()
        }
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemName: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemName = itemView.findViewById(R.id.item_name)

        }
    }
}