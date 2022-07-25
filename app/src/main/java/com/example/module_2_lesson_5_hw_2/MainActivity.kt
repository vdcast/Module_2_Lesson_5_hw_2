package com.example.module_2_lesson_5_hw_2

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_rv_newslist.*
import kotlinx.android.synthetic.main.item_rv_newslist.view.*

class MainActivity : AppCompatActivity(), NewsListCallBack {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsList = getNews()

        rvNewsList.adapter = NewsAdapter(this, newsList,this)
        rvNewsList.layoutManager = LinearLayoutManager(this)

        clViewItem.visibility = View.GONE

        btHome.setOnClickListener {
            rvNewsList.visibility = View.VISIBLE
            clViewItem.visibility = View.GONE
        }

    }

    private fun getNews(): ArrayList<News>{
        val news = ArrayList<News>()

        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_a3_1gen),
            resources.getString(R.string.news_title_1),
            resources.getString(R.string.news_description_1),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
            ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_a3_2gen),
            resources.getString(R.string.news_title_2),
            resources.getString(R.string.news_description_2),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_a3_3gen),
            resources.getString(R.string.news_title_3),
            resources.getString(R.string.news_description_3),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_a3_4gen),
            resources.getString(R.string.news_title_4),
            resources.getString(R.string.news_description_4),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_s3_1gen),
            resources.getString(R.string.news_title_5),
            resources.getString(R.string.news_description_5),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_s3_2gen),
            resources.getString(R.string.news_title_6),
            resources.getString(R.string.news_description_6),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_s3_3gen),
            resources.getString(R.string.news_title_7),
            resources.getString(R.string.news_description_7),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_s3_4gen),
            resources.getString(R.string.news_title_8),
            resources.getString(R.string.news_description_8),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_rs3_2gen),
            resources.getString(R.string.news_title_9),
            resources.getString(R.string.news_description_9),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_rs3_3gen),
            resources.getString(R.string.news_title_10),
            resources.getString(R.string.news_description_10),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.audi_rs3_4gen),
            resources.getString(R.string.news_title_11),
            resources.getString(R.string.news_description_11),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.husqvarna),
            resources.getString(R.string.news_title_12),
            resources.getString(R.string.news_description_12),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.ktm),
            resources.getString(R.string.news_title_13),
            resources.getString(R.string.news_description_13),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.gas_gas_1),
            resources.getString(R.string.news_title_14),
            resources.getString(R.string.news_description_14),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))
        news.add(News(
            BitmapFactory.decodeResource(resources,R.drawable.honda),
            resources.getString(R.string.news_title_15),
            resources.getString(R.string.news_description_15),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_up_like),
            BitmapFactory.decodeResource(resources,R.drawable.thumbs_down_dislike),
            resources.getString(R.string.like_number)
        ))

        return news
    }

    override fun onItemSelected(news: ArrayList<News>, index: Int) {

        ivOpenedNewsAvatar.setImageBitmap(news[index].newsAvatar)
        tvOpenedNewsTitle.text = news[index].newsTitle
        tvOpenedNewsDescription.text = news[index].newsDescription
        tvLikeNumberViewItem.text = news[index].likeNumber
        ivLikeViewItem.setImageBitmap(news[index].likeImage)
        ivDislikeViewItem.setImageBitmap(news[index].dislikeImage)
        rvNewsList.visibility = View.GONE
        clViewItem.visibility = View.VISIBLE

        ivLikeViewItem.setOnClickListener {
            val resultDislike = Integer.parseInt(news[index].likeNumber) + 1
            news[index].likeNumber = resultDislike.toString()
            tvLikeNumberViewItem.text = news[index].likeNumber
            rvNewsList.adapter?.notifyItemChanged(index)
        }

        ivDislikeViewItem.setOnClickListener {
            val resultDislike = Integer.parseInt(news[index].likeNumber) - 1
            news[index].likeNumber = resultDislike.toString()
            tvLikeNumberViewItem.text = news[index].likeNumber
            rvNewsList.adapter?.notifyItemChanged(index)
        }
    }
}