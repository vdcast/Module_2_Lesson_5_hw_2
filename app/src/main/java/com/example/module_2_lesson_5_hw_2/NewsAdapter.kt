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
        holder.ivNewsAvatar.setImageBitmap(news[position].newsAvatar)
        holder.tvNewsTitle.text = news[position].newsTitle
        holder.tvNewsDescription.text = news[position].newsDescription
        holder.ivLike.setImageBitmap(news[position].likeImage)
        holder.ivDislike.setImageBitmap(news[position].dislikeImage)
        holder.tvLikeNumber.text = news[position].likeNumber
        holder.ivLike.setOnClickListener {
            val resultLikePlus = Integer.parseInt(holder.tvLikeNumber.text.toString()) + 1
            holder.tvLikeNumber.text = resultLikePlus.toString()
        }
        holder.ivDislike.setOnClickListener {
            val resultLikePlus = Integer.parseInt(holder.tvLikeNumber.text.toString()) - 1
            holder.tvLikeNumber.text = resultLikePlus.toString()
        }
        holder.ivNewsAvatar.setOnClickListener {
            callBack.onItemSelected(news, position)
        }
        holder.tvNewsTitle.setOnClickListener {
            callBack.onItemSelected(news, position)
        }
        holder.tvNewsDescription.setOnClickListener {
            callBack.onItemSelected(news, position)
        }

//        holder.newsTitle.setTextAppearance(R.style.newslist_body_text_style)
    }

    override fun getItemCount(): Int {
        return news.size
    }

}

class ViewHolder (itemView: View) : RecyclerView.ViewHolder (itemView){
    val ivNewsAvatar = itemView.ivNewsAvatar
    val tvNewsTitle = itemView.tvNewsTitle
    val tvNewsDescription = itemView.tvNewsDescription
    val ivLike = itemView.ivLike
    val ivDislike = itemView.ivDislike
    val tvLikeNumber = itemView.tvLikeNumber
}

interface NewsListCallBack{
    fun onItemSelected(news: ArrayList<News>, index: Int)
}