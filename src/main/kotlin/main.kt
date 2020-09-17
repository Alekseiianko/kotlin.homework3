fun main(){
    var id = 0
    val post1 = Posts(id++, "title", "text")
    val post2 = Posts(id++, "title2", "text2")
    val post3 = Posts(id++, "title3", "text3")
    val post4 = Posts(id++, "title4", "text4")
    val post5 = Posts(id++, "title5", "text5")

    WallService.add(post1)
    WallService.add(post2)
    WallService.add(post3)
    WallService.add(post4)
    WallService.add(post5)

    WallService.update(post2)

}