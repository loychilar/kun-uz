package com.example.myapplication111111111111111

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication111111111111111.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://kun.uz/uz/99699559"))
            startActivity(intent)
        }

        binding.btn2.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://kun.uz/uz/news/2020/04/21/yirik-soliq-tolovchilar-avtomobil-uchun-maxsus-ruxsatnoma-olishi-mumkin"))
            startActivity(intent)
        }

        binding.btn3.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://kun.uz/uz/54946217"))
            startActivity(intent)
        }

        binding.btn4.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://m.kun.uz/uz/news/2020/04/23/bmt-yaqin-5-yilda-sayyorada-yangi-harorat-rekordi-qayd-etilishini-prognoz-qildi"))
            startActivity(intent)
        }

        binding.btn5.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://kun.uz/uz/45305721"))
            startActivity(intent)
        }


    }
}