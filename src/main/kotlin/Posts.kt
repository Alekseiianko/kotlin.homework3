data class Posts(

    val id: Int,
    val title: String,
    val subtitle: String,
    val text: String,
    val likes: Int,
    val attachments: List<Attachment>,
    val post: Posts?){

    val isRepost: Boolean
        get() = post != null

    val allLikes :Int
        get() = likes + (post?.likes ?: 0)

}

interface Attachment {
    val type: String
}

data class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo
) : Attachment {

    data class Photo(
        val id: Long,
        val albumId: Long,
        val ownerId: Long,
        val userId: Long
    )
}

data class VideoAttachment(
    override val type: String = "video",
    val video: Video
) : Attachment {

    data class Video(
        val id: Long,
        val albumId: Long,
        val ownerId: Long,
        val userId: Long
    )
}