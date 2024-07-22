package com.example.android_vl_mvvm_01.ui

import androidx.lifecycle.ViewModel
import com.example.android_vl_mvvm_01.data.Repository
import com.example.android_vl_mvvm_01.data.model.Chapter

class BookFragmentViewModel: ViewModel() {

    private val repository = Repository()
    private val chapterList = repository.getChapterList()

    private var _currentChapter = chapterList.first()
    val currentChapter: Chapter
        get() = _currentChapter

    fun nextChapter() {
        if (_currentChapter.chapterNumber + 1 < chapterList.size) {
            _currentChapter = chapterList[_currentChapter.chapterNumber + 1]
        }
    }
}