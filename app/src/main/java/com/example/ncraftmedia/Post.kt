package com.example.ncraftmedia

class Post (
    val id: Long,
    val content: String,
    val created: String,
    var likedByMe: Boolean = false,
    var commentedByMe: Boolean = false,
    var sharedByMe: Boolean = false
)
