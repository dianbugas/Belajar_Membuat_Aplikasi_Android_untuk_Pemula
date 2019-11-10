package com.dicoding.academy.programminglanguage;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProgrammingActivity extends AppCompatActivity {

    TextView paName, paContent, paAuthor, paAuthorName, paSince, paSinceNumber, paTags, paTagsTitle;
    ImageView paImage;

    //swipe
    RecyclerView recyclerView;
    ArrayList<Horizontal> horizontal;
    HorizontalAdapter horizontalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming);

        //Swipe horizontal
        recyclerView = findViewById(R.id.rv_top_pr);

        Integer[] imgPr ={R.drawable.bahasac, R.drawable.cplus, R.drawable.go,R.drawable.java3, R.drawable.js3, R.drawable.kotlin2, R.drawable.objective_c, R.drawable.phppp, R.drawable.python, R.drawable.ruby};
        String[] namePr = {"C", "C++", "Go", "Java", "Javascript", "Kotlin", "Matlab", "PHP", "Python", "Ruby"};

        horizontal = new ArrayList<>();
        for (int i = 0; i < imgPr.length; i++) {
            Horizontal hr = new Horizontal(imgPr[i], namePr[i]);
            horizontal.add(hr);
        }

        //horizontal layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ProgrammingActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //inisialisasi HorizontalAdapter
        horizontalAdapter = new HorizontalAdapter(ProgrammingActivity.this, horizontal);

        //set HorizontalAdapter ke Recyclerview
        recyclerView.setAdapter(horizontalAdapter);

        // actionbar
        ActionBar actionBar = getSupportActionBar();

        paName = findViewById(R.id.language_pr);
        paContent = findViewById(R.id.content_pr);
        paAuthor = findViewById(R.id.author_pr);
        paAuthorName = findViewById(R.id.author_name_pr);
        paSince = findViewById(R.id.since_pr);
        paSinceNumber = findViewById(R.id.since_number_pr);
        paTags = findViewById(R.id.tags_pr);
        paTagsTitle = findViewById(R.id.tags_title_pr);
        paImage = findViewById(R.id.image_pr);

        // Mengambil data dari Intent
        Intent intent = getIntent();

        String iName = intent.getStringExtra("Name");
        String iContent = intent.getStringExtra("Content");
        String iAuthor = intent.getStringExtra("Author");
        String iAuthorName = intent.getStringExtra("AuthorName");
        String iSince = intent.getStringExtra("Since");
        String iSinceNumber = intent.getStringExtra("SinceNumber");
        String iTags = intent.getStringExtra("Tags");
        String iTagsTitle = intent.getStringExtra("TagsTitle");
        byte[] iBytes = getIntent().getByteArrayExtra("Image");

        Bitmap bitmap = BitmapFactory.decodeByteArray(iBytes, 0, iBytes.length);

        // set title pada ActionBar
        actionBar.setTitle(iName);

        // set data ke dalam layout, lalu ambil data dari activity sebelumnya
        paName.setText(iName);
        paContent.setText(iContent);
        paAuthor.setText(iAuthor);
        paAuthorName.setText(iAuthorName);
        paSince.setText(iSince);
        paSinceNumber.setText(iSinceNumber);
        paTags.setText(iTags);
        paTagsTitle.setText(iTagsTitle);
        paImage.setImageBitmap(bitmap);
    }
}
