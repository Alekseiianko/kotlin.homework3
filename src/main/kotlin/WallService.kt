import java.io.InputStream
import java.util.*

object WallService {

    var posts = emptyArray<Posts>()

    fun add(post: Posts): Posts {
        posts += post
        return posts.last()
    }

    fun update(post: Posts): Boolean {
        val id = 2
        return if (id <= posts.size) {
            posts[id].title = "new title $id"
            posts[id].text = "new text $id"
            true
        }else {
            false
        }
    }
}
