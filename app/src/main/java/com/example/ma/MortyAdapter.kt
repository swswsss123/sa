package com.example.ma

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

import com.example.ma.model.ResponseGameItem

class MortyAdapter(val dataMorty: List<ResponseGameItem?>?): RecyclerView.Adapter<MortyAdapter.MyViewHolder>() {
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val nameMorty = view.findViewById<TextView>(R.id.textViewname)
        val statusMorty = view.findViewById<TextView>(R.id.textData)
        val speciesMorty = view.findViewById<TextView>(R.id.textTitle)
    }

    //берем наш item который заполняет
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nameMorty.text = dataMorty?.get(position)?.title
        holder.statusMorty.text = dataMorty?.get(position)?.shortDescription
        holder.speciesMorty.text = dataMorty?.get(position)?.articleContent



    }

    override fun getItemCount(): Int {
        if (dataMorty != null){
            return dataMorty.size
        }
        return 0
    }
}