package com.workshop.aroundme.app.ui.categories

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.workshop.aroundme.R
import com.workshop.aroundme.data.model.ParentCategoryEntity
import java.util.*

class CategoryAdapter(private val items: List<ParentCategoryEntity>) : RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category_fragment, parent, false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

       holder.bind(items[position])

    }


}