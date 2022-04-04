import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    var count: Int by mutableStateOf(0)

    renderComposable(rootElementId = "root") {
        Text("Theme: " + GameIdeas.randomTheme())
        Br()
        Text("Style: " + GameIdeas.randomStyle())
        Br()
        Text("Genre: " + GameIdeas.randomGenre())
        Br()
        Br()
        Br()
        Br()

        Text("Unimplemented features:")
        Br()
        Br()
        Button() {
            Text("Random Game Idea (TODO)")
        }
        Br()
        Div({ style { padding(25.px) } }) {
            Button(attrs = {
                onClick { count -= 1 }
            }) {
                Text("-")
            }

            Span({ style { padding(15.px) } }) {
                Text("$count")
            }

            Button(attrs = {
                onClick { count += 1 }
            }) {
                Text("+")
            }
        }
    }
}

