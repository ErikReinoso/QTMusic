package com.erik.quiztime.CasoUso

import com.erik.quiztime.Entidades.Categorias

class CategoriasCasoUso {
    private val catList = listOf<Categorias>(
        Categorias(
            "¿Qué causó la muerte de Kurt Cobain?",
        "Mucha gente piensa que su ex pareja Kourtney Love fue quien lo asesinó, sin embargo según una carta dejada por él mismo" +
                "se descubrió que su suicidio fue premeditado.",
        "https://www.biografiasyvidas.com/biografia/c/fotos/cobain_kurt_5.jpg"
        ),
        Categorias(
            "¿Cómo comenzó el Thrash Metal?",
        "El 'Thrash' comenzó oficialmente a partir del primer álbum de Metallica (Kill em All), pero lo que no muchos saben es que" +
                "la legendaria Banda Black Sabbath fue quien dio las primeras nociones del género. ",
        "https://yt3.ggpht.com/a/AATXAJy1TkOQuhPUDAa7cEGHJOWGQiJgDegIJ_0Acg=s900-c-k-c0xffffffff-no-rj-mo"
        ),
        Categorias(
            "¿Qué tan bueno fue Jimi Hendrix'",
        "El gran guitarrista de los 60s, ha sido considerado el mejor de todos los tiempos pues sin haber estudiado música o leer acordes" +
                "de guitarra pudo llegar a un lugar muy alto en la historia del rock.",
        "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fs3.amazonaws.com%2Fzweb-s3.uploads%2Fez2%2Fwp-content%2Fuploads%2F2020%2F09%2FjimiMAIN.jpg&f=1&nofb=1"
        ),
        Categorias(
            "¿Cuál fue la primera banda de Heavy Metal?",
            "Black Sabbath fue la primera banda de la historia en hacer Heavy Metal, desde su álbum homónimo lanzado en 1970, experimentaron con variantes del Blues hasta" +
                    "llegar a un estilo único que marcaría la historia del Metal para siempre.",
            "https://picfiles.alphacoders.com/297/297059.jpg"
        )
    )
    fun getAllCategories(): List<Categorias>{
    return catList
    }
}