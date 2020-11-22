class WallService {

    private var posts = emptyArray<Posts>()
    private var comments = emptyArray<Comment>()

    fun add(post: Posts): Posts {
        posts += post
        return posts.last()
    }

    fun update(post: Posts): Boolean {

        val index = posts.indexOfFirst { it.id == post.id }

        if (index < 0) {
            return false
        }

        posts[index] = post
        return true
    }

    fun createComment(comment: Comment) {
        val postExists = posts.any { it.id == comment.postId}
        return if (postExists) {
            comments += comment
        } else {
            throw PostNotFoundException()
        }
    }

}
