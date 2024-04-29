package Dogsgame.kt

class petgame {
    var feed: String = ""
    var feedtoo: String = ""
    var clean: String = ""
    var cleantoo :String = ""
    var play: String = ""
    var playtoo: String = ""
    var resultwon: String = ""
    var resultlose: String = ""

    fun main() {
      val c1 = petgame("Pet is eating food.","Pet is fully feed!","Pet is fresh and clean.",
          "Pet is super clean!","Pet is having fun and playing around.","Pet is tired from playing alot!",
          "YOU WIN !!!","YOU LOSE, YOUR HAS FAINTED")
    }

    class  petgame(feed: String, feedtoo: String, clean: String,
    cleantoo: String, play: String, playtoo: String, resultwon: String, resultlose: String)

    var ftext: String = ""
    var ftootext: String = ""
    var ctext: String = ""
    var ctootext: String = ""
    var ptext: String = ""
    var ptootext: String = ""
    var rwtext: String = ""
    var rltext: String = ""


    init {
        feed = ftext
        feedtoo = ftootext
        clean = ctext
        cleantoo = ctootext
        play = ptext
        playtoo = ptootext
        resultwon = rwtext
        resultlose = rltext

    }



}