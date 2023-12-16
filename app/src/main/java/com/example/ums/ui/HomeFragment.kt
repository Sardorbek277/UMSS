package com.example.ums.ui

import android.app.Notification.Action
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.findNavController
import com.example.ums.R
import com.example.ums.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.apply {
            linerTarif.setOnClickListener {
                findNavController().navigate(R.id.listFragment, bundleOf("key" to 1))
            }
            linerDaqiqa.setOnClickListener {
                findNavController().navigate(R.id.listFragment, bundleOf("key" to 2))
            }
            linerInternet.setOnClickListener {
                findNavController().navigate(R.id.listFragment, bundleOf("key" to 3))
            }
            linerXizmatlar.setOnClickListener {
                findNavController().navigate(R.id.listFragment, bundleOf("key" to 4))
            }
            linerSms.setOnClickListener {
                findNavController().navigate(R.id.listFragment, bundleOf("key" to 5))
            }
            linerYangiliklar.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
                intent.data =Uri.parse("https://mobi.uz/uz/")
                startActivity(intent)
            }
        }

        return binding.root
    }
}