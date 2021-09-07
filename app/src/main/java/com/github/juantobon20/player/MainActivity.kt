package com.github.juantobon20.player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.juantobon20.library.PlayerData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val player = PlayerData()
        player.id = 1
    }
}