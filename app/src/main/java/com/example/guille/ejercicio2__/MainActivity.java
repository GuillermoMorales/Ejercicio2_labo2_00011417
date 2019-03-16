package com.example.guille.ejercicio2__;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView img1, img2, img3, img4, img5, img6,img7,img8,img9;
    int contador1=0;
    int[] coleccion = {R.drawable.icon1,R.drawable.icon2,R.drawable.icon3,R.drawable.icon4,R.drawable.icon5,
    R.drawable.icon6,R.drawable.icon7,R.drawable.icon8,R.drawable.icon9};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();

        img1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                img1.setImageResource(coleccion[contador1]);
                contador1++;
                if(contador1==8)
                {
                    contador1 = 0;
                }
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img2.setImageResource(coleccion[contador1]);
                contador1++;
                if(contador1 == 8)
                {
                    contador1= 0;
                }
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img3.setImageResource(coleccion[contador1]);
                contador1++;
                if(contador1 == 8)
                {
                    contador1= 0;
                }
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img4.setImageResource(coleccion[contador1]);
                contador1++;
                if(contador1 == 8)
                {
                    contador1= 0;
                }
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img5.setImageResource(coleccion[contador1]);
                contador1++;
                if(contador1 == 8)
                {
                    contador1= 0;
                }
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img6.setImageResource(coleccion[contador1]);
                contador1++;
                if(contador1 == 8)
                {
                    contador1= 0;
                }
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img7.setImageResource(coleccion[contador1]);
                contador1++;
                if(contador1 == 8)
                {
                    contador1= 0;
                }
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img8.setImageResource(coleccion[contador1]);
                contador1++;
                if(contador1 == 8)
                {
                    contador1= 0;
                }
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img9.setImageResource(coleccion[contador1]);
                contador1++;
                if(contador1 == 8)
                {
                    contador1= 0;
                }
            }
        });

    }
    public void inicializar()
    {
        img1 = (ImageView)findViewById(R.id.image1);
        img2 = (ImageView)findViewById(R.id.image2);
        img3 = (ImageView)findViewById(R.id.image3);
        img4 = (ImageView)findViewById(R.id.image4);
        img5 = (ImageView)findViewById(R.id.image5);
        img6 = (ImageView)findViewById(R.id.image6);
        img7 = (ImageView)findViewById(R.id.image7);
        img8 = (ImageView)findViewById(R.id.image8);
        img9 = (ImageView)findViewById(R.id.image9);
    }
}
