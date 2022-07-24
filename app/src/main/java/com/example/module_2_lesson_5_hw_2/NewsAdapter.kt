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
        holder.likeImage.setImageBitmap(news[position].likeImage)
        holder.dislikeImage.setImageBitmap(news[position].dislikeImage)
        holder.likeNumber.text = news[position].likeNumber
        holder.likeImage.setOnClickListener {
//            callBack.onItemSelected(position)
            val resultLikePlus = Integer.parseInt(holder.likeNumber.text.toString()) + 1
            holder.likeNumber.text = resultLikePlus.toString()
        }
        holder.dislikeImage.setOnClickListener {
//            callBack.onItemSelected(position)
            val resultLikePlus = Integer.parseInt(holder.likeNumber.text.toString()) - 1
            holder.likeNumber.text = resultLikePlus.toString()
        }
    }

    override fun getItemCount(): Int {
        return news.size
    }

}

class ViewHolder (itemView: View) : RecyclerView.ViewHolder (itemView){
    val newsAvatar = itemView.ivNewsAvatar
    val newsTitle = itemView.tvNewsTitle
    val newsDescription = itemView.tvNewsDescription
    val likeImage = itemView.ivLike
    val dislikeImage = itemView.ivDislike
    val likeNumber = itemView.tvLikeNumber
}

interface NewsListCallBack{
    fun onItemSelected(index: Int)
}