package com.example.android_vl_mvvm_01.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android_vl_mvvm_01.data.Repository
import com.example.android_vl_mvvm_01.data.model.Chapter

class BookFragmentViewModel: ViewModel() {

    private val repository = Repository()
    private val chapterList = repository.getChapterList()

   // private var _currentChapter = chapterList.first()
    //val currentChapter: Chapter
      //  get() = _currentChapter

    private val _currentChapter = MutableLiveData<Chapter>(chapterList.first())
    val currentChapter: LiveData<Chapter>
        get() = _currentChapter

    fun nextChapter() {
        if (_currentChapter.value!!.chapterNumber + 1 < chapterList.size) {
            _currentChapter.value = chapterList[_currentChapter.value!!.chapterNumber + 1]
        }
    }
}