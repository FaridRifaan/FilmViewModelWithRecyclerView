package com.latihan.viewmodelfilmdanrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.latihan.viewmodelfilmdanrv.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var setFmVm : setFilmViewModel
    lateinit var filmAdapter: FilmAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initLayout()
        setFmVm = ViewModelProvider(this).get(setFilmViewModel::class.java)
        setFmVm.getData()
        setFmVm.getDFilm.observe(this, Observer {
            filmAdapter.setListDataFilm(it as ArrayList<DataFilm>)

        })


    }

    fun initLayout(){
        filmAdapter = FilmAdapter(ArrayList())
        binding.recylerContainer.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
        binding.recylerContainer.adapter = filmAdapter

    }
}