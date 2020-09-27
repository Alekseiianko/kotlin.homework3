import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    private val wallService = WallService()

    @Test
    fun add() {
        val post = Posts(id = 0, title = "test",subtitle = "subtitle",  text = "test")

        val result = wallService.add(post)

        assertEquals(post, result)
    }

    @Test
    fun update_true() {
        val post = Posts(id = 0, title = "test", subtitle = "subtitle",text = "test")
        val update = Posts(id = 0, title = "updated title",subtitle = "updated subtitle" , text = "updated test")

        wallService.add(post)
        val result = wallService.update(update)

        assertTrue(result)
    }

    @Test
    fun update_false() {
        val post = Posts(id = 0, title = "test", subtitle = "subtitle", text = "test")
        val update = Posts(id = 1, title = "updated title",subtitle = "subtitle" ,text = "updated test")

        wallService.add(post)
        val result = wallService.update(update)

        assertFalse(result)
    }
}