package com.example.testrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class PersonAdapter (var personList:ArrayList<PersonModel>) : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {



    inner class  ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
      lateinit  var txtName:TextView
      lateinit var img: ImageView
      lateinit var txtBio:TextView
      init {
          txtName = itemView.findViewById(R.id.textView)
          img = itemView.findViewById(R.id.imageView)
          txtBio = itemView.findViewById(R.id.txtDetails)
          itemView.setOnClickListener {
              Toast.makeText(itemView.context,"You selected: "+personList[adapterPosition].name,Toast.LENGTH_LONG).show()
          }
      }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtName.setText(personList[position].name)
        holder.img.setImageResource(personList[position].img)
        holder.txtBio.setText(personList[position].bio)

    }
}