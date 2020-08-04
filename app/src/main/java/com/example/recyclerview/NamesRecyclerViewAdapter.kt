package com.example.recyclerview

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_name_item.view.*

class NamesRecyclerViewAdapter(val namesList: List<Names>) :
    RecyclerView.Adapter<NamesRecyclerViewAdapter.NamesViewHolder>(), Parcelable {

    constructor(parcel: Parcel) : this(TODO("namesList")) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        class NamesRecyclerViewAdapter(val namesList: List<String>) :
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<NamesRecyclerViewAdapter> {
        override fun createFromParcel(parcel: Parcel): NamesRecyclerViewAdapter {
            return NamesRecyclerViewAdapter(parcel)
        }

        override fun newArray(size: Int): Array<NamesRecyclerViewAdapter?> {
            return arrayOfNulls(size)
        }
    }
}

    fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val namesList =
            holder.rowView.tvName.text = namesList[position]
        holder.rowView.tvName.text = namesList[position].toString()
    }

    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)

