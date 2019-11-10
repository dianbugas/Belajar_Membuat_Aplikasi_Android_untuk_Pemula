package com.dicoding.academy.programminglanguage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgrammingAdapter programmingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //List
        recyclerView = findViewById(R.id.rv_programming);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        programmingAdapter = new ProgrammingAdapter(this, getListData());
        recyclerView.setAdapter(programmingAdapter);
    }

    // menu profile
    @Override
    public boolean onCreateOptionsMenu(Menu profile) {
        getMenuInflater().inflate(R.menu.main, profile);
        return super.onCreateOptionsMenu(profile);
    }

    private ArrayList<Programming> getListData() {

        ArrayList<Programming> programming = new ArrayList<>();

        Programming pr = new Programming();
        pr.setLanguageName("C");
        pr.setLanguageContent("Bahasa pemrograman C merupakan salah satu bahasa pemrograman komputer. Dibuat pada tahun 1972 oleh Dennis Ritchie untuk Sistem Operasi Unix di Bell Telephone Laboratories. Meskipun C dibuat untuk memprogram sistem dan jaringan komputer namun bahasa ini juga sering digunakan dalam mengembangkan software aplikasi.");
        pr.setLanguageAuthor("Didesain");
        pr.setLanguageAuthorName("Dennie Ritchie");
        pr.setLanguageSince("Rilis");
        pr.setLanguageSinceNumber("1972");
        pr.setLanguageTags("Untuk");
        pr.setLanguageTagsTitle("Unix,Software");
        pr.setLanguageImage(R.drawable.bahasac);
        programming.add(pr);

        pr = new Programming();
        pr.setLanguageName("C++");
        pr.setLanguageContent("C++ adalah bahasa pemrograman komputer yang di buat oleh Bjarne Stroustrup, yang merupakan perkembangan dari bahasa C dikembangkan di Bong Labs (Dennis Ritchie) pada awal tahun 1970-an, Bahasa itu diturunkan dari bahasa sebelumnya, yaitu B, Pada awalnya, bahasa tersebut dirancang sebagai bahasa pemrograman yang dijalankan pada sistem Unix, Pada perkembangannya, versi ANSI (American National Standart Institute) Bahasa pemrograman C menjadi versi dominan, Meskipun versi tersebut sekarang jarang dipakai dalam pengembangan sistem dan jaringan maupun untuk sistem embedded, Bjarne Stroustrup pada Bel labs pertama kali mengembangkan C++ pada awal 1980-an. Untuk mendukung fitur-fitur pada C++, dibangun efisiensi dan sistem support untuk pemrograman tingkat rendah (low level coding).");
        pr.setLanguageAuthor("Didesain");
        pr.setLanguageAuthorName("Bjarne Stroustrup");
        pr.setLanguageSince("Rilis");
        pr.setLanguageSinceNumber("1980");
        pr.setLanguageTags("Untuk");
        pr.setLanguageTagsTitle("Unix,OOP");
        pr.setLanguageImage(R.drawable.cplus);
        programming.add(pr);

        pr = new Programming();
        pr.setLanguageName("Go");
        pr.setLanguageContent("Go adalah bahasa pemrograman yang dibuat di Google pada tahun 2009 oleh Robert Griesemer, Rob Pike, dan Ken Thompson. Golang adalah bahasa pemrograman yang dihimpun dan diketik dalam bahasa C, dengan fitur pengumpulan sampah, penulisan terstruktur, keamanan memori, dan pemrograman yang konkuren serta berururtan.");
        pr.setLanguageAuthor("Didesain");
        pr.setLanguageAuthorName("Rob Pike");
        pr.setLanguageSince("Rilis");
        pr.setLanguageSinceNumber("2009");
        pr.setLanguageTags("Untuk");
        pr.setLanguageTagsTitle("Backend");
        pr.setLanguageImage(R.drawable.go);
        programming.add(pr);

        pr = new Programming();
        pr.setLanguageName("Kotlin");
        pr.setLanguageContent("Daya tarik terkuat yang dimiliki Kotlin adalah hasil kompilasinya dalam bentuk bytecode JVM atau Javascript. Selain itu Kotlin ini dibuat oleh praktisi industri, bukan dari pihak akademis, sehingga lebih memahami kebutuhan yang diperlukan.Mempelajari bahasa Kotlin tidak memerlukan learning curve yang lama, cukup beberapa jam saja untuk memahami dialek bahasa yg digunakan; karena memang adanya Kotlin sangat sederhana, bisa dikatakan Kotlin merupakan Swift-nya Android.");
        pr.setLanguageAuthor("Didesain");
        pr.setLanguageAuthorName("JetBrains");
        pr.setLanguageSince("Rilis");
        pr.setLanguageSinceNumber("2011");
        pr.setLanguageTags("Untuk");
        pr.setLanguageTagsTitle("Android");
        pr.setLanguageImage(R.drawable.kotlin2);
        programming.add(pr);

        pr = new Programming();
        pr.setLanguageName("Java");
        pr.setLanguageContent("Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems saat ini merupakan bagian dari Oracle dan dirilis tahun 1995.");
        pr.setLanguageAuthor("Didesain");
        pr.setLanguageAuthorName("James Gosling");
        pr.setLanguageSince("Rilis");
        pr.setLanguageSinceNumber("1991");
        pr.setLanguageTags("Untuk");
        pr.setLanguageTagsTitle("Desktop");
        pr.setLanguageImage(R.drawable.java3);
        programming.add(pr);

        pr = new Programming();
        pr.setLanguageName("Python");
        pr.setLanguageContent("Python adalah bahasa pemrograman interpretatif multiguna dengan filosofi perancangan yang berfokus pada tingkat keterbacaan kode.");
        pr.setLanguageAuthor("Didesain");
        pr.setLanguageAuthorName("Guido Van Rossum");
        pr.setLanguageSince("Rilis");
        pr.setLanguageSinceNumber("1991");
        pr.setLanguageTags("Untuk");
        pr.setLanguageTagsTitle("Machine Learning");
        pr.setLanguageImage(R.drawable.python);
        programming.add(pr);

        pr = new Programming();
        pr.setLanguageName("JavaScript");
        pr.setLanguageContent("JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis. JavaScript populer di internet dan dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer, Mozilla Firefox, Netscape dan Opera. Kode JavaScript dapat disisipkan dalam halaman web menggunakan tag SCRIPT.");
        pr.setLanguageAuthor("Didesain");
        pr.setLanguageAuthorName("Brendan Eich");
        pr.setLanguageSince("Rilis");
        pr.setLanguageSinceNumber("1995");
        pr.setLanguageTags("Untuk");
        pr.setLanguageTagsTitle("Frontend");
        pr.setLanguageImage(R.drawable.js3);
        programming.add(pr);

        pr = new Programming();
        pr.setLanguageName("Matlab");
        pr.setLanguageContent("MATLAB adalah sebuah lingkungan komputasi numerikal dan bahasa pemrograman komputer generasi keempat. Dikembangkan oleh The MathWorks, MATLAB memungkinkan manipulasi matriks, pem-plot-an fungsi dan data, implementasi algoritme, pembuatan antarmuka pengguna, dan peng-antarmuka-an dengan program dalam bahasa lainnya.");
        pr.setLanguageAuthor("Didesain");
        pr.setLanguageAuthorName("Cleve Moler");
        pr.setLanguageSince("Rilis");
        pr.setLanguageSinceNumber("1970");
        pr.setLanguageTags("Untuk");
        pr.setLanguageTagsTitle("Cross-platform");
        pr.setLanguageImage(R.drawable.objective_c);
        programming.add(pr);

        pr = new Programming();
        pr.setLanguageName("PHP");
        pr.setLanguageContent("PHP: Hypertext Preprocessor adalah bahasa skrip yang dapat ditanamkan atau disisipkan ke dalam HTML. PHP banyak dipakai untuk memprogram situs web dinamis. PHP dapat digunakan untuk membangun sebuah CMS.");
        pr.setLanguageAuthor("Didesain");
        pr.setLanguageAuthorName("Rasmus Lerdorf");
        pr.setLanguageSince("Rilis");
        pr.setLanguageSinceNumber("1994");
        pr.setLanguageTags("Untuk");
        pr.setLanguageTagsTitle("Backend");
        pr.setLanguageImage(R.drawable.phppp);
        programming.add(pr);

        pr = new Programming();
        pr.setLanguageName("Ruby");
        pr.setLanguageContent("Ruby adalah bahasa pemrograman dinamis berbasis skrip yang berorientasi objek. Tujuan dari ruby adalah menggabungkan kelebihan dari semua bahasa-bahasa pemrograman skrip yang ada di dunia. Ruby ditulis dengan bahasa pemrograman C dengan kemampuan dasar seperti Perl dan Python.");
        pr.setLanguageAuthor("Didesain");
        pr.setLanguageAuthorName("Yukihiro Matsumoto");
        pr.setLanguageSince("Since");
        pr.setLanguageSinceNumber("1995");
        pr.setLanguageTags("Untuk");
        pr.setLanguageTagsTitle("Web Application");
        pr.setLanguageImage(R.drawable.ruby);
        programming.add(pr);

        return programming;
    }

    // Intent Profile
    public void Profile(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
