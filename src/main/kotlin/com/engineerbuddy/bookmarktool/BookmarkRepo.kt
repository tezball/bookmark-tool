package com.engineerbuddy.bookmarktool

import org.springframework.data.jpa.repository.JpaRepository

interface BookmarkRepo: JpaRepository<BookmarkEntity, Long> {
}