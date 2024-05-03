package com.tntapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MasterActivity : AppCompatActivity() {

    private val encuestas = arrayOf(
        "Encuesta 1",
        "Encuesta 2",
        "Encuesta 3",
        "Encuesta 4")

    private lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master)

        listView = findViewById(R.id.listViewMaster)

        val arrayAdapter : ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, encuestas
        )

        listView.adapter = arrayAdapter

    }
}