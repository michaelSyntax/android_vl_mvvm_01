package com.example.android_vl_mvvm_01.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.android_vl_mvvm_01.R
import com.example.android_vl_mvvm_01.databinding.FragmentBookBinding


class BookFragment : Fragment() {
    private lateinit var viewBinding: FragmentBookBinding
    private val viewModel: BookFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentBookBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //updateView()
        addObservers()

        viewBinding.btNextPage.setOnClickListener {
            viewModel.nextChapter()
           // updateView()
        }
    }

   // private fun updateView() {
        //viewBinding.tvBookContent.text = viewModel.currentChapter.chapterTitle
   // }

    private fun addObservers() {
        viewModel.currentChapter.observe(viewLifecycleOwner) { newCurrentChapter ->
            viewBinding.tvBookContent.text = newCurrentChapter.chapterTitle
        }

        //viewModel.currentChapter.observe(viewLifecycleOwner) {
        //    viewBinding.tvBookContent.text = it.chapterTitle
        //}
    }
}