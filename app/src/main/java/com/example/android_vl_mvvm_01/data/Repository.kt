package com.example.android_vl_mvvm_01.data

import com.example.android_vl_mvvm_01.data.model.Chapter

class Repository {

    fun getChapterList(): List<Chapter> {
        return listOf(
            Chapter(0, "Lorem"),
            Chapter(1, "Lorem ispum"),
            Chapter(2, "lorem ipsum dolor"),
            Chapter(3, "lorem ipsum dolor amet"),
            Chapter(4, "lorem ipsum dolor amet consectetur"),
            Chapter(5, "lorem ipsum dolor amet consectetur adipiscing"),
            Chapter(6, "lorem ipsum dolor amet consectetur adipiscing elit"),
            Chapter(7, "lorem ipsum dolor amet consectetur adipiscing elit sed"),
            Chapter(8, "lorem ipsum dolor amet consectetur adipiscing elit sed do"),
            Chapter(9, "lorem ipsum dolor amet consectetur adipiscing elit sed do eiusmod"),
            Chapter(10, "lorem ipsum dolor amet consectetur adipiscing elit sed do eiusmod tempor"),
            Chapter(11, "lorem ipsum dolor amet consectetur adipiscing elit sed do eiusmod tempor incididunt"),
            Chapter(12, "lorem ipsum dolor amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut"),
            Chapter(13, "lorem ipsum dolor amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore"),
            Chapter(14, "lorem ipsum dolor amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et"),
            Chapter(15, "lorem ipsum dolor amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore"),
            Chapter(16, "lorem ipsum dolor amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna"),
            Chapter(17, "lorem ipsum dolor amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"),
            Chapter(18, "lorem ipsum dolor amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua ut"),
            Chapter(19, "lorem ipsum dolor amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua ut enim"),
            Chapter(20, "lorem ipsum dolor amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua ut enim ad"),
            Chapter(21, "lorem ipsum dolor amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua ut enim ad minim"),
            Chapter(22, "Letzte Seite")
        )
    }
}