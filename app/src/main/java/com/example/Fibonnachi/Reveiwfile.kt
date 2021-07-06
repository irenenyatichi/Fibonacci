package com.example.Fibonnachi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class Reveiwfile(var numList:List<BigInteger>): RecyclerView.Adapter<numbers>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): numbers {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.view_file_holder,parent,false)
        return numbers(itemView)
}
    override fun onBindViewHolder(holder: numbers, position: Int) {
        holder.tvNumbers.text = numList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numList.count()
    }
}
class numbers(var itemView: View): RecyclerView.ViewHolder(itemView){
    var tvNumbers = itemView.findViewById<TextView>(R.id.tvNumbers)
}
