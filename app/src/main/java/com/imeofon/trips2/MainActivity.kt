package com.imeofon.trips2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.trip)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val details = ArrayList<TripsUser>()

        details.add(TripsUser(R.drawable.plane2,R.drawable.ic_dots, "Lagos", "London", "Business", "Mon 23, 2020\n12:24 pm", "Mon 24, 2020\n1:24 pm"))
        details.add(TripsUser(R.drawable.ic_car,R.drawable.ic_dots, "Calabar", "Abuja", "Visiting", "Mon 23, 2020\n12:24 pm", "Mon 24, 2020\n1:24 pm"))
        details.add(TripsUser(R.drawable.ic_bike,R.drawable.ic_dots, "Obotidim", "Nung Oku", "Private", "Mon 23, 2020\n12:24 pm", "Mon 24, 2020\n1:24 pm"))
        details.add(TripsUser(R.drawable.plane2,R.drawable.ic_dots, "Berlin", "London", "Holiday", "Mon 23, 2020\n12:24 pm", "Mon 24, 2020\n1:24 pm"))
        details.add(TripsUser(R.drawable.plane2,R.drawable.ic_dots, "Lagos", "London", "Business", "Mon 23, 2020\n12:24 pm", "Mon 24, 2020\n1:24 pm"))
        details.add(TripsUser(R.drawable.plane2,R.drawable.ic_dots, "Lagos", "London", "Business", "Mon 23, 2020\n12:24 pm", "Mon 24, 2020\n1:24 pm"))
        details.add(TripsUser(R.drawable.plane2,R.drawable.ic_dots, "Lagos", "London", "Business", "Mon 23, 2020\n12:24 pm", "Mon 24, 2020\n1:24 pm"))
        details.add(TripsUser(R.drawable.plane2,R.drawable.ic_dots, "Lagos", "London", "Business", "Mon 23, 2020\n12:24 pm", "Mon 24, 2020\n1:24 pm"))
        details.add(TripsUser(R.drawable.plane2,R.drawable.ic_dots, "Lagos", "London", "Business", "Mon 23, 2020\n12:24 pm", "Mon 24, 2020\n1:24 pm"))
        details.add(TripsUser(R.drawable.plane2,R.drawable.ic_dots, "Lagos", "London", "Business", "Mon 23, 2020\n12:24 pm", "Mon 24, 2020\n1:24 pm"))


        val adapter = TripsAdapter(details)
        recyclerView.adapter = adapter
    }
}