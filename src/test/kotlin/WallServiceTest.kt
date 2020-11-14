import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    private val wallService = WallService()
    private val photo = PhotoAttachment("photo", PhotoAttachment.Photo(1,2,3,4))
    private val video = VideoAttachment("video", VideoAttachment.Video(5,6,7,8))
    private val attachmentList = listOf<Attachment>(photo, video)
    private val post = Posts(id = 0, title = "test",subtitle = "subtitle",  text = "test",
        likes = 30, attachments = attachmentList, post = null)

    @Test
    fun add() {
        val result = wallService.add(post)

        assertEquals(post, result)
    }

    @Test
    fun update_true() {

        val update = Posts(id = 0, title = "updated title",subtitle = "updated subtitle"
            , text = "updated test", likes = 50, attachments = attachmentList, post = null)

        wallService.add(post)
        val result = wallService.update(update)

        assertTrue(result)
    }

    @Test
    fun update_false() {
        val update = Posts(id = 1, title = "updated title",subtitle = "subtitle" ,
            text = "updated test", likes = 30, attachments = attachmentList, post = null)

        wallService.add(post)
        val result = wallService.update(update)

        assertFalse(result)
    }

    @Test
    fun create_comment(){
        val post = Posts(2, "title", "subtitle","text",
            80, attachmentList,null)
        val comment = Comment(1,"nice comment")
        assertEquals(post.id-1, comment.postId)
    }

}