package com.mayarafelix.jetpacknotes.note

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.mayarafelix.jetpacknotes.R
import kotlinx.android.synthetic.main.activity_main.*

class NoteActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)
        setSupportActionBar(toolbar)

        navController = Navigation.findNavController(this, R.id.fragment_nav)
    }
}
