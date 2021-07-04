package me.relex.recyclerpager;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public abstract class PageRecyclerAdapter<VH extends RecyclerView.ViewHolder>
        extends RecyclerView.Adapter<VH> {

    @Nullable public CharSequence getPageTitle(int position) {
        return null;
    }
}