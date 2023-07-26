package com.example.testrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1- RecyclerView

        val recyclerView:RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        //2- Datasource
        var personList:ArrayList<PersonModel> = ArrayList()
        var p1 = PersonModel("Bill Gates",R.drawable.bill,"He is the co-founder of Microsoft. ")
        var p2 = PersonModel("Mark Zuckerberg",R.drawable.zakir,"He is the co-founder of Meta. ")
        var p3 = PersonModel("Tim Cook",R.drawable.jobs,"He is the co-founder of Apple. ")
        var p4 = PersonModel("Elon Musk",R.drawable.musk,"He is the co-founder of SpaceX\n,Tesla and Twitter. ")
        var p5 = PersonModel("Jeff Bezos",R.drawable.jiff,"He is the co-founder of Amazon .")
        var p6 = PersonModel("Jack Ma",R.drawable.jak,"He is the co-founder of Alibaba Group. ")
        var p7 = PersonModel("Sundar Pichai",R.drawable.sander,"He is the co-founder of Google. ")
        var p8 = PersonModel("Larry Ellison",R.drawable.larry,"He is the co-founder of Oracle. ")
        personList.add(p1)
        personList.add(p2)
        personList.add(p3)
        personList.add(p4)
        personList.add(p5)
        personList.add(p6)
        personList.add(p7)
        personList.add(p8)
        val adapter = PersonAdapter(personList)
        recyclerView.adapter = adapter


    }
}