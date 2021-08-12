package com.engineerbuddy.bookmarktool

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BookmarkController(
    private val bookmarkRepo: BookmarkRepo
) {



    @GetMapping("/bookmarks")
    fun bookmarks(): List<Bookmark> {
        val bookmark1 = Bookmark(
            "https://kotlinlang.org/docs/data-classes.html#properties-declared-in-the-class-body",
            "Kotlin Data Class"
        )
        val bookmark2 = Bookmark("https://kotlinlang.org/", "Kotlin Docs")
        return listOf(bookmark1, bookmark2)
    }

    @PostMapping("/bookmark")
    fun createBookmark(@RequestBody bookmark: Bookmark) : Bookmark {
        val entity = BookmarkEntity(0, bookmark.link, bookmark.name)
        bookmarkRepo.save(entity)
        return bookmark
    }
}