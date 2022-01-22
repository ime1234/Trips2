package com.imeofon.trips2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class TripsAdapter(private val tripsList:ArrayList<TripsUser>): RecyclerView.Adapter<TripsAdapter.ViewHolder>() {

    class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        var plane :ImageView = itemView.findViewById(R.id.plane)
        var image: ImageView = itemView.findViewById(R.id.dots)
        var lagos: TextView = itemView.findViewById(R.id.lagos)
        var london: TextView = itemView.findViewById(R.id.london)
        var business: TextView = itemView.findViewById(R.id.business)
        var date: TextView = itemView.findViewById(R.id.date_time)
        var date_two: TextView = itemView.findViewById(R.id.date_time2)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val trips = tripsList[position]
        holder.plane.setImageResource(trips.getPlane()!!)
        holder.image.setImageResource(trips.getImage()!!)
        holder.lagos.text = trips.getLagos()
        holder.london.text = trips.getLondon()
        holder.business.text = trips.getBusiness()
        holder.date.text = trips.getDate()
        holder.date_two.text = trips.getDate_two()


    }

    override fun getItemCount(): Int {
        return  tripsList.size
    }




}