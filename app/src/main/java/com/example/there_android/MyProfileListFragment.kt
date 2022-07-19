package com.example.there_android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.there_android.databinding.FragmentMyprofileBinding
import com.example.there_android.databinding.FragmentMyprofilelistBinding

class MyProfileListFragment : Fragment() {
    private lateinit var binding: FragmentMyprofilelistBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyprofilelistBinding.inflate(inflater, container, false)
        return binding.root
    }
}