package com.example.ncraftmedia

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_avatar)

        val post=Post(55,"First post in our network!","20 august 2019",false,false,false)
        contentTv.text=post.content
        createdTv.text=post.created

        likeButton.setOnClickListener(View.OnClickListener {
            if(!post.likedByMe)
            {
                post.likedByMe=true
                likeButton.setImageResource(R.drawable.ic_like_red_24dp)
                likeTv.setTextColor(Color.RED)
                var likes:Int=if ((likeTv.text).toString()=="") 0 else (likeTv.text).toString().toInt()
                likes++
                likeTv.text=likes.toString()
            }
            else
            {
                post.likedByMe=false
                likeButton.setImageResource(R.drawable.ic_like_black_24dp)
                likeTv.setTextColor(Color.BLACK)
                var likes:Int=if ((likeTv.text).toString()=="") 0 else (likeTv.text).toString().toInt()
                likes--
                likeTv.text=likes.toString()
            }
        })

        commentsButton.setOnClickListener(View.OnClickListener {
            if(!post.commentedByMe)
            {
                post.commentedByMe=true
                commentsButton.setImageResource(R.drawable.ic_comment_red_24dp)
                commentsTv.setTextColor(Color.RED)
                var comments:Int=if ((commentsTv.text).toString()=="") 0 else (commentsTv.text).toString().toInt()
                comments++

                commentsTv.text=comments.toString()
            }
            else
            {
                post.commentedByMe=false
                commentsButton.setImageResource(R.drawable.ic_comment_black_24dp)
                commentsTv.setTextColor(Color.BLACK)
                //val comments:Int=(commentsTv.text).toString().toInt()-1
                var comments:Int=if ((commentsTv.text).toString()=="") 0 else (commentsTv.text).toString().toInt()
                comments--
                commentsTv.text=comments.toString()
            }
        })

        shareButton.setOnClickListener(View.OnClickListener {
            if(!post.sharedByMe)
            {
                post.sharedByMe=true
                shareButton.setImageResource(R.drawable.ic_share_red_24dp)
                shareTv.setTextColor(Color.RED)
                //val shares:Int=(shareTv.text).toString().toInt()+1
                var shares:Int=if ((shareTv.text).toString()=="") 0 else (shareTv.text).toString().toInt()
                shares++
                shareTv.text=shares.toString()
            }
            else
            {
                post.sharedByMe=false
                shareButton.setImageResource(R.drawable.ic_share_black_24dp)
                shareTv.setTextColor(Color.BLACK)
                //val shares:Int=(shareTv.text).toString().toInt()-1
                var shares:Int=if ((shareTv.text).toString()=="") 0 else (shareTv.text).toString().toInt()
                shares--
                shareTv.text=shares.toString()
            }
        })
    }
}



