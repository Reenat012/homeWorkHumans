fun main() {
    var likes: Int = 61 //количество лайков
    var message: String = if (((likes - 1) % 10 == 0 || (likes - 11) % 100 == 0) && likes != 11) "Понравилось $likes человеку"
        else "Понравилось $likes людям"
    println(message)
}