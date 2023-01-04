fun main(){
    val song = Song("Imagination", "Shawn Mendes", 2015, 5000)
    println(song.display())
    println(song.isPopular)
}

class Song(var title: String, var artist: String, var yearPublished: Int, var numPlays: Int){
    val isPopular: Boolean = numPlays >= 1000

    fun display(): String {
        return "$title, dibawakan oleh $artist, dirilis pada tahun $yearPublished"
    }
}