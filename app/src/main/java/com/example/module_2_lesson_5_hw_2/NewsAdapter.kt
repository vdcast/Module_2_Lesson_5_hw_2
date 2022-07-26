package com.example.module_2_lesson_5_hw_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rv_newslist.view.*

class NewsAdapter(val context: Context, val news: ArrayList<News>,
                  val callBack: NewsListCallBack) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_rv_newslist, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.newsAvatar.setImageBitmap(news[position].newsAvatar)
        holder.newsTitle.text = news[position].newsTitle
        holder.newsDescription.text = news[position].newsDescription
        holder.like.setImageBitmap(news[position].likeImage)
        holder.dislike.setImageBitmap(news[position].dislikeImage)
        holder.likeNumber.text = news[position].likeNumber
        holder.like.setOnClickListener {
            val resultLike = Integer.parseInt(holder.likeNumber.text.toString()) + 1
            news[position].likeNumber = resultLike.toString()
            holder.likeNumber.text = news[position].likeNumber
        }
        holder.dislike.setOnClickListener {
            val resultDislike = Integer.parseInt(holder.likeNumber.text.toString()) - 1
            news[position].likeNumber = resultDislike.toString()
            holder.likeNumber.text = news[position].likeNumber
        }
        holder.newsAvatar.setOnClickListener {
            callBack.onItemSelected(news, position)
        }
        holder.newsTitle.setOnClickListener {
            callBack.onItemSelected(news, position)
        }
        holder.newsDescription.setOnClickListener {
            callBack.onItemSelected(news, position)
        }


//        holder.newsTitle.setTextAppearance(R.style.newslist_body_text_style)
    }

    override fun getItemCount(): Int {
        return news.size
    }

}

class ViewHolder (itemView: View) : RecyclerView.ViewHolder (itemView){
    val newsAvatar = itemView.ivNewsAvatar
    val newsTitle = itemView.tvNewsTitle
    val newsDescription = itemView.tvNewsDescription
    val like = itemView.ivLike
    val dislike = itemView.ivDislike
    var likeNumber = itemView.tvLikeNumber
}

interface NewsListCallBack{
    fun onItemSelected(news: ArrayList<News>, index: Int)
}