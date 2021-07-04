package me.relex.recyclerpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class FragmentViewHolder extends RecyclerView.ViewHolder {
    Fragment currentFragment;

    static FragmentViewHolder createViewHolder(@NonNull ViewGroup parent) {
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        frameLayout.setLayoutParams(
                new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT,
                        RecyclerView.LayoutParams.MATCH_PARENT));
        return new FragmentViewHolder(frameLayout);
    }

    private FragmentViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}