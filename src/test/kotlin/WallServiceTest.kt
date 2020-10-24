import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    private val wallService = WallService()

    @Test
    fun add() {
        val post = Posts(id = 0, title = "test",subtitle = "subtitle",  text = "test",
            likes = 30, post = null)

        val result = wallService.add(post)

        assertEquals(post, result)
    }

    @Test
    fun update_true() {
        val post = Posts(id = 0, title = "test", subtitle = "subtitle",
            text = "test", likes = 50, post = null)
        val update = Posts(id = 0, title = "updated title",subtitle = "updated subtitle"
            , text = "updated test", likes = 50, post = null)

        wallService.add(post)
        val result = wallService.update(update)

        assertTrue(result)
    }

    @Test
    fun update_false() {
        val post = Posts(id = 0, title = "test", subtitle = "subtitle",
            text = "test", likes = 30, post = null)
        val update = Posts(id = 1, title = "updated title",subtitle = "subtitle" ,
            text = "updated test", likes = 30, post = null)

        wallService.add(post)
        val result = wallService.update(update)

        assertFalse(result)
    }
}