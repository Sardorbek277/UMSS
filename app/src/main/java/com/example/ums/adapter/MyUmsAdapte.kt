package com.example.ums.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ums.databinding.ItemRvBinding
import com.example.ums.model.MyUms

class MyUmsAdapte (var rvAction:RvAction,var list: ArrayList<MyUms> = ArrayList()): RecyclerView.Adapter<MyUmsAdapte.Vh>() {

    inner class Vh(val itemRvBinding: ItemRvBinding) : RecyclerView.ViewHolder(itemRvBinding.root) {

        fun onBind(myUms: MyUms) {
            itemRvBinding.tvName.text = myUms.name
            itemRvBinding.tvDesc.text = myUms.desc
            itemRvBinding.tvCode.text = myUms.code

            itemRvBinding.root.setOnClickListener {
                rvAction.itemClick(myUms)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    interface RvAction{
        fun itemClick(myUms: MyUms)
    }

}