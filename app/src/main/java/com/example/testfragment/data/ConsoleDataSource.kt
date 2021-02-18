package com.example.testfragment.data

import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console

class ConsoleDataSource {

    companion object{
        fun getConsoles(context: Context) : ArrayList<Console> {
            var consoles = ArrayList<Console> ()

            consoles.add(Console(
                1,
                "Xbox One",
                "Microsoft",
                "2020-11-06",
                context.getDrawable(R.drawable.xbox_one)!!,
                "É uma meeerda!"))

            consoles.add(Console(
                2,
                "Xbox One",
                "Microsoft",
                "2020-11-06",
                context.getDrawable(R.drawable.xbox_one)!!,
                "É uma meeerda!"))

            consoles.add(Console(
                3,
                "Xbox One",
                "Microsoft",
                "2020-11-06",
                context.getDrawable(R.drawable.xbox_one)!!,
                "É uma meeerda!"))

            consoles.add(Console(
                4,
                "Xbox One",
                "Microsoft",
                "2020-11-06",
                context.getDrawable(R.drawable.xbox_one)!!,
                "É uma meeerda!"))







            return consoles
        }
    }
}