package com.engineerbuddy.bookmarktool

import javax.persistence.*

@Entity
@Table(name = "BOOKMARK")
class BookmarkEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val bookmarkId: Long,
    @Column(name="LINK")
    val link: String,
    @Column(name="NAME")
    val name: String
)