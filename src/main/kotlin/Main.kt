fun main() {
    var likes: Int = 11 //количество лайков
    var message: String = if (likes == 11) "Понравилось $likes людям"
        else if ((likes - 1) % 10 == 0 || (likes - 11) % 100 == 0) "Понравилось $likes человеку"
        else "Понравилось $likes людям"
    println(message)
}