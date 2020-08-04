package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.collections.listOf as listOf1

data class Names(val name: String,val age: Int,val hobby: String,val dob:String)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvNames.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(namesList = listOf1(
                Names("Kibe",20,"Reading","2000"),
                Names("Jesse",22,"volleyball","11/2/1998"),
                Names("John",18,"Teacher","14/04/2004"),
                Names("Lesley",2,"Dancing","5/02/2018"),
                Names("Slyvia",30,"Singing","11/03/1990"),
                Names("James",40,"Riding","11/7/1800"),
                Names("Esther",22,"Watching","10/2/1998"),
                Names("Rachel",14,"Poetry","11/4/2006"),
                Names("Precious",18,"Dancing","11/1/2001"),
                Names("Patience",21, "Novels","10/4/1999"))
        rvNames.namesAdapter


    }
}




