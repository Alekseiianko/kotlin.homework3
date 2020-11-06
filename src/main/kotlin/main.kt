fun main(){

    val wallService = WallService()
    val photo = PhotoAttachment("photo", PhotoAttachment.Photo(1,2,3,4))
    val video = VideoAttachment("video", VideoAttachment.Video(5,6,7,8))
    val attachmentList = listOf<Attachment>(photo, video)

    var id = 0
    val post1 = Posts(id++, "title", "subtitle","text",
                        80, attachmentList,null)
    val post2 = Posts(id++, "title2", "subtitle2","text2",
                        70,attachmentList, post1)
    val post3 = Posts(id++, "title3", "subtitle3","text3",
                        65, attachmentList, null)
    val post4 = Posts(id++, "title4", "subtitle4", "text4",
                        201, attachmentList, post2)
    val post5 = Posts(id++, "title5", "subtitle5","text5",
                        106, attachmentList,  post3)

    wallService.add(post1)
    wallService.add(post2)
    wallService.add(post3)
    wallService.add(post4)
    wallService.add(post5)

    wallService.update(post2)

    println(post5.allLikes)

    val comment = Comment(1,"nice comment")
    if(wallService.createComment(comment)){
        println("lol")
    }


}