package com.latihan.viewmodelfilmdanrv

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class setFilmViewModel: ViewModel() {
    val listData = arrayListOf(
        DataFilm("Jhon wick 3 ", "Tanggal rilis: 17 Mei 2019", R.drawable.john_wick),
        DataFilm("Spider-man: No Way Home", "Tanggal rilis: 15 Desember 2021", R.drawable.spiderman),
        DataFilm("Star wars: The last Jedi", "Tanggal rilis: 13 Desember 2017 ", R.drawable.starwars),
        DataFilm("Knives Out", "Tanggal rilis: 27 November 2019", R.drawable.knivesout),
        DataFilm("Avengers: Endgame", "Tanggal rilis: 24 April 2019 ", R.drawable.avengers),
        DataFilm("Captain America: The First Avenger", "Tanggal rilis: 19 Juli 2011", R.drawable.captainamerica),
        DataFilm("Fantastic Beasts: The Crimes of Grindelwald", "Tanggal rilis: 14 November 2018", R.drawable.fantasticbeast)
    )
    val getDFilm: MutableLiveData<List<DataFilm>> = MutableLiveData()

    fun getData(){
        getDFilm.value = listData

    }
}

