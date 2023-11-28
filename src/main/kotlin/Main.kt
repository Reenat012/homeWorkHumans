fun main() {
    var likes: Int = 11 //количество лайков
    var message: String = if ((likes % 10 == 1) && likes % 100 != 11) "Понравилось $likes человеку"
        else "Понравилось $likes людям"
    println(message)
}