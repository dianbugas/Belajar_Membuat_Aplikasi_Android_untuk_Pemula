package com.dicoding.academy.programminglanguage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingHolder> {

    Context mycontext;
    ArrayList<Programming> programming;

    public ProgrammingAdapter(Context mycontext, ArrayList<Programming> programming) {
        this.mycontext = mycontext;
        this.programming = programming;
    }

    @NonNull
    @Override
    public ProgrammingHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_programming, null);
        return new ProgrammingHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProgrammingHolder programmingHolder, int position) {
        programmingHolder.phName.setText(programming.get(position).getLanguageName());
        programmingHolder.phContent.setText(programming.get(position).getLanguageContent());
        programmingHolder.phAuthor.setText(programming.get(position).getLanguageAuthor());
        programmingHolder.phAuthorName.setText(programming.get(position).getLanguageAuthorName());
        programmingHolder.phSince.setText(programming.get(position).getLanguageSince());
        programmingHolder.phSinceNumber.setText(programming.get(position).getLanguageSinceNumber());
        programmingHolder.phTags.setText(programming.get(position).getLanguageTags());
        programmingHolder.phTagsTitle.setText(programming.get(position).getLanguageTagsTitle());
        programmingHolder.phImage.setImageResource(programming.get(position).getLanguageImage());

        // from interface
        programmingHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void OnItemClickListener(View view, int position) {
                String pgName = programming.get(position).getLanguageName();
                String pgContent = programming.get(position).getLanguageContent();
                String pgAuthor = programming.get(position).getLanguageAuthor();
                String pgAuthorName = programming.get(position).getLanguageAuthorName();
                String pgSince = programming.get(position).getLanguageSince();
                String pgSinceNumber = programming.get(position).getLanguageSinceNumber();
                String pgTags = programming.get(position).getLanguageTags();
                String pgTagsTitle = programming.get(position).getLanguageTagsTitle();
                BitmapDrawable bitmapDrawable = (BitmapDrawable)programmingHolder.phImage.getDrawable();

                Bitmap bt = bitmapDrawable.getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();

                // compress Image
                bt.compress(Bitmap.CompressFormat.PNG, 100, stream);

                byte[] by = stream.toByteArray();

                // Mengambil data dengan Intent
                Intent intent = new Intent(mycontext, ProgrammingActivity.class);
                intent.putExtra("Name", pgName);
                intent.putExtra("Content", pgContent);
                intent.putExtra("Author", pgAuthor);
                intent.putExtra("AuthorName", pgAuthorName);
                intent.putExtra("Since", pgSince);
                intent.putExtra("SinceNumber", pgSinceNumber);
                intent.putExtra("Tags", pgTags);
                intent.putExtra("TagsTitle", pgTagsTitle);
                intent.putExtra("Image", by);
                mycontext.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return programming.size();
    }

}
