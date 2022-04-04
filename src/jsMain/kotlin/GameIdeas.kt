object GameIdeas {

    private val styles = listOf("2D", "3D", "card", "cartoon", "geometric", "isometric")

    private val themes = listOf("animals", "space", "underground", "future", "water")

    private val genres = listOf("4D", "action", "adventure", "arcade", "casual", "clicker", "evolve", "idle", "infinite",
        "magic", "management", "mouse-only", "puzzle", "racing", "RPG", "shooter", "speed run", "turn-based")

    fun randomStyle(): String = styles.random()

    fun randomTheme(): String = themes.random()

    fun randomGenre(): String = genres.random()

    fun randomSummary(): String {
        return """
            Theme: ${randomTheme()}
            Style: ${randomStyle()}
            Genre: ${randomGenre()}
        """.trimIndent()
    }

}
