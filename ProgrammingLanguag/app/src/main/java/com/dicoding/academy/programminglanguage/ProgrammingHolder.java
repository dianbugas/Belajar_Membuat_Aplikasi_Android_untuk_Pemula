package com.dicoding.academy.programminglanguage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgrammingHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView phName, phContent, phAuthor, phAuthorName, phSince, phSinceNumber, phTags, phTagsTitle;
    ImageView phImage;

    //from interface
    ItemClickListener itemClickListener;

    public ProgrammingHolder(@NonNull View itemView) {
        super(itemView);

        this.phName = itemView.findViewById(R.id.language);
        this.phContent = itemView.findViewById(R.id.content);
        this.phAuthor = itemView.findViewById(R.id.author);
        this.phAuthorName = itemView.findViewById(R.id.author_name);
        this.phSince = itemView.findViewById(R.id.since);
        this.phSinceNumber = itemView.findViewById(R.id.since_number);
        this.phTags = itemView.findViewById(R.id.tags);
        this.phTagsTitle = itemView.findViewById(R.id.tags_title);
        this.phImage = itemView.findViewById(R.id.image_language);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.OnItemClickListener(v, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }
}
