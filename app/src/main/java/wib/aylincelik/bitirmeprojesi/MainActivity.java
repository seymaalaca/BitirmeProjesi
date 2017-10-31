package wib.aylincelik.bitirmeprojesi;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imgbuton1;
    ImageButton imgbuton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgbuton2=(ImageButton)findViewById(R.id.imageButton2); //öğrenci butonu
        imgbuton1=(ImageButton)findViewById(R.id.imageButton); // öğretmen butonu
        imgbuton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yeni= new Intent(MainActivity.this,OgretmenGiris.class);
                startActivity(yeni);
            }
        });
        imgbuton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Ardından Intent methodunu kullanarak nereden nereye gideceğini söylüyoruz.
                Intent yeni= new Intent(MainActivity.this,OgrenciAnasayfa.class);
                startActivity(yeni);
            }
        });
    }

}