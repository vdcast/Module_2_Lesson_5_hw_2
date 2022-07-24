package com.example.module_2_lesson_5_hw_2

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvNewsList.adapter = NewsAdapter(this, getNews())
        rvNewsList.layoutManager = LinearLayoutManager(this)

    }

    private fun getNews(): ArrayList<News>{
        val news = ArrayList<News>()

        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_a3_1gen),
            resources.getString(R.string.news_title_1),
            resources.getString(R.string.news_description_1)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_a3_2gen),
            resources.getString(R.string.news_title_2),
            resources.getString(R.string.news_description_2)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_a3_3gen),
            resources.getString(R.string.news_title_3),
            resources.getString(R.string.news_description_3)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_a3_4gen),
            resources.getString(R.string.news_title_4),
            resources.getString(R.string.news_description_4)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_s3_1gen),
            resources.getString(R.string.news_title_5),
            resources.getString(R.string.news_description_5)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_s3_2gen),
            resources.getString(R.string.news_title_6),
            resources.getString(R.string.news_description_6)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_s3_3gen),
            resources.getString(R.string.news_title_7),
            resources.getString(R.string.news_description_7)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_s3_4gen),
            resources.getString(R.string.news_title_8),
            resources.getString(R.string.news_description_8)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_rs3_2gen),
            resources.getString(R.string.news_title_9),
            resources.getString(R.string.news_description_9)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_rs3_3gen),
            resources.getString(R.string.news_title_10),
            resources.getString(R.string.news_description_10)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_rs3_4gen),
            resources.getString(R.string.news_title_11),
            resources.getString(R.string.news_description_11)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.husqvarna),
            resources.getString(R.string.news_title_12),
            resources.getString(R.string.news_description_12)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.ktm),
            resources.getString(R.string.news_title_13),
            resources.getString(R.string.news_description_13)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.gas_gas_1),
            resources.getString(R.string.news_title_14),
            resources.getString(R.string.news_description_14)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.honda),
            resources.getString(R.string.news_title_15),
            resources.getString(R.string.news_description_15)
        ))

        return news
    }
}