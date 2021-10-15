package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var data = listOf(
            listOf("abcdqw", "aafdcw4ffs", "ddheehed", "ddwq43334"),
            listOf("ab", "acbdw", "dddddddddd", "fdfdfdfdffe333d"),
            listOf("fdswddddd", "ab", "dddd", "ddd3dffff3")
        )

        val columns = 3
        val rows = 2
        val longestString = intArrayOf(0, 0, 0, 0)

        for(i in data){

        }
        for (i in 0..columns) {
            for (j in 0..rows) {
                if (data[j][i].length > longestString[i]) {
                    longestString[i] = data[j][i].length
                }
            }
        }
        binding.tv1.text = longestString.joinToString(separator = " ")
    }
}


