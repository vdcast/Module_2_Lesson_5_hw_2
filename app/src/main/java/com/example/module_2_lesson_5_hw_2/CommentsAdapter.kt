package com.example.module_2_lesson_5_hw_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rv_commentslist.view.*

class CommentsAdapter (val context: Context, val comments: ArrayList<Comments>) :
    RecyclerView.Adapter<ViewHolderComments>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderComments {
        return ViewHolderComments(LayoutInflater.from(context).inflate(R.layout.item_rv_commentslist, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolderComments, position: Int) {
        holder.commentsAvatar.setImageBitmap(comments[position].commentsAvatar)
        holder.commentsTitle.text = comments[position].commentsTitle
        holder.commentsDescription.text = comments[position].commentsDescription
        holder.like.setImageBitmap(comments[position].likeImage)
        holder.dislike.setImageBitmap(comments[position].dislikeImage)
        holder.likeNumber.text = comments[position].likeNumber
    }

    override fun getItemCount(): Int {
        return comments.size
    }
}

class ViewHolderComments (itemView: View) : RecyclerView.ViewHolder(itemView){
    val commentsAvatar = itemView.ivAvatarComments
    val commentsTitle = itemView.tvTitleComments
    val commentsDescription = itemView.tvDescriptionComments
    val like = itemView.ivLikeComments
    val dislike = itemView.ivDislikeComments
    var likeNumber = itemView.tvLikeNumberComments
}