package com.example.ums.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.ums.R
import com.example.ums.adapter.MyUmsAdapte
import com.example.ums.databinding.ActivityMainBinding
import com.example.ums.databinding.FragmentListBinding
import com.example.ums.model.MyUms
import com.example.ums.utils.MyData

class ListFragment : Fragment(), MyUmsAdapte.RvAction {
    private val binding by lazy { FragmentListBinding.inflate(layoutInflater) }
    private lateinit var myUmsAdapte: MyUmsAdapte
      override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

          myUmsAdapte = MyUmsAdapte(this)
          when(arguments?.getInt("key", 0)){
              1-> myUmsAdapte.list.addAll(MyData.tarifList)
              2-> myUmsAdapte.list.addAll(MyData.daqiqaList)
              3-> myUmsAdapte.list.addAll(MyData.internetList)
              4-> myUmsAdapte.list.addAll(MyData.xizmatList)
              5-> myUmsAdapte.list.addAll(MyData.smsList)
          }
          binding.rvList.adapter = myUmsAdapte


          return binding.root
    }

    override fun itemClick(myUms: MyUms) {
        findNavController().navigate(R.id.infoFragment, bundleOf("keyMyUms" to myUms))
    }

}