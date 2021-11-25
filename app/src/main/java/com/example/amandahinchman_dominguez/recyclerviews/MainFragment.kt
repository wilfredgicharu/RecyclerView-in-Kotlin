package com.example.amandahinchman_dominguez.recyclerviews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_main.*

data class Movie(val title: String, val year: Int, val image: Int)

class MainFragment : Fragment() {

    private val nicCageMovies = listOf(
        Movie("Raising Arizona", 1987, R.drawable.raising_arizona),
        Movie("Vampire's Kiss", 1988,  R.drawable.vampires_kiss),
        Movie("Con Air", 1997,  R.drawable.con_air),
        Movie("Face/Off", 1997,  R.drawable.face_off),
        Movie("National Treasure", 2004, R.drawable.national_treasure),
        Movie("The Wicker Man", 2006,  R.drawable.wicker_man),
        Movie("Bad Lieutenant", 2009,  R.drawable.bad_lieutenant),
        Movie("Kick-Ass", 2010,  R.drawable.kickass)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_main, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list_recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ListAdapter(nicCageMovies)
        }
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }
}