package com.example.testfragment.holder

import android.view.ContextThemeWrapper
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.model.Console

import com.google.android.material.chip.Chip


class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val textConsoleName = itemView.findViewById<TextView>(R.id.text_view_console_name)
    val textConsoleMaker = itemView.findViewById<TextView>(R.id.text_view_console_maker)
    val textConsoleDescription = itemView.findViewById<TextView>(R.id.text_view_console_description)
    val textConsoleReleaseDate = itemView.findViewById<TextView>(R.id.text_view_console_release)
    val imageConsole = itemView.findViewById<ImageView>(R.id.image_console)

    fun bind(console: Console) {
        textConsoleName.text = console.consoleName
        textConsoleMaker.text = console.consoleMaker
        textConsoleReleaseDate.text = console.consoleReleaseDate
        imageConsole.setImageDrawable(console.consoleImage)
        textConsoleDescription.text = console.consoleDescription


    }


}