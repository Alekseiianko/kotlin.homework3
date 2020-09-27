fun main(){

    val wallService = WallService()

    var id = 0
    val post1 = Posts(id++, "title", "subtitle","text")
    val post2 = Posts(id++, "title2", "subtitle2","text2")
    val post3 = Posts(id++, "title3", "subtitle3","text3")
    val post4 = Posts(id++, "title4", "subtitle4","text4")
    val post5 = Posts(id++, "title5", "subtitle5","text5")

    wallService.add(post1)
    wallService.add(post2)
    wallService.add(post3)
    wallService.add(post4)
    wallService.add(post5)

    wallService.update(post2)

}