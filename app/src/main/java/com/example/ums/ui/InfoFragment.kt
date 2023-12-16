package com.example.ums.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ums.R
import com.example.ums.databinding.FragmentInfoBinding
import com.example.ums.model.MyUms

class InfoFragment : Fragment() {
    private val binding by lazy { FragmentInfoBinding.inflate(layoutInflater) }
       override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

           binding.btnBack.setOnClickListener {
               findNavController().popBackStack()
           }

           val myUms:MyUms=arguments?.getSerializable("keyMyUms") as MyUms

           binding.apply {
               tvName.text = myUms.name
               tvDesc.text = myUms.desc
               tvCode.text = myUms.code
           }


           return binding.root
    }

}