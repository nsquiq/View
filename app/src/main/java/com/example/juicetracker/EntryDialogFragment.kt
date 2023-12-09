package com.example.juicetracker

import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.example.juicetracker.databinding.FragmentEntryDialogBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.juicetracker.ui.AppViewModelProvider
import com.example.juicetracker.ui.EntryViewModel

class EntryDialogFragment : BottomSheetDialogFragment() {

    private val entryViewModel by viewModels<EntryViewModel> { AppViewModelProvider.Factory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentEntryDialogBinding.inflate(inflater, container, false).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentEntryDialogBinding.bind(view)
    }
}