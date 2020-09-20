import WallService.posts
import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {
    @Test
    fun add() {
        val post = Posts(id = 0, title = "test", text = "test")

        val result = WallService.add(post)

        assertEquals(post, result)
    }

    @Test
    fun update() {
        add()
        var updateResult:Boolean
        val id = 0
        if (id <= posts.size) {
            updateResult = true
            posts[id].title = "new title $id"
            posts[id].text = "new text $id"
        } else {
            updateResult = false
        }

        assertEquals(true, updateResult)
    }
}