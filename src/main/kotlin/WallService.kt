class WallService {

    private var posts = emptyArray<Posts>()

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
}
