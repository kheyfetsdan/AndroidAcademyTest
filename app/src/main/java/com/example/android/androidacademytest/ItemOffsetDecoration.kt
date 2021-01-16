package com.example.android.androidacademytest

import android.graphics.Rect
import android.view.View
import androidx.core.view.size
import androidx.recyclerview.widget.RecyclerView


class ItemOffsetDecoration(private var itemOffset: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect, view: View, parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        val position = parent.getChildAdapterPosition(view)
        val lastPosition = state.itemCount - 1

        if (position != 0 || position != lastPosition)
            outRect.set(itemOffset / 2, 0, itemOffset / 2, 0)
        if (position == 0)
            outRect.set(0, 0, itemOffset/2, 0)
        if (position == lastPosition)
            outRect.set(itemOffset/2, 0, itemOffset, 0)
    }

}