package com.example.swipequiz

class Question(var question: String, var answer: Boolean) {

    companion object {
        val QUESTIONS = arrayOf(
            "Sonos is beter dan Bose",
            "PC heeft betere graphics dan Playstation",
            "Albert heijn heeft geen bezorg dienst",
            "Coolblue heeft de focus gelegd op klantvriendelijkheid",
            "Vrijdag is katerdag"
        )

        val ANSWERS = arrayOf(
            false,
            true,
            false,
            true,
            false
        )
    }

}