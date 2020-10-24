data class Posts(
    val id: Int,
    val title: String,
    val subtitle: String,
    val text: String,
    val likes: Int,
    val post: Posts?){

    val isRepost: Boolean
        get() = post != null

    val allLikes :Int
        get() = likes + (post?.likes ?: 0)

}

