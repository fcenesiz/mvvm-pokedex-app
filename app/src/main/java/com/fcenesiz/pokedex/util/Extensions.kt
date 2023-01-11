package com.fcenesiz.pokedex.util

import java.util.Locale

fun String.capitalize(locale: Locale) : String{
    return replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(
            locale
        ) else it.toString()
    }
}